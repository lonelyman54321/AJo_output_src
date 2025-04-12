/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import com.ril.ajio.services.data.ratings.TextReviewResponse;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Ho3 {
    public static final void a(ArrayList arrayList, yi2_1 yi2_12, hd2_0 hd2_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(hd2_02, "rateReviewClickListener");
        int n4 = -1310187836;
        object = object.g(n4);
        Object object2 = yi2_12.R6();
        int n7 = 0;
        Serializable serializable = null;
        if (object2 != null) {
            object2 = ((RatingsResponse)object2).getReviewIdChanged();
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object3 = yi2_12.R6();
        if (object3 != null) {
            serializable = ((RatingsResponse)object3).isFromLoginFlow();
        }
        if (arrayList != null) {
            object3 = Boolean.TRUE;
            n7 = Intrinsics.areEqual(serializable, object3);
            object3 = null;
            if (n7 != 0) {
                boolean bl2;
                n7 = -539122688;
                ((j30_0)object).K(n7);
                int n8 = yx_2.o(arrayList, 10);
                serializable = new ArrayList(n8);
                Iterator iterator = arrayList.iterator();
                while (bl2 = iterator.hasNext()) {
                    Object object4 = (ProductReview)iterator.next();
                    Constable constable = ((ProductReview)object4).getReviewId();
                    boolean bl3 = Intrinsics.areEqual(constable, object2);
                    if (bl3) {
                        constable = Boolean.TRUE;
                        ((ProductReview)object4).setMarkedHelpful((Boolean)constable);
                    }
                    object4 = Unit.a;
                    ((ArrayList)serializable).add(object4);
                }
                n4 = n3 & 0x70 | 8;
                n7 = n3 & 0x380;
                Ho3.b(arrayList, yi2_12, hd2_02, (b30_0)object, n4 |= n7);
                ((j30_0)object).T(false);
            } else {
                ((j30_0)object).K(-538845393);
                n4 = n3 & 0x70 | 8;
                n7 = n3 & 0x380;
                Ho3.b(arrayList, yi2_12, hd2_02, (b30_0)object, n4 |= n7);
                ((j30_0)object).T(false);
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new do3_0(arrayList, yi2_12, hd2_02, n3);
        }
    }

    public static final void b(ArrayList arrayList, yi2_1 yi2_12, hd2_0 hd2_02, b30_0 object, int n3) {
        boolean bl2;
        object = object.g(-62208437);
        int n4 = 2;
        Object object2 = ((Iterable)CollectionsKt.f0(arrayList, n4)).iterator();
        while (bl2 = object2.hasNext()) {
            ProductReview productReview = (ProductReview)object2.next();
            Object object3 = LP1$a.b;
            int n7 = 8;
            float f5 = n7;
            int n8 = 24;
            float f6 = n8;
            boolean bl3 = false;
            object3 = h.i((LP1)object3, f6, f5, 0.0f, 0.0f, 12);
            Object object4 = Nc$a.a;
            f5 = 0.0f;
            fo3_0 fo3_02 = null;
            object4 = HA.e((Nc)object4, false);
            int n10 = ((j30_0)object).P;
            Object object5 = ((j30_0)object).P();
            object3 = a30_0.c((b30_0)object, (LP1)object3);
            N20.W.getClass();
            Object object6 = N20$a.b;
            mp mp2 = ((j30_0)object).a;
            int n14 = mp2 instanceof mp;
            if (n14 != 0) {
                ((j30_0)object).A();
                n14 = ((j30_0)object).O;
                if (n14 != 0) {
                    ((j30_0)object).C((Function0)object6);
                } else {
                    ((j30_0)object).n();
                }
                object6 = N20$a.e;
                Ow3.a((b30_0)object, object4, (Function2)object6);
                object4 = N20$a.d;
                Ow3.a((b30_0)object, object5, (Function2)object4);
                object4 = N20$a.f;
                bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = ((j30_0)object).v(), object6 = Integer.valueOf(n10)))) {
                    rk_0.a(n10, (j30_0)object, n10, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object, object3, (Function2)object4);
                object4 = new eo3_0(hd2_02);
                fo3_02 = new fo3_0(hd2_02);
                int n15 = n3 & 0x70;
                n14 = n15 | 8;
                n7 = 16;
                bl3 = false;
                object5 = null;
                object3 = yi2_12;
                object6 = object;
                bp2_0.b(productReview, yi2_12, (Function1)object4, fo3_02, null, (b30_0)object, n14, n7);
                bl2 = true;
                ((j30_0)object).T(bl2);
                continue;
            }
            s20.a();
            throw null;
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new go3_0(arrayList, yi2_12, hd2_02, n3);
        }
    }

    public static final void c(int n3, b30_0 object, yi2_1 yi2_12, hd2_0 hd2_02) {
        int n4;
        boolean bl2 = true;
        Intrinsics.checkNotNullParameter(hd2_02, "rateReviewClickListener");
        String string2 = "pdpInfoProvider";
        Intrinsics.checkNotNullParameter(yi2_12, string2);
        object = object.g(1529323541);
        int n7 = n3 & 0xE;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(hd2_02) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x70;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).J(yi2_12) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x5B) == (n4 = 18) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object2;
            int n10;
            Object object3 = yi2_12.R6();
            n4 = 0;
            fx0_2 fx0_22 = null;
            if (object3 != null && (object3 = ((RatingsResponse)object3).getTextReview()) != null) {
                object3 = ((TextReviewResponse)object3).getProductReviews();
            } else {
                n8 = 0;
                object3 = null;
            }
            int n14 = 0;
            float f5 = 0.0f;
            LP1 lP1 = null;
            if (object3 != null) {
                n10 = ((ArrayList)object3).size();
            } else {
                n10 = 0;
                object2 = null;
            }
            if (n10 > 0) {
                int n15;
                int n16;
                object2 = LD2.a;
                object2 = yi2_12.x5();
                if (object2 != null) {
                    object2 = ((Product)object2).getCode();
                } else {
                    n10 = 0;
                    object2 = null;
                }
                Object object4 = yi2_12.x5();
                if (object4 != null) {
                    object4 = ((Product)object4).getName();
                } else {
                    n16 = 0;
                    object4 = null;
                }
                Object object5 = yi2_12.x5();
                if (object5 != null) {
                    object5 = ((Product)object5).getBrickCode();
                } else {
                    n15 = 0;
                    object5 = null;
                }
                LD2.c("reviews widget", "seen", (String)object2, (String)object4, (String)object5);
                object2 = LP1$a.b;
                object4 = zp.c;
                object5 = Nc$a.m;
                object4 = oZ.a((zp$l)object4, (Gx$a)object5, (b30_0)object, 0);
                n15 = ((j30_0)object).P;
                Object object6 = ((j30_0)object).P();
                LP1 lP12 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                Xp1$a xp1$a = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl3 = mp2 instanceof mp;
                if (bl3) {
                    ((j30_0)object).A();
                    n4 = (int)(((j30_0)object).O ? 1 : 0);
                    if (n4 != 0) {
                        ((j30_0)object).C(xp1$a);
                    } else {
                        ((j30_0)object).n();
                    }
                    fx0_22 = N20$a.e;
                    Ow3.a((b30_0)object, object4, fx0_22);
                    fx0_22 = N20$a.d;
                    Ow3.a((b30_0)object, object6, fx0_22);
                    fx0_22 = N20$a.f;
                    n16 = ((j30_0)object).O;
                    if (n16 != 0 || (n16 = Intrinsics.areEqual(object4 = ((j30_0)object).v(), object6 = Integer.valueOf(n15))) == 0) {
                        rk_0.a(n15, (j30_0)object, n15, (N20$a$a)fx0_22);
                    }
                    fx0_22 = N20$a.c;
                    Ow3.a((b30_0)object, lP12, fx0_22);
                    fx0_22 = new mc2_1(hd2_02, (int)(bl2 ? 1 : 0));
                    n16 = 48;
                    f41_0.a((Function0)fx0_22, bl2, (b30_0)object, n16, 0);
                    n4 = 8;
                    f5 = n4;
                    lP1 = h.e((LP1)object2, f5);
                    Q93.b((b30_0)object, lP1);
                    n14 = n7 & 0x70;
                    n7 = n7 << 6 & 0x380 | (n4 |= n14);
                    Ho3.a((ArrayList)object3, yi2_12, hd2_02, (b30_0)object, n7);
                    ((j30_0)object).T(bl2);
                } else {
                    s20.a();
                    throw null;
                }
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            co3_0 co3_02 = new co3_0(n3, yi2_12, hd2_02);
            ((CF2)object).d = co3_02;
        }
    }
}

