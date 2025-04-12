/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Cart.AmountData;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartCount;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.ConvenienceFee;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.query.QueryDeliveryAddress;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FT
 */
public final class ft_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ft_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        float f5 = 0.0f;
        Object object2 = null;
        Object object3 = "this$0";
        Object object4 = this.b;
        int n4 = 1;
        int n7 = this.a;
        switch (n7) {
            default: {
                object2 = object;
                object2 = (DataCallback)object;
                object4 = (NewProductDetailsFragment)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                Intrinsics.checkNotNullParameter(object2, "cartCountDataCallback");
                object3 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object3, (DataCallback)object2);
                if (n8 != 0 && (n8 = ((DataCallback)object2).getStatus()) == 0) {
                    object3 = ((NewProductDetailsFragment)object4).Wa();
                    Object object5 = ((DataCallback)object2).getData();
                    Intrinsics.checkNotNull(object5);
                    object5 = (CartCount)object5;
                    n4 = ((CartCount)object5).getCartCount();
                    ((jo_2)object3).p(n4);
                    object2 = (CartCount)((DataCallback)object2).getData();
                    if (object2 != null) {
                        f5 = ((CartCount)object2).getCartAmount();
                        object3 = ((NewProductDetailsFragment)object4).Wa();
                        ((jo_2)object3).o(f5);
                    }
                    ((NewProductDetailsFragment)object4).Zb();
                }
                return Unit.a;
            }
            case 1: {
                object2 = object;
                object2 = (Boolean)object;
                object4 = (bf1_2)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                Intrinsics.checkNotNullParameter(object2, "isNavPresentInPref");
                CategoryNavigationRepo categoryNavigationRepo = ((bf1_2)object4).d;
                zr1_1 zr1_12 = ((bf1_2)object4).f;
                boolean bl2 = (Boolean)object2;
                String string2 = ld3_2.STORE_LUXE.getStoreId();
                return categoryNavigationRepo.getCMSCategoryNavigation(zr1_12, bl2, string2, false, true);
            }
            case 0: 
        }
        Object object6 = object;
        object6 = (DataCallback)object;
        object4 = (CheckoutFragment)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = cp_1.Companion;
        int n10 = nn_2.b((cp$a)object3, (DataCallback)object6);
        if (n10 != 0) {
            Boolean bl3;
            Boolean bl4;
            Object object7;
            boolean bl5;
            boolean bl6;
            Object object8;
            Object object9;
            Object object10;
            float f6;
            Object object11;
            float f7;
            object3 = ((CheckoutFragment)object4).h;
            object6 = "checkOutViewModel";
            boolean bl7 = false;
            PriceValidation priceValidation = null;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n10 = 0;
                object3 = null;
                f7 = 0.0f;
            }
            if ((n10 = ((ArrayList)(object3 = ((ps_0)object3).n)).size()) != 0) {
                ((CheckoutFragment)object4).A = null;
                ((CheckoutFragment)object4).Ra(n4 != 0);
                object3 = ((CheckoutFragment)object4).h;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n10 = 0;
                    object3 = null;
                    f7 = 0.0f;
                }
                if ((object11 = ((CheckoutFragment)object4).g) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userViewModel");
                    boolean bl8 = false;
                    object11 = null;
                    f6 = 0.0f;
                }
                object11 = ((hy3_0)object11).k();
                Intrinsics.checkNotNullExpressionValue(object11, "getLoggedInStatus(...)");
                object3.getClass();
                Intrinsics.checkNotNullParameter(object11, "logInStatus");
                object10 = new ls_0((ps_0)object3, (String)object11);
                object11 = new o53_0((Callable)object10);
                object10 = qt2_2.c;
                object11 = ((g53_0)object11).h((Scheduler)object10);
                object10 = ti_2.a();
                object11 = ((g53_0)object11).e((Scheduler)object10);
                object10 = new h9_0(n4);
                object9 = new i9_0(object10, n4);
                object10 = new Object();
                object8 = new ns_0(0, (Function1)object10);
                object2 = ((g53_0)object11).f((o60_0)object9, (o60_0)object8);
                object3 = ((ps_0)object3).r;
                ((t30_0)object3).b((yr0_2)object2);
            } else {
                ((CheckoutFragment)object4).Ya();
                object3 = ((CheckoutFragment)object4).h;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n10 = 0;
                    object3 = null;
                    f7 = 0.0f;
                }
                if ((object3 = ((ps_0)object3).o) == null) {
                    object2 = ((CheckoutFragment)object4).h;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        n3 = 0;
                        object2 = null;
                        f5 = 0.0f;
                    }
                    object2.getClass();
                    object2 = Unit.a;
                } else {
                    object3 = ((CheckoutFragment)object4).i;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shippingViewModel");
                        n10 = 0;
                        object3 = null;
                        f7 = 0.0f;
                    }
                    object11 = ((CheckoutFragment)object4).I;
                    Intrinsics.checkNotNull(object11);
                    object11.getClass();
                    object8 = new QueryDeliveryAddress();
                    object11 = ((KT)object11).b.o;
                    if (object11 != null) {
                        if ((object11 = ((CartDeliveryAddress)object11).getId()) == null) {
                            object11 = "";
                        }
                        ((QueryDeliveryAddress)object8).setAddressId((String)object11);
                    }
                    boolean bl9 = ((CheckoutFragment)object4).Qa().e.e();
                    bl6 = ((CheckoutFragment)object4).Qa().e.f();
                    bl5 = ((CheckoutFragment)object4).Qa().e.d();
                    object3.getClass();
                    object7 = "single page checkout";
                    Intrinsics.checkNotNullParameter(object7, "screenName");
                    Intrinsics.checkNotNullParameter(object8, "deliveryAddress");
                    bl4 = bl9;
                    object11 = bl6;
                    bl3 = bl5;
                    object10 = ((v33)object3).a;
                    object9 = object7;
                    object7 = object11;
                    object11 = ((r33)object10).a((String)object9, (QueryDeliveryAddress)object8, bl4, (Boolean)object11, bl3);
                    object10 = new tx0_1(object3, n4);
                    object9 = new lf1_2((Function1)object10);
                    object10 = new fy1_2(object3, n4);
                    object8 = new u33(0, (Function1)object10);
                    object2 = ((g53_0)object11).f((o60_0)object9, (o60_0)object8);
                    object3 = ((v33)object3).b;
                    ((t30_0)object3).b((yr0_2)object2);
                    object2 = Unit.a;
                }
            }
            object2 = ((CheckoutFragment)object4).h;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            if ((object2 = ((ps_0)object2).k) != null && (object2 = ((Cart)object2).getTotalPriceWithTax()) != null && (object2 = ((Price)object2).getValue()) != null) {
                object3 = ((CheckoutFragment)object4).Qa();
                ((kj2_1)object3).o = f5 = Float.parseFloat((String)object2);
            }
            if ((object2 = ((CheckoutFragment)object4).Qa()) != null && (object2 = ((kj2_1)object2).e) != null && (n3 = ((m80_0)object2).e()) == n4) {
                object2 = ((CheckoutFragment)object4).Qa();
                object3 = ((CheckoutFragment)object4).I;
                if (object3 != null) {
                    ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp;
                    bl6 = false;
                    float f8 = 0.0f;
                    object10 = null;
                    bl5 = false;
                    float f11 = 0.0f;
                    object9 = null;
                    object8 = null;
                    bl4 = null;
                    object7 = null;
                    bl3 = null;
                    int n14 = 0;
                    object11 = priceValidation;
                    priceValidation = new PriceValidation(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    int n15 = 4095;
                    object4 = new PriceSplitUp(null, null, null, null, null, null, null, null, null, null, null, null, n15, null);
                    int n16 = 31;
                    object11 = convenienceFeePriceSplitUp;
                    convenienceFeePriceSplitUp = new ConvenienceFeePriceSplitUp(null, null, null, null, null, n16, null);
                    int n17 = 15;
                    object6 = new ConvenienceFeePriceSplitUp$AmountData(0.0f, 0.0f, null, false, n17, null);
                    object3 = ((KT)object3).b;
                    object11 = ((ps_0)object3).k;
                    if (object11 != null && (object11 = ((Cart)object11).getConvenienceFee()) != null && (object11 = ((ConvenienceFee)object11).getRVP()) != null && (object11 = ((AmountData)object11).getNetAmount()) != null && (object11 = ((Price)object11).getValue()) != null) {
                        f6 = Float.parseFloat((String)object11);
                        ((ConvenienceFeePriceSplitUp$AmountData)object6).setNetAmount(f6);
                    }
                    if ((object11 = ((ps_0)object3).k) != null && (object11 = ((Cart)object11).getConvenienceFee()) != null && (object11 = ((ConvenienceFee)object11).getRVP()) != null && (object11 = ((AmountData)object11).getAmount()) != null && (object11 = ((Price)object11).getValue()) != null) {
                        f6 = Float.parseFloat((String)object11);
                        ((ConvenienceFeePriceSplitUp$AmountData)object6).setAmount(f6);
                    }
                    n16 = 15;
                    n14 = 0;
                    bl5 = false;
                    f11 = 0.0f;
                    object9 = null;
                    object8 = null;
                    bl4 = null;
                    object7 = null;
                    object10 = object11;
                    object11 = new ConvenienceFeePriceSplitUp$AmountData(0.0f, 0.0f, null, false, n16, null);
                    object10 = ((ps_0)object3).k;
                    if (object10 != null && (object10 = ((Cart)object10).getConvenienceFee()) != null && (object10 = ((ConvenienceFee)object10).getDelivery()) != null && (object10 = ((AmountData)object10).getNetAmount()) != null && (object10 = ((Price)object10).getValue()) != null) {
                        f8 = Float.parseFloat((String)object10);
                        ((ConvenienceFeePriceSplitUp$AmountData)object11).setNetAmount(f8);
                    }
                    if ((object10 = ((ps_0)object3).k) != null && (object10 = ((Cart)object10).getConvenienceFee()) != null && (object10 = ((ConvenienceFee)object10).getDelivery()) != null && (object10 = ((AmountData)object10).getAmount()) != null && (object10 = ((Price)object10).getValue()) != null) {
                        f8 = Float.parseFloat((String)object10);
                        ((ConvenienceFeePriceSplitUp$AmountData)object11).setAmount(f8);
                    }
                    n14 = 15;
                    object8 = null;
                    bl4 = null;
                    object7 = null;
                    n16 = 0;
                    bl3 = null;
                    object9 = object10;
                    object10 = new ConvenienceFeePriceSplitUp$AmountData(0.0f, 0.0f, null, false, n14, null);
                    object9 = ((ps_0)object3).k;
                    if (object9 != null && (object9 = ((Cart)object9).getConvenienceFee()) != null && (object9 = ((ConvenienceFee)object9).getTotal()) != null && (object9 = ((AmountData)object9).getNetAmount()) != null && (object9 = ((Price)object9).getValue()) != null) {
                        f11 = Float.parseFloat((String)object9);
                        ((ConvenienceFeePriceSplitUp$AmountData)object10).setNetAmount(f11);
                    }
                    if ((object3 = ((ps_0)object3).k) != null && (object3 = ((Cart)object3).getConvenienceFee()) != null && (object3 = ((ConvenienceFee)object3).getTotal()) != null && (object3 = ((AmountData)object3).getAmount()) != null && (object3 = ((Price)object3).getValue()) != null) {
                        f7 = Float.parseFloat((String)object3);
                        ((ConvenienceFeePriceSplitUp$AmountData)object10).setAmount(f7);
                    }
                    convenienceFeePriceSplitUp.setTotal((ConvenienceFeePriceSplitUp$AmountData)object10);
                    convenienceFeePriceSplitUp.setDelivery((ConvenienceFeePriceSplitUp$AmountData)object11);
                    convenienceFeePriceSplitUp.setRVP((ConvenienceFeePriceSplitUp$AmountData)object6);
                    ((PriceSplitUp)object4).setConvenienceFee(convenienceFeePriceSplitUp);
                    priceValidation.setPriceSplitup((PriceSplitUp)object4);
                }
                ((kj2_1)object2).f = priceValidation;
            }
        }
        return Unit.a;
    }
}

