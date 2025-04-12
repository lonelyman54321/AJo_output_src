/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  org.json.JSONArray
 */
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.Ga4Events;
import com.ril.ajio.myaccount.order.data.PriorityDeliveryConfig;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.GiftProducts;
import com.ril.ajio.services.data.Cart.ServicabilityInfo;
import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery;
import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery$Fee;
import com.ril.ajio.services.data.Cart.TagData;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/*
 * Renamed from lP
 */
public final class lp_0 {
    public static void a(Bundle bundle, CartEntry object) {
        int n3;
        Object object2 = "bundle";
        Intrinsics.checkNotNullParameter(bundle, (String)object2);
        if (object != null && (object2 = ((CartEntry)object).getGiftQuantity()) != null && (n3 = ((Number)object2).intValue()) > 0) {
            int n4;
            String string2;
            object2 = hj0_0.a(n3, "GetFreebies - ");
            Object object3 = a21.a;
            object = ((CartEntry)object).getGiftProducts();
            object3.getClass();
            object = a21.f(object);
            object3 = null;
            if (object != null) {
                string2 = ((GiftProducts)object).getGwpCode();
            } else {
                n4 = 0;
                string2 = null;
            }
            if (string2 != null && (n4 = string2.length()) != 0) {
                if (object != null) {
                    object3 = ((GiftProducts)object).getGwpCode();
                }
                object = " - ";
                object2 = nb0_0.a((String)object2, (String)object, (String)object3);
            }
            object = h40_0.a;
            object = Ga4Events.INSTANCE.getGav4DimensionMap();
            object3 = "dimension162";
            if ((object = (String)object.get(object3)) != null) {
                bundle.putString((String)object, (String)object2);
            }
        }
    }

    public static String b(ArrayList object) {
        boolean bl2;
        if (object != null && !(bl2 = object.isEmpty())) {
            boolean bl3;
            ArrayList arrayList = new ArrayList(object);
            object = CollectionsKt.k0(arrayList);
            arrayList = new ArrayList();
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                Product product;
                Object e2 = object.next();
                Object object2 = e2;
                object2 = (CartEntry)e2;
                if (object2 == null || (product = ((CartEntry)object2).getProduct()) == null || (object2 = ((CartEntry)object2).getProduct().getCode()) == null) continue;
                arrayList.add(e2);
            }
            jp_0 jp_02 = new jp_0(0);
            return CollectionsKt.R(arrayList, ",", null, null, jp_02, 30);
        }
        return "";
    }

    public static String c(ArrayList object) {
        String string2 = "";
        if (object != null) {
            boolean bl2;
            object = ((ArrayList)object).iterator();
            Object object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl2 = object.hasNext()) {
                int n3;
                String string3;
                object2 = object.next();
                Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                object2 = (CartEntry)object2;
                String string4 = null;
                if (object2 != null) {
                    string3 = ((CartEntry)object2).getAge();
                } else {
                    n3 = 0;
                    string3 = null;
                }
                if (string3 == null || (n3 = string3.length()) == 0) continue;
                if (string2 != null && (n3 = string2.length()) != 0) {
                    if (object2 != null) {
                        string4 = ((CartEntry)object2).getAge();
                    }
                    object2 = ",";
                    string2 = nb0_0.a(string2, (String)object2, string4);
                    continue;
                }
                if (object2 != null) {
                    string4 = ((CartEntry)object2).getAge();
                }
                string2 = String.valueOf(string4);
            }
        }
        return string2;
    }

    public static int d(ArrayList object) {
        boolean bl2;
        if (object == null) {
            object = mz0_2.a;
        }
        object = object.iterator();
        int n3 = 0;
        while (bl2 = object.hasNext()) {
            int n4;
            Object object2 = (CartEntry)object.next();
            Object object3 = ((CartEntry)object2).getServicabilityInfo();
            if (object3 != null) {
                object3 = ((ServicabilityInfo)object3).getServicability();
                Boolean bl3 = Boolean.FALSE;
                n4 = Intrinsics.areEqual(object3, bl3);
            } else {
                n4 = 0;
                object3 = null;
            }
            if (n4 == 0) continue;
            object3 = ((CartEntry)object2).getReasonForNotServiceability();
            if (object3 != null && (n4 = ((String)object3).length()) != 0) {
                n4 = 0;
                object3 = null;
            } else {
                n4 = 1;
            }
            if (n4 != 0) continue;
            object2 = ((CartEntry)object2).getReasonForNotServiceability();
            Intrinsics.checkNotNullExpressionValue(object2, "getReasonForNotServiceability(...)");
            object2 = ((String)object2).toLowerCase();
            Intrinsics.checkNotNullExpressionValue(object2, "toLowerCase(...)");
            object3 = "oos";
            bl2 = Intrinsics.areEqual(object3, object2);
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }

    public static String e(CartEntry object) {
        if (object != null && (object = ((CartEntry)object).getTags()) != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                TagData tagData = (TagData)object.next();
                cp_1.Companion.getClass();
                Object object2 = cp$a.e();
                String string2 = tagData.getCategory();
                object2.getClass();
                object2 = h40_0.a;
                object2 = h40_0.m();
                String string3 = "category";
                boolean bl3 = object2.has(string3);
                if (bl3) {
                    object2 = h40_0.m().getJSONArray(string3);
                    Intrinsics.checkNotNull(object2);
                } else {
                    object2 = new JSONArray();
                }
                if (!(bl3 = ai0_2.d(string2, (JSONArray)object2))) continue;
                object2 = cp$a.e();
                string2 = tagData.getName();
                object2.getClass();
                object2 = h40_0.m();
                string3 = "name";
                bl3 = object2.has(string3);
                if (bl3) {
                    object2 = h40_0.m().getJSONArray(string3);
                    Intrinsics.checkNotNull(object2);
                } else {
                    object2 = new JSONArray();
                }
                if (!(bl3 = ai0_2.d(string2, (JSONArray)object2))) continue;
                return tagData.getValue();
            }
        }
        return "";
    }

    public static String f(String string2, Cart object) {
        boolean bl2;
        Object object2;
        Intrinsics.checkNotNullParameter(string2, "walletTypeString");
        ArrayList arrayList = null;
        if (object != null) {
            object2 = ((Cart)object).getInternalWallets();
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null && !(bl2 = object2.isEmpty()) && object != null && (object = ((Cart)object).getInternalWallets()) != null) {
            boolean bl3;
            object = object.iterator();
            bl2 = false;
            object2 = null;
            while (bl3 = object.hasNext()) {
                float f5;
                float f6;
                int n3;
                Object object3;
                PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)object.next();
                if (paymentInstrumentInfo != null) {
                    object3 = paymentInstrumentInfo.getType();
                } else {
                    n3 = 0;
                    object3 = null;
                    f6 = 0.0f;
                }
                if ((n3 = Intrinsics.areEqual(string2, object3)) == 0) continue;
                object3 = paymentInstrumentInfo.getAmount();
                if (object3 != null) {
                    f6 = ((Float)object3).floatValue();
                } else {
                    n3 = 0;
                    f6 = 0.0f;
                    object3 = null;
                }
                if ((n3 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) <= 0) continue;
                object2 = String.valueOf(paymentInstrumentInfo.getAmount());
            }
            arrayList = object2;
        }
        return arrayList;
    }

    public static void g(Bundle bundle, CartEntry serializable) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Object object = h40_0.a;
        boolean bl2 = h40_0.O1();
        if (bl2 && serializable != null && (object = ((CartEntry)serializable).getServicabilityInfo()) != null && (object = ((ServicabilityInfo)object).getPriorityDelivery()) != null) {
            String string2 = ((ServicabilityInfo$PriorityDelivery)object).getDeliveryDate();
            String string3 = "yyyy-MM-dd";
            string2 = k7.c(string2, "yyyyMMdd", string3);
            bundle.putString("priority_delivery_EDD", string2);
            object = ((ServicabilityInfo$PriorityDelivery)object).getFee();
            double d2 = ((ServicabilityInfo$PriorityDelivery$Fee)object).getValue();
            String string4 = "product_priority_delivery_fee";
            bundle.putDouble(string4, d2);
            bl2 = h40_0.Q1();
            if (bl2) {
                int n3;
                int n4;
                object = ((CartEntry)serializable).getServicabilityInfo();
                string2 = null;
                if (object != null) {
                    object = ((ServicabilityInfo)object).getDeliverySLA();
                } else {
                    bl2 = false;
                    object = null;
                }
                string4 = "priority_delivery_sla_tag";
                if (object != null && (n4 = ((String)object).length()) != 0) {
                    bundle.putString(string4, (String)object);
                }
                if ((serializable = ((CartEntry)serializable).getServicabilityInfo()) != null && (serializable = ((ServicabilityInfo)serializable).getPriorityDelivery()) != null) {
                    string2 = ((ServicabilityInfo$PriorityDelivery)serializable).getDeliverySLA();
                }
                if (string2 != null && (n3 = string2.length()) != 0) {
                    bundle.putString(string4, string2);
                }
            }
        }
    }

    public static void h(ImageView imageView) {
        if (imageView != null) {
            AJIOApplication aJIOApplication;
            int n3;
            Object object;
            Object object2 = imageView.getLayoutParams();
            if (object2 != null) {
                object = h40_0.a;
                object = h40_0.j0();
                n3 = ((PriorityDeliveryConfig)object).getPriorityTagImageWidth();
                AJIOApplication.Companion.getClass();
                aJIOApplication = AJIOApplication$a.a();
                ((ViewGroup.LayoutParams)object2).width = n3 = ai0_2.e(n3, (Context)aJIOApplication);
            }
            if ((object2 = imageView.getLayoutParams()) != null) {
                object = h40_0.a;
                object = h40_0.j0();
                n3 = ((PriorityDeliveryConfig)object).getPriorityTagImageHeight();
                AJIOApplication.Companion.getClass();
                aJIOApplication = AJIOApplication$a.a();
                ((ViewGroup.LayoutParams)object2).height = n3 = ai0_2.e(n3, (Context)aJIOApplication);
            }
            imageView.requestLayout();
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            n3 = R$string.pd_icon_content_description;
            object2 = object2.getString(n3);
            imageView.setContentDescription((CharSequence)object2);
            object2 = new da$a();
            n3 = 1;
            ((da$a)object2).k = n3;
            ((da$a)object2).g = n3;
            ((da$a)object2).b = n3 = R$drawable.ic_priority_delivery;
            ((da$a)object2).c = n3;
            object = h40_0.a;
            object = h40_0.j0().getPriorityDeliveryIcon();
            if (object == null) {
                object = "";
            }
            ((da$a)object2).n = object;
            ((da$a)object2).u = imageView;
            ((da$a)object2).a();
        }
    }
}

