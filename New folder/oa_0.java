/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.drawable.LayerDrawable
 *  android.text.SpannableStringBuilder
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.RatingBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.ratings.AggregateRating;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oa
 */
public final class oa_0 {
    public static final Oa$a Companion;
    public final Context a;
    public final View b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final ConstraintLayout f;
    public final TextView g;
    public final RatingBar h;
    public final TextView i;
    public final hh3_2 j;
    public final hh3_2 k;
    public final hh3_2 l;
    public Double m;
    public String n;
    public yi2_1 o;

    static {
        Oa$a oa$a;
        Companion = oa$a = new Object();
    }

    public oa_0(Context object, View view) {
        int n3;
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, object2);
        this.a = object;
        this.b = view;
        int n4 = 0;
        object = null;
        if (view != null) {
            n3 = R$id.rating_container;
            object2 = (LinearLayout)view.findViewById(n3);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.c = object2;
        if (view != null) {
            n3 = R$id.ratings_count;
            object2 = (TextView)view.findViewById(n3);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.d = object2;
        if (view != null) {
            n3 = R$id.ratings_value;
            object2 = (TextView)view.findViewById(n3);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.e = object2;
        if (view != null) {
            n3 = R$id.new_rating_container;
            object2 = (ConstraintLayout)view.findViewById(n3);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.f = object2;
        if (view != null) {
            n3 = R$id.new_ratings_count;
            object2 = (TextView)view.findViewById(n3);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.g = object2;
        if (view != null) {
            n3 = R$id.new_rating_star;
            object2 = (RatingBar)view.findViewById(n3);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.h = object2;
        if (view != null) {
            n4 = R$id.new_ratings_value;
            object = (TextView)view.findViewById(n4);
        }
        this.i = object;
        super(0);
        object = yr1_2.b((Function0)object);
        this.j = object;
        super(0);
        object = yr1_2.b((Function0)object);
        this.k = object;
        super(0);
        object = yr1_2.b((Function0)object);
        this.l = object;
    }

    public final void a(int n3) {
        Object object = this.c;
        int n4 = 1;
        int n7 = 8;
        TextView textView = this.e;
        String string2 = "| ";
        TextView textView2 = this.d;
        Object object2 = this.f;
        if (n3 != n4) {
            n4 = 2;
            if (n3 == n4) {
                int n8;
                if (object2 != null) {
                    ai0_2.i((View)object2);
                }
                Object object3 = this.o;
                n4 = 0;
                Double d2 = null;
                if (object3 != null) {
                    object3 = object3.R6();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                if (object3 != null && (object2 = ((RatingsResponse)object3).getAggregateRating()) != null) {
                    object2 = ((AggregateRating)object2).getAverageRating();
                } else {
                    n8 = 0;
                    object2 = null;
                }
                if (object2 != null && (object2 = ((RatingsResponse)object3).getAggregateRating()) != null && (object2 = ((AggregateRating)object2).getNumUserRatings()) != null && (n8 = ((String)object2).length()) > 0) {
                    Object object4;
                    if (object != null) {
                        object.setVisibility(0);
                    }
                    if ((object4 = ((RatingsResponse)object3).getAggregateRating()) != null && (object4 = ((AggregateRating)object4).getAverageRating()) != null) {
                        double d5 = ((Number)object4).doubleValue();
                        object4 = this.b;
                        if (object4 != null && (object4 = object4.getContext()) != null) {
                            cp_1.Companion.getClass();
                            cp_1 cp_12 = cp$a.e();
                            Object object5 = ((RatingsResponse)object3).getAggregateRating();
                            object5 = object5 != null ? ((AggregateRating)object5).getNumUserRatings() : null;
                            cp_12.getClass();
                            cp_1.D(d5, (View)object, (Context)object4, (String)object5);
                        }
                    }
                    if (textView2 != null) {
                        object = ((RatingsResponse)object3).getAggregateRating();
                        object = object != null ? ((AggregateRating)object).getNumUserRatings() : null;
                        object4 = new StringBuilder(string2);
                        ((StringBuilder)object4).append((String)object);
                        object = ((StringBuilder)object4).toString();
                        textView2.setText((CharSequence)object);
                    }
                    if (textView != null) {
                        if ((object3 = ((RatingsResponse)object3).getAggregateRating()) != null) {
                            d2 = ((AggregateRating)object3).getAverageRating();
                        }
                        object3 = String.valueOf(d2);
                        textView.setText((CharSequence)object3);
                    }
                } else if (object != null) {
                    object.setVisibility(n7);
                }
            }
        } else {
            Object object6;
            if (object2 != null) {
                ai0_2.i((View)object2);
            }
            if ((object6 = this.m) != null) {
                double d7;
                double d9 = ((Number)object6).doubleValue();
                double d12 = d9 - (d7 = 0.0);
                n3 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                if (n3 == 0) {
                    if (object != null) {
                        object.setVisibility(n7);
                    }
                } else {
                    if (object != null) {
                        object.setVisibility(0);
                    }
                    cp_1.Companion.getClass();
                    object6 = cp$a.e();
                    CharSequence charSequence = this.n;
                    object6.getClass();
                    object6 = this.a;
                    cp_1.D(d9, (View)object, (Context)object6, (String)charSequence);
                    object6 = this.n;
                    if (object6 != null && (n3 = ((String)object6).length()) != 0) {
                        object6 = new SpannableStringBuilder();
                        object = this.n;
                        charSequence = new StringBuilder(string2);
                        ((StringBuilder)charSequence).append((String)object);
                        object = ((StringBuilder)charSequence).toString();
                        object6.append((CharSequence)object);
                        if (textView2 != null) {
                            textView2.setText((CharSequence)object6);
                        }
                    }
                    if (textView != null) {
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append(d9);
                        object = " ";
                        ((StringBuilder)object6).append((String)object);
                        object6 = ((StringBuilder)object6).toString();
                        textView.setText((CharSequence)object6);
                    }
                }
            } else if (object != null) {
                object.setVisibility(n7);
            }
        }
    }

    public final void b(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            TextView textView = this.i;
            if (textView != null) {
                ai0_2.B((View)textView);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String string3 = "(";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(string2);
            stringBuilder.append(")");
            string2 = stringBuilder.toString();
            spannableStringBuilder.append((CharSequence)string2);
            if (textView != null) {
                textView.setText((CharSequence)spannableStringBuilder);
            }
        }
    }

    public final void c(double d2) {
        TextView textView = this.g;
        if (textView != null) {
            ai0_2.B((View)textView);
        }
        if (textView != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d2);
            stringBuilder.append(" ");
            String string2 = stringBuilder.toString();
            textView.setText((CharSequence)string2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Boolean var1_1, int var2_2) {
        block20: {
            block19: {
                block18: {
                    var3_3 = (Boolean)this.j.getValue();
                    var4_4 = var3_3;
                    var5_5 = this.c;
                    if (!var4_4) break block20;
                    if (var5_5 != null) {
                        ai0_2.i((View)var5_5);
                    }
                    if ((var1_1 = this.m) == null) return;
                    var6_6 = var1_1.doubleValue();
                    cfr_temp_0 = var6_6 - (var8_7 = 0.0);
                    var10_8 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                    if (var10_8 == false) {
                        return;
                    }
                    var1_1 = this.h;
                    if (var1_1 != null) {
                        var11_10 = oa_0.Companion;
                        var12_11 = (float)var6_6;
                        var11_10.getClass();
                        var13_12 = Oa$a.a(var12_11);
                        var1_1.setRating(var13_12);
                    }
                    var11_10 = "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable";
                    var14_13 = this.a;
                    var15_14 = null;
                    var16_15 = 1;
                    var17_16 = 2;
                    if (var1_1 == null) ** GOTO lbl30
                    try {
                        block21: {
                            var18_17 /* !! */  = var1_1.getProgressDrawable();
                            break block21;
lbl30:
                            // 1 sources

                            var19_18 = false;
                            var18_17 /* !! */  = null;
                        }
                        Intrinsics.checkNotNull(var18_17 /* !! */ , (String)var11_10);
                        var18_17 /* !! */  = (LayerDrawable)var18_17 /* !! */ ;
                        var20_19 = var18_17 /* !! */ .getDrawable(var17_16);
                        if (var20_19 != null) {
                            var21_20 = this.l;
                            var21_20 = var21_20.getValue();
                            var21_20 = (String)var21_20;
                            var22_21 = Color.parseColor((String)var21_20);
                            var20_19.setTint(var22_21);
                        }
                    }
                    catch (Exception v0) {
                        break block18;
                    }
                    {
                        if ((var20_19 = var18_17 /* !! */ .getDrawable(var16_15)) != null) {
                            var22_21 = R$color.transparent;
                            var22_21 = t70.getColor(var14_13, var22_21);
                            var20_19.setTint(var22_21);
                        }
                        if ((var18_17 /* !! */  = var18_17 /* !! */ .getDrawable(0)) == null) break block18;
                        var23_22 = R$color.accent_color_16;
                        var23_22 = t70.getColor(var14_13, var23_22);
                        var18_17 /* !! */ .setTint(var23_22);
                    }
                }
                var18_17 /* !! */  = od3_2.a();
                var20_19 = ld3_2.STORE_AJIOGRAM.getStoreId();
                var19_18 = Intrinsics.areEqual(var18_17 /* !! */ , var20_19);
                if (!var19_18) break block19;
                if (var1_1 == null) ** GOTO lbl-1000
                try {
                    var15_14 = var1_1.getProgressDrawable();
                }
                catch (Exception v1) {
                    break block19;
                }
lbl-1000:
                // 2 sources

                {
                    Intrinsics.checkNotNull(var15_14, (String)var11_10);
                    var15_14 = (LayerDrawable)var15_14;
                    var1_1 = var15_14.getDrawable(var17_16);
                    if (var1_1 != null) {
                        var24_23 = R$color.white;
                        var24_23 = QC3.a(var24_23, var14_13);
                        var1_1.setTint(var24_23);
                    }
                    if ((var1_1 = var15_14.getDrawable(var16_15)) != null) {
                        var24_23 = R$color.transparent;
                        var24_23 = QC3.a(var24_23, var14_13);
                        var1_1.setTint(var24_23);
                    }
                    if ((var1_1 = var15_14.getDrawable(0)) == null) break block19;
                    var24_23 = R$color.color_6d6d6d;
                    var24_23 = QC3.a(var24_23, var14_13);
                    var1_1.setTint(var24_23);
                }
            }
            if ((var1_1 = this.f) != null) {
                ai0_2.B((View)var1_1);
            }
            if ((var10_8 = (double)(var1_1 = (Number)this.k.getValue()).intValue()) == false) return;
            if (var10_8 == var16_15) {
                var1_1 = this.n;
                this.b((String)var1_1);
                return;
            }
            if (var10_8 == var17_16) {
                this.c(var6_6);
                return;
            }
            var24_23 = 3;
            var13_12 = 4.2E-45f;
            if (var10_8 != var24_23) {
                this.a(var2_2);
                return;
            }
            var1_1 = this.n;
            this.c(var6_6);
            this.b((String)var1_1);
            return;
        }
        var3_3 = Boolean.TRUE;
        var10_9 = Intrinsics.areEqual(var1_1, var3_3);
        if (var10_9 != 0) {
            this.a(var2_2);
            return;
        }
        if (var5_5 == null) return;
        var10_9 = 8;
        var5_5.setVisibility(var10_9);
    }
}

