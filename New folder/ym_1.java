/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YM
 */
public final class ym_1
implements View.OnClickListener {
    public final /* synthetic */ bn_2 a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ tm_2 c;

    public /* synthetic */ ym_1(bn_2 bn_22, Product product, tm_2 tm_22) {
        this.a = bn_22;
        this.b = product;
        this.c = tm_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View view) {
        int n3;
        int n4;
        Object object;
        Object object2;
        Object object3;
        bn_2 bn_22;
        block51: {
            long l2;
            double d2;
            double d5;
            long l3;
            boolean bl2;
            int n7;
            Object object4;
            Object object5;
            String string2;
            Object object6;
            Object object7;
            Object object8;
            String string3;
            Object object9;
            String string4;
            Object object10;
            String string5;
            block54: {
                block53: {
                    block52: {
                        NumberFormatException numberFormatException2;
                        block45: {
                            block44: {
                                block43: {
                                    bn_22 = this.a;
                                    Intrinsics.checkNotNullParameter(bn_22, "this$0");
                                    object3 = this.c;
                                    Intrinsics.checkNotNullParameter(object3, "$it");
                                    bn_22.dismiss();
                                    object2 = this.b;
                                    bn_22.Oa((Product)object2, "Move to wishlist");
                                    object = AnalyticsManager.Companion;
                                    String string6 = "bag screen";
                                    string5 = "Remove From Cart";
                                    tj2_0.e((AnalyticsManager$Companion)object, string5, "Add To Closet", string6);
                                    object10 = bn_22.c;
                                    string4 = ((NewCustomEventsRevamp)object10).getEC_BAG_INTERACTIONS();
                                    object9 = bn_22.d;
                                    object = bn_22.e;
                                    string3 = null;
                                    String string7 = "remove from cart";
                                    object8 = "cart_move_to_wishlist";
                                    object7 = "bag screen";
                                    object6 = "bag screen";
                                    string2 = null;
                                    int n8 = 1668;
                                    object5 = object10;
                                    object4 = object;
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object10, string4, string7, null, (String)object8, (String)object7, (String)object6, (String)object9, null, (String)object, false, null, n8, null);
                                    n4 = 1;
                                    if (object2 == null) break block51;
                                    string5 = new Bundle();
                                    object = ((NewCustomEventsRevamp)object10).getPRODUCT_NAME();
                                    object5 = ((Product)object2).getName();
                                    n7 = TextUtils.isEmpty((CharSequence)object5);
                                    string4 = "";
                                    object5 = n7 != 0 ? string4 : ((Product)object2).getName();
                                    string5.putString((String)object, (String)object5);
                                    object = ((Product)object2).getBaseProduct();
                                    bl2 = TextUtils.isEmpty((CharSequence)object);
                                    n7 = 0;
                                    object5 = null;
                                    l3 = 0L;
                                    if (!bl2) {
                                        object = ((Product)object2).getBaseProduct();
                                        object8 = (object = ((NewCustomEventsRevamp)object10).trimProductId((String)object))[0];
                                        boolean bl3 = TextUtils.isEmpty((CharSequence)object8);
                                        if (bl3) {
                                            object8 = ((NewCustomEventsRevamp)object10).getPRODUCT_ID();
                                            string5.putLong((String)object8, l3);
                                        }
                                        if ((object5 = object[0]) != null) {
                                            object8 = ((NewCustomEventsRevamp)object10).getPRODUCT_ID();
                                            long l4 = Long.parseLong((String)object5);
                                            string5.putLong((String)object8, l4);
                                        }
                                        if ((n7 = ((String[])object).length) > n4 && (n7 = (int)(TextUtils.isEmpty((CharSequence)(object5 = object[n4])) ? 1 : 0)) == 0) {
                                            object5 = ((NewCustomEventsRevamp)object10).getPRODUCT_COLOR();
                                            object = object[n4];
                                            string5.putString((String)object5, (String)object);
                                        }
                                    } else {
                                        object = ((Product)object2).getCode();
                                        object5 = (object = ((NewCustomEventsRevamp)object10).trimProductId((String)object))[0];
                                        n7 = TextUtils.isEmpty((CharSequence)object5);
                                        if (n7 != 0) {
                                            object5 = ((NewCustomEventsRevamp)object10).getPRODUCT_ID();
                                            string5.putLong((String)object5, l3);
                                        }
                                        if ((n7 = ((String[])object).length) > n4 && (n7 = (int)(TextUtils.isEmpty((CharSequence)(object5 = object[n4])) ? 1 : 0)) == 0) {
                                            object5 = ((NewCustomEventsRevamp)object10).getPRODUCT_COLOR();
                                            object = object[n4];
                                            string5.putString((String)object5, (String)object);
                                        }
                                    }
                                    object = ((NewCustomEventsRevamp)object10).getPRODUCT_BRAND();
                                    object5 = ((Product)object2).getBrandName();
                                    n7 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                                    object5 = n7 != 0 ? string4 : ((Product)object2).getBrandName();
                                    string5.putString((String)object, (String)object5);
                                    d5 = 0.0;
                                    try {
                                        object = bn_22.a;
                                        if (object == null || (object = ((tm_2)object).a) == null) break block43;
                                        object = ((CartEntry)object).getBasePrice();
                                        break block44;
                                    }
                                    catch (NumberFormatException numberFormatException2) {
                                        break block45;
                                    }
                                }
                                bl2 = false;
                                object = null;
                            }
                            if (object == null) break block52;
                            object = bn_22.a;
                            if (object != null && (object = ((tm_2)object).a) != null) {
                                object = ((CartEntry)object).getBasePrice();
                            } else {
                                bl2 = false;
                                object = null;
                            }
                            Intrinsics.checkNotNull(object);
                            object = ((Price)object).getValue();
                            if (object == null) break block52;
                            d2 = Double.parseDouble((String)object);
                            break block53;
                        }
                        object6 = yn3_0.a;
                        ((yn3$a)object6).e(numberFormatException2);
                    }
                    d2 = d5;
                }
                bl2 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
                if (bl2) {
                    NumberFormatException numberFormatException3;
                    block48: {
                        block47: {
                            block46: {
                                try {
                                    object = bn_22.a;
                                    if (object == null || (object = ((tm_2)object).a) == null || (object = ((CartEntry)object).getProduct()) == null || (object = ((Product)object).getWasPriceData()) == null) break block46;
                                    object = ((Price)object).getValue();
                                    break block47;
                                }
                                catch (NumberFormatException numberFormatException3) {
                                    break block48;
                                }
                            }
                            bl2 = false;
                            object = null;
                        }
                        if (object != null) {
                            object = bn_22.a;
                            if (object != null && (object = ((tm_2)object).a) != null && (object = ((CartEntry)object).getProduct()) != null && (object = ((Product)object).getWasPriceData()) != null && (object = ((Price)object).getValue()) != null) {
                                double d7 = Double.parseDouble((String)object);
                                object = d7;
                            } else {
                                bl2 = false;
                                object = null;
                            }
                            Intrinsics.checkNotNull(object);
                            d5 = (Double)object - d2;
                        }
                        break block54;
                    }
                    object5 = yn3_0.a;
                    ((yn3$a)object5).e(numberFormatException3);
                }
            }
            bl2 = hv3_0.Y();
            if (bl2) {
                object = bn_22.a;
                if (object != null) {
                    object = ((tm_2)object).a;
                } else {
                    bl2 = false;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                object = ((CartEntry)object).getProduct().getSelectedSizeVariant();
                object = object != null ? Y63.c((ProductOptionVariant)object) : string4;
            } else {
                object = bn_22.a;
                if (object != null) {
                    object = ((tm_2)object).a;
                } else {
                    bl2 = false;
                    object = null;
                }
                object = ka2_2.a((CartEntry)object).c;
            }
            object5 = ((NewCustomEventsRevamp)object10).getPRODUCT_PRICE();
            string5.putDouble((String)object5, d2);
            object5 = ((NewCustomEventsRevamp)object10).getPRODUCT_SIZE();
            string5.putString((String)object5, (String)object);
            object = ((NewCustomEventsRevamp)object10).getPRODUCT_DISCOUNT();
            string5.putDouble((String)object, d5);
            object = ((NewCustomEventsRevamp)object10).getPRODUCT_CATEGORY();
            object5 = ((Product)object2).getBrickCategory();
            string5.putString((String)object, (String)object5);
            object = ((NewCustomEventsRevamp)object10).getPRODUCT_BRICK();
            object5 = ((Product)object2).getBrickName();
            string5.putString((String)object, (String)object5);
            object = ((NewCustomEventsRevamp)object10).getPRODUCT_TAG();
            object10 = hv3_0.a;
            object5 = ((Product)object2).getFnlColorVariantData();
            object10.getClass();
            object10 = hv3_0.A((ProductFnlColorVariantData)object5);
            boolean bl4 = TextUtils.isEmpty((CharSequence)object10);
            if (!bl4) {
                object2 = ((Product)object2).getFnlColorVariantData();
                string4 = hv3_0.A((ProductFnlColorVariantData)object2);
            }
            string5.putString((String)object, string4);
            object = bn_22.a;
            object7 = object != null ? (object = ((tm_2)object).a) : null;
            object = bn_22.b;
            object6 = ((NewEEcommerceEventsRevamp)object).getEE_REMOVE_FROM_CART();
            object2 = bn_22.a;
            if (object2 != null) {
                object10 = ((tm_2)object2).a;
                if (object10 != null) {
                    object10 = ((CartEntry)object10).getQuantity();
                } else {
                    bl4 = false;
                    object10 = null;
                }
                if (object10 != null) {
                    object2 = ((tm_2)object2).a;
                    if (object2 != null && (object2 = ((CartEntry)object2).getQuantity()) != null) {
                        n3 = (Integer)object2;
                        l2 = n3;
                        object2 = l2;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                } else {
                    object2 = l3;
                }
                object9 = object2;
            } else {
                object9 = null;
            }
            object2 = bn_22.d;
            object10 = bn_22.e;
            string2 = "bag screen";
            string3 = "bag screen";
            object8 = object;
            object4 = object2;
            ((NewEEcommerceEventsRevamp)object).pushEEAddRemoveCart((CartEntry)object7, (String)object6, (Long)object9, string2, (String)object2, string3, (String)object10);
            object2 = bn_22.a;
            object9 = object2 != null ? (object2 = ((tm_2)object2).a) : null;
            string2 = ((NewEEcommerceEventsRevamp)object).getEE_ADD_TO_WISHLIST();
            object2 = bn_22.a;
            if (object2 != null) {
                object10 = ((tm_2)object2).a;
                if (object10 != null) {
                    object10 = ((CartEntry)object10).getQuantity();
                } else {
                    bl4 = false;
                    object10 = null;
                }
                if (object10 != null) {
                    object2 = ((tm_2)object2).a;
                    if (object2 != null && (object2 = ((CartEntry)object2).getQuantity()) != null) {
                        n3 = (Integer)object2;
                        l2 = n3;
                        object5 = l2;
                    } else {
                        n7 = 0;
                        object5 = null;
                    }
                } else {
                    object5 = l3;
                }
                object4 = object5;
            } else {
                object4 = null;
            }
            object2 = bn_22.d;
            object10 = bn_22.e;
            string3 = "bag screen";
            String string8 = "bag screen";
            object6 = object;
            ((NewEEcommerceEventsRevamp)object).pushEEAddRemoveCart((CartEntry)object9, string2, (Long)object4, string3, (String)object2, string8, (String)object10);
            object = bn_22.a;
            if (object != null && (object = ((tm_2)object).a) != null && (object = ((CartEntry)object).getProduct()) != null) {
                AJIOApplication.Companion.getClass();
                object2 = UserInformation.getInstance((Context)AJIOApplication$a.a());
                n3 = (int)(((UserInformation)object2).isUserOnline() ? 1 : 0);
                if (n3 != 0) {
                    object2 = el1_2.a;
                    object2 = yt2_2.CART;
                    el1_2.c((yt2_2)((Object)object2), (Product)object);
                }
            }
        }
        object = new Intent();
        object.putExtra("MOVE_TO_CLOSET", n4 != 0);
        object2 = ((bp_1)bn_22.g.getValue()).b;
        object3 = ((tm_2)object3).a;
        ((LiveData)object2).k(object3);
        object3 = bn_22.getTargetFragment();
        if (object3 != null) {
            int n10 = bn_22.getTargetRequestCode();
            n3 = -1;
            ((Fragment)object3).onActivityResult(n10, n3, (Intent)object);
        }
    }
}

