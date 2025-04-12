/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StyleSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.ProductDetail;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.prioritydelivery.DeliveryTimeData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from pi2
 */
public final class pi2_2
extends RecyclerView$B
implements View.OnClickListener {
    public TextView A;
    public TextView B;
    public AjioTextView C;
    public ConstraintLayout D;
    public ConstraintLayout E;
    public final View F;
    public final View G;
    public final View a;
    public final yi2_1 b;
    public final sj2_0 c;
    public View d;
    public AjioTextView e;
    public AjioButton f;
    public LinearLayout g;
    public AjioTextView h;
    public AjioButton i;
    public ImageView j;
    public AjioTextView k;
    public AjioTextView l;
    public ImageView m;
    public AjioTextView n;
    public AjioTextView o;
    public ConstraintLayout p;
    public ConstraintLayout q;
    public ConstraintLayout r;
    public Button s;
    public AjioTextView t;
    public ImageView u;
    public final zi2_1 v;
    public final boolean w;
    public ConstraintLayout x;
    public ConstraintLayout y;
    public TextView z;

    public pi2_2(yi2_1 yi2_12, sj2_0 sj2_02, View view) {
        int n3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(sj2_02, "pdpuiDelegateListener");
        super(view);
        this.a = view;
        this.b = yi2_12;
        this.c = sj2_02;
        yi2_12 = yi2_12.Aa();
        this.v = yi2_12;
        this.w = n3 = mz3_0.B();
        Intrinsics.checkNotNullParameter(view, "itemView");
        n3 = R$id.edd_layout;
        yi2_12 = view.findViewById(n3);
        this.F = yi2_12;
        n3 = R$id.edd_layout_new;
        yi2_12 = view.findViewById(n3);
        this.G = yi2_12;
        this.w();
    }

    public static void z(String string2, String string3, AjioTextView ajioTextView) {
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        string2 = new StyleSpan(1);
        int n3 = string3.length();
        int n4 = 33;
        spannableString.setSpan((Object)string2, 0, n3, n4);
        if (ajioTextView != null) {
            ajioTextView.setText((CharSequence)spannableString);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void A(EddResult var1_1) {
        block239: {
            block241: {
                block240: {
                    block231: {
                        block230: {
                            block238: {
                                block232: {
                                    block237: {
                                        block236: {
                                            block235: {
                                                block233: {
                                                    block234: {
                                                        var2_2 = this;
                                                        this.w();
                                                        var3_3 /* !! */  = "Pincode |";
                                                        var4_4 = "pincode";
                                                        var5_5 = " |";
                                                        var6_6 = " ";
                                                        var7_7 = "codImg";
                                                        var8_8 = "eddMsgstaticMsg";
                                                        var9_9 = "eddImg";
                                                        var10_10 = "Pincode | ";
                                                        var11_11 = this.w;
                                                        var12_12 = "codMsgTv";
                                                        var13_13 = "eddMsgTv";
                                                        var14_14 = "changePincodeTv";
                                                        var15_15 = "errorMsgTv";
                                                        var16_16 = "pincodeTv";
                                                        var17_17 = "eddCheckButton";
                                                        var18_18 = "";
                                                        var19_19 = this.b;
                                                        var20_20 = var3_3 /* !! */ ;
                                                        if (var1_1 != null) break block231;
                                                        var21_21 = var19_19.G1();
                                                        var22_22 = "eddTitleTv";
                                                        if (var21_21 != null) break block232;
                                                        var3_3 /* !! */  = this.f;
                                                        if (var3_3 /* !! */  == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                                            var23_24 = var5_5;
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
lbl31:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var23_24 = var5_5;
                                                        ** while (true)
                                                        var25_29 = 0;
                                                        var5_5 = null;
                                                        var3_3 /* !! */ .setVisibility(0);
                                                        var3_3 /* !! */  = var2_2.e;
                                                        if (var3_3 /* !! */  == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var22_22);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var3_3 /* !! */ .setVisibility(0);
                                                        var3_3 /* !! */  = var2_2.g;
                                                        var25_29 = 8;
                                                        if (var3_3 /* !! */  != null) {
                                                            var3_3 /* !! */ .setVisibility(var25_29);
                                                            var3_3 /* !! */  = Unit.a;
                                                        }
                                                        if ((var3_3 /* !! */  = var2_2.j) == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var3_3 /* !! */ .setVisibility(var25_29);
                                                        var3_3 /* !! */  = var2_2.k;
                                                        if (var3_3 /* !! */  == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var3_3 /* !! */ .setVisibility(var25_29);
                                                        var3_3 /* !! */  = var2_2.l;
                                                        if (var3_3 /* !! */  == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var3_3 /* !! */ .setVisibility(var25_29);
                                                        var3_3 /* !! */  = var2_2.p;
                                                        if (var3_3 /* !! */  != null) {
                                                            ai0_2.i((View)var3_3 /* !! */ );
                                                            var3_3 /* !! */  = Unit.a;
                                                        }
                                                        if ((var3_3 /* !! */  = var2_2.m) == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var25_29 = 8;
                                                        var3_3 /* !! */ .setVisibility(var25_29);
                                                        var3_3 /* !! */  = var2_2.n;
                                                        if (var3_3 /* !! */  == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var3_3 /* !! */ .setVisibility(var25_29);
                                                        var3_3 /* !! */  = var2_2.r;
                                                        if (var3_3 /* !! */  != null) {
                                                            ai0_2.i((View)var3_3 /* !! */ );
                                                            var3_3 /* !! */  = Unit.a;
                                                        }
                                                        if ((var3_3 /* !! */  = var2_2.o) == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var25_29 = 8;
                                                        var3_3 /* !! */ .setVisibility(var25_29);
                                                        var24_26 = 0;
                                                        var3_3 /* !! */  = null;
                                                        if (var11_11 != 0) {
                                                            var2_2.y(null);
                                                        }
                                                        if ((var25_29 = (int)var19_19.S5()) == 0) {
                                                            var5_5 = var2_2.f;
                                                            if (var5_5 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                                                var25_29 = 0;
                                                                var5_5 = null;
                                                            }
                                                            var5_5.setOnClickListener(null);
                                                        }
                                                        if ((var24_26 = (int)h40_0.Q1()) == 0) ** GOTO lbl172
                                                        var3_3 /* !! */  = var2_2.i;
                                                        if (var3_3 /* !! */  == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var2_2);
                                                        var3_3 /* !! */  = od3_2.a;
                                                        var25_29 = var3_3 /* !! */ .length();
                                                        if (var25_29 == 0) {
                                                            var3_3 /* !! */  = od3_2.a();
                                                        }
                                                        if ((var24_26 = (int)Intrinsics.areEqual(var3_3 /* !! */ , var5_5 = ld3_2.STORE_LUXE.getStoreId())) == 0) break block233;
                                                        var3_3 /* !! */  = var2_2.f;
                                                        if (var3_3 /* !! */  == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var2_2);
                                                        var3_3 /* !! */  = var2_2.g;
                                                        if (var3_3 /* !! */  != null) {
                                                            var25_29 = 0;
                                                            var5_5 = null;
                                                            var3_3 /* !! */ .setVisibility(0);
                                                            var3_3 /* !! */  = Unit.a;
                                                        }
                                                        if ((var3_3 /* !! */  = var2_2.f) == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var25_29 = 8;
                                                        var3_3 /* !! */ .setVisibility(var25_29);
                                                        var3_3 /* !! */  = var2_2.y;
                                                        if (var3_3 /* !! */  != null) {
                                                            var3_3 /* !! */ .setVisibility(var25_29);
                                                            var3_3 /* !! */  = Unit.a;
                                                        }
                                                        if ((var3_3 /* !! */  = var19_19.getAddress()) == null) {
                                                            var19_19 = var2_2.e;
                                                            if (var19_19 == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var22_22);
                                                                var26_32 = 0;
                                                                var19_19 = null;
                                                            }
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                            var19_19.setVisibility(0);
                                                            var19_19 = var2_2.g;
                                                            if (var19_19 != null) {
                                                                var27_35 = 8;
                                                                var19_19.setVisibility(var27_35);
                                                                var19_19 = Unit.a;
                                                            }
                                                            if ((var19_19 = var2_2.x) != null) {
                                                                var19_19.setVisibility(0);
                                                                var19_19 = Unit.a;
                                                            }
                                                            if ((var19_19 = var2_2.C) != null) {
                                                                var19_19.setVisibility(0);
                                                                var19_19 = Unit.a;
                                                            }
                                                            if ((var19_19 = var2_2.h) == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                                                var26_32 = 0;
                                                                var19_19 = null;
                                                            }
                                                            var24_26 = 8;
                                                            var19_19.setVisibility(var24_26);
                                                            var19_19 = var2_2.B;
                                                            if (var19_19 != null) {
                                                                var19_19.setVisibility(var24_26);
                                                                var19_19 = Unit.a;
                                                            }
                                                            if ((var19_19 = var2_2.f) == null) {
                                                                Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                                                var26_32 = 0;
                                                                var19_19 = null;
                                                            }
                                                            var19_19.setVisibility(var24_26);
lbl172:
                                                            // 12 sources

                                                            while (true) {
                                                                var24_26 = 0;
                                                                var3_3 /* !! */  = null;
                                                                break block230;
                                                                break;
                                                            }
                                                        }
                                                        var24_26 = 8;
                                                        var5_5 = var2_2.e;
                                                        if (var5_5 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var22_22);
                                                            var25_29 = 0;
                                                            var5_5 = null;
                                                        }
                                                        var5_5.setVisibility(var24_26);
                                                        var3_3 /* !! */  = var19_19.getAddress();
                                                        if (var3_3 /* !! */  != null) {
                                                            var3_3 /* !! */  = var3_3 /* !! */ .getFormattedAddress();
                                                        } else {
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        if (var3_3 /* !! */  == null || (var24_26 = var3_3 /* !! */ .length()) == 0) break block234;
                                                        var3_3 /* !! */  = var2_2.h;
                                                        if (var3_3 /* !! */  == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                                            var24_26 = 0;
                                                            var3_3 /* !! */  = null;
                                                        }
                                                        var3_3 /* !! */ .setVisibility(8);
                                                        var3_3 /* !! */  = var2_2.C;
                                                        var27_35 = 0;
                                                        var4_4 = null;
                                                        if (var3_3 /* !! */  != null) {
                                                            var3_3 /* !! */ .setVisibility(0);
                                                            var3_3 /* !! */  = Unit.a;
                                                        }
                                                        if ((var3_3 /* !! */  = var2_2.B) != null) {
                                                            var3_3 /* !! */ .setVisibility(0);
                                                            var3_3 /* !! */  = Unit.a;
                                                        }
                                                        if ((var3_3 /* !! */  = var19_19.getAddress()) == null || (var3_3 /* !! */  = var3_3 /* !! */ .getFirstName()) == null) {
                                                            var3_3 /* !! */  = var18_18;
                                                        }
                                                        if ((var4_4 = var19_19.getAddress()) != null) {
                                                            var4_4 = var4_4.getCompleteAddress();
                                                        } else {
                                                            var27_35 = 0;
                                                            var4_4 = null;
                                                        }
                                                        var3_3 /* !! */  = var3_3 /* !! */ .concat(" | ");
                                                        var4_4 = n1.a((String)var3_3 /* !! */ , (String)var6_6, (String)var4_4);
                                                        var5_5 = var2_2.C;
                                                        pi2_2.z((String)var4_4, (String)var3_3 /* !! */ , (AjioTextView)var5_5);
                                                        var3_3 /* !! */  = var2_2.B;
                                                        if (var3_3 /* !! */  != null) {
                                                            if ((var19_19 = var19_19.getAddress()) == null || (var19_19 = var19_19.getPostalCode()) == null) {
                                                                var19_19 = var18_18;
                                                            }
                                                            var3_3 /* !! */ .setText((CharSequence)var19_19);
                                                            var19_19 = Unit.a;
                                                        }
                                                        ** GOTO lbl172
                                                    }
                                                    var3_3 /* !! */  = var19_19.E1();
                                                    var24_26 = var3_3 /* !! */ .length();
                                                    if (var24_26 == 0) ** GOTO lbl172
                                                    var3_3 /* !! */  = var2_2.C;
                                                    if (var3_3 /* !! */  != null) {
                                                        var25_29 = 0;
                                                        var5_5 = null;
                                                        var3_3 /* !! */ .setVisibility(0);
                                                        var3_3 /* !! */  = Unit.a;
                                                    }
                                                    if ((var3_3 /* !! */  = var2_2.h) == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                                        var24_26 = 0;
                                                        var3_3 /* !! */  = null;
                                                    }
                                                    var25_29 = 8;
                                                    var3_3 /* !! */ .setVisibility(var25_29);
                                                    var3_3 /* !! */  = var2_2.B;
                                                    if (var3_3 /* !! */  != null) {
                                                        var3_3 /* !! */ .setVisibility(var25_29);
                                                        var3_3 /* !! */  = Unit.a;
                                                    }
                                                    if ((var3_3 /* !! */  = var2_2.C) != null) {
                                                        var3_3 /* !! */ .setText((CharSequence)var10_10);
                                                        var3_3 /* !! */  = Unit.a;
                                                    }
                                                    var3_3 /* !! */  = var19_19.E1();
                                                    var3_3 /* !! */  = "Pincode |  ".concat((String)var3_3 /* !! */ );
                                                    var5_5 = var2_2.C;
                                                    pi2_2.z((String)var3_3 /* !! */ , (String)var10_10, (AjioTextView)var5_5);
                                                    tj2_2.Companion.getClass();
                                                    var3_3 /* !! */  = tj2$a_0.a();
                                                    var19_19 = var19_19.E1();
                                                    var3_3 /* !! */ .getClass();
                                                    Intrinsics.checkNotNullParameter(var19_19, (String)var4_4);
                                                    var3_3 /* !! */ .a = var19_19;
                                                    ** GOTO lbl172
                                                }
                                                var3_3 /* !! */  = var2_2.y;
                                                if (var3_3 /* !! */  != null) {
                                                    var25_29 = 8;
                                                    var3_3 /* !! */ .setVisibility(var25_29);
                                                    var3_3 /* !! */  = Unit.a;
                                                }
                                                if ((var3_3 /* !! */  = var19_19.getAddress()) != null) break block235;
                                                var19_19 = var2_2.C;
                                                if (var19_19 != null) {
                                                    var24_26 = 0;
                                                    var3_3 /* !! */  = null;
                                                    var19_19.setVisibility(0);
                                                    var19_19 = Unit.a;
                                                }
                                                if ((var19_19 = var2_2.h) == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                                    var26_32 = 0;
                                                    var19_19 = null;
                                                }
                                                var24_26 = 8;
                                                var19_19.setVisibility(var24_26);
                                                var19_19 = var2_2.B;
                                                if (var19_19 != null) {
                                                    var19_19.setVisibility(var24_26);
                                                    var19_19 = Unit.a;
                                                }
                                                ** GOTO lbl172
                                            }
                                            var3_3 /* !! */  = var19_19.getAddress();
                                            if (var3_3 /* !! */  != null) {
                                                var3_3 /* !! */  = var3_3 /* !! */ .getFormattedAddress();
                                            } else {
                                                var24_26 = 0;
                                                var3_3 /* !! */  = null;
                                            }
                                            if (var3_3 /* !! */  == null || (var24_26 = var3_3 /* !! */ .length()) == 0) break block236;
                                            var3_3 /* !! */  = var2_2.h;
                                            if (var3_3 /* !! */  == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                                var24_26 = 0;
                                                var3_3 /* !! */  = null;
                                            }
                                            var3_3 /* !! */ .setVisibility(8);
                                            var3_3 /* !! */  = var2_2.C;
                                            var27_35 = 0;
                                            var4_4 = null;
                                            if (var3_3 /* !! */  != null) {
                                                var3_3 /* !! */ .setVisibility(0);
                                                var3_3 /* !! */  = Unit.a;
                                            }
                                            if ((var3_3 /* !! */  = var2_2.B) != null) {
                                                var3_3 /* !! */ .setVisibility(0);
                                                var3_3 /* !! */  = Unit.a;
                                            }
                                            if ((var3_3 /* !! */  = var2_2.f) == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                                var24_26 = 0;
                                                var3_3 /* !! */  = null;
                                            }
                                            var27_35 = 8;
                                            var3_3 /* !! */ .setVisibility(var27_35);
                                            var3_3 /* !! */  = var19_19.getAddress();
                                            if (var3_3 /* !! */  == null || (var3_3 /* !! */  = var3_3 /* !! */ .getFirstName()) == null) {
                                                var3_3 /* !! */  = var18_18;
                                            }
                                            if ((var4_4 = var19_19.getAddress()) != null) {
                                                var4_4 = var4_4.getCompleteAddress();
                                                var5_5 = var23_24;
                                            } else {
                                                var5_5 = var23_24;
                                                var27_35 = 0;
                                                var4_4 = null;
                                            }
                                            var3_3 /* !! */  = var3_3 /* !! */ .concat((String)var5_5);
                                            var4_4 = n1.a((String)var3_3 /* !! */ , (String)var6_6, (String)var4_4);
                                            var5_5 = var2_2.C;
                                            pi2_2.z((String)var4_4, (String)var3_3 /* !! */ , (AjioTextView)var5_5);
                                            var3_3 /* !! */  = var2_2.B;
                                            if (var3_3 /* !! */  != null) {
                                                if ((var19_19 = var19_19.getAddress()) == null || (var19_19 = var19_19.getPostalCode()) == null) {
                                                    var19_19 = var18_18;
                                                }
                                                var3_3 /* !! */ .setText((CharSequence)var19_19);
                                                var19_19 = Unit.a;
                                            }
                                            ** GOTO lbl172
                                        }
                                        var3_3 /* !! */  = var19_19.getAddress();
                                        if (var3_3 /* !! */  != null) {
                                            var3_3 /* !! */  = var3_3 /* !! */ .getPostalCode();
                                        } else {
                                            var24_26 = 0;
                                            var3_3 /* !! */  = null;
                                        }
                                        if (var3_3 /* !! */  == null || (var24_26 = var3_3 /* !! */ .length()) == 0) break block237;
                                        var3_3 /* !! */  = var2_2.C;
                                        if (var3_3 /* !! */  != null) {
                                            var25_29 = 0;
                                            var5_5 = null;
                                            var3_3 /* !! */ .setVisibility(0);
                                            var3_3 /* !! */  = Unit.a;
                                        }
                                        if ((var3_3 /* !! */  = var2_2.f) == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                            var24_26 = 0;
                                            var3_3 /* !! */  = null;
                                        }
                                        var25_29 = 8;
                                        var3_3 /* !! */ .setVisibility(var25_29);
                                        var3_3 /* !! */  = var19_19.getAddress();
                                        if (var3_3 /* !! */  != null) {
                                            var3_3 /* !! */  = var3_3 /* !! */ .getPostalCode();
                                        } else {
                                            var24_26 = 0;
                                            var3_3 /* !! */  = null;
                                        }
                                        var3_3 /* !! */  = kp1_0.c((String)var10_10, (String)var3_3 /* !! */ );
                                        var5_5 = var2_2.C;
                                        var6_6 = var20_20;
                                        pi2_2.z((String)var3_3 /* !! */ , (String)var20_20, (AjioTextView)var5_5);
                                        tj2_2.Companion.getClass();
                                        var3_3 /* !! */  = tj2$a_0.a();
                                        var19_19 = var19_19.getAddress();
                                        if (var19_19 == null || (var19_19 = var19_19.getPostalCode()) == null) {
                                            var19_19 = var18_18;
                                        }
                                        var3_3 /* !! */ .getClass();
                                        Intrinsics.checkNotNullParameter(var19_19, (String)var4_4);
                                        var3_3 /* !! */ .a = var19_19;
                                        ** GOTO lbl172
                                    }
                                    if ((var19_19 = var19_19.getAddress()) != null) {
                                        var19_19 = var19_19.getAddressType();
                                    } else {
                                        var26_32 = 0;
                                        var19_19 = null;
                                    }
                                    if (var19_19 != (var3_3 /* !! */  = AddressType.PinCodeEmpty)) ** GOTO lbl172
                                    var19_19 = var2_2.C;
                                    if (var19_19 != null) {
                                        var24_26 = 0;
                                        var3_3 /* !! */  = null;
                                        var19_19.setVisibility(0);
                                        var19_19 = Unit.a;
                                    }
                                    if ((var19_19 = var2_2.h) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                        var26_32 = 0;
                                        var19_19 = null;
                                    }
                                    var24_26 = 8;
                                    var19_19.setVisibility(var24_26);
                                    var19_19 = var2_2.B;
                                    if (var19_19 != null) {
                                        var19_19.setVisibility(var24_26);
                                        var19_19 = Unit.a;
                                    }
                                    if ((var19_19 = var2_2.f) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                        var26_32 = 0;
                                        var19_19 = null;
                                    }
                                    var19_19.setVisibility(var24_26);
                                    ** GOTO lbl172
                                }
                                var24_26 = 8;
                                var26_32 = h40_0.Q1();
                                if (var26_32 == 0) break block238;
                                var19_19 = this.f;
                                if (var19_19 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                    var26_32 = 0;
                                    var19_19 = null;
                                }
                                var19_19.setVisibility(var24_26);
                                var19_19 = var2_2.i;
                                if (var19_19 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                                    var26_32 = 0;
                                    var19_19 = null;
                                }
                                var19_19.setOnClickListener((View.OnClickListener)var2_2);
                                var19_19 = var2_2.o;
                                if (var19_19 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                    var26_32 = 0;
                                    var19_19 = null;
                                }
                                ai0_2.i((View)var19_19);
                                var19_19 = var2_2.h;
                                if (var19_19 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                    var26_32 = 0;
                                    var19_19 = null;
                                }
                                ai0_2.B((View)var19_19);
                                if (var11_11 == 0) ** GOTO lbl172
                                var26_32 = 0;
                                var19_19 = null;
                                var2_2.y(null);
                                var24_26 = 0;
                                var3_3 /* !! */  = null;
                                break block230;
                            }
                            var3_3 /* !! */  = this.f;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                var26_32 = 0;
                                var19_19 = null;
                                var24_26 = 0;
                                var3_3 /* !! */  = null;
                            } else {
                                var26_32 = 0;
                                var19_19 = null;
                            }
                            var3_3 /* !! */ .setVisibility(0);
                            var3_3 /* !! */  = var2_2.e;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var22_22);
                                var24_26 = 0;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setVisibility(0);
                            var19_19 = var2_2.g;
                            var24_26 = 8;
                            if (var19_19 != null) {
                                var19_19.setVisibility(var24_26);
                                var19_19 = Unit.a;
                            }
                            if ((var19_19 = var2_2.j) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                                var26_32 = 0;
                                var19_19 = null;
                            }
                            var19_19.setVisibility(var24_26);
                            var19_19 = var2_2.k;
                            if (var19_19 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                                var26_32 = 0;
                                var19_19 = null;
                            }
                            var19_19.setVisibility(var24_26);
                            var19_19 = var2_2.l;
                            if (var19_19 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                                var26_32 = 0;
                                var19_19 = null;
                            }
                            var19_19.setVisibility(var24_26);
                            var19_19 = var2_2.p;
                            if (var19_19 != null) {
                                ai0_2.i((View)var19_19);
                                var19_19 = Unit.a;
                            }
                            if ((var3_3 /* !! */  = var2_2.m) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var7_7);
                                var26_32 = 8;
                                var24_26 = 0;
                                var3_3 /* !! */  = null;
                            } else {
                                var26_32 = 8;
                            }
                            var3_3 /* !! */ .setVisibility(var26_32);
                            var3_3 /* !! */  = var2_2.n;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                                var24_26 = 0;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setVisibility(var26_32);
                            var19_19 = var2_2.r;
                            if (var19_19 != null) {
                                ai0_2.i((View)var19_19);
                                var19_19 = Unit.a;
                            }
                            if ((var3_3 /* !! */  = var2_2.o) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                var26_32 = 8;
                                var24_26 = 0;
                                var3_3 /* !! */  = null;
                            } else {
                                var26_32 = 8;
                            }
                            var3_3 /* !! */ .setVisibility(var26_32);
                            if (var11_11 != 0) ** break;
                            ** while (true)
                            var24_26 = 0;
                            var3_3 /* !! */  = null;
                            var2_2.y(null);
                        }
                        if (var11_11 != 0) {
                            var19_19 = var2_2.f;
                            if (var19_19 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                var26_32 = 0;
                                var19_19 = null;
                            }
                            ai0_2.i((View)var19_19);
                            var19_19 = var2_2.g;
                            if (var19_19 != null) {
                                ai0_2.B((View)var19_19);
                                var19_19 = Unit.a;
                            }
                            AJIOApplication.Companion.getClass();
                            var4_4 = AJIOApplication$a.a();
                            var19_19 = new jo_2((Context)var4_4);
                            var19_19 = var19_19.i();
                            if (var19_19 != null) {
                                var19_19 = var19_19.getPincode();
                            } else {
                                var26_32 = 0;
                                var19_19 = null;
                            }
                            tj2_2.Companion.getClass();
                            var4_4 = tj2$a_0.a().a;
                            if (var4_4 != null && (var27_35 = var4_4.length()) > 0) {
                                var19_19 = tj2$a_0.a().a;
                            } else if (var19_19 == null || (var27_35 = var19_19.length()) <= 0) {
                                var19_19 = var18_18;
                            }
                            var27_35 = (int)h40_0.Q1();
                            if (var27_35 == 0) {
                                if (var19_19 != null && (var27_35 = var19_19.length()) > 0) {
                                    var4_4 = var2_2.h;
                                    if (var4_4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                        var27_35 = 0;
                                        var4_4 = null;
                                    }
                                    var4_4.setText((CharSequence)var19_19);
                                    var19_19 = var2_2.h;
                                    if (var19_19 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                        var26_32 = 0;
                                        var19_19 = null;
                                    }
                                    var27_35 = hv3_0.m(R$color.accent_color_10);
                                    var19_19.setTextColor(var27_35);
                                } else {
                                    var19_19 = var2_2.h;
                                    if (var19_19 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                        var26_32 = 0;
                                        var19_19 = null;
                                    }
                                    var27_35 = R$string.pin_code_edd;
                                    var4_4 = hv3_0.K(var27_35);
                                    var19_19.setText((CharSequence)var4_4);
                                    var19_19 = var2_2.h;
                                    if (var19_19 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                        var26_32 = 0;
                                        var19_19 = null;
                                    }
                                    var27_35 = hv3_0.m(R$color.color_6d6d6d);
                                    var19_19.setTextColor(var27_35);
                                    var19_19 = var2_2.i;
                                    if (var19_19 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                                        var26_32 = 0;
                                        var19_19 = null;
                                    }
                                    var27_35 = R$string.check_delivery_date;
                                    var4_4 = hv3_0.K(var27_35);
                                    var19_19.setText((CharSequence)var4_4);
                                }
                            }
                            if ((var19_19 = var2_2.i) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                            } else {
                                var3_3 /* !! */  = var19_19;
                            }
                            var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var2_2);
                        }
                        break block239;
                    }
                    var20_20 = var1_1.getStatus();
                    var22_23 = var15_15;
                    var15_15 = "format(...)";
                    if (var20_20 == null) break block240;
                    var20_20 = var1_1.getStatus();
                    var23_25 = var12_12;
                    var28_37 = var20_20.getStatusCode();
                    var20_20 = var7_7;
                    var29_38 = 1;
                    if (var28_37 != var29_38) break block241;
                    var19_19 = StringCompanionObject.INSTANCE;
                    var26_33 = R$string.acc_error_message;
                    var3_3 /* !! */  = hv3_0.K(R$string.something_wrong_msg);
                    var4_4 = new Object[var29_38];
                    var25_30 = false;
                    var5_5 = null;
                    var4_4[0] = var3_3 /* !! */ ;
                    var19_19 = hv3_0.L(var26_33, (Object[])var4_4);
                    var19_19 = xh2_0.a(new Object[0], 0, (String)var19_19, var15_15);
                    var24_27 = R$string.something_wrong_msg;
                    var3_3 /* !! */  = hv3_0.K(var24_27);
                    var4_4 = this.v;
                    var4_4.ia((String)var3_3 /* !! */ , (String)var19_19);
                    break block239;
                }
                var20_20 = var7_7;
                var23_25 = var12_12;
            }
            if (var11_11 != 0) {
                var7_7 = var2_2.i;
                if (var7_7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                    var29_38 = 0;
                    var7_7 = null;
                }
                var28_37 = R$string.change_pincode;
                var12_12 = hv3_0.K(var28_37);
                var7_7.setText((CharSequence)var12_12);
                var7_7 = var2_2.h;
                if (var7_7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                    var29_38 = 0;
                    var7_7 = null;
                }
                var28_37 = hv3_0.m(R$color.accent_color_10);
                var7_7.setTextColor(var28_37);
            }
            var7_7 = this.x();
            tj2_2.Companion.getClass();
            var12_12 = tj2$a_0.a();
            var30_39 = var15_15;
            var15_15 = var1_1.getPinCode();
            var31_40 = var11_11;
            var32_41 = "getPinCode(...)";
            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var32_41);
            var12_12.getClass();
            Intrinsics.checkNotNullParameter(var15_15, (String)var4_4);
            var12_12.a = var15_15;
            var4_4 = var1_1.getProductDetails();
            if (var4_4 != null && (var27_36 = (var4_4 = var1_1.getProductDetails()).size()) > 0) {
                var4_4 = var1_1.getProductDetails();
                var11_11 = 0;
                var4_4 = (ProductDetail)var4_4.get(0);
                var32_41 = var19_19.G1();
                if (var32_41 != null) {
                    var32_41 = var1_1.getProductDetails();
                    var2_2.B((ArrayList)var32_41);
                }
            } else {
                var27_36 = 0;
                var4_4 = null;
            }
            if ((var32_41 = var2_2.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                var11_11 = 0;
                var32_41 = null;
            }
            var12_12 = var1_1.getPinCode();
            var32_41.setText((CharSequence)var12_12);
            var32_41 = var2_2.i;
            if (var32_41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                var11_11 = 0;
                var32_41 = null;
            }
            var32_41.setOnClickListener((View.OnClickListener)var2_2);
            var11_11 = h40_0.Q1();
            if (var11_11 != 0) {
                var32_41 = var2_2.i;
                if (var32_41 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                    var11_11 = 0;
                    var32_41 = null;
                }
                var32_41.setOnClickListener((View.OnClickListener)var2_2);
                var32_41 = var2_2.f;
                if (var32_41 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                    var11_11 = 0;
                    var32_41 = null;
                }
                var32_41.setOnClickListener((View.OnClickListener)var2_2);
                var32_41 = var19_19.getAddress();
                if (var32_41 == null) {
                    var11_11 = 1;
                } else {
                    var11_11 = 0;
                    var32_41 = null;
                }
                var12_12 = "Change";
                if (var11_11 == 0 && (var11_11 = var19_19.P1()) != 0) {
                    var3_3 /* !! */  = var2_2.h;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .setVisibility(8);
                    var3_3 /* !! */  = var2_2.C;
                    var33_42 = 0;
                    var10_10 = null;
                    if (var3_3 /* !! */  != null) {
                        var3_3 /* !! */ .setVisibility(0);
                        var3_3 /* !! */  = Unit.a;
                    }
                    if ((var3_3 /* !! */  = var2_2.B) != null) {
                        var3_3 /* !! */ .setVisibility(0);
                        var3_3 /* !! */  = Unit.a;
                    }
                    if ((var3_3 /* !! */  = var2_2.f) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    }
                    var33_42 = 8;
                    var3_3 /* !! */ .setVisibility(var33_42);
                    var3_3 /* !! */  = var19_19.getAddress();
                    if (var3_3 /* !! */  == null || (var3_3 /* !! */  = var3_3 /* !! */ .getFirstName()) == null) {
                        var3_3 /* !! */  = var18_18;
                    }
                    if ((var10_10 = var19_19.getAddress()) != null) {
                        var10_10 = var10_10.getCompleteAddress();
                    } else {
                        var33_42 = 0;
                        var10_10 = null;
                    }
                    var3_3 /* !! */  = var3_3 /* !! */ .concat((String)var5_5);
                    var5_5 = n1.a((String)var3_3 /* !! */ , (String)var6_6, (String)var10_10);
                    var6_6 = var2_2.C;
                    pi2_2.z((String)var5_5, (String)var3_3 /* !! */ , (AjioTextView)var6_6);
                    var3_3 /* !! */  = var2_2.B;
                    if (var3_3 /* !! */  != null) {
                        if ((var19_19 = var19_19.getAddress()) != null) {
                            var19_19 = var19_19.getPostalCode();
                        } else {
                            var26_34 = 0;
                            var19_19 = null;
                        }
                        var3_3 /* !! */ .setText((CharSequence)var19_19);
                        var19_19 = Unit.a;
                    }
                    if ((var3_3 /* !! */  = var2_2.i) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .setText((CharSequence)var12_12);
                } else {
                    var32_41 = var19_19.getAddress();
                    if (var32_41 != null && (var11_11 = var19_19.K2()) == 0) {
                        var32_41 = var19_19.getAddress();
                        if (var32_41 != null) {
                            var32_41 = var32_41.getFormattedAddress();
                        } else {
                            var11_11 = 0;
                            var32_41 = null;
                        }
                        if (var32_41 != null && (var11_11 = var32_41.length()) != 0) {
                            var3_3 /* !! */  = var2_2.h;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                var24_28 = false;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setVisibility(8);
                            var3_3 /* !! */  = var2_2.C;
                            var33_43 = 0;
                            var10_10 = null;
                            if (var3_3 /* !! */  != null) {
                                var3_3 /* !! */ .setVisibility(0);
                                var3_3 /* !! */  = Unit.a;
                            }
                            if ((var3_3 /* !! */  = var2_2.B) != null) {
                                var3_3 /* !! */ .setVisibility(0);
                                var3_3 /* !! */  = Unit.a;
                            }
                            if ((var3_3 /* !! */  = var2_2.f) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                var24_28 = false;
                                var3_3 /* !! */  = null;
                            }
                            var33_43 = 8;
                            var3_3 /* !! */ .setVisibility(var33_43);
                            var3_3 /* !! */  = var19_19.getAddress();
                            if (var3_3 /* !! */  == null || (var3_3 /* !! */  = var3_3 /* !! */ .getFirstName()) == null) {
                                var3_3 /* !! */  = var18_18;
                            }
                            if ((var10_10 = var19_19.getAddress()) != null) {
                                var10_10 = var10_10.getCompleteAddress();
                            } else {
                                var33_43 = 0;
                                var10_10 = null;
                            }
                            var3_3 /* !! */  = var3_3 /* !! */ .concat((String)var5_5);
                            var5_5 = n1.a((String)var3_3 /* !! */ , (String)var6_6, (String)var10_10);
                            var6_6 = var2_2.C;
                            pi2_2.z((String)var5_5, (String)var3_3 /* !! */ , (AjioTextView)var6_6);
                            var3_3 /* !! */  = var2_2.B;
                            if (var3_3 /* !! */  != null) {
                                if ((var19_19 = var19_19.getAddress()) != null) {
                                    var19_19 = var19_19.getPostalCode();
                                } else {
                                    var26_34 = 0;
                                    var19_19 = null;
                                }
                                var3_3 /* !! */ .setText((CharSequence)var19_19);
                                var19_19 = Unit.a;
                            }
                            if ((var3_3 /* !! */  = var2_2.i) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                                var24_28 = false;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setText((CharSequence)var12_12);
                        } else {
                            var5_5 = var19_19.getAddress();
                            if (var5_5 != null) {
                                var5_5 = var5_5.getPostalCode();
                            } else {
                                var25_31 = 0;
                                var5_5 = null;
                            }
                            if (var5_5 != null && (var25_31 = var5_5.length()) != 0) {
                                var5_5 = var2_2.h;
                                if (var5_5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                                    var25_31 = 0;
                                    var5_5 = null;
                                }
                                var34_44 = 8;
                                var5_5.setVisibility(var34_44);
                                var5_5 = var2_2.C;
                                if (var5_5 != null) {
                                    var34_44 = 0;
                                    var6_6 = null;
                                    var5_5.setVisibility(0);
                                    var5_5 = Unit.a;
                                }
                                if ((var5_5 = var2_2.f) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                                    var25_31 = 0;
                                    var5_5 = null;
                                }
                                var34_44 = 8;
                                var5_5.setVisibility(var34_44);
                                var19_19 = var19_19.getAddress();
                                if (var19_19 != null) {
                                    var19_19 = var19_19.getPostalCode();
                                } else {
                                    var26_34 = 0;
                                    var19_19 = null;
                                }
                                var19_19 = kp1_0.c((String)var10_10, (String)var19_19);
                                var5_5 = var2_2.C;
                                pi2_2.z((String)var19_19, (String)var3_3 /* !! */ , (AjioTextView)var5_5);
                                var3_3 /* !! */  = var2_2.i;
                                if (var3_3 /* !! */  == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                                    var24_28 = false;
                                    var3_3 /* !! */  = null;
                                }
                                var3_3 /* !! */ .setText((CharSequence)var12_12);
                            }
                        }
                    } else {
                        var5_5 = var1_1.getProductDetails();
                        if (var5_5 != null && (var25_31 = (var5_5 = var1_1.getProductDetails()).size()) > 0) {
                            var4_4 = var1_1.getProductDetails();
                            var25_31 = 0;
                            var5_5 = null;
                            var4_4 = (ProductDetail)var4_4.get(0);
                        }
                        if ((var5_5 = var2_2.B) != null) {
                            var34_45 = 8;
                            var5_5.setVisibility(var34_45);
                            var5_5 = Unit.a;
                        }
                        var5_5 = var1_1.getProductDetails();
                        if ((var19_19 = var19_19.G1()) != null) {
                            var2_2.B((ArrayList)var5_5);
                        }
                        if ((var19_19 = var2_2.h) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var16_16);
                            var26_34 = 0;
                            var19_19 = null;
                        }
                        var25_31 = 8;
                        var19_19.setVisibility(var25_31);
                        var19_19 = var2_2.C;
                        if (var19_19 != null) {
                            var25_31 = 0;
                            var5_5 = null;
                            var19_19.setVisibility(0);
                            var19_19 = Unit.a;
                        }
                        if ((var19_19 = var1_1.getPinCode()) != null && (var26_34 = var19_19.length()) != 0) {
                            var19_19 = var1_1.getPinCode().toString();
                            var19_19 = kp1_0.c((String)var10_10, (String)var19_19);
                            var5_5 = var2_2.C;
                            pi2_2.z((String)var19_19, (String)var3_3 /* !! */ , (AjioTextView)var5_5);
                        }
                        if ((var3_3 /* !! */  = var2_2.i) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var14_14);
                            var24_28 = false;
                            var3_3 /* !! */  = null;
                        }
                        var3_3 /* !! */ .setText((CharSequence)var12_12);
                    }
                }
            }
            var26_34 = var1_1.isServicability();
            var3_3 /* !! */  = "EDD on PDP";
            var5_5 = "pdp screen";
            var6_6 = ", item id -";
            if (var26_34 == 0) {
                var19_19 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var10_10 = var1_1.getPinCode();
                var32_41 = "Delivery not available, pincode -";
                var6_6 = UX.c((String)var32_41, (String)var10_10, (String)var6_6, (String)var7_7);
                var19_19.pushButtonTapEvent((String)var3_3 /* !! */ , var6_6, (String)var5_5);
                var3_3 /* !! */  = var2_2.f;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                    var26_34 = 8;
                    var24_28 = false;
                    var3_3 /* !! */  = null;
                } else {
                    var26_34 = 8;
                }
                var3_3 /* !! */ .setVisibility(var26_34);
                var19_19 = var2_2.g;
                if (var19_19 != null) {
                    var24_28 = false;
                    var3_3 /* !! */  = null;
                    var19_19.setVisibility(0);
                    var19_19 = Unit.a;
                }
                if ((var3_3 /* !! */  = var2_2.j) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                    var26_34 = 8;
                    var24_28 = false;
                    var3_3 /* !! */  = null;
                } else {
                    var26_34 = 8;
                }
                var3_3 /* !! */ .setVisibility(var26_34);
                var3_3 /* !! */  = var2_2.k;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                    var24_28 = false;
                    var3_3 /* !! */  = null;
                }
                var3_3 /* !! */ .setVisibility(var26_34);
                var3_3 /* !! */  = var2_2.l;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                    var24_28 = false;
                    var3_3 /* !! */  = null;
                }
                var3_3 /* !! */ .setVisibility(var26_34);
                var19_19 = var2_2.p;
                if (var19_19 != null) {
                    ai0_2.i((View)var19_19);
                    var19_19 = Unit.a;
                }
                if ((var3_3 /* !! */  = var2_2.m) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_20);
                    var26_34 = 8;
                    var24_28 = false;
                    var3_3 /* !! */  = null;
                } else {
                    var26_34 = 8;
                }
                var3_3 /* !! */ .setVisibility(var26_34);
                var3_3 /* !! */  = var2_2.n;
                if (var3_3 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var23_25);
                    var24_28 = false;
                    var3_3 /* !! */  = null;
                }
                var3_3 /* !! */ .setVisibility(var26_34);
                var19_19 = var2_2.r;
                if (var19_19 != null) {
                    ai0_2.i((View)var19_19);
                    var19_19 = Unit.a;
                }
                if (var31_40 != 0) {
                    this.y(var1_1);
                }
                if ((var26_34 = (int)var1_1.isFirstTimeCalled()) == 0) {
                    var3_3 /* !! */  = var2_2.o;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var22_23);
                        var26_34 = 0;
                        var19_19 = null;
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    } else {
                        var26_34 = 0;
                        var19_19 = null;
                    }
                    var3_3 /* !! */ .setVisibility(0);
                    var3_3 /* !! */  = var2_2.o;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var22_23);
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    }
                    ai0_2.a((View)var3_3 /* !! */ );
                } else {
                    var3_3 /* !! */  = var2_2.o;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var22_23);
                        var26_34 = 8;
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    } else {
                        var26_34 = 8;
                    }
                    var3_3 /* !! */ .setVisibility(var26_34);
                    var19_19 = Unit.a;
                }
                var19_19 = "Currently, we do not deliver to %s";
                if (var4_4 != null) {
                    var3_3 /* !! */  = var4_4.getReasonForNotServiceability();
                    var4_4 = "Selected size is not deliverable to %s";
                    if (var3_3 /* !! */  != null && (var25_31 = var3_3 /* !! */ .length()) != 0) {
                        var5_5 = "ns";
                        var24_28 = var3_3 /* !! */ .equalsIgnoreCase((String)var5_5);
                        if (var24_28) {
                            var3_3 /* !! */  = var2_2.o;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var22_23);
                                var24_28 = false;
                                var3_3 /* !! */  = null;
                            }
                            var4_4 = StringCompanionObject.INSTANCE;
                            var4_4 = var1_1.getPinCode();
                            var25_31 = 1;
                            var6_6 = new Object[var25_31];
                            var29_38 = 0;
                            var7_7 = null;
                            var6_6[0] = var4_4;
                            var10_10 = var30_39;
                            n40_0.a(var6_6, var25_31, (String)var19_19, var30_39, (AjioTextView)var3_3 /* !! */ );
                        } else {
                            var10_10 = var30_39;
                            var25_31 = 1;
                            var29_38 = 0;
                            var7_7 = null;
                            var19_19 = var2_2.o;
                            if (var19_19 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var22_23);
                                var24_28 = false;
                                var3_3 /* !! */  = null;
                            } else {
                                var3_3 /* !! */  = var19_19;
                            }
                            var19_19 = StringCompanionObject.INSTANCE;
                            var19_19 = var1_1.getPinCode();
                            var6_6 = new Object[var25_31];
                            var6_6[0] = var19_19;
                            n40_0.a(var6_6, var25_31, (String)var4_4, (String)var10_10, (AjioTextView)var3_3 /* !! */ );
                        }
                    } else {
                        var10_10 = var30_39;
                        var25_31 = 1;
                        var19_19 = var2_2.o;
                        if (var19_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var22_23);
                            var24_28 = false;
                            var3_3 /* !! */  = null;
                        } else {
                            var3_3 /* !! */  = var19_19;
                        }
                        var19_19 = StringCompanionObject.INSTANCE;
                        var19_19 = var1_1.getPinCode();
                        var6_6 = new Object[var25_31];
                        var29_38 = 0;
                        var7_7 = null;
                        var6_6[0] = var19_19;
                        n40_0.a(var6_6, var25_31, (String)var4_4, (String)var10_10, (AjioTextView)var3_3 /* !! */ );
                    }
                } else {
                    var10_10 = var30_39;
                    var25_31 = 1;
                    var29_38 = 0;
                    var7_7 = null;
                    var3_3 /* !! */  = var2_2.o;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var22_23);
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    }
                    var4_4 = StringCompanionObject.INSTANCE;
                    var4_4 = var1_1.getPinCode();
                    var6_6 = new Object[var25_31];
                    var6_6[0] = var4_4;
                    n40_0.a(var6_6, var25_31, (String)var19_19, (String)var10_10, (AjioTextView)var3_3 /* !! */ );
                }
            } else {
                var10_10 = var30_39;
                var26_34 = h40_0.Q1();
                if (var26_34 == 0 && (var19_19 = var2_2.p) != null) {
                    ai0_2.B((View)var19_19);
                    var19_19 = Unit.a;
                }
                if ((var19_19 = var2_2.f) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var17_17);
                    var26_34 = 0;
                    var19_19 = null;
                }
                var19_19.setVisibility(8);
                var19_19 = var2_2.g;
                var11_11 = 0;
                var32_41 = null;
                if (var19_19 != null) {
                    var19_19.setVisibility(0);
                    var19_19 = Unit.a;
                }
                if ((var26_34 = h40_0.Q1()) == 0) {
                    var19_19 = var2_2.k;
                    if (var19_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                        var26_34 = 0;
                        var19_19 = null;
                    }
                    var19_19.setVisibility(0);
                    var19_19 = var2_2.j;
                    if (var19_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                        var26_34 = 0;
                        var19_19 = null;
                    }
                    var19_19.setVisibility(0);
                    var19_19 = var2_2.l;
                    if (var19_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                        var26_34 = 0;
                        var19_19 = null;
                    }
                    var19_19.setVisibility(0);
                }
                if ((var19_19 = var2_2.m) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_20);
                    var26_34 = 0;
                    var19_19 = null;
                }
                var19_19.setVisibility(0);
                var19_19 = var2_2.n;
                if (var19_19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var23_25);
                    var26_34 = 0;
                    var19_19 = null;
                }
                var19_19.setVisibility(0);
                var19_19 = var2_2.r;
                if (var19_19 != null) {
                    ai0_2.B((View)var19_19);
                    var19_19 = Unit.a;
                }
                if ((var19_19 = var2_2.o) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var22_23);
                    var26_34 = 0;
                    var19_19 = null;
                }
                var35_46 = 8;
                var19_19.setVisibility(var35_46);
                if (var4_4 != null) {
                    var26_34 = (int)var4_4.isCodEligible();
                    if (var26_34 != 0) {
                        var19_19 = var2_2.n;
                        if (var19_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var23_25);
                            var26_34 = 0;
                            var19_19 = null;
                        }
                        var35_46 = R$string.new_cod_available_online_payment;
                        var8_8 = hv3_0.K(var35_46);
                        var19_19.setText((CharSequence)var8_8);
                        var19_19 = "COD available";
                    } else {
                        var19_19 = var2_2.n;
                        if (var19_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var23_25);
                            var26_34 = 0;
                            var19_19 = null;
                        }
                        var35_46 = R$string.cod_unavailable_online_payment;
                        var8_8 = hv3_0.K(var35_46);
                        var19_19.setText((CharSequence)var8_8);
                        var19_19 = "COD unavailable";
                    }
                    var8_8 = var4_4.getEddLower();
                    var35_46 = (int)TextUtils.isEmpty((CharSequence)var8_8);
                    var9_9 = "yyyy-MM-dd'T'HH:mm:ssZZZZ";
                    var32_41 = "dd MMM";
                    if (var35_46 == 0) {
                        var8_8 = k7.c(var4_4.getEddLower(), (String)var32_41, (String)var9_9);
                        var12_12 = "-";
                        var8_8 = Ft2.a(var8_8, (String)var12_12);
                    } else {
                        var8_8 = var18_18;
                    }
                    var12_12 = var4_4.getEddUpper();
                    var28_37 = (int)TextUtils.isEmpty((CharSequence)var12_12);
                    if (var28_37 == 0) {
                        var4_4 = k7.c(var4_4.getEddUpper(), (String)var32_41, (String)var9_9);
                        var8_8 = Ft2.a(var8_8, (String)var4_4);
                        var4_4 = var2_2.k;
                        if (var4_4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                            var27_36 = 0;
                            var4_4 = null;
                        }
                        var9_9 = StringCompanionObject.INSTANCE;
                        var36_47 = R$string.expected_delivery_format;
                        var9_9 = hv3_0.K(var36_47);
                        var11_11 = 1;
                        var12_12 = new Object[var11_11];
                        var13_13 = null;
                        var12_12[0] = var8_8;
                        n40_0.a(var12_12, var11_11, (String)var9_9, (String)var10_10, (AjioTextView)var4_4);
                    } else {
                        var4_4 = var2_2.k;
                        if (var4_4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                            var27_36 = 0;
                            var4_4 = null;
                        }
                        var36_48 = 8;
                        var4_4.setVisibility(var36_48);
                    }
                    var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var9_9 = var1_1.getPinCode();
                    var10_10 = new StringBuilder();
                    var10_10.append((String)var19_19);
                    var10_10.append(", pincode -");
                    var10_10.append((String)var9_9);
                    var10_10.append((String)var6_6);
                    var10_10.append((String)var7_7);
                    var19_19 = h30_0.a((StringBuilder)var10_10, ", EDD -", var8_8);
                    var4_4.pushButtonTapEvent((String)var3_3 /* !! */ , var19_19, (String)var5_5);
                } else {
                    var3_3 /* !! */  = var2_2.k;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var13_13);
                        var19_19 = var18_18;
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    } else {
                        var19_19 = var18_18;
                    }
                    var3_3 /* !! */ .setText((CharSequence)var19_19);
                    var3_3 /* !! */  = var2_2.n;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var23_25);
                        var24_28 = false;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .setText((CharSequence)var19_19);
                }
                if (var31_40 != 0) {
                    this.y(var1_1);
                }
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void B(ArrayList object) {
        Object object2;
        String string2;
        Object object3;
        pi2_2 pi2_22;
        block75: {
            int n3;
            Object object4;
            Object object5;
            String string3;
            Object object6;
            block74: {
                String string4;
                Object object7;
                block56: {
                    block73: {
                        int n4;
                        Object object8;
                        block71: {
                            block55: {
                                block70: {
                                    double d2;
                                    double d5;
                                    double d7;
                                    Object object9;
                                    Object object10;
                                    Object object11;
                                    int n7;
                                    block67: {
                                        Object object12;
                                        block72: {
                                            String string5;
                                            String string6;
                                            boolean bl2;
                                            block68: {
                                                block69: {
                                                    double d9;
                                                    double d12;
                                                    int n8;
                                                    block65: {
                                                        Object object13;
                                                        String string7;
                                                        String string8;
                                                        Object object14;
                                                        Object object15;
                                                        block66: {
                                                            block64: {
                                                                Object object16;
                                                                block54: {
                                                                    block63: {
                                                                        block61: {
                                                                            block53: {
                                                                                block57: {
                                                                                    double d13;
                                                                                    block58: {
                                                                                        block62: {
                                                                                            block59: {
                                                                                                block60: {
                                                                                                    double d14;
                                                                                                    double d15;
                                                                                                    double d16;
                                                                                                    boolean bl3;
                                                                                                    int n10;
                                                                                                    block52: {
                                                                                                        block51: {
                                                                                                            pi2_22 = this;
                                                                                                            if (object == null) return;
                                                                                                            n10 = object.isEmpty();
                                                                                                            if (n10 != 0) {
                                                                                                                return;
                                                                                                            }
                                                                                                            object3 = this.y;
                                                                                                            string2 = null;
                                                                                                            if (object3 != null) {
                                                                                                                object3.setVisibility(0);
                                                                                                            }
                                                                                                            object3 = object.iterator();
                                                                                                            while ((n8 = object3.hasNext()) != 0) {
                                                                                                                object2 = object3.next();
                                                                                                                object6 = object2;
                                                                                                                object6 = (ProductDetail)object2;
                                                                                                                object7 = ((ProductDetail)object6).getDeliveryMethod();
                                                                                                                bl2 = Intrinsics.areEqual(object7, object8 = "PRIORITY");
                                                                                                                if (!bl2 || (n7 = ((ProductDetail)object6).isServicability()) == 0) continue;
                                                                                                                break block51;
                                                                                                            }
                                                                                                            n8 = 0;
                                                                                                            object2 = null;
                                                                                                        }
                                                                                                        object2 = (ProductDetail)object2;
                                                                                                        object3 = object.iterator();
                                                                                                        while ((n7 = object3.hasNext()) != 0) {
                                                                                                            object7 = object6 = object3.next();
                                                                                                            object7 = (ProductDetail)object6;
                                                                                                            object8 = ((ProductDetail)object7).getDeliveryMethod();
                                                                                                            bl3 = Intrinsics.areEqual(object8, object11 = "STANDARD");
                                                                                                            if (!bl3 || !(bl2 = ((ProductDetail)object7).isServicability())) continue;
                                                                                                            break block52;
                                                                                                        }
                                                                                                        n7 = 0;
                                                                                                        object6 = null;
                                                                                                    }
                                                                                                    object6 = (ProductDetail)object6;
                                                                                                    n10 = 8;
                                                                                                    bl2 = true;
                                                                                                    if (object2 != null && (bl3 = ((ProductDetail)object2).isServicability()) == bl2) {
                                                                                                        object8 = pi2_22.D;
                                                                                                        if (object8 != null) {
                                                                                                            object8.setVisibility(0);
                                                                                                        }
                                                                                                    } else {
                                                                                                        object8 = pi2_22.D;
                                                                                                        if (object8 != null) {
                                                                                                            object8.setVisibility(n10);
                                                                                                        }
                                                                                                    }
                                                                                                    if (object6 != null && (bl3 = ((ProductDetail)object6).isServicability()) == bl2) {
                                                                                                        object3 = pi2_22.E;
                                                                                                        if (object3 != null) {
                                                                                                            object3.setVisibility(0);
                                                                                                        }
                                                                                                    } else {
                                                                                                        object7 = pi2_22.E;
                                                                                                        if (object7 != null) {
                                                                                                            object7.setVisibility(n10);
                                                                                                        }
                                                                                                    }
                                                                                                    object3 = new Ref$ObjectRef();
                                                                                                    ((Ref$ObjectRef)object3).element = object7 = "";
                                                                                                    object8 = "Order by ";
                                                                                                    object11 = "</b>. ";
                                                                                                    object16 = "</b> ";
                                                                                                    string3 = " Order by ";
                                                                                                    object10 = "</b>";
                                                                                                    string4 = "</b>.";
                                                                                                    object9 = "Delivery by <b>";
                                                                                                    string6 = "EEE";
                                                                                                    string5 = "yyyy-MM-dd'T'HH:mm:ss";
                                                                                                    object5 = "dateInString";
                                                                                                    d7 = 0.0;
                                                                                                    string2 = "toString(...)";
                                                                                                    if (object2 == null) break block57;
                                                                                                    object4 = h40_0.a;
                                                                                                    object = object7;
                                                                                                    object7 = ((h40_0)object4).d0();
                                                                                                    object4 = object6;
                                                                                                    if (object7 != null) {
                                                                                                        object6 = ((ProductDetail)object2).getDeliverySLA();
                                                                                                        object6 = (DeliveryTimeData)object7.get(object6);
                                                                                                    } else {
                                                                                                        n7 = 0;
                                                                                                        object6 = null;
                                                                                                    }
                                                                                                    object7 = ". Order by ";
                                                                                                    object15 = object8;
                                                                                                    object8 = "<b>";
                                                                                                    if (object6 == null) break block58;
                                                                                                    object14 = ((ProductDetail)object2).getDeliveryFee();
                                                                                                    string8 = object11;
                                                                                                    object11 = " for ";
                                                                                                    string7 = object10;
                                                                                                    object10 = "</b> for ";
                                                                                                    if (object14 == null || (d16 = (d15 = (d14 = ((Double)(object14 = ((ProductDetail)object2).getDeliveryFee())).doubleValue()) - d7) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1)) <= 0) break block59;
                                                                                                    object7 = new StringBuilder();
                                                                                                    d16 = (double)((DeliveryTimeData)object6).getShowDay();
                                                                                                    if (d16 == false) break block60;
                                                                                                    object11 = ((ProductDetail)object2).getEddUpper();
                                                                                                    if (object11 == null) {
                                                                                                        object11 = object;
                                                                                                    }
                                                                                                    object6 = ((DeliveryTimeData)object6).getDisplayName();
                                                                                                    Intrinsics.checkNotNullParameter(object11, (String)object5);
                                                                                                    d16 = ((String)object11).length();
                                                                                                    if (d16 == false) {
                                                                                                        object11 = object;
                                                                                                        object14 = object16;
                                                                                                        object13 = object9;
                                                                                                        break block53;
                                                                                                    } else {
                                                                                                        object14 = object16;
                                                                                                        object13 = object9;
                                                                                                        object9 = Locale.ENGLISH;
                                                                                                        object16 = new SimpleDateFormat(string5, (Locale)object9);
                                                                                                        object11 = ((DateFormat)object16).parse((String)object11);
                                                                                                        object16 = new SimpleDateFormat(string6, (Locale)object9);
                                                                                                        object11 = ((DateFormat)object16).format((Date)object11);
                                                                                                        break block53;
                                                                                                    }
                                                                                                }
                                                                                                object14 = object16;
                                                                                                object13 = object9;
                                                                                                object6 = ((DeliveryTimeData)object6).getDisplayName();
                                                                                                object16 = new StringBuilder();
                                                                                                ((StringBuilder)object16).append((String)object6);
                                                                                                ((StringBuilder)object16).append((String)object11);
                                                                                                object6 = ((StringBuilder)object16).toString();
                                                                                                ((StringBuilder)object7).append((String)object6);
                                                                                                break block61;
                                                                                            }
                                                                                            object14 = object16;
                                                                                            object13 = object9;
                                                                                            object8 = new StringBuilder();
                                                                                            int n14 = ((DeliveryTimeData)object6).getShowDay();
                                                                                            if (n14 == 0) break block62;
                                                                                            object11 = ((ProductDetail)object2).getEddUpper();
                                                                                            if (object11 == null) {
                                                                                                object11 = object;
                                                                                            }
                                                                                            object6 = ((DeliveryTimeData)object6).getDisplayName();
                                                                                            Intrinsics.checkNotNullParameter(object11, (String)object5);
                                                                                            n14 = ((String)object11).length();
                                                                                            if (n14 == 0) break block63;
                                                                                            try {
                                                                                                object9 = Locale.ENGLISH;
                                                                                                object16 = new SimpleDateFormat(string5, (Locale)object9);
                                                                                                object11 = ((DateFormat)object16).parse((String)object11);
                                                                                                object16 = new SimpleDateFormat(string6, (Locale)object9);
                                                                                                object11 = ((DateFormat)object16).format((Date)object11);
                                                                                                break block54;
                                                                                            }
                                                                                            catch (Exception exception) {}
                                                                                        }
                                                                                        object6 = ((DeliveryTimeData)object6).getDisplayName();
                                                                                        object16 = new StringBuilder();
                                                                                        ((StringBuilder)object16).append((String)object6);
                                                                                        ((StringBuilder)object16).append((String)object11);
                                                                                        object6 = ((StringBuilder)object16).toString();
                                                                                        ((StringBuilder)object8).append((String)object6);
                                                                                        break block64;
                                                                                    }
                                                                                    String string9 = object11;
                                                                                    String string10 = object16;
                                                                                    String string11 = object10;
                                                                                    String string12 = object9;
                                                                                    object6 = ((ProductDetail)object2).getDeliveryFee();
                                                                                    if (object6 != null && (n7 = (int)((d13 = (d12 = ((Double)(object6 = ((ProductDetail)object2).getDeliveryFee())).doubleValue()) - d7) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1))) > 0) {
                                                                                        int n15;
                                                                                        object6 = new StringBuilder();
                                                                                        object11 = ((ProductDetail)object2).getEddUpper();
                                                                                        Intrinsics.checkNotNullExpressionValue(object11, "getEddUpper(...)");
                                                                                        object11 = k7.n((String)object11);
                                                                                        object10 = object9;
                                                                                        object16 = new StringBuilder((String)object9);
                                                                                        ((StringBuilder)object16).append((String)object11);
                                                                                        object11 = string10;
                                                                                        ((StringBuilder)object16).append(string10);
                                                                                        object16 = ((StringBuilder)object16).toString();
                                                                                        ((StringBuilder)object6).append((String)object16);
                                                                                        object16 = qz2_0.w(((ProductDetail)object2).getDeliveryFee());
                                                                                        object9 = new StringBuilder((String)object8);
                                                                                        ((StringBuilder)object9).append((String)object16);
                                                                                        object8 = string11;
                                                                                        ((StringBuilder)object9).append(string11);
                                                                                        object16 = ((StringBuilder)object9).toString();
                                                                                        ((StringBuilder)object6).append((String)object16);
                                                                                        object16 = ((ProductDetail)object2).getCutOffTime();
                                                                                        if (object16 != null && (n15 = ((String)object16).length()) != 0) {
                                                                                            object16 = ((ProductDetail)object2).getCutOffTime();
                                                                                            n15 = (int)(k7.y((String)object16) ? 1 : 0);
                                                                                            object2 = n15 != 0 ? k7.u(((ProductDetail)object2).getCutOffTime()) : k7.r(((ProductDetail)object2).getCutOffTime());
                                                                                            object16 = new StringBuilder((String)object7);
                                                                                            ((StringBuilder)object16).append((String)object2);
                                                                                            object2 = ((StringBuilder)object16).toString();
                                                                                            ((StringBuilder)object6).append((String)object2);
                                                                                        }
                                                                                        object2 = ((StringBuilder)object6).toString();
                                                                                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                                                                                        object9 = object15;
                                                                                        object7 = string9;
                                                                                    } else {
                                                                                        int n16;
                                                                                        object11 = string10;
                                                                                        object8 = string11;
                                                                                        object10 = string12;
                                                                                        object6 = new StringBuilder();
                                                                                        object7 = ((ProductDetail)object2).getEddUpper();
                                                                                        if (object7 == null) {
                                                                                            object7 = object;
                                                                                        }
                                                                                        object7 = k7.n((String)object7);
                                                                                        object16 = new StringBuilder((String)object10);
                                                                                        ((StringBuilder)object16).append((String)object7);
                                                                                        object7 = string9;
                                                                                        ((StringBuilder)object16).append(string9);
                                                                                        object16 = ((StringBuilder)object16).toString();
                                                                                        ((StringBuilder)object6).append((String)object16);
                                                                                        ((StringBuilder)object6).append("<font color='#202020'>Free</font>");
                                                                                        object16 = ((ProductDetail)object2).getCutOffTime();
                                                                                        if (object16 == null || (n16 = ((String)object16).length()) == 0) {
                                                                                            object9 = object15;
                                                                                        } else {
                                                                                            object16 = ((ProductDetail)object2).getCutOffTime();
                                                                                            n16 = (int)(k7.y((String)object16) ? 1 : 0);
                                                                                            object2 = n16 != 0 ? k7.u(((ProductDetail)object2).getCutOffTime()) : k7.r(((ProductDetail)object2).getCutOffTime());
                                                                                            object9 = object15;
                                                                                            object16 = new StringBuilder((String)object15);
                                                                                            ((StringBuilder)object16).append((String)object2);
                                                                                            object2 = ((StringBuilder)object16).toString();
                                                                                            ((StringBuilder)object6).append((String)object2);
                                                                                        }
                                                                                        object2 = ((StringBuilder)object6).toString();
                                                                                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                                                                                    }
                                                                                    ((Ref$ObjectRef)object3).element = object2;
                                                                                    object6 = pi2_22.A;
                                                                                    if (object6 != null) {
                                                                                        object2 = hv3_0.f((String)object2);
                                                                                        object6.setText(object2);
                                                                                    }
                                                                                    if ((object2 = pi2_22.E) != null) {
                                                                                        n7 = 0;
                                                                                        object6 = null;
                                                                                        object2.setVisibility(0);
                                                                                    }
                                                                                    break block65;
                                                                                }
                                                                                object4 = object6;
                                                                                object = object7;
                                                                                object7 = object11;
                                                                                object11 = object16;
                                                                                String string13 = object9;
                                                                                object9 = object8;
                                                                                object8 = object10;
                                                                                object10 = string13;
                                                                                break block65;
                                                                                catch (Exception exception) {}
                                                                                {
                                                                                    object11 = object;
                                                                                }
                                                                            }
                                                                            object16 = new StringBuilder();
                                                                            ((StringBuilder)object16).append((String)object6);
                                                                            ((StringBuilder)object16).append(",  <b>");
                                                                            ((StringBuilder)object16).append((String)object11);
                                                                            ((StringBuilder)object16).append((String)object10);
                                                                            object6 = ((StringBuilder)object16).toString();
                                                                            ((StringBuilder)object7).append((String)object6);
                                                                        }
                                                                        object6 = qz2_0.w(((ProductDetail)object2).getDeliveryFee());
                                                                        object11 = new StringBuilder((String)object8);
                                                                        ((StringBuilder)object11).append((String)object6);
                                                                        ((StringBuilder)object11).append(string4);
                                                                        object6 = ((StringBuilder)object11).toString();
                                                                        ((StringBuilder)object7).append((String)object6);
                                                                        object6 = ((ProductDetail)object2).getCutOffTime();
                                                                        n7 = (int)(k7.y((String)object6) ? 1 : 0);
                                                                        object2 = n7 != 0 ? k7.u(((ProductDetail)object2).getCutOffTime()) : k7.r(((ProductDetail)object2).getCutOffTime());
                                                                        object6 = new StringBuilder(string3);
                                                                        ((StringBuilder)object6).append((String)object2);
                                                                        object2 = ((StringBuilder)object6).toString();
                                                                        ((StringBuilder)object7).append((String)object2);
                                                                        object2 = ((StringBuilder)object7).toString();
                                                                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                                                                        break block66;
                                                                    }
                                                                    object11 = object;
                                                                }
                                                                object16 = new StringBuilder();
                                                                ((StringBuilder)object16).append((String)object6);
                                                                ((StringBuilder)object16).append(",   <b>");
                                                                ((StringBuilder)object16).append((String)object11);
                                                                ((StringBuilder)object16).append((String)object10);
                                                                object6 = ((StringBuilder)object16).toString();
                                                                ((StringBuilder)object8).append((String)object6);
                                                            }
                                                            ((StringBuilder)object8).append("<font color='#202020'>FREE</font>");
                                                            object6 = ((ProductDetail)object2).getCutOffTime();
                                                            n7 = (int)(k7.y((String)object6) ? 1 : 0);
                                                            object2 = n7 != 0 ? k7.u(((ProductDetail)object2).getCutOffTime()) : k7.r(((ProductDetail)object2).getCutOffTime());
                                                            object6 = new StringBuilder((String)object7);
                                                            ((StringBuilder)object6).append((String)object2);
                                                            ((StringBuilder)object6).append("}");
                                                            object2 = ((StringBuilder)object6).toString();
                                                            ((StringBuilder)object8).append((String)object2);
                                                            object2 = ((StringBuilder)object8).toString();
                                                            Intrinsics.checkNotNullExpressionValue(object2, string2);
                                                        }
                                                        ((Ref$ObjectRef)object3).element = object2;
                                                        object6 = pi2_22.z;
                                                        if (object6 != null) {
                                                            object2 = hv3_0.f((String)object2);
                                                            object6.setText(object2);
                                                        }
                                                        if ((object2 = pi2_22.D) != null) {
                                                            n7 = 0;
                                                            object6 = null;
                                                            object2.setVisibility(0);
                                                        }
                                                        object9 = object15;
                                                        object11 = object14;
                                                        object7 = string8;
                                                        object8 = string7;
                                                        object10 = object13;
                                                    }
                                                    if (object4 == null) return;
                                                    object2 = h40_0.a.d0();
                                                    if (object2 != null) {
                                                        object6 = ((ProductDetail)object4).getDeliverySLA();
                                                        object2 = (DeliveryTimeData)object2.get(object6);
                                                        object12 = object2;
                                                    } else {
                                                        object12 = null;
                                                    }
                                                    if (object12 == null) break block67;
                                                    object2 = ((ProductDetail)object4).getDeliveryFee();
                                                    object6 = " ";
                                                    if (object2 == null || (n8 = (d9 = (d12 = ((Double)(object2 = ((ProductDetail)object4).getDeliveryFee())).doubleValue()) - d7) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) <= 0) break block68;
                                                    object2 = new Object();
                                                    bl2 = ((DeliveryTimeData)object12).getShowDay();
                                                    if (!bl2) break block69;
                                                    object6 = ((ProductDetail)object4).getEddUpper();
                                                    if (object6 == null) {
                                                        object6 = object;
                                                    }
                                                    object7 = ((DeliveryTimeData)object12).getDisplayName();
                                                    Intrinsics.checkNotNullParameter(object6, (String)object5);
                                                    n4 = ((String)object6).length();
                                                    if (n4 == 0) break block70;
                                                    try {
                                                        object11 = Locale.ENGLISH;
                                                        object5 = new SimpleDateFormat(string5, (Locale)object11);
                                                        object5 = ((DateFormat)object5).parse((String)object6);
                                                        object6 = new SimpleDateFormat(string6, (Locale)object11);
                                                        object5 = ((DateFormat)object6).format((Date)object5);
                                                        break block55;
                                                    }
                                                    catch (Exception exception) {}
                                                }
                                                object5 = ((DeliveryTimeData)object12).getDisplayName();
                                                object7 = new StringBuilder();
                                                ((StringBuilder)object7).append((String)object5);
                                                ((StringBuilder)object7).append((String)object6);
                                                object5 = ((StringBuilder)object7).toString();
                                                ((StringBuilder)object2).append((String)object5);
                                                break block71;
                                            }
                                            object2 = new Object();
                                            bl2 = ((DeliveryTimeData)object12).getShowDay();
                                            if (!bl2) break block72;
                                            object6 = ((ProductDetail)object4).getEddUpper();
                                            if (object6 == null) {
                                                object6 = object;
                                            }
                                            object7 = ((DeliveryTimeData)object12).getDisplayName();
                                            Intrinsics.checkNotNullParameter(object6, (String)object5);
                                            n3 = ((String)object6).length();
                                            if (n3 == 0) break block73;
                                            try {
                                                object8 = Locale.ENGLISH;
                                                object5 = new SimpleDateFormat(string5, (Locale)object8);
                                                object5 = ((DateFormat)object5).parse((String)object6);
                                                object6 = new SimpleDateFormat(string6, (Locale)object8);
                                                object5 = ((DateFormat)object6).format((Date)object5);
                                                break block56;
                                            }
                                            catch (Exception exception) {}
                                        }
                                        object5 = ((DeliveryTimeData)object12).getDisplayName();
                                        object7 = new StringBuilder();
                                        ((StringBuilder)object7).append((String)object5);
                                        ((StringBuilder)object7).append((String)object6);
                                        object5 = ((StringBuilder)object7).toString();
                                        ((StringBuilder)object2).append((String)object5);
                                        break block74;
                                    }
                                    object2 = ((ProductDetail)object4).getDeliveryFee();
                                    if (object2 != null && (n7 = (d5 = (d2 = ((Double)(object2 = ((ProductDetail)object4).getDeliveryFee())).doubleValue()) - d7) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) > 0) {
                                        int n17;
                                        object2 = new Object();
                                        object5 = ((ProductDetail)object4).getEddUpper();
                                        if (object5 == null) {
                                            object5 = object;
                                        }
                                        object5 = k7.n((String)object5);
                                        object6 = new StringBuilder((String)object10);
                                        ((StringBuilder)object6).append((String)object5);
                                        ((StringBuilder)object6).append((String)object7);
                                        object5 = ((StringBuilder)object6).toString();
                                        ((StringBuilder)object2).append((String)object5);
                                        object5 = ((ProductDetail)object4).getCutOffTime();
                                        if (object5 != null && (n17 = ((String)object5).length()) != 0) {
                                            object5 = ((ProductDetail)object4).getCutOffTime();
                                            n17 = (int)(k7.y((String)object5) ? 1 : 0);
                                            object5 = n17 != 0 ? k7.u(((ProductDetail)object4).getCutOffTime()) : k7.r(((ProductDetail)object4).getCutOffTime());
                                            object7 = "Order by <b>";
                                            object6 = new StringBuilder((String)object7);
                                            ((StringBuilder)object6).append((String)object5);
                                            ((StringBuilder)object6).append((String)object8);
                                            object5 = ((StringBuilder)object6).toString();
                                            ((StringBuilder)object2).append((String)object5);
                                        }
                                        object2 = ((StringBuilder)object2).toString();
                                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                                    } else {
                                        int n18;
                                        object2 = new Object();
                                        object5 = ((ProductDetail)object4).getEddUpper();
                                        object7 = object5 == null ? object : object5;
                                        object5 = k7.n((String)object7);
                                        object6 = new StringBuilder((String)object10);
                                        ((StringBuilder)object6).append((String)object5);
                                        ((StringBuilder)object6).append((String)object11);
                                        object5 = ((StringBuilder)object6).toString();
                                        ((StringBuilder)object2).append((String)object5);
                                        object5 = ((ProductDetail)object4).getCutOffTime();
                                        if (object5 != null && (n18 = ((String)object5).length()) != 0) {
                                            object5 = ((ProductDetail)object4).getCutOffTime();
                                            n18 = (int)(k7.y((String)object5) ? 1 : 0);
                                            object5 = n18 != 0 ? k7.u(((ProductDetail)object4).getCutOffTime()) : k7.r(((ProductDetail)object4).getCutOffTime());
                                            object6 = new StringBuilder((String)object9);
                                            ((StringBuilder)object6).append((String)object5);
                                            object5 = ((StringBuilder)object6).toString();
                                            ((StringBuilder)object2).append((String)object5);
                                        }
                                        object2 = ((StringBuilder)object2).toString();
                                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                                    }
                                    ((Ref$ObjectRef)object3).element = object2;
                                    object3 = pi2_22.A;
                                    if (object3 != null) {
                                        string2 = hv3_0.f((String)object2);
                                        object3.setText(string2);
                                    }
                                    if ((object3 = pi2_22.E) == null) return;
                                    string2 = null;
                                    object3.setVisibility(0);
                                    return;
                                }
                                object5 = object;
                            }
                            object6 = new StringBuilder();
                            ((StringBuilder)object6).append((String)object7);
                            object7 = ", <b>";
                            ((StringBuilder)object6).append((String)object7);
                            ((StringBuilder)object6).append((String)object5);
                            ((StringBuilder)object6).append(string4);
                            object5 = ((StringBuilder)object6).toString();
                            ((StringBuilder)object2).append((String)object5);
                        }
                        object5 = ((ProductDetail)object4).getCutOffTime();
                        if (object5 != null && (n4 = ((String)object5).length()) != 0) {
                            object5 = ((ProductDetail)object4).getCutOffTime();
                            n4 = (int)(k7.y((String)object5) ? 1 : 0);
                            object5 = n4 != 0 ? k7.u(((ProductDetail)object4).getCutOffTime()) : k7.r(((ProductDetail)object4).getCutOffTime());
                            object7 = " Order by <b>";
                            object6 = new StringBuilder((String)object7);
                            ((StringBuilder)object6).append((String)object5);
                            ((StringBuilder)object6).append((String)object8);
                            object5 = ((StringBuilder)object6).toString();
                            ((StringBuilder)object2).append((String)object5);
                        }
                        object2 = ((StringBuilder)object2).toString();
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        break block75;
                    }
                    object5 = object;
                }
                object6 = new StringBuilder();
                ((StringBuilder)object6).append((String)object7);
                object7 = " , <b>";
                ((StringBuilder)object6).append((String)object7);
                ((StringBuilder)object6).append((String)object5);
                ((StringBuilder)object6).append(string4);
                object5 = ((StringBuilder)object6).toString();
                ((StringBuilder)object2).append((String)object5);
            }
            object5 = ((ProductDetail)object4).getCutOffTime();
            if (object5 != null && (n3 = ((String)object5).length()) != 0) {
                object5 = ((ProductDetail)object4).getCutOffTime();
                n3 = (int)(k7.y((String)object5) ? 1 : 0);
                object5 = n3 != 0 ? k7.u(((ProductDetail)object4).getCutOffTime()) : k7.r(((ProductDetail)object4).getCutOffTime());
                object6 = new StringBuilder(string3);
                ((StringBuilder)object6).append((String)object5);
                object5 = ((StringBuilder)object6).toString();
                ((StringBuilder)object2).append((String)object5);
            }
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullExpressionValue(object2, string2);
        }
        ((Ref$ObjectRef)object3).element = object2;
        object3 = pi2_22.z;
        if (object3 != null) {
            string2 = hv3_0.f((String)object2);
            object3.setText(string2);
        }
        if ((object3 = pi2_22.D) == null) return;
        string2 = null;
        object3.setVisibility(0);
    }

    public final void C() {
        Object object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = "pdp screen";
        String string3 = "EDD on PDP";
        ((GTMEvents)object).pushButtonTapEvent(string3, "Clicked on Enter pincode for EDD", string2);
        object = this.x();
        Object object2 = this.h;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pincodeTv");
            object2 = null;
        }
        object2 = ((Object)((AppCompatTextView)object2).getText()).toString();
        this.v.j8((String)object, (String)object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onClick(View var1_1) {
        block24: {
            block25: {
                block23: {
                    var2_2 = null;
                    if (var1_1 != null) {
                        var3_3 = var1_1.getId();
                        var1_1 = var3_3;
                    } else {
                        var3_3 = 0;
                        var1_1 = null;
                    }
                    var4_4 = R$id.check_edd;
                    var5_5 = this.v;
                    var6_6 = this.b;
                    if (var1_1 == null || (var7_7 = var1_1.intValue()) != var4_4) break block23;
                    var1_1 = var6_6.G1();
                    if (var1_1 == null) {
                        var5_5.s4();
                    } else {
                        this.C();
                    }
                    break block24;
                }
                var4_4 = R$id.change_pincode;
                if (var1_1 == null || (var7_7 = var1_1.intValue()) != var4_4) break block25;
                var1_1 = this.i;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("changePincodeTv");
                    var3_3 = 0;
                    var1_1 = null;
                }
                if ((var3_3 = (int)(var1_1 = var1_1.getText()).equals(var8_8 = "Check Delivery Date")) != 0) {
                    var1_1 = var6_6.G1();
                    if (var1_1 == null) {
                        var5_5.s4();
                    } else {
                        this.C();
                    }
                } else {
                    var1_1 = var6_6.G1();
                    if (var1_1 == null) {
                        var5_5.s4();
                    } else {
                        var1_1 = this.x();
                        var8_8 = this.h;
                        if (var8_8 == null) {
                            var8_8 = "pincodeTv";
                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                        } else {
                            var2_2 = var8_8;
                        }
                        var2_2 = var2_2.getText().toString();
                        var5_5.j8((String)var1_1, (String)var2_2);
                    }
                }
                break block24;
            }
            var4_4 = R$id.return_policies_btn;
            if (var1_1 == null || (var3_3 = var1_1.intValue()) != var4_4) break block24;
            var1_1 = var6_6.x5();
            if (var1_1 == null || (var4_4 = (int)TextUtils.isEmpty((CharSequence)(var8_9 /* !! */  = var1_1.getReturnContent()))) != 0) ** GOTO lbl-1000
            if (var1_1 != null) {
                var8_9 /* !! */  = var1_1.getReturnUrl();
            } else {
                var4_4 = 0;
                var8_9 /* !! */  = null;
            }
            var4_4 = (int)TextUtils.isEmpty((CharSequence)var8_9 /* !! */ );
            if (var4_4 == 0) {
                if (var1_1 != null) {
                    var1_1 = var1_1.getReturnUrl();
                } else {
                    var3_3 = 0;
                    var1_1 = null;
                }
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = UrlHelper.Companion.getInstance();
                var4_4 = 0;
                var8_9 /* !! */  = new Object[]{};
                var5_5 = "misc";
                var9_10 = "faq_returns";
                var1_1 = var1_1.getApiUrl((String)var5_5, var9_10, var8_9 /* !! */ );
            }
            var4_4 = (int)var6_6.u7();
            var10_11 = 14;
            if (var4_4 != 0) {
                var2_2 = this.c;
                var2_2.w1(var10_11, (String)var1_1);
            } else {
                var8_9 /* !! */  = CustomWebViewActivity.Companion;
                var6_6 = this.d;
                if (var6_6 == null) {
                    var6_6 = "parentView";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                } else {
                    var2_2 = var6_6;
                }
                var2_2 = var2_2.getContext();
                var6_6 = "getContext(...)";
                Intrinsics.checkNotNullExpressionValue(var2_2, (String)var6_6);
                CustomWebViewActivity$a.b((CustomWebViewActivity$a)var8_9 /* !! */ , (Context)var2_2, (String)var1_1, var10_11);
            }
        }
    }

    public final void w() {
        boolean bl2;
        Object object = this.F;
        Object object2 = this.G;
        boolean bl3 = h40_0.Q1();
        if (bl3) {
            if (object2 != null) {
                this.d = object2;
            }
            if (object2 != null) {
                ai0_2.t(object2);
            }
            if (object2 != null) {
                ai0_2.B(object2);
            }
            if (object != null) {
                ai0_2.i(object);
            }
        } else {
            if (object != null) {
                this.d = object;
            }
            if (object != null) {
                ai0_2.t(object);
            }
            if (object != null) {
                ai0_2.B(object);
            }
            if (object2 != null) {
                ai0_2.i(object2);
            }
        }
        if ((object = this.d) == null) {
            return;
        }
        int n3 = R$id.edd_details_title;
        object = (AjioTextView)object.findViewById(n3);
        this.e = object;
        object = this.d;
        object2 = "parentView";
        bl3 = false;
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        int n4 = R$id.check_edd;
        object = (AjioButton)object.findViewById(n4);
        this.f = object;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eddCheckButton");
            bl2 = false;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pincode_layout;
        object = (LinearLayout)object.findViewById(n4);
        this.g = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pincode_tv;
        object = (AjioTextView)object.findViewById(n4);
        this.h = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.change_pincode;
        object = (AjioButton)object.findViewById(n4);
        this.i = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.edd_img;
        object = (ImageView)object.findViewById(n4);
        this.j = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.edd_msg_tv;
        object = (AjioTextView)object.findViewById(n4);
        this.k = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.edd_success_footer;
        object = (AjioTextView)object.findViewById(n4);
        this.l = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.cod_img;
        object = (ImageView)object.findViewById(n4);
        this.m = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.cod_msg_tv;
        object = (AjioTextView)object.findViewById(n4);
        this.n = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.row_pdp_edd_error_tv_error;
        object = (AjioTextView)object.findViewById(n4);
        this.o = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.edd_delivery_layout;
        object = (ConstraintLayout)object.findViewById(n4);
        this.p = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.edd_return_layout;
        object = (ConstraintLayout)object.findViewById(n4);
        this.q = object;
        if (object != null) {
            ai0_2.i(object);
        }
        if ((object = this.d) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.edd_cod_layout;
        object = (ConstraintLayout)object.findViewById(n4);
        this.r = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.return_policies_btn;
        object = (Button)object.findViewById(n4);
        this.s = object;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.d) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.edd_msg_return;
        object = (AjioTextView)object.findViewById(n4);
        this.t = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.edd_img_return;
        object = (ImageView)object.findViewById(n4);
        this.u = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pincode_layout_cl;
        object = (ConstraintLayout)object.findViewById(n4);
        this.x = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pd_sd_view_cl;
        object = (ConstraintLayout)object.findViewById(n4);
        this.y = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pd_deliveryDate;
        object = (TextView)object.findViewById(n4);
        this.z = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.sd_deliveryDate;
        object = (TextView)object.findViewById(n4);
        this.A = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.sd_finalDate;
        object = (TextView)object.findViewById(n4);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pin_code_show;
        object = (TextView)object.findViewById(n4);
        this.B = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pincode;
        object = (AjioTextView)object.findViewById(n4);
        this.C = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.sd_cornerIcon;
        object = (ImageView)object.findViewById(n4);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pd_cornerIcon;
        object = (ImageView)object.findViewById(n4);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n4 = R$id.pd_constraint_layout;
        object = (ConstraintLayout)object.findViewById(n4);
        this.D = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        n3 = R$id.sd_constraint_layout;
        object = (ConstraintLayout)object.findViewById(n3);
        this.E = object;
        bl2 = this.w;
        if (bl2) {
            object = this.e;
            if (object == null) {
                object = "eddTitleTv";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object;
            }
            object = h40_0.a;
            object = h40_0.d().optString("pdpTitle");
            object2 = "optString(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object3.setText((CharSequence)object);
            object = this.s;
            if (object != null) {
                object3 = h40_0.d();
                String string2 = "returnPolicyTitle";
                object3 = object3.optString(string2);
                Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                object.setText((CharSequence)object3);
            }
        }
    }

    public final String x() {
        Object object = this.b;
        Serializable serializable = object.G1();
        String string2 = null;
        if (serializable != null) {
            if ((object = object.G1()) != null) {
                string2 = ((ProductOptionVariant)object).getCode();
            }
        } else {
            serializable = object.x5();
            if (serializable != null) {
                string2 = object.l6();
            }
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void y(EddResult var1_1) {
        block38: {
            block36: {
                block37: {
                    var2_2 /* !! */  = null;
                    var3_3 = this.b;
                    var4_4 = this.w;
                    if (!var4_4) break block36;
                    var5_5 /* !! */  = this.q;
                    if (var5_5 /* !! */  != null) {
                        ai0_2.B((View)var5_5 /* !! */ );
                    }
                    if (var1_1 != null) break block37;
                    var5_5 /* !! */  = var3_3.ma();
                    if (var5_5 /* !! */  != null) {
                        var6_6 = var5_5 /* !! */ .getReturnWindow();
                    } else {
                        var6_6 = 0;
                        var5_5 /* !! */  = null;
                    }
                    var7_8 = this.t;
                    if (var7_8 != null) {
                        var8_9 = mz3_0.a;
                        var9_10 = var3_3.ma();
                        if (var9_10 != null) {
                            var10_11 = var9_10.isReturnable();
                        } else {
                            var10_11 = false;
                            var9_10 = null;
                        }
                        var11_12 = var3_3.ma();
                        if (var11_12 != null) {
                            var12_13 = var11_12.isExchangeable();
                        } else {
                            var12_13 = false;
                            var11_12 = null;
                        }
                        var8_9 = var8_9.l(var6_6, var10_11, var12_13);
                        var7_8.setText((CharSequence)var8_9);
                    }
                    if (var6_6 <= 0) ** GOTO lbl-1000
                    var5_5 /* !! */  = var3_3.ma();
                    var13_14 = 1;
                    if (var5_5 /* !! */  != null && (var6_6 = (int)var5_5 /* !! */ .isReturnable()) == var13_14 || (var5_5 /* !! */  = var3_3.ma()) != null && (var6_6 = (int)var5_5 /* !! */ .isExchangeable()) == var13_14) {
                        var5_5 /* !! */  = this.u;
                        if (var5_5 /* !! */  != null) {
                            var13_14 = R$drawable.ic_return_available;
                            var7_8 = hv3_0.r(var13_14);
                            var5_5 /* !! */ .setImageDrawable((Drawable)var7_8);
                        }
                    } else if ((var5_5 /* !! */  = this.u) != null) {
                        var13_14 = R$drawable.ic_return_not_available;
                        var7_8 = hv3_0.r(var13_14);
                        var5_5 /* !! */ .setImageDrawable((Drawable)var7_8);
                    }
                    break block38;
                }
                var5_5 /* !! */  = this.t;
                if (var5_5 /* !! */  != null) {
                    var7_8 = var1_1.getReturnLayoutMessage();
                    var5_5 /* !! */ .setText((CharSequence)var7_8);
                }
                if ((var6_7 = var1_1.getFinalReturnWindow()) > 0 && ((var6_7 = (int)var1_1.isFinalReturnable()) != 0 || (var6_7 = (int)var1_1.isFinalExchangeable()) != 0)) {
                    var5_5 /* !! */  = this.u;
                    if (var5_5 /* !! */  != null) {
                        var13_14 = R$drawable.ic_return_available;
                        var7_8 = hv3_0.r(var13_14);
                        var5_5 /* !! */ .setImageDrawable((Drawable)var7_8);
                    }
                } else {
                    var5_5 /* !! */  = this.u;
                    if (var5_5 /* !! */  != null) {
                        var13_14 = R$drawable.ic_return_not_available;
                        var7_8 = hv3_0.r(var13_14);
                        var5_5 /* !! */ .setImageDrawable((Drawable)var7_8);
                    }
                }
                break block38;
            }
            var5_5 /* !! */  = this.q;
            if (var5_5 /* !! */  != null) {
                ai0_2.i((View)var5_5 /* !! */ );
            }
        }
        if (var4_4) {
            var14_15 /* !! */  = this.m;
            var5_5 /* !! */  = "codImg";
            var13_14 = 0;
            var7_8 = null;
            if (var14_15 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5 /* !! */ );
                var4_4 = false;
                var14_15 /* !! */  = null;
            }
            var14_15 /* !! */ .setVisibility(0);
            var14_15 /* !! */  = this.n;
            var8_9 = "codMsgTv";
            if (var14_15 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var8_9);
                var4_4 = false;
                var14_15 /* !! */  = null;
            }
            var14_15 /* !! */ .setVisibility(0);
            var2_2 /* !! */  = this.r;
            if (var2_2 /* !! */  != null) {
                ai0_2.B((View)var2_2 /* !! */ );
            }
            if (var1_1 == null) {
                var1_1 = var3_3.t9();
                if (var1_1 != null) {
                    var1_1 = var1_1.getCodAllowed();
                } else {
                    var15_16 = 0;
                    var1_1 = null;
                }
            } else {
                var15_16 = var1_1.isFinalCodEligible();
                var1_1 = Boolean.valueOf((boolean)var15_16);
            }
            var2_2 /* !! */  = Boolean.TRUE;
            var15_16 = Intrinsics.areEqual(var1_1, (Object)var2_2 /* !! */ );
            var2_2 /* !! */  = "optString(...)";
            if (var15_16 != 0) {
                var1_1 = this.n;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_9);
                    var15_16 = 0;
                    var1_1 = null;
                }
                var3_3 = h40_0.a;
                var3_3 = h40_0.d();
                var14_15 /* !! */  = "codAvailableMsg";
                var3_3 = var3_3.optString((String)var14_15 /* !! */ );
                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var2_2 /* !! */ );
                var1_1.setText((CharSequence)var3_3);
                var1_1 = this.m;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5 /* !! */ );
                } else {
                    var7_8 = var1_1;
                }
                var15_16 = R$drawable.ic_cod_available;
                var1_1 = hv3_0.r(var15_16);
                var7_8.setImageDrawable((Drawable)var1_1);
            } else {
                var1_1 = this.n;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_9);
                    var15_16 = 0;
                    var1_1 = null;
                }
                var3_3 = h40_0.a;
                var3_3 = h40_0.d();
                var14_15 /* !! */  = "codUnavailableMsg";
                var3_3 = var3_3.optString((String)var14_15 /* !! */ );
                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var2_2 /* !! */ );
                var1_1.setText((CharSequence)var3_3);
                var1_1 = this.m;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5 /* !! */ );
                } else {
                    var7_8 = var1_1;
                }
                var15_16 = R$drawable.ic_cod_not_available;
                var1_1 = hv3_0.r(var15_16);
                var7_8.setImageDrawable((Drawable)var1_1);
            }
        } else {
            var1_1 = this.r;
            if (var1_1 != null) {
                ai0_2.i((View)var1_1);
            }
        }
    }
}

