/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Product.PriceBreakUp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Li2
 */
public final class li2_1
extends RecyclerView$B {
    public final View a;
    public final LinearLayout b;
    public final View c;
    public final TextView d;
    public final TextView e;

    public li2_1(View view) {
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = view;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.price_detail_dynamic_container;
        this.b = linearLayout = (LinearLayout)view.findViewById(n3);
        n3 = R$id.no_size_info_container;
        linearLayout = view.findViewById(n3);
        this.c = linearLayout;
        n3 = R$id.no_size_tv_1;
        linearLayout = (TextView)view.findViewById(n3);
        this.d = linearLayout;
        n3 = R$id.pdp_price_title;
        view = (TextView)view.findViewById(n3);
        this.e = view;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void w(Context context, ArrayList arrayList, String string2, String string3) {
        int n3;
        float f5;
        Object object;
        int n4;
        Object object2;
        int n7;
        li2_1 li2_12 = this;
        int n8 = 1;
        Object object3 = this.c;
        Object object4 = this.e;
        LinearLayout linearLayout = this.b;
        String string4 = "parentDynamicView";
        int n10 = 0;
        float f6 = 0.0f;
        Object object5 = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n7 = 0;
            object2 = null;
        } else {
            object2 = linearLayout;
        }
        object2.removeAllViews();
        object2 = "noPriceDetailTV";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
            f5 = 0.0f;
        } else {
            object = object4;
        }
        int n14 = 8;
        float f7 = 1.1E-44f;
        object.setVisibility(n14);
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n4 = 0;
            object = null;
            f5 = 0.0f;
        } else {
            object = linearLayout;
        }
        object.setVisibility(0);
        object = "noSizeInfoContainer";
        if (string2 != null && (n3 = string2.length()) != 0) {
            int n15;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n15 = 0;
                object3 = null;
            }
            object3.setVisibility(n14);
            if (arrayList == null || (n8 = arrayList.isEmpty()) != 0) {
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    object4 = null;
                }
                object4.setVisibility(0);
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n15 = 8;
                    linearLayout = null;
                } else {
                    n15 = 8;
                }
                linearLayout.setVisibility(n15);
                return;
            }
        } else {
            Object object6;
            int n16;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n16 = 0;
                object3 = null;
            }
            object3.setVisibility(0);
            object3 = li2_12.d;
            if (object3 == null) {
                object3 = "noSizeTV";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n10 = 0;
                f6 = 0.0f;
                object5 = null;
            } else {
                object5 = object3;
            }
            if (string3 != null && (n16 = string3.length()) != 0) {
                n16 = R$string.select_size_metal_purity;
                object6 = new Object[n8];
                object6[0] = string3;
                object6 = hv3_0.L(n16, object6);
            } else {
                n16 = R$string.select_size_metal_purity;
                object6 = new Object[n8];
                object6[0] = object4 = "Size";
                object6 = hv3_0.L(n16, object6);
            }
            object5.setText((CharSequence)object6);
            return;
        }
        if (context == null) return;
        Object object7 = context.getApplicationContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type android.view.LayoutInflater");
        object3 = object7;
        object3 = (LayoutInflater)object7;
        object4 = arrayList.iterator();
        while ((n8 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            block41: {
                Exception exception2;
                block39: {
                    Object object8;
                    View view;
                    View view2;
                    block38: {
                        int n17;
                        object7 = (PriceBreakUp)object4.next();
                        n7 = R$layout.row_pdp_price_detail;
                        object2 = object3.inflate(n7, null);
                        n4 = R$id.pdp_price_title;
                        object = object2.findViewById(n4);
                        n3 = R$id.pdp_price_info;
                        View view3 = object2.findViewById(n3);
                        int n18 = R$id.pdp_price_old;
                        view2 = object2.findViewById(n18);
                        int n19 = R$id.pdp_price_new;
                        view = object2.findViewById(n19);
                        view3 = (TextView)view3;
                        view3.setVisibility(n14);
                        if (object7 == null) break block41;
                        Object object9 = ((PriceBreakUp)object7).getLabel();
                        object.setText((CharSequence)object9);
                        object9 = ((PriceBreakUp)object7).getLabel();
                        if (object9 != null) {
                            object9 = ((Object)StringsKt.m0((CharSequence)object9)).toString();
                        } else {
                            n17 = 0;
                            object9 = null;
                        }
                        String string5 = "total";
                        n17 = string5.equalsIgnoreCase((String)object9);
                        int n20 = 2;
                        if (n17 != 0) {
                            object9 = FontsManager.getInstance();
                            AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                            aJIOApplication$a.getClass();
                            object5 = AJIOApplication$a.a();
                            object5 = ((FontsManager)object9).getTypefaceWithFont((Context)object5, 10);
                            object.setTypeface((Typeface)object5);
                            n14 = 1095761920;
                            f7 = 13.0f;
                            object.setTextSize(n20, f7);
                            object = view;
                            object = (TextView)view;
                            object.setTypeface((Typeface)object5);
                            n10 = 1096810496;
                            f6 = 14.0f;
                            object.setTextSize(n20, f6);
                        } else {
                            object5 = FontsManager.getInstance();
                            AJIOApplication.Companion.getClass();
                            object8 = AJIOApplication$a.a();
                            n17 = 9;
                            object5 = ((FontsManager)object5).getTypefaceWithFont((Context)object8, n17);
                            object.setTypeface((Typeface)object5);
                            n14 = 0x41400000;
                            f7 = 12.0f;
                            object.setTextSize(n20, f7);
                            object = view;
                            object = (TextView)view;
                            object.setTypeface((Typeface)object5);
                            object.setTextSize(n20, f7);
                        }
                        object5 = ((PriceBreakUp)object7).getDescription();
                        if (object5 != null && (n10 = ((String)object5).length()) != 0) {
                            object5 = ((PriceBreakUp)object7).getDescription();
                            view3.setText((CharSequence)object5);
                            view3.setVisibility(0);
                        }
                        try {
                            object5 = ((PriceBreakUp)object7).getPrice();
                            if (object5 != null && (n10 = ((String)object5).length()) != 0) break block38;
                        }
                        catch (Exception exception2) {
                            break block39;
                        }
                        object5 = ((PriceBreakUp)object7).getDiscountedPrice();
                        if (object5 == null || (n10 = ((String)object5).length()) == 0) break block41;
                    }
                    object5 = ((PriceBreakUp)object7).getPrice();
                    n4 = 0;
                    f5 = 0.0f;
                    object = null;
                    if (object5 != null && (n10 = ((String)object5).length()) != 0) {
                        object5 = ((PriceBreakUp)object7).getDiscountedPrice();
                        if (object5 != null && (n10 = ((String)object5).length()) != 0) {
                            object5 = view2;
                            object5 = (TextView)view2;
                            object5.setVisibility(0);
                            object5 = view;
                            object5 = (TextView)view;
                            object5.setVisibility(0);
                            object5 = view2;
                            object5 = (TextView)view2;
                            object8 = ((PriceBreakUp)object7).getPrice();
                            if (object8 != null) {
                                f7 = Float.parseFloat((String)object8);
                            } else {
                                n14 = 0;
                                f7 = 0.0f;
                                object8 = null;
                            }
                            object8 = Float.valueOf(f7);
                            object8 = qz2_0.x((Float)object8);
                            object5.setText((CharSequence)object8);
                            view = (TextView)view;
                            object7 = ((PriceBreakUp)object7).getDiscountedPrice();
                            if (object7 != null) {
                                f5 = Float.parseFloat((String)object7);
                            }
                            object7 = Float.valueOf(f5);
                            object7 = qz2_0.x((Float)object7);
                            view.setText((CharSequence)object7);
                            object7 = view2;
                            object7 = (TextView)view2;
                            view2 = (TextView)view2;
                            n10 = view2.getPaintFlags() | 0x10;
                            object7.setPaintFlags(n10);
                        } else {
                            view2 = (TextView)view2;
                            n10 = 8;
                            f6 = 1.1E-44f;
                            view2.setVisibility(n10);
                            view = (TextView)view;
                            object7 = ((PriceBreakUp)object7).getPrice();
                            if (object7 != null) {
                                f5 = Float.parseFloat((String)object7);
                            }
                            object7 = Float.valueOf(f5);
                            object7 = qz2_0.x((Float)object7);
                            view.setText((CharSequence)object7);
                        }
                    } else {
                        view2 = (TextView)view2;
                        n10 = 8;
                        f6 = 1.1E-44f;
                        view2.setVisibility(n10);
                        view = (TextView)view;
                        object7 = ((PriceBreakUp)object7).getDiscountedPrice();
                        if (object7 != null) {
                            f5 = Float.parseFloat((String)object7);
                        }
                        object7 = Float.valueOf(f5);
                        object7 = qz2_0.x((Float)object7);
                        view.setText((CharSequence)object7);
                    }
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n8 = 0;
                        object7 = null;
                    } else {
                        object7 = linearLayout;
                    }
                    object7.addView((View)object2);
                    break block41;
                }
                object5 = yn3_0.a;
                ((yn3$a)object5).e(exception2);
            }
            n10 = 0;
            f6 = 0.0f;
            object5 = null;
            n14 = 8;
            f7 = 1.1E-44f;
        }
    }
}

