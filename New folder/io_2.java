/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.Collection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from iO
 */
public final class io_2
extends BottomSheetDialogFragment
implements View.OnClickListener,
dP$b {
    public boolean A;
    public final int a;
    public final int b;
    public final int c;
    public final NewCustomEventsRevamp d;
    public int e;
    public String f;
    public String g;
    public TextView h;
    public TextView i;
    public TextView j;
    public ImageView k;
    public ImageView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public RecyclerView p;
    public LinearLayoutManager q;
    public ImageView r;
    public View s;
    public View t;
    public View u;
    public ep_0 v;
    public dP w;
    public boolean x;
    public boolean y;
    public int z;

    public io_2() {
        int n3;
        this.a = 1;
        this.b = n3 = 10;
        this.c = n3;
        Object object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.d = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.f = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.g = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final void O9(String object) {
        block58: {
            float f5;
            float f6;
            int n3;
            Object object2;
            Object object3;
            String string2;
            int n4;
            boolean bl2;
            block60: {
                Object object4;
                block59: {
                    Object object5;
                    int n7;
                    bl2 = true;
                    n4 = TextUtils.isEmpty((CharSequence)object);
                    if (n4 != 0) break block58;
                    Intrinsics.checkNotNull(object);
                    object4 = this.v;
                    string2 = "cartSizeUpdateSVM";
                    object3 = null;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object4 = null;
                    }
                    if ((object4 = (Collection)((ep_0)object4).b) != null && (n4 = object4.isEmpty()) == 0) {
                        object4 = this.v;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n4 = 0;
                            object4 = null;
                        }
                        object4 = ((ep_0)object4).b;
                        Intrinsics.checkNotNull(object4);
                        object4 = ((Iterable)object4).iterator();
                        while ((n7 = object4.hasNext()) != 0) {
                            object5 = (ProductOptionVariant)object4.next();
                            object2 = ((ProductOptionVariant)object5).getCode();
                            boolean bl3 = kotlin.text.b.i((String)object, (String)object2, bl2);
                            if (bl3) {
                                object2 = this.v;
                                if (object2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    bl3 = false;
                                    object2 = null;
                                }
                                ((ep_0)object2).c = object5;
                                ((ProductOptionVariant)object5).setSelected(bl2);
                                this.Va((ProductOptionVariant)object5);
                                continue;
                            }
                            ((ProductOptionVariant)object5).setSelected(false);
                        }
                    }
                    if ((object = this.w) != null) {
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                    if ((object = this.p) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cartProductDetailSizeRV");
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    object.invalidate();
                    object = this.v;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    if ((object = ((ep_0)object).c) != null) {
                        object = ((ProductOptionVariant)object).getCode();
                    } else {
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    if (object == null || (n3 = ((String)object).length()) == 0) break block58;
                    object = this.v;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    if ((object = ((ep_0)object).a) != null && (object = ((CartEntry)object).getProduct()) != null) {
                        object = ((Product)object).getCode();
                    } else {
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    if (object == null || (n3 = ((String)object).length()) == 0) break block58;
                    object = this.v;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    if ((object = ((ep_0)object).c) != null) {
                        object = ((ProductOptionVariant)object).getCode();
                    } else {
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    object4 = this.v;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object4 = null;
                    }
                    if ((object4 = ((ep_0)object4).a) != null && (object4 = ((CartEntry)object4).getProduct()) != null) {
                        object4 = ((Product)object4).getCode();
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    n3 = (int)(kotlin.text.b.i((String)object, (String)object4, bl2) ? 1 : 0);
                    object4 = "tvQtyInCartUpdate";
                    if (n3 != 0) {
                        object = this.v;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object = null;
                            f6 = 0.0f;
                        }
                        if ((object5 = this.v) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n7 = 0;
                            object5 = null;
                            f5 = 0.0f;
                        }
                        if ((object5 = ((ep_0)object5).a) != null && (object5 = ((CartEntry)object5).getQuantity()) != null) {
                            n7 = (Integer)object5;
                        } else {
                            n7 = 0;
                            f5 = 0.0f;
                            object5 = null;
                        }
                        ((ep_0)object).d = n7;
                        object = this.i;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            n3 = 0;
                            object = null;
                            f6 = 0.0f;
                        }
                        if ((object4 = this.v) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n4 = 0;
                            object4 = null;
                        }
                        n4 = ((ep_0)object4).d;
                        object4 = String.valueOf(n4);
                        object.setText((CharSequence)object4);
                        object = this.v;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object = null;
                            f6 = 0.0f;
                        }
                        if ((object = ((ep_0)object).c) != null) {
                            n3 = ((ProductOptionVariant)object).getStockLevel();
                        } else {
                            n3 = 0;
                            f6 = 0.0f;
                            object = null;
                        }
                        this.z = n3;
                    } else {
                        object = this.v;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object = null;
                            f6 = 0.0f;
                        }
                        ((ep_0)object).d = bl2;
                        object = this.i;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            n3 = 0;
                            object = null;
                            f6 = 0.0f;
                        }
                        if ((object4 = this.v) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n4 = 0;
                            object4 = null;
                        }
                        n4 = ((ep_0)object4).d;
                        object4 = String.valueOf(n4);
                        object.setText((CharSequence)object4);
                        object = this.v;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object = null;
                            f6 = 0.0f;
                        }
                        if ((object = ((ep_0)object).c) != null) {
                            n3 = ((ProductOptionVariant)object).getStockLevel();
                        } else {
                            n3 = 0;
                            f6 = 0.0f;
                            object = null;
                        }
                        this.z = n3;
                    }
                    object = this.v;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    n3 = ((ep_0)object).d;
                    n4 = this.z;
                    n7 = 0x3F000000;
                    f5 = 0.5f;
                    object2 = "inc";
                    if (n3 >= n4) break block59;
                    object = this.v;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    if ((n3 = ((ep_0)object).d) < (n4 = this.b)) break block60;
                }
                if ((object = this.k) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object = null;
                    f6 = 0.0f;
                }
                this.Wa((ImageView)object, false);
                object = this.v;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                    f6 = 0.0f;
                }
                if ((n3 = ((ep_0)object).d) > (n4 = this.z)) {
                    this.Ra(f5, false);
                    n3 = R$string.qty_update_alert;
                    n4 = this.z;
                    object4 = n4;
                    Object[] objectArray = new Object[bl2];
                    objectArray[0] = object4;
                    object = hv3_0.L(n3, objectArray);
                    this.Qa((String)object);
                }
            }
            if ((object = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
                f6 = 0.0f;
            }
            if ((n3 = ((ep_0)object).d) <= (n4 = this.z)) {
                f6 = 1.0f;
                this.Ra(f6, bl2);
                n3 = this.z;
                this.Pa(n3);
                object = this.v;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                    f6 = 0.0f;
                }
                if ((n3 = ((ep_0)object).d) < (n4 = this.z)) {
                    object = this.k;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    this.Wa((ImageView)object, bl2);
                }
            }
            if ((object = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
                f6 = 0.0f;
            }
            n3 = ((ep_0)object).d;
            n4 = this.a;
            string2 = "dec";
            if (n3 == n4) {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object;
                }
                this.Wa((ImageView)object3, false);
            } else {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object;
                }
                this.Wa((ImageView)object3, bl2);
            }
            n3 = this.z;
            if (n3 <= 0) {
                this.Ra(f5, false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle Oa() {
        Object object;
        double d2;
        Object object2;
        int n3;
        double d5;
        boolean bl2;
        String string2;
        Object object3;
        Object object4;
        Bundle bundle;
        ProductFnlColorVariantData productFnlColorVariantData;
        Object object5;
        Object object6;
        block56: {
            Object object7;
            block55: {
                long l2;
                long l3;
                block54: {
                    NumberFormatException numberFormatException2;
                    block51: {
                        block50: {
                            int n4;
                            String string3;
                            object6 = this.v;
                            object5 = "cartSizeUpdateSVM";
                            productFnlColorVariantData = null;
                            if (object6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                object6 = null;
                            }
                            object6 = (object6 = ((ep_0)object6).a) != null ? ((CartEntry)object6).getProduct() : null;
                            bundle = new Bundle();
                            object4 = this.d;
                            object3 = ((NewCustomEventsRevamp)object4).getPRODUCT_NAME();
                            if (object6 != null) {
                                string3 = ((Product)object6).getName();
                            } else {
                                n4 = 0;
                                string3 = null;
                            }
                            n4 = TextUtils.isEmpty((CharSequence)string3);
                            string2 = "";
                            if (n4 != 0) {
                                string3 = string2;
                            } else if (object6 != null) {
                                string3 = ((Product)object6).getName();
                            } else {
                                n4 = 0;
                                string3 = null;
                            }
                            bundle.putString((String)object3, string3);
                            if (object6 != null) {
                                object3 = ((Product)object6).getBaseProduct();
                            } else {
                                bl2 = false;
                                object3 = null;
                            }
                            bl2 = TextUtils.isEmpty((CharSequence)object3);
                            l3 = 0L;
                            d5 = 0.0;
                            n4 = 0;
                            string3 = null;
                            n3 = 1;
                            if (!bl2) {
                                if (object6 != null) {
                                    object3 = ((Product)object6).getBaseProduct();
                                } else {
                                    bl2 = false;
                                    object3 = null;
                                }
                                object3 = ((NewCustomEventsRevamp)object4).trimProductId((String)object3);
                                object7 = object3[0];
                                boolean bl3 = TextUtils.isEmpty((CharSequence)object7);
                                if (bl3) {
                                    object7 = ((NewCustomEventsRevamp)object4).getPRODUCT_ID();
                                    bundle.putLong((String)object7, l3);
                                }
                                if ((string3 = object3[0]) != null) {
                                    object2 = ((NewCustomEventsRevamp)object4).getPRODUCT_ID();
                                    long l4 = Long.parseLong(string3);
                                    bundle.putLong((String)object2, l4);
                                }
                                if ((n4 = ((String[])object3).length) > n3 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(string3 = object3[n3])) ? 1 : 0)) == 0) {
                                    string3 = ((NewCustomEventsRevamp)object4).getPRODUCT_COLOR();
                                    object3 = object3[n3];
                                    bundle.putString(string3, (String)object3);
                                }
                            } else {
                                if (object6 != null) {
                                    object3 = ((Product)object6).getCode();
                                } else {
                                    bl2 = false;
                                    object3 = null;
                                }
                                object3 = ((NewCustomEventsRevamp)object4).trimProductId((String)object3);
                                string3 = object3[0];
                                n4 = TextUtils.isEmpty((CharSequence)string3);
                                if (n4 != 0) {
                                    string3 = ((NewCustomEventsRevamp)object4).getPRODUCT_ID();
                                    bundle.putLong(string3, l3);
                                }
                                if ((n4 = ((String[])object3).length) > n3 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(string3 = object3[n3])) ? 1 : 0)) == 0) {
                                    string3 = ((NewCustomEventsRevamp)object4).getPRODUCT_COLOR();
                                    object3 = object3[n3];
                                    bundle.putString(string3, (String)object3);
                                }
                            }
                            object3 = ((NewCustomEventsRevamp)object4).getPRODUCT_BRAND();
                            if (object6 != null) {
                                string3 = ((Product)object6).getBrandName();
                            } else {
                                n4 = 0;
                                string3 = null;
                            }
                            n4 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
                            if (n4 != 0) {
                                string3 = string2;
                            } else if (object6 != null) {
                                string3 = ((Product)object6).getBrandName();
                            } else {
                                n4 = 0;
                                string3 = null;
                            }
                            bundle.putString((String)object3, string3);
                            l2 = 0L;
                            d2 = 0.0;
                            try {
                                object2 = this.v;
                                if (object2 != null) break block50;
                                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                object2 = null;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block51;
                            }
                        }
                        if ((object2 = (object2 = ((ep_0)object2).a) != null ? ((CartEntry)object2).getBasePrice() : null) == null) break block54;
                        object2 = this.v;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            object2 = null;
                        }
                        object2 = (object2 = ((ep_0)object2).a) != null ? ((CartEntry)object2).getBasePrice() : null;
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Price)object2).getValue();
                        if (object2 == null) break block54;
                        d5 = Double.parseDouble((String)object2);
                        break block55;
                    }
                    yn3$a yn3$a = yn3_0.a;
                    yn3$a.e(numberFormatException2);
                }
                l3 = l2;
                d5 = d2;
            }
            n3 = (int)(d5 == d2 ? 0 : (d5 < d2 ? -1 : 1));
            if (n3 != 0) {
                NumberFormatException numberFormatException3;
                block53: {
                    block52: {
                        try {
                            object = this.v;
                            if (object != null) break block52;
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n3 = 0;
                            object = null;
                        }
                        catch (NumberFormatException numberFormatException3) {
                            break block53;
                        }
                    }
                    if ((object = ((ep_0)object).a) != null && (object = ((CartEntry)object).getProduct()) != null && (object = ((Product)object).getWasPriceData()) != null) {
                        object = ((Price)object).getValue();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = this.v;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n3 = 0;
                            object = null;
                        }
                        if ((object = ((ep_0)object).a) != null && (object = ((CartEntry)object).getProduct()) != null && (object = ((Product)object).getWasPriceData()) != null && (object = ((Price)object).getValue()) != null) {
                            double d7 = Double.parseDouble((String)object);
                            object = d7;
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        Intrinsics.checkNotNull(object);
                        d2 = (Double)object - d5;
                    }
                    break block56;
                }
                object7 = yn3_0.a;
                ((yn3$a)object7).e(numberFormatException3);
            }
        }
        n3 = (int)(hv3_0.Y() ? 1 : 0);
        if (n3 != 0) {
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n3 = 0;
                object = null;
            }
            object5 = (object5 = ((ep_0)object).c) != null ? Y63.c((ProductOptionVariant)object5) : string2;
        } else {
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n3 = 0;
                object = null;
            }
            object5 = ka2_2.a((CartEntry)((ep_0)object).a).c;
        }
        object = ((NewCustomEventsRevamp)object4).getPRODUCT_PRICE();
        bundle.putDouble((String)object, d5);
        object2 = ((NewCustomEventsRevamp)object4).getPRODUCT_SIZE();
        bundle.putString((String)object2, (String)object5);
        object5 = ((NewCustomEventsRevamp)object4).getPRODUCT_DISCOUNT();
        bundle.putDouble((String)object5, d2);
        object5 = ((NewCustomEventsRevamp)object4).getPRODUCT_CATEGORY();
        if (object6 != null) {
            object3 = ((Product)object6).getBrickCategory();
        } else {
            bl2 = false;
            object3 = null;
        }
        bundle.putString((String)object5, (String)object3);
        object5 = ((NewCustomEventsRevamp)object4).getPRODUCT_BRICK();
        if (object6 != null) {
            object3 = ((Product)object6).getBrickName();
        } else {
            bl2 = false;
            object3 = null;
        }
        bundle.putString((String)object5, (String)object3);
        object5 = ((NewCustomEventsRevamp)object4).getPRODUCT_TAG();
        object4 = hv3_0.a;
        if (object6 != null) {
            object3 = ((Product)object6).getFnlColorVariantData();
        } else {
            bl2 = false;
            object3 = null;
        }
        object4.getClass();
        object4 = hv3_0.A((ProductFnlColorVariantData)object3);
        boolean bl4 = TextUtils.isEmpty((CharSequence)object4);
        if (!bl4) {
            if (object6 != null) {
                productFnlColorVariantData = ((Product)object6).getFnlColorVariantData();
            }
            string2 = hv3_0.A(productFnlColorVariantData);
        }
        bundle.putString((String)object5, string2);
        return bundle;
    }

    public final void Pa(int n3) {
        int n4 = this.c;
        if (n3 <= n4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append(" left");
            String string2 = stringBuilder.toString();
            this.Qa(string2);
        } else {
            n3 = 0;
            Object var4_5 = null;
            this.Qa(null);
        }
    }

    public final void Qa(String string2) {
        String string3 = null;
        String string4 = "tvQuantityInfoInUpdateSizeQty";
        if (string2 == null) {
            string2 = this.j;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
            } else {
                string3 = string2;
            }
            string3.setVisibility(4);
            return;
        }
        TextView textView = this.j;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            textView = null;
        }
        textView.setText((CharSequence)string2);
        string2 = this.j;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
        } else {
            string3 = string2;
        }
        string3.setVisibility(0);
    }

    public final void Ra(float f5, boolean bl2) {
        TextView textView = this.h;
        TextView textView2 = null;
        String string2 = "updateButton";
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            textView = null;
        }
        textView.setEnabled(bl2);
        textView = this.h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            textView = null;
        }
        textView.setClickable(bl2);
        TextView textView3 = this.h;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            textView2 = textView3;
        }
        textView2.setAlpha(f5);
    }

    public final void Sa() {
        NewCustomEventsRevamp newCustomEventsRevamp = this.d;
        String string2 = newCustomEventsRevamp.getEC_BAG_INTERACTIONS();
        String string3 = this.f;
        Bundle bundle = this.Oa();
        String string4 = this.g;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "quantity change", null, "quantity_change_cart", "bag screen", "bag screen", string3, bundle, string4, false, null, 1540, null);
    }

    public final void Ta() {
        NewCustomEventsRevamp newCustomEventsRevamp = this.d;
        String string2 = newCustomEventsRevamp.getEC_BAG_INTERACTIONS();
        String string3 = this.f;
        Bundle bundle = this.Oa();
        String string4 = this.g;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "size change", null, "size_change_cart", "bag screen", "bag screen", string3, bundle, string4, false, null, 1540, null);
    }

    public final void Ua(CartEntry cartEntry, String string2, long l2) {
        Object object;
        Bundle bundle = new Bundle();
        Object object2 = null;
        object = cartEntry != null && (object = cartEntry.getProduct()) != null ? ((Product)object).getCode() : null;
        String string3 = "product_id";
        bundle.putString(string3, (String)object);
        if (cartEntry != null && (object = cartEntry.getProduct()) != null) {
            object2 = ((Product)object).getName();
        }
        bundle.putString("product_name", object2);
        String string4 = String.valueOf(l2);
        object2 = AnalyticsManager.Companion;
        String string5 = bv_0.a((AnalyticsManager$Companion)object2);
        String string6 = cv_0.a((AnalyticsManager$Companion)object2);
        object2 = this.d;
        string3 = string2;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "bag interactions", string2, string4, "bag_interaction", "bag screen", "bag screen", string5, bundle, string6, false, null, 1536, null);
    }

    public final void Va(ProductOptionVariant object) {
        boolean bl2 = hv3_0.Y();
        if (bl2) {
            Object object2 = this.n;
            Object object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeUnitTv");
                bl2 = false;
                object2 = null;
            }
            Y63.h(object2, (ProductOptionVariant)object);
            object2 = Y63.j((ProductOptionVariant)object);
            Object object4 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object2, object4);
            object4 = "brandSizeTv";
            if (bl2) {
                int n3;
                String string2;
                object2 = this.o;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    bl2 = false;
                    object2 = null;
                }
                if ((string2 = Y63.b((ProductOptionVariant)object)) != null && (n3 = string2.length()) != 0) {
                    object = Y63.b((ProductOptionVariant)object);
                    string2 = "Brand Size ";
                    object = kp1_0.c(string2, (String)object);
                } else {
                    object = "";
                }
                object2.setText((CharSequence)object);
                object = this.o;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object;
                }
                boolean bl3 = false;
                object = null;
                object3.setVisibility(0);
            } else {
                object = this.o;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object;
                }
                int n4 = 8;
                object3.setVisibility(n4);
            }
        }
    }

    public final void Wa(ImageView imageView, boolean bl2) {
        boolean bl3 = this.A;
        if (bl3) {
            boolean bl4 = false;
            float f5 = 0.0f;
            imageView.setEnabled(false);
            imageView.setClickable(false);
        } else {
            imageView.setEnabled(bl2);
            imageView.setClickable(bl2);
            if (bl2) {
                int n3 = 1065353216;
                float f6 = 1.0f;
                imageView.setAlpha(f6);
            } else {
                int n4 = 0x3F000000;
                float f7 = 0.5f;
                imageView.setAlpha(f7);
            }
        }
    }

    public final void Xa(ImageView imageView, ImageView imageView2, boolean bl2, boolean bl3) {
        int n3 = this.A;
        if (n3 != 0) {
            bl2 = false;
            imageView.setEnabled(false);
            imageView.setClickable(false);
            imageView2.setEnabled(false);
            imageView2.setClickable(false);
        } else {
            imageView.setEnabled(bl2);
            imageView.setClickable(bl2);
            n3 = 0x3F000000;
            float f5 = 0.5f;
            float f6 = 1.0f;
            if (bl2) {
                imageView.setAlpha(f6);
            } else {
                imageView.setAlpha(f5);
            }
            imageView2.setEnabled(bl3);
            imageView2.setClickable(bl3);
            if (bl3) {
                imageView2.setAlpha(f6);
            } else {
                imageView2.setAlpha(f5);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void onClick(View var1_1) {
        block119: {
            block123: {
                block125: {
                    block124: {
                        block120: {
                            block121: {
                                block122: {
                                    block115: {
                                        block116: {
                                            block118: {
                                                block117: {
                                                    var2_2 = 0;
                                                    var3_3 = null;
                                                    if (var1_1 != null) {
                                                        var4_4 = var1_1.getId();
                                                        var1_1 = var4_4;
                                                    } else {
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    var6_6 = R$id.decQty;
                                                    var7_7 = "Quantity Button";
                                                    var8_8 = this.b;
                                                    var9_9 = "inc";
                                                    var10_10 = "dec";
                                                    var11_11 = "tvQtyInCartUpdate";
                                                    var12_12 = -1;
                                                    var13_13 = "bag screen";
                                                    var14_14 = 1;
                                                    var15_15 = "cartSizeUpdateSVM";
                                                    if (var1_1 == null || (var16_16 = var1_1.intValue()) != var6_6) break block115;
                                                    var1_1 = this.v;
                                                    if (var1_1 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    var1_1.d = var6_6 = var1_1.d + var12_12;
                                                    var1_1 = this.i;
                                                    if (var1_1 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    if ((var17_17 = this.v) == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                                        var6_6 = 0;
                                                        var17_17 = null;
                                                    }
                                                    var6_6 = var17_17.d;
                                                    var17_17 = String.valueOf(var6_6);
                                                    var1_1.setText((CharSequence)var17_17);
                                                    var1_1 = this.v;
                                                    if (var1_1 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    if ((var4_4 = var1_1.d) == (var6_6 = this.a)) {
                                                        var1_1 = this.l;
                                                        if (var1_1 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                                                            var4_4 = 0;
                                                            var1_1 = null;
                                                            var5_5 = 0.0f;
                                                        }
                                                        if ((var17_17 = this.k) == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                                            var6_6 = 0;
                                                            var17_17 = null;
                                                        }
                                                        this.Xa((ImageView)var1_1, (ImageView)var17_17, false, (boolean)var14_14);
                                                    } else {
                                                        var1_1 = this.l;
                                                        if (var1_1 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                                                            var4_4 = 0;
                                                            var1_1 = null;
                                                            var5_5 = 0.0f;
                                                        }
                                                        if ((var17_17 = this.k) == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                                            var6_6 = 0;
                                                            var17_17 = null;
                                                        }
                                                        this.Xa((ImageView)var1_1, (ImageView)var17_17, (boolean)var14_14, (boolean)var14_14);
                                                    }
                                                    var1_1 = this.v;
                                                    if (var1_1 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    if ((var1_1 = var1_1.c) != null) {
                                                        var1_1 = var1_1.getCode();
                                                    } else {
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    if (var1_1 == null || (var4_4 = var1_1.length()) == 0) break block116;
                                                    var1_1 = this.v;
                                                    if (var1_1 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    if ((var1_1 = var1_1.a) != null && (var1_1 = var1_1.getProduct()) != null) {
                                                        var1_1 = var1_1.getCode();
                                                    } else {
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    if (var1_1 == null || (var4_4 = var1_1.length()) == 0) break block116;
                                                    var1_1 = this.v;
                                                    if (var1_1 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    if ((var4_4 = var1_1.d) >= (var6_6 = this.z)) break block117;
                                                    var1_1 = this.v;
                                                    if (var1_1 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                                        var4_4 = 0;
                                                        var1_1 = null;
                                                        var5_5 = 0.0f;
                                                    }
                                                    if ((var4_4 = var1_1.d) < var8_8) break block118;
                                                }
                                                if ((var1_1 = this.k) == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                                    var4_4 = 0;
                                                    var1_1 = null;
                                                    var5_5 = 0.0f;
                                                }
                                                this.Wa((ImageView)var1_1, false);
                                                var4_4 = 0x3F000000;
                                                var5_5 = 0.5f;
                                                this.Ra(var5_5, false);
                                            }
                                            if ((var1_1 = this.v) == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                            } else {
                                                var3_3 = var1_1;
                                            }
                                            var4_4 = var3_3.d;
                                            var2_2 = this.z;
                                            if (var4_4 <= var2_2) {
                                                var5_5 = 1.0f;
                                                this.Ra(var5_5, (boolean)var14_14);
                                                var4_4 = this.z;
                                                this.Pa(var4_4);
                                            }
                                        }
                                        var1_1 = AnalyticsManager.Companion;
                                        var3_3 = "Decrease Quantity";
                                        tj2_0.e((AnalyticsManager$Companion)var1_1, (String)var3_3, (String)var7_7, var13_13);
                                        break block119;
                                    }
                                    var6_6 = R$id.incQty;
                                    if (var1_1 == null || (var16_16 = var1_1.intValue()) != var6_6) break block120;
                                    var1_1 = this.v;
                                    if (var1_1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    var1_1.d = var6_6 = var1_1.d + var14_14;
                                    var1_1 = this.i;
                                    if (var1_1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var11_11);
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    if ((var17_18 = this.v) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                        var6_6 = 0;
                                        var17_18 = null;
                                    }
                                    var6_6 = var17_18.d;
                                    var17_18 = String.valueOf(var6_6);
                                    var1_1.setText((CharSequence)var17_18);
                                    var1_1 = this.v;
                                    if (var1_1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    if ((var4_4 = var1_1.d) == var8_8) {
                                        var1_1 = this.l;
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                                            var4_4 = 0;
                                            var1_1 = null;
                                            var5_5 = 0.0f;
                                        }
                                        if ((var17_18 = this.k) == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                            var6_6 = 0;
                                            var17_18 = null;
                                        }
                                        this.Xa((ImageView)var1_1, (ImageView)var17_18, (boolean)var14_14, false);
                                    } else {
                                        var1_1 = this.l;
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                                            var4_4 = 0;
                                            var1_1 = null;
                                            var5_5 = 0.0f;
                                        }
                                        if ((var17_18 = this.k) == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                            var6_6 = 0;
                                            var17_18 = null;
                                        }
                                        this.Xa((ImageView)var1_1, (ImageView)var17_18, (boolean)var14_14, (boolean)var14_14);
                                    }
                                    var1_1 = this.v;
                                    if (var1_1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    if ((var1_1 = var1_1.c) != null) {
                                        var1_1 = var1_1.getCode();
                                    } else {
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    if (var1_1 == null || (var4_4 = var1_1.length()) == 0) break block121;
                                    var1_1 = this.v;
                                    if (var1_1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    if ((var1_1 = var1_1.a) != null && (var1_1 = var1_1.getProduct()) != null) {
                                        var1_1 = var1_1.getCode();
                                    } else {
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    if (var1_1 == null || (var4_4 = var1_1.length()) == 0) break block121;
                                    var1_1 = this.v;
                                    if (var1_1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    if ((var4_4 = var1_1.d) >= (var6_6 = this.z)) break block122;
                                    var1_1 = this.v;
                                    if (var1_1 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                        var4_4 = 0;
                                        var1_1 = null;
                                        var5_5 = 0.0f;
                                    }
                                    if ((var4_4 = var1_1.d) < var8_8) break block121;
                                }
                                if ((var1_1 = this.k) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                } else {
                                    var3_3 = var1_1;
                                }
                                this.Wa((ImageView)var3_3, false);
                            }
                            var1_1 = AnalyticsManager.Companion;
                            var3_3 = "Increase Quantity";
                            tj2_0.e((AnalyticsManager$Companion)var1_1, (String)var3_3, (String)var7_7, var13_13);
                            break block119;
                        }
                        var6_6 = R$id.updateBtn;
                        if (var1_1 == null || (var18_20 = var1_1.intValue()) != var6_6) break block123;
                        var1_1 = this.v;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        if ((var1_1 = var1_1.a) != null && (var1_1 = var1_1.getProduct()) != null) {
                            var1_1 = var1_1.getCode();
                        } else {
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        var17_19 = this.v;
                        if (var17_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        if ((var17_19 = var17_19.c) != null) {
                            var17_19 = var17_19.getCode();
                        } else {
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        var4_4 = (int)kotlin.text.b.i((String)var1_1, (String)var17_19, (boolean)var14_14);
                        if (var4_4 == 0) break block124;
                        var1_1 = this.v;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        if ((var1_1 = var1_1.a) == null) break block124;
                        var1_1 = var1_1.getQuantity();
                        var17_19 = this.v;
                        if (var17_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        var6_6 = var17_19.d;
                        if (var1_1 != null && (var4_4 = var1_1.intValue()) == var6_6) break block125;
                    }
                    if ((var1_1 = this.v) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var4_4 = 0;
                        var1_1 = null;
                        var5_5 = 0.0f;
                    }
                    if ((var1_1 = var1_1.a) != null && (var1_1 = var1_1.getProduct()) != null) {
                        var1_1 = var1_1.getCode();
                    } else {
                        var4_4 = 0;
                        var1_1 = null;
                        var5_5 = 0.0f;
                    }
                    var17_19 = this.v;
                    if (var17_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var6_6 = 0;
                        var17_19 = null;
                    }
                    if ((var17_19 = var17_19.c) != null) {
                        var17_19 = var17_19.getCode();
                    } else {
                        var6_6 = 0;
                        var17_19 = null;
                    }
                    var4_4 = (int)kotlin.text.b.i((String)var1_1, (String)var17_19, (boolean)var14_14);
                    if (var4_4 != 0) ** GOTO lbl-1000
                    var1_1 = this.v;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var4_4 = 0;
                        var1_1 = null;
                        var5_5 = 0.0f;
                    }
                    if ((var1_1 = var1_1.a) == null) ** GOTO lbl-1000
                    var1_1 = var1_1.getQuantity();
                    var17_19 = this.v;
                    if (var17_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var6_6 = 0;
                        var17_19 = null;
                    }
                    var6_6 = var17_19.d;
                    if (var1_1 == null || (var4_4 = var1_1.intValue()) != var6_6) lbl-1000:
                    // 2 sources

                    {
                        var1_1 = "Change Size/Quantity";
                        var17_19 = "Size/Quantity updated";
                    } else lbl-1000:
                    // 2 sources

                    {
                        if ((var1_1 = this.v) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        if ((var1_1 = var1_1.a) != null && (var1_1 = var1_1.getProduct()) != null) {
                            var1_1 = var1_1.getCode();
                        } else {
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        var17_19 = this.v;
                        if (var17_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        if ((var17_19 = var17_19.c) != null) {
                            var17_19 = var17_19.getCode();
                        } else {
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        var4_4 = (int)kotlin.text.b.i((String)var1_1, (String)var17_19, (boolean)var14_14);
                        if (var4_4 == 0) {
                            var1_1 = "Change Size";
                            var17_19 = "Size updated";
                        } else {
                            var1_1 = this.v;
                            if (var1_1 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                                var4_4 = 0;
                                var1_1 = null;
                                var5_5 = 0.0f;
                            }
                            if ((var1_1 = var1_1.a) != null && (var4_4 = (int)var1_1.inventoryQtyUpdateNeeded()) == var14_14) {
                                var1_1 = "Inventory change";
lbl360:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var1_1 = "Quantity updated";
                            ** continue;
                            var17_19 = var1_1;
                            var1_1 = "Change Quantity";
                        }
                    }
                    var7_7 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var7_7.pushButtonTapEvent((String)var1_1, var17_19, var13_13);
                    var1_1 = this.getTargetFragment();
                    if (var1_1 != null) {
                        var6_6 = this.getTargetRequestCode();
                        var1_1.onActivityResult(var6_6, var12_12, null);
                    }
                    this.Oa();
                    var1_1 = this.v;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var4_4 = 0;
                        var1_1 = null;
                        var5_5 = 0.0f;
                    }
                    if ((var1_1 = var1_1.a) != null && (var1_1 = var1_1.getProduct()) != null) {
                        var1_1 = var1_1.getCode();
                    } else {
                        var4_4 = 0;
                        var1_1 = null;
                        var5_5 = 0.0f;
                    }
                    var17_19 = this.v;
                    if (var17_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var6_6 = 0;
                        var17_19 = null;
                    }
                    if ((var17_19 = var17_19.c) != null) {
                        var17_19 = var17_19.getCode();
                    } else {
                        var6_6 = 0;
                        var17_19 = null;
                    }
                    var4_4 = kotlin.text.b.i((String)var1_1, (String)var17_19, (boolean)var14_14);
                    if (var4_4 != 0) ** GOTO lbl-1000
                    var1_1 = this.v;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var4_4 = 0;
                        var1_1 = null;
                        var5_5 = 0.0f;
                    }
                    if ((var1_1 = var1_1.a) == null) ** GOTO lbl-1000
                    var1_1 = var1_1.getQuantity();
                    var17_19 = this.v;
                    if (var17_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var6_6 = 0;
                        var17_19 = null;
                    }
                    var6_6 = var17_19.d;
                    if (var1_1 == null || (var4_4 = var1_1.intValue()) != var6_6) lbl-1000:
                    // 2 sources

                    {
                        this.Sa();
                        this.Ta();
                    } else lbl-1000:
                    // 2 sources

                    {
                        if ((var1_1 = this.v) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        if ((var1_1 = var1_1.a) != null && (var1_1 = var1_1.getProduct()) != null) {
                            var1_1 = var1_1.getCode();
                        } else {
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        var17_19 = this.v;
                        if (var17_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        if ((var17_19 = var17_19.c) != null) {
                            var17_19 = var17_19.getCode();
                        } else {
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        var4_4 = kotlin.text.b.i((String)var1_1, (String)var17_19, (boolean)var14_14);
                        if (var4_4 == 0) {
                            this.Ta();
                        } else {
                            this.Sa();
                        }
                    }
                    var4_4 = this.e;
                    var17_19 = this.v;
                    if (var17_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var6_6 = 0;
                        var17_19 = null;
                    }
                    if (var4_4 > (var6_6 = var17_19.d)) {
                        var1_1 = this.v;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        var1_1 = var1_1.a;
                        var6_6 = this.e;
                        var7_7 = this.v;
                        if (var7_7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var18_20 = 0;
                            var7_7 = null;
                        }
                        var18_20 = var7_7.d;
                        var19_21 = var6_6 -= var18_20;
                        var21_22 = "decrase quantity";
                        this.Ua((CartEntry)var1_1, (String)var21_22, var19_21);
                        var1_1 = this.v;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        this.e = var4_4 = var1_1.d;
                    }
                    var4_4 = this.e;
                    var17_19 = this.v;
                    if (var17_19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var6_6 = 0;
                        var17_19 = null;
                    }
                    if (var4_4 < (var6_6 = var17_19.d)) {
                        var1_1 = this.v;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        var1_1 = var1_1.a;
                        var17_19 = this.v;
                        if (var17_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        var6_6 = var17_19.d;
                        var18_20 = this.e;
                        var19_21 = var6_6 -= var18_20;
                        var21_22 = "increase quantity";
                        this.Ua((CartEntry)var1_1, (String)var21_22, var19_21);
                        var1_1 = this.v;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var4_4 = 0;
                            var1_1 = null;
                            var5_5 = 0.0f;
                        }
                        this.e = var4_4 = var1_1.d;
                    }
                    if ((var1_1 = this.v) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                        var4_4 = 0;
                        var1_1 = null;
                        var5_5 = 0.0f;
                    }
                    if ((var1_1 = var1_1.a) != null && (var1_1 = var1_1.getProduct()) != null) {
                        var17_19 = var1_1.getPrice();
                        if (var17_19 != null && (var17_19 = var17_19.getValue()) != null) {
                            var22_23 = Double.parseDouble((String)var17_19);
                            ok1_1.a(var22_23);
                        }
                        if ((var17_19 = this.v) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        var6_6 = var17_19.d;
                        var17_19 = el1_2.a;
                        var17_19 = this.v;
                        if (var17_19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var15_15);
                            var6_6 = 0;
                            var17_19 = null;
                        }
                        var6_6 = var17_19.d;
                        var7_7 = "product";
                        Intrinsics.checkNotNullParameter(var1_1, (String)var7_7);
                        var18_20 = (int)el1_2.j();
                        if (var18_20 != 0) {
                            var7_7 = el1_2.b;
                            var21_22 = new fl1_2((Product)var1_1, var6_6, null);
                            var4_4 = 3;
                            var5_5 = 4.2E-45f;
                            Ae3.d((i90_0)var7_7, null, null, (Function2)var21_22, var4_4);
                        }
                    }
                }
                this.x = false;
                this.dismiss();
                break block119;
            }
            var2_2 = R$id.cancelBtn;
            if (var1_1 != null && (var4_4 = var1_1.intValue()) == var2_2) {
                this.dismiss();
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getParentFragment();
        if (object != null) {
            object = this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(object, "requireParentFragment(...)");
            Object object2 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = object.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = object.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, "store");
            Intrinsics.checkNotNullParameter(object4, "factory");
            object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, (E$b)object4, (Wd0)object);
            object2 = ep_0.class;
            object3 = "modelClass";
            object2 = do_0.a((Class)object2, (String)object3, (Class)object2, (String)object3, (String)object3);
            Intrinsics.checkNotNullParameter(object2, "<this>");
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object3 = ((String)object4).concat((String)object3);
                this.v = object = (ep_0)((pD3)object).a((yn1_2)object2, (String)object3);
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        go_2 go_22 = new go_2((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)go_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.cart_update_item_bottomsheet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.cart_update_item_bottomsheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        float f5;
        int n3;
        int n4;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n8 = R$id.parent_layout;
        object2 = (ConstraintLayout)object.findViewById(n8);
        Object object3 = Looper.getMainLooper();
        Object object4 = new Handler(object3);
        object3 = new ho_1((ConstraintLayout)((Object)object2));
        long l2 = 100;
        object4.postDelayed((Runnable)object3, l2);
        n8 = R$id.updateBtn;
        object2 = (TextView)object.findViewById(n8);
        this.h = object2;
        n8 = R$id.quantityTv;
        object2 = (TextView)object.findViewById(n8);
        this.i = object2;
        n8 = R$id.cart_qty_info_tv_header;
        object2 = (TextView)object.findViewById(n8);
        this.j = object2;
        n8 = R$id.incQty;
        object2 = (ImageView)object.findViewById(n8);
        this.k = object2;
        n8 = R$id.decQty;
        object2 = (ImageView)object.findViewById(n8);
        this.l = object2;
        object4 = "dec";
        object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n8 = 0;
            object2 = null;
        }
        int n10 = R$string.reduce_quantity;
        String string2 = hv3_0.K(n10);
        object2.setContentDescription((CharSequence)string2);
        object2 = this.k;
        string2 = "inc";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object2 = null;
        }
        int n14 = R$string.increase_quantity;
        Object object5 = hv3_0.K(n14);
        object2.setContentDescription((CharSequence)object5);
        n8 = R$id.cart_size_info_tv_header;
        object2 = (TextView)object.findViewById(n8);
        this.m = object2;
        n8 = R$id.size_unit_tv;
        object2 = (TextView)object.findViewById(n8);
        this.n = object2;
        n8 = R$id.brand_size_tv;
        object2 = (TextView)object.findViewById(n8);
        this.o = object2;
        n8 = R$id.sizeRv;
        object2 = (RecyclerView)object.findViewById(n8);
        this.p = object2;
        object5 = this.requireActivity();
        object2 = new LinearLayoutManager((Context)object5, 0, false);
        this.q = object2;
        n8 = R$id.cancelBtn;
        object2 = (ImageView)object.findViewById(n8);
        this.r = object2;
        object5 = "cancelBtn";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n8 = 0;
            object2 = null;
        }
        int n15 = R$string.close_txt;
        String string3 = hv3_0.K(n15);
        object2.setContentDescription((CharSequence)string3);
        n8 = R$id.qtyContainer;
        object2 = object.findViewById(n8);
        this.s = object2;
        n8 = R$id.cart_size_dod;
        object2 = object.findViewById(n8);
        this.t = object2;
        n8 = R$id.cart_qty_dod;
        object = object.findViewById(n8);
        this.u = object;
        object = this.r;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.v;
        object2 = "cartSizeUpdateSVM";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        this.e = n4 = ((ep_0)object).d;
        this.A = false;
        object = this.v;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        if ((object = ((ep_0)object).a) != null && (n4 = (int)(((CartEntry)object).isDealEnabled() ? 1 : 0)) == n7) {
            long l3 = k7.p();
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            object = ((ep_0)object).a;
            long l4 = 0L;
            long l7 = object != null ? ((CartEntry)object).getActualDealStartTime() : l4;
            long l8 = l3 - l7;
            n4 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n4 > 0) {
                object = this.v;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n4 = 0;
                    object = null;
                }
                if ((object = ((ep_0)object).a) != null) {
                    l4 = ((CartEntry)object).getDealEndTime();
                }
                if ((n4 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1))) < 0) {
                    this.A = n7;
                }
            }
        }
        n4 = (int)(this.A ? 1 : 0);
        n14 = 8;
        n15 = 0x3F000000;
        float f6 = 0.5f;
        Object object6 = "cartQtyDod";
        Object object7 = "cartSizeDod";
        Object object8 = "qtyContainer";
        if (n4 != 0) {
            object = this.s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n4 = 0;
                object = null;
            }
            object.setAlpha(f6);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n4 = 0;
                object = null;
            }
            if ((object8 = this.k) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object8 = null;
                f5 = 0.0f;
            }
            this.Xa((ImageView)object, (ImageView)object8, false, false);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n4 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n4 = 0;
                object = null;
            }
            object.setVisibility(0);
        } else {
            object = this.s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n4 = 0;
                object = null;
            }
            n3 = 1065353216;
            f5 = 1.0f;
            object.setAlpha(f5);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n4 = 0;
                object = null;
            }
            object.setVisibility(n14);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n4 = 0;
                object = null;
            }
            object.setVisibility(n14);
        }
        object = this.v;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        if ((object = ((ep_0)object).b) != null) {
            object6 = object.iterator();
            int n16 = 0;
            object7 = null;
            while ((n3 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                object8 = (ProductOptionVariant)object6.next();
                n3 = (int)(((ProductOptionVariant)object8).isStockAvailable() ? 1 : 0);
                if (n3 != 0) continue;
                n16 += n7;
            }
            int n17 = object.size();
            object8 = "tvSizeOOS";
            if (n16 == n17) {
                object5 = this.m;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                    n14 = 0;
                    object5 = null;
                }
                n17 = R$string.product_oos;
                object6 = hv3_0.K(n17);
                object5.setText((CharSequence)object6);
                object5 = this.m;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                    n14 = 0;
                    object5 = null;
                }
                object5.setVisibility(0);
                this.x = n7;
            } else {
                object6 = this.v;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n17 = 0;
                    object6 = null;
                }
                if ((object6 = ((ep_0)object6).c) != null && (n17 = (int)(((ProductOptionVariant)object6).isStockAvailable() ? 1 : 0)) == n7) {
                    object6 = this.m;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                        n17 = 0;
                        object6 = null;
                    }
                    object6.setVisibility(n14);
                } else {
                    object5 = this.m;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                        n14 = 0;
                        object5 = null;
                    }
                    n17 = R$string.size_oos;
                    object6 = hv3_0.K(n17);
                    object5.setText((CharSequence)object6);
                    object5 = this.m;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                        n14 = 0;
                        object5 = null;
                    }
                    object5.setVisibility(0);
                }
            }
            object5 = object;
            object5 = (Collection)object;
            n14 = object5.isEmpty() ^ n7;
            if (n14 != 0) {
                object5 = (ProductOptionVariant)object.get(0);
                object6 = this.n;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sizeUnitTv");
                    n17 = 0;
                    object6 = null;
                }
                Y63.h((TextView)object6, (ProductOptionVariant)object5);
            }
            if ((object5 = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n14 = 0;
                object5 = null;
            }
            if ((object5 = ((ep_0)object5).c) == null) {
                this.y = n7;
            }
            if ((object5 = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n14 = 0;
                object5 = null;
            }
            if ((object5 = ((ep_0)object5).b) != null) {
                object5 = ((Iterable)object5).iterator();
                while ((n17 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                    object6 = (ProductOptionVariant)object5.next();
                    n16 = (int)(((ProductOptionVariant)object6).isSelected() ? 1 : 0);
                    if (n16 != 0) {
                        this.Va((ProductOptionVariant)object6);
                    }
                    if ((n16 = (int)(this.y ? 1 : 0)) != 0) continue;
                    object7 = this.v;
                    if (object7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n16 = 0;
                        object7 = null;
                    }
                    if ((object7 = ((ep_0)object7).c) != null) {
                        object7 = ((ProductOptionVariant)object7).getCode();
                    } else {
                        n16 = 0;
                        object7 = null;
                    }
                    if ((n16 = (int)(kotlin.text.b.i((String)object7, (String)(object8 = ((ProductOptionVariant)object6).getCode()), n7 != 0) ? 1 : 0)) == 0) continue;
                    n17 = ((ProductOptionVariant)object6).isStockAvailable() ^ n7;
                    this.y = n17;
                }
            }
            object5 = this.p;
            object6 = "cartProductDetailSizeRV";
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n14 = 0;
                object5 = null;
            }
            if ((object7 = this.q) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeLayoutManager");
                n16 = 0;
                object7 = null;
            }
            ((RecyclerView)object5).setLayoutManager((RecyclerView$o)object7);
            Intrinsics.checkNotNullParameter(object, "productOptionVariantList");
            object7 = "onSizeClickListener";
            Intrinsics.checkNotNullParameter(this, (String)object7);
            object5 = new RecyclerView$f();
            ((dP)object5).a = object;
            ((dP)object5).b = this;
            this.w = object5;
            object = this.p;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n4 = 0;
                object = null;
            }
            object5 = this.w;
            ((RecyclerView)object).setAdapter((RecyclerView$f)object5);
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((object5 = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n14 = 0;
                object5 = null;
            }
            if ((object5 = ((ep_0)object5).a) != null && (object5 = ((CartEntry)object5).getQuantity()) != null) {
                n14 = (Integer)object5;
            } else {
                n14 = 0;
                object5 = null;
            }
            ((ep_0)object).d = n14;
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((object = ((ep_0)object).c) != null) {
                n4 = ((ProductOptionVariant)object).getStockLevel();
            } else {
                n4 = 0;
                object = null;
            }
            this.z = n4;
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((n4 = ((ep_0)object).d) == (n14 = this.a)) {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n4 = 0;
                    object = null;
                }
                if ((object6 = this.k) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n17 = 0;
                    object6 = null;
                }
                this.Xa((ImageView)object, (ImageView)object6, false, n7 != 0);
            }
            if ((object = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((n4 = ((ep_0)object).d) == (n17 = this.b)) {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n4 = 0;
                    object = null;
                }
                if ((object7 = this.k) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n16 = 0;
                    object7 = null;
                }
                this.Xa((ImageView)object, (ImageView)object7, n7 != 0, false);
            }
            if ((object = this.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvQtyInCartUpdate");
                n4 = 0;
                object = null;
            }
            if ((object7 = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n16 = 0;
                object7 = null;
            }
            n16 = ((ep_0)object7).d;
            object7 = String.valueOf(n16);
            object.setText((CharSequence)object7);
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((n4 = ((ep_0)object).d) <= n14) {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n4 = 0;
                    object = null;
                }
                this.Wa((ImageView)object, false);
            }
            if ((object = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((n4 = ((ep_0)object).d) >= n17) {
                object = this.k;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object = null;
                }
                this.Wa((ImageView)object, false);
            }
            if ((object = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((object = ((ep_0)object).c) != null) {
                object = ((ProductOptionVariant)object).getCode();
            } else {
                n4 = 0;
                object = null;
            }
            object5 = "updateButton";
            if (object != null && (n4 = ((String)object).length()) != 0) {
                object = this.v;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n4 = 0;
                    object = null;
                }
                if ((object = ((ep_0)object).a) != null && (object = ((CartEntry)object).getProduct()) != null) {
                    object = ((Product)object).getCode();
                } else {
                    n4 = 0;
                    object = null;
                }
                if (object != null && (n4 = ((String)object).length()) != 0) {
                    object = this.v;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n4 = 0;
                        object = null;
                    }
                    if ((object = ((ep_0)object).c) != null) {
                        object = ((ProductOptionVariant)object).getCode();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    object6 = this.v;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n17 = 0;
                        object6 = null;
                    }
                    if ((object6 = ((ep_0)object6).a) != null && (object6 = ((CartEntry)object6).getProduct()) != null) {
                        object6 = ((Product)object6).getCode();
                    } else {
                        n17 = 0;
                        object6 = null;
                    }
                    Intrinsics.checkNotNull(object6);
                    n4 = kotlin.text.b.i((String)object, (String)object6, n7 != 0);
                    if (n4 != 0) {
                        object = this.v;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            n4 = 0;
                            object = null;
                        }
                        if ((n4 = ((ep_0)object).d) >= (n17 = this.z)) {
                            n4 = (int)(this.x ? 1 : 0);
                            if (n4 != 0) {
                                object = this.l;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                    n4 = 0;
                                    object = null;
                                }
                                if ((object6 = this.k) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n17 = 0;
                                    object6 = null;
                                }
                                this.Xa((ImageView)object, (ImageView)object6, false, false);
                            } else {
                                object = this.v;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                    n4 = 0;
                                    object = null;
                                }
                                if ((n4 = ((ep_0)object).d) >= (n17 = this.z)) {
                                    object = this.k;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n4 = 0;
                                        object = null;
                                    }
                                    this.Wa((ImageView)object, false);
                                }
                                if ((object = this.h) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                    n4 = 0;
                                    object = null;
                                }
                                object.setEnabled(false);
                                object = this.h;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                    n4 = 0;
                                    object = null;
                                }
                                object.setClickable(false);
                            }
                            object = this.v;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                n4 = 0;
                                object = null;
                            }
                            if ((n4 = ((ep_0)object).d) > (n8 = this.z)) {
                                n4 = (int)(this.x ? 1 : 0);
                                if (n4 != 0) {
                                    object = "This product is out of stock";
                                    this.Qa((String)object);
                                } else {
                                    n4 = R$string.qty_update_alert;
                                    object2 = n8;
                                    Object[] objectArray = new Object[n7];
                                    objectArray[0] = object2;
                                    object = hv3_0.L(n4, objectArray);
                                    this.Qa((String)object);
                                }
                            } else {
                                this.Pa(n8);
                            }
                        } else {
                            this.Pa(n17);
                        }
                    }
                }
            }
            if ((object = this.l) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n4 = 0;
                object = null;
            }
            object.setOnClickListener((View.OnClickListener)this);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object = null;
            }
            object.setOnClickListener((View.OnClickListener)this);
            n4 = (int)(this.x ? 1 : 0);
            if (n4 != 0) {
                object = this.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n4 = 0;
                    object = null;
                }
                n8 = R$string.okay;
                object.setText(n8);
            }
            if ((n4 = (int)(this.y ? 1 : 0)) != 0) {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n4 = 0;
                    object = null;
                }
                if ((object2 = this.k) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n8 = 0;
                    object2 = null;
                }
                this.Xa((ImageView)object, (ImageView)object2, false, false);
                this.Ra(f6, false);
            }
            if ((object = this.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            } else {
                object3 = object;
            }
            object3.setOnClickListener((View.OnClickListener)this);
        }
    }
}

