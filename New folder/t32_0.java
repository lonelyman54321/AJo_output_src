/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from t32
 */
public class t32_0
extends RecyclerView$B {
    public final oq2_0 a;
    public final yi2_1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public TextView f;
    public LinearLayout g;
    public ImageView h;
    public ImageView i;
    public final c92 j;
    public final int k;

    public t32_0(View view, c92 c922, oq2_0 oq2_02, yi2_1 yi2_12, boolean bl2, boolean bl3, vb2_1 vb2_12, boolean bl4) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(c922, "onSizeClickListener");
        Intrinsics.checkNotNullParameter(oq2_02, "rowWidthCallBack");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super(view);
        this.a = oq2_02;
        this.b = yi2_12;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.j = c922;
        this.k = 3;
        yi2_12.o5();
    }

    public final void w() {
        int n3;
        TextView textView = this.f;
        if (textView != null) {
            n3 = 0;
            textView.setPadding(0, 0, 0, 0);
        }
        if ((textView = this.f) != null) {
            n3 = 17;
            textView.setGravity(n3);
        }
        if ((textView = this.h) != null) {
            ai0_2.i((View)textView);
        }
        if ((textView = this.i) != null) {
            ai0_2.i((View)textView);
        }
    }

    public final void x(ProductOptionVariant object, int n3) {
        Object object2;
        Object[] objectArray;
        int n4;
        Object[] objectArray2;
        int n7;
        Object object3;
        int n8;
        int n10;
        int n14;
        int n15 = 0;
        t32$a_0 t32$a_0 = null;
        int n16 = 1;
        float f5 = Float.MIN_VALUE;
        Intrinsics.checkNotNullParameter(object, "productOptionVariant");
        String string2 = ((ProductOptionVariant)object).getValue();
        int n17 = TextUtils.isEmpty((CharSequence)string2);
        if (n17 != 0) {
            return;
        }
        string2 = ((ProductOptionVariant)object).getValue();
        int n18 = 32;
        Object object4 = null;
        if (string2 != null) {
            n14 = string2.length() - n16;
            n10 = 0;
            n8 = 0;
            object3 = null;
            while (n10 <= n14) {
                n7 = n8 == 0 ? n10 : n14;
                if ((n7 = Intrinsics.compare(string2.charAt(n7), n18)) <= 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    objectArray2 = null;
                }
                if (n8 == 0) {
                    if (n7 == 0) {
                        n8 = 1;
                        continue;
                    }
                    n10 += n16;
                    continue;
                }
                if (n7 == 0) break;
                n14 += -1;
            }
            string2 = com.jio.jioads.adinterfaces.a.a(n14, n16, n10, string2);
        } else {
            n17 = 0;
            string2 = null;
        }
        Object[] objectArray3 = this.b;
        n10 = objectArray3.E0();
        if (n10 != 0 && (n10 = (int)(objectArray3.N0() ? 1 : 0)) != 0) {
            string2 = ((ProductOptionVariant)object).getBrickBrandSize();
            if (string2 != null) {
                n10 = string2.length() - n16;
                n8 = 0;
                object3 = null;
                n7 = 0;
                objectArray2 = null;
                while (n8 <= n10) {
                    n4 = n7 == 0 ? n8 : n10;
                    if ((n4 = Intrinsics.compare(string2.charAt(n4), n18)) <= 0) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        objectArray = null;
                    }
                    if (n7 == 0) {
                        if (n4 == 0) {
                            n7 = 1;
                            continue;
                        }
                        n8 += n16;
                        continue;
                    }
                    if (n4 == 0) break;
                    n10 += -1;
                }
                string2 = com.jio.jioads.adinterfaces.a.a(n10, n16, n8, string2);
            } else {
                n17 = 0;
                string2 = null;
            }
        }
        if ((object2 = this.f) != null) {
            object2.setText((CharSequence)string2);
        }
        if ((object2 = this.f) != null) {
            n10 = hv3_0.m(R$color.black);
            object2.setTextColor(n10);
        }
        n18 = (int)(objectArray3.c9() ? 1 : 0);
        n10 = this.k;
        n8 = 2;
        objectArray2 = " from popup";
        n4 = this.c;
        String string3 = "format(...)";
        String string4 = "getString(...)";
        if (n18 != 0) {
            n18 = (int)(((ProductOptionVariant)object).isStockAvailable() ? 1 : 0);
            if (n18 == 0) {
                this.w();
                object = this.f;
                if (object != null) {
                    object.setTag(null);
                }
                if (string2 != null) {
                    n15 = string2.length();
                }
                if (n15 > n10) {
                    object = this.f;
                    if (object != null) {
                        n15 = R$drawable.luxe_rect_oos_size_pdp;
                        object.setBackgroundResource(n15);
                    }
                } else {
                    object = this.f;
                    if (object != null) {
                        n15 = R$drawable.luxe_rect_oos_size_pdp;
                        object.setBackgroundResource(n15);
                    }
                }
                if ((object = this.f) != null) {
                    object.setContentDescription(null);
                    object.setImportantForAccessibility(n8);
                }
            } else {
                this.w();
                n18 = (int)(((ProductOptionVariant)object).isSelected() ? 1 : 0);
                if (n18 != 0) {
                    object = this.f;
                    if (object != null) {
                        object.setImportantForAccessibility(n16);
                        if (n4 != 0) {
                            object2 = StringCompanionObject.INSTANCE;
                            object2 = object.getContext();
                            n14 = R$string.acc_selected;
                            object2 = object2.getString(n14);
                            Intrinsics.checkNotNullExpressionValue(object2, string4);
                            objectArray3 = new Object[n16];
                            objectArray3[0] = string2;
                            Object object5 = Arrays.copyOf(objectArray3, n16);
                            object5 = String.format((String)object2, (Object[])object5);
                            Intrinsics.checkNotNullExpressionValue(object5, string3);
                            object5 = ((String)object5).concat((String)objectArray2);
                            object.setContentDescription((CharSequence)object5);
                        } else {
                            object2 = StringCompanionObject.INSTANCE;
                            object2 = object.getContext();
                            n14 = R$string.acc_selected;
                            object2 = object2.getString(n14);
                            Intrinsics.checkNotNullExpressionValue(object2, string4);
                            objectArray3 = new Object[n16];
                            objectArray3[0] = string2;
                            He1.a(objectArray3, n16, (String)object2, string3, (TextView)object);
                        }
                    }
                    if ((object = this.f) != null) {
                        object.setTag(null);
                    }
                    if (string2 != null) {
                        n15 = string2.length();
                    }
                    if (n15 > n10) {
                        object = this.f;
                        if (object != null) {
                            n15 = R$drawable.luxe_rect_selected_size_pdp;
                            object.setBackgroundResource(n15);
                        }
                    } else {
                        object = this.f;
                        if (object != null) {
                            n15 = R$drawable.luxe_rect_selected_size_pdp;
                            object.setBackgroundResource(n15);
                        }
                    }
                    if ((object = this.f) != null) {
                        n15 = hv3_0.m(R$color.white);
                        object.setTextColor(n15);
                    }
                } else {
                    Object object6;
                    this.w();
                    object2 = this.f;
                    if (object2 != null) {
                        object2.setImportantForAccessibility(n16);
                        if (n4 != 0) {
                            object4 = StringCompanionObject.INSTANCE;
                            object4 = object2.getContext();
                            n14 = R$string.acc_unselected;
                            object4 = object4.getString(n14);
                            Intrinsics.checkNotNullExpressionValue(object4, string4);
                            objectArray3 = new Object[n16];
                            objectArray3[0] = string2;
                            object6 = Arrays.copyOf(objectArray3, n16);
                            object6 = String.format((String)object4, (Object[])object6);
                            Intrinsics.checkNotNullExpressionValue(object6, string3);
                            object6 = ((String)object6).concat((String)objectArray2);
                            object2.setContentDescription((CharSequence)object6);
                        } else {
                            object4 = StringCompanionObject.INSTANCE;
                            object4 = object2.getContext();
                            n14 = R$string.acc_unselected;
                            object4 = object4.getString(n14);
                            Intrinsics.checkNotNullExpressionValue(object4, string4);
                            objectArray3 = new Object[n16];
                            objectArray3[0] = string2;
                            He1.a(objectArray3, n16, (String)object4, string3, object2);
                        }
                    }
                    if ((object6 = this.f) != null) {
                        object6.setTag(object);
                    }
                    if (string2 != null) {
                        n15 = string2.length();
                    }
                    if (n15 > n10) {
                        object = this.f;
                        if (object != null) {
                            n15 = R$drawable.rect_border_size_pdp;
                            object.setBackgroundResource(n15);
                        }
                    } else {
                        object = this.f;
                        if (object != null) {
                            n15 = R$drawable.rect_border_size_pdp;
                            object.setBackgroundResource(n15);
                        }
                    }
                    if ((object = this.f) != null) {
                        n15 = hv3_0.m(R$color.black);
                        object.setTextColor(n15);
                    }
                }
            }
            if ((object = this.f) != null) {
                t32$a_0 = new t32$a_0(this, n3);
                object.setOnClickListener((View.OnClickListener)t32$a_0);
            }
        } else {
            Object object7;
            n18 = (int)(((ProductOptionVariant)object).isStockAvailable() ? 1 : 0);
            String string5 = "getContext(...)";
            if (n18 == 0 && (n18 = (int)(objectArray3.K5() ? 1 : 0)) == 0) {
                n16 = (int)(objectArray3.c7() ? 1 : 0);
                if (n16 != 0) {
                    object7 = this.h;
                    if (object7 != null) {
                        ai0_2.B((View)object7);
                    }
                    if ((object7 = this.i) != null) {
                        ai0_2.B((View)object7);
                    }
                    if ((object7 = this.f) != null) {
                        object7.setTag(object);
                    }
                    if ((object = this.f) != null) {
                        n16 = 81;
                        f5 = 1.14E-43f;
                        object.setGravity(n16);
                    }
                    if ((object = this.f) != null) {
                        f5 = hv3_0.x(6.0f);
                        n16 = (int)f5;
                        object.setPadding(0, 0, 0, n16);
                    }
                    if ((object = this.f) != null) {
                        n16 = hv3_0.m(R$color.color_202020);
                        object.setTextColor(n16);
                        object.setContentDescription(null);
                        object.setImportantForAccessibility(n8);
                    }
                } else {
                    int n19;
                    this.w();
                    object = this.f;
                    if (object != null) {
                        object.setTag(null);
                    }
                    if (string2 != null) {
                        n19 = string2.length();
                    } else {
                        n19 = 0;
                        object = null;
                    }
                    if (n19 > n10) {
                        object = this.f;
                        if (object != null) {
                            n16 = R$drawable.new_size_selectable_stock_not_available_drawable_one_size;
                            object.setBackgroundResource(n16);
                        }
                    } else {
                        object = this.f;
                        if (object != null) {
                            n16 = R$drawable.new_size_selectable_stock_not_available_drawable;
                            object.setBackgroundResource(n16);
                        }
                    }
                    if ((object = this.f) != null) {
                        object7 = object.getContext();
                        Intrinsics.checkNotNullExpressionValue(object7, string5);
                        n17 = R$attr.size_chip_oos_text_color;
                        n16 = tm3_0.a(n17, (Context)object7);
                        object.setTextColor(n16);
                    }
                    if ((object = this.f) != null) {
                        object.setContentDescription(null);
                        object.setImportantForAccessibility(n8);
                    }
                }
            } else {
                n18 = (int)(((ProductOptionVariant)object).isSelected() ? 1 : 0);
                if (n18 != 0) {
                    int n20;
                    this.w();
                    object2 = this.f;
                    if (object2 != null) {
                        object2.setImportantForAccessibility(n16);
                        if (n4 != 0) {
                            object3 = StringCompanionObject.INSTANCE;
                            object3 = object2.getContext();
                            n4 = R$string.acc_selected;
                            object3 = object3.getString(n4);
                            Intrinsics.checkNotNullExpressionValue(object3, string4);
                            objectArray = new Object[n16];
                            objectArray[0] = string2;
                            object7 = Arrays.copyOf(objectArray, n16);
                            object7 = String.format((String)object3, (Object[])object7);
                            Intrinsics.checkNotNullExpressionValue(object7, string3);
                            object7 = ((String)object7).concat((String)objectArray2);
                            object2.setContentDescription((CharSequence)object7);
                        } else {
                            object3 = StringCompanionObject.INSTANCE;
                            object3 = object2.getContext();
                            n7 = R$string.acc_selected;
                            object3 = object3.getString(n7);
                            Intrinsics.checkNotNullExpressionValue(object3, string4);
                            objectArray2 = new Object[n16];
                            objectArray2[0] = string2;
                            He1.a(objectArray2, n16, (String)object3, string3, object2);
                        }
                    }
                    if ((n16 = (int)(objectArray3.c7() ? 1 : 0)) != 0) {
                        object7 = this.f;
                        if (object7 != null) {
                            object7.setTag(object);
                        }
                    } else {
                        object = this.f;
                        if (object != null) {
                            object.setTag(null);
                        }
                    }
                    if (string2 != null) {
                        n20 = string2.length();
                    } else {
                        n20 = 0;
                        object = null;
                    }
                    if (n20 > n10) {
                        object = this.f;
                        if (object != null) {
                            n16 = R$drawable.new_selected_size_shape_drawable_one_size;
                            object.setBackgroundResource(n16);
                        }
                    } else {
                        object = this.f;
                        if (object != null) {
                            n16 = R$drawable.new_selected_size_shape_drawable;
                            object.setBackgroundResource(n16);
                        }
                    }
                    if ((object = this.f) != null) {
                        object7 = object.getContext();
                        Intrinsics.checkNotNullExpressionValue(object7, string5);
                        n17 = R$attr.size_chip_selected_text_color;
                        n16 = tm3_0.a(n17, (Context)object7);
                        object.setTextColor(n16);
                    }
                } else {
                    n18 = (int)(((ProductOptionVariant)object).isHighlighted() ? 1 : 0);
                    if (n18 != 0) {
                        int n21;
                        this.w();
                        object2 = this.f;
                        if (object2 != null) {
                            object2.setImportantForAccessibility(n16);
                            if (n4 != 0) {
                                object4 = StringCompanionObject.INSTANCE;
                                object4 = object2.getContext();
                                n14 = R$string.acc_selected;
                                object4 = object4.getString(n14);
                                Intrinsics.checkNotNullExpressionValue(object4, string4);
                                objectArray3 = new Object[n16];
                                objectArray3[0] = string2;
                                object7 = Arrays.copyOf(objectArray3, n16);
                                object7 = String.format((String)object4, (Object[])object7);
                                Intrinsics.checkNotNullExpressionValue(object7, string3);
                                object7 = ((String)object7).concat((String)objectArray2);
                                object2.setContentDescription((CharSequence)object7);
                            } else {
                                object4 = StringCompanionObject.INSTANCE;
                                object4 = object2.getContext();
                                n14 = R$string.acc_selected;
                                object4 = object4.getString(n14);
                                Intrinsics.checkNotNullExpressionValue(object4, string4);
                                objectArray3 = new Object[n16];
                                objectArray3[0] = string2;
                                He1.a(objectArray3, n16, (String)object4, string3, object2);
                            }
                        }
                        if ((object7 = this.f) != null) {
                            object7.setTag(object);
                        }
                        if (string2 != null) {
                            n21 = string2.length();
                        } else {
                            n21 = 0;
                            object = null;
                        }
                        if (n21 > n10) {
                            object = this.f;
                            if (object != null) {
                                n16 = R$drawable.new_highlighted_size_shape_drawable_one_size;
                                object.setBackgroundResource(n16);
                            }
                        } else {
                            object = this.f;
                            if (object != null) {
                                n16 = R$drawable.new_highlighted_size_shape_drawable;
                                object.setBackgroundResource(n16);
                            }
                        }
                        if ((object = this.f) != null) {
                            object7 = object.getContext();
                            Intrinsics.checkNotNullExpressionValue(object7, string5);
                            n17 = R$attr.size_chip_highlighted_text_color;
                            n16 = tm3_0.a(n17, (Context)object7);
                            object.setTextColor(n16);
                        }
                    } else {
                        int n22;
                        this.w();
                        object2 = this.f;
                        if (object2 != null) {
                            object2.setImportantForAccessibility(n16);
                            if (n4 != 0) {
                                object4 = StringCompanionObject.INSTANCE;
                                object4 = object2.getContext();
                                n14 = R$string.acc_unselected;
                                object4 = object4.getString(n14);
                                Intrinsics.checkNotNullExpressionValue(object4, string4);
                                objectArray3 = new Object[n16];
                                objectArray3[0] = string2;
                                object7 = Arrays.copyOf(objectArray3, n16);
                                object7 = String.format((String)object4, (Object[])object7);
                                Intrinsics.checkNotNullExpressionValue(object7, string3);
                                object7 = ((String)object7).concat((String)objectArray2);
                                object2.setContentDescription((CharSequence)object7);
                            } else {
                                object4 = StringCompanionObject.INSTANCE;
                                object4 = object2.getContext();
                                n14 = R$string.acc_unselected;
                                object4 = object4.getString(n14);
                                Intrinsics.checkNotNullExpressionValue(object4, string4);
                                objectArray3 = new Object[n16];
                                objectArray3[0] = string2;
                                He1.a(objectArray3, n16, (String)object4, string3, object2);
                            }
                        }
                        if ((object7 = this.f) != null) {
                            object7.setTag(object);
                        }
                        if (string2 != null) {
                            n22 = string2.length();
                        } else {
                            n22 = 0;
                            object = null;
                        }
                        if (n22 > n10) {
                            object = this.f;
                            if (object != null) {
                                n16 = R$drawable.new_disselected_size_shape_drawable_one_size;
                                object.setBackgroundResource(n16);
                            }
                        } else {
                            object = this.f;
                            if (object != null) {
                                n16 = R$drawable.new_disselected_size_shape_drawable;
                                object.setBackgroundResource(n16);
                            }
                        }
                        if ((object = this.f) != null) {
                            object7 = object.getContext();
                            Intrinsics.checkNotNullExpressionValue(object7, string5);
                            n17 = R$attr.size_chip_default_text_color;
                            n16 = tm3_0.a(n17, (Context)object7);
                            object.setTextColor(n16);
                        }
                    }
                }
            }
            if ((object = this.f) != null) {
                object7 = new t32$a_0(this, n3);
                object.setOnClickListener((View.OnClickListener)object7);
            }
            if (n3 == 0) {
                this.itemView.measure(0, 0);
                this.itemView.getMeasuredWidth();
                object = this.a;
                object.a();
            }
        }
    }
}

