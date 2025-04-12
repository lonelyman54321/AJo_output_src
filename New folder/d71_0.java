/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Home.HomePageRatingResponse;
import com.ril.ajio.services.data.Home.HomePageRatingViewType;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.user.UserInformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from D71
 */
public final class d71_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d71_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (String)object;
                Object object3 = "this$0";
                pa3_1 pa3_12 = (pa3_1)this.b;
                Intrinsics.checkNotNullParameter(pa3_12, (String)object3);
                boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl2) {
                    object3 = pa3_12.b();
                    ((UserInformation)object3).setNewClientId((String)object2);
                }
                return Unit.a;
            }
            case 1: {
                Object object4 = object;
                object4 = (rz2_0)object;
                g g3 = (g)this.b;
                Intrinsics.checkNotNullParameter(g3, "this$0");
                Object object5 = ((rz2_0)object4).b;
                Object object6 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object6, (DataCallback)object5);
                if (n4 != 0) {
                    Serializable serializable;
                    Object object7;
                    object6 = (PriceValidation)((DataCallback)object5).getData();
                    if (object6 != null && (object6 = ((PriceValidation)object6).getPriceSplitup()) != null) {
                        float f5;
                        object7 = g3.Wa();
                        serializable = ((PriceSplitUp)object6).getNetPayableAmount();
                        if (serializable != null) {
                            f5 = serializable.floatValue();
                        } else {
                            f5 = 0.0f;
                            serializable = null;
                        }
                        ((kj2_1)object7).o = f5;
                        no2_0.a = object7 = ((PriceSplitUp)object6).getOnepTotalPrice();
                        no2_0.b = object6 = ((PriceSplitUp)object6).getThreepTotalPrice();
                    }
                    if ((n4 = ((DataCallback)object5).getStatus()) == 0) {
                        object6 = (PriceValidation)((DataCallback)object5).getData();
                        boolean bl3 = false;
                        object7 = null;
                        if (object6 != null && (object6 = ((PriceValidation)object6).getError()) != null) {
                            object6 = ((Error)object6).getCode();
                        } else {
                            n4 = 0;
                            object6 = null;
                        }
                        if (object6 != null && (n4 = ((String)object6).length()) != 0) {
                            object4 = g3.c;
                            if (object4 != null) {
                                object4.h();
                            }
                            n3 = R$string.something_went_wrong_text;
                            object4 = hv3_0.K(n3);
                            int n7 = 1;
                            hv3_0.o0(n7, (String)object4, null);
                        } else {
                            object6 = g3.Va();
                            serializable = g3.Wa().E;
                            String string2 = g3.Wa().D;
                            object6.getClass();
                            aW aW2 = md3_0.c((jD3)object6);
                            np2_2 np2_22 = new np2_2((op2_2)object6, string2, (TenantResponse)serializable, null);
                            Ae3.d(aW2, null, null, np2_22, 3);
                            object5 = (PriceValidation)((DataCallback)object5).getData();
                            n4 = 0;
                            object6 = null;
                            object4 = ((rz2_0)object4).a;
                            g3.cb((PriceValidation)object5, (hj_1)((Object)object4), false);
                        }
                    } else {
                        g3.eb();
                    }
                }
                g3.Qa();
                return Unit.a;
            }
            case 0: 
        }
        Object object8 = object;
        object8 = (DataCallback)object;
        Object[] objectArray = (Object[])this.b;
        Intrinsics.checkNotNullParameter(objectArray, "this$0");
        Object object9 = objectArray.l;
        Object object10 = "LP";
        int n8 = Intrinsics.areEqual(object9, object10);
        if (n8 != 0) {
            object9 = objectArray.h;
            hv3_0.s0((ShimmerFrameLayout)((Object)object9));
        } else {
            object9 = objectArray.n;
            hv3_0.s0((ShimmerFrameLayout)((Object)object9));
        }
        object9 = cp_1.Companion;
        n8 = nn_2.b((cp$a)object9, (DataCallback)object8);
        if (n8 != 0) {
            int n10;
            n8 = 1;
            Object object11 = "Unrated items not find";
            float f6 = 0.0f;
            Object var10_20 = null;
            int n14 = 8;
            if (object8 != null && (n10 = ((DataCallback)object8).getStatus()) == 0) {
                int n15;
                Object object12;
                object8 = (HomePageRatingResponse)((DataCallback)object8).getData();
                n10 = 0;
                Object object13 = null;
                if (object8 != null) {
                    object12 = ((HomePageRatingResponse)object8).getUserUnratedItems();
                } else {
                    n15 = 0;
                    object12 = null;
                }
                if (object12 != null && (n15 = object12.isEmpty()) == 0) {
                    if (object8 != null) {
                        Object object14;
                        Object object15;
                        int n16;
                        int n17;
                        int n18;
                        int n19;
                        object11 = objectArray.b;
                        if (object11 != null) {
                            object11.setVisibility(0);
                        }
                        if ((n19 = Intrinsics.areEqual(object11 = objectArray.l, object10)) != 0) {
                            object11 = objectArray.m;
                            if (object11 != null) {
                                n15 = mz3_0.d(0);
                                n18 = object11.getPaddingLeft();
                                n17 = object11.getPaddingTop();
                                n16 = object11.getPaddingRight();
                                object11.setPadding(n18, n17, n16, n15);
                            }
                            if ((object11 = objectArray.b) != null) {
                                n15 = hv3_0.m(R$color.white);
                                object11.setBackgroundColor(n15);
                            }
                        } else {
                            object11 = objectArray.m;
                            if (object11 != null) {
                                n15 = mz3_0.d(14);
                                n18 = object11.getPaddingLeft();
                                n17 = object11.getPaddingTop();
                                n16 = object11.getPaddingRight();
                                object11.setPadding(n18, n17, n16, n15);
                            }
                            if ((n15 = ((String)(object11 = od3_2.a)).length()) == 0) {
                                object11 = od3_2.a();
                            }
                            n19 = (n15 = (int)(s20.a ? 1 : 0)) == 0 && (n15 = (int)(Intrinsics.areEqual(object12 = od3_2.a(), object15 = ((ld3_2)((Object)(object14 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && (n19 = (int)(Intrinsics.areEqual(object11, object12 = ((ld3_2)((Object)object14)).getStoreId()) ? 1 : 0)) == 0 ? R$color.accent_color_19 : R$color.bg_color_accent_2;
                            object12 = objectArray.c;
                            if (object12 != null) {
                                n18 = hv3_0.m(n19);
                                object12.setBackgroundColor(n18);
                            }
                            if ((object12 = objectArray.m) != null) {
                                n18 = hv3_0.m(n19);
                                object12.setBackgroundColor(n18);
                            }
                            if ((object12 = objectArray.b) != null) {
                                n19 = hv3_0.m(n19);
                                object12.setBackgroundColor(n19);
                            }
                        }
                        if ((object11 = ((HomePageRatingResponse)object8).getWidgetTitle()) != null) {
                            object12 = objectArray.b;
                            if (object12 != null) {
                                object12.setText((CharSequence)object11);
                            }
                        } else {
                            object11 = objectArray.b;
                            if (object11 != null) {
                                n15 = R$string.rate_purchase;
                                object12 = objectArray.getString(n15);
                                object11.setText((CharSequence)object12);
                            }
                        }
                        if ((object11 = ((HomePageRatingResponse)object8).getUserUnratedItems()) != null && (n19 = (int)(object11.isEmpty() ? 1 : 0)) == 0) {
                            object11 = objectArray.d;
                            if (object11 != null) {
                                ((ArrayList)object11).clear();
                            }
                            objectArray.d = object11 = ((HomePageRatingResponse)object8).getUserUnratedItems();
                            object11 = objectArray.l;
                            int n20 = Intrinsics.areEqual(object11, object10);
                            n19 = 3;
                            if (n20 != 0) {
                                Object object16;
                                object10 = objectArray.d;
                                if (object10 != null) {
                                    n20 = ((ArrayList)object10).size();
                                } else {
                                    n20 = 0;
                                    object10 = null;
                                }
                                if (n20 > n19) {
                                    object10 = objectArray.d;
                                    if (object10 != null) {
                                        object10 = object10.iterator();
                                        n14 = 0;
                                        object16 = null;
                                        while ((n15 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
                                            object12 = object10.next();
                                            n18 = n14 + 1;
                                            if (n14 >= 0) {
                                                object12 = (UserUnratedItem)object12;
                                                if (n14 < n19) {
                                                    if (object12 != null) {
                                                        object15 = HomePageRatingViewType.RATE_ITEM_VIEW;
                                                        ((UserUnratedItem)object12).setViewType((HomePageRatingViewType)((Object)object15));
                                                    }
                                                } else if (object12 != null) {
                                                    object15 = HomePageRatingViewType.RATE_OTHER_ITEM_VIEW;
                                                    ((UserUnratedItem)object12).setViewType((HomePageRatingViewType)((Object)object15));
                                                }
                                                if ((object15 = objectArray.d) != null) {
                                                    object16 = (UserUnratedItem)((ArrayList)object15).set(n14, object12);
                                                }
                                                n14 = n18;
                                                continue;
                                            }
                                            xx_2.n();
                                            throw null;
                                        }
                                    }
                                } else {
                                    object10 = objectArray.d;
                                    if (object10 != null) {
                                        object10 = object10.iterator();
                                        n19 = 0;
                                        object11 = null;
                                        while ((n14 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
                                            object16 = object10.next();
                                            n15 = n19 + 1;
                                            if (n19 >= 0) {
                                                if ((object16 = (UserUnratedItem)object16) != null) {
                                                    object14 = HomePageRatingViewType.RATE_ITEM_VIEW;
                                                    ((UserUnratedItem)object16).setViewType((HomePageRatingViewType)((Object)object14));
                                                }
                                                if ((object14 = objectArray.d) != null) {
                                                    object11 = (UserUnratedItem)((ArrayList)object14).set(n19, object16);
                                                }
                                                n19 = n15;
                                                continue;
                                            }
                                            xx_2.n();
                                            throw null;
                                        }
                                    }
                                }
                                object10 = new Object();
                                object11 = new ArrayList();
                                object16 = objectArray.d;
                                if (object16 != null) {
                                    object16 = object16.iterator();
                                    while ((n15 = (int)(object16.hasNext() ? 1 : 0)) != 0) {
                                        object12 = (UserUnratedItem)object16.next();
                                        if (object12 != null) {
                                            object14 = ((UserUnratedItem)object12).getViewType();
                                        } else {
                                            n18 = 0;
                                            object14 = null;
                                        }
                                        object15 = HomePageRatingViewType.RATE_ITEM_VIEW;
                                        if (object14 == object15) {
                                            ((ArrayList)object10).add((Object)object12);
                                            continue;
                                        }
                                        if (object12 == null || (object12 = ((UserUnratedItem)object12).getImageUrl()) == null) continue;
                                        ((ArrayList)object11).add(object12);
                                    }
                                }
                                if ((n14 = ((ArrayList)object11).isEmpty() ^ n8) != 0) {
                                    n14 = ((ArrayList)object11).size();
                                    if (n14 > (n10 = 5)) {
                                        object16 = "<this>";
                                        Intrinsics.checkNotNullParameter(object11, (String)object16);
                                        object9 = CollectionsKt.p0(object11, n10, n10, n8 != 0);
                                        object9 = (List)CollectionsKt.N(0, (List)object9);
                                        if (object9 != null) {
                                            object9 = (Collection)object9;
                                            ArrayList arrayList = new ArrayList(object9);
                                            HomePageRatingViewType homePageRatingViewType = HomePageRatingViewType.RATE_OTHER_ITEM_VIEW;
                                            int n21 = 3903;
                                            boolean bl4 = false;
                                            n10 = 0;
                                            object13 = null;
                                            n15 = 0;
                                            object12 = null;
                                            n18 = 0;
                                            object14 = null;
                                            n17 = 0;
                                            object15 = null;
                                            n16 = 0;
                                            Object var29_59 = null;
                                            object16 = object9;
                                            object9 = new UserUnratedItem(null, null, null, null, null, null, homePageRatingViewType, arrayList, null, null, null, null, n21, null);
                                            ((ArrayList)object10).add((Object)object9);
                                        }
                                    } else {
                                        HomePageRatingViewType homePageRatingViewType = HomePageRatingViewType.RATE_OTHER_ITEM_VIEW;
                                        int n22 = 3903;
                                        n18 = 0;
                                        object14 = null;
                                        n17 = 0;
                                        object15 = null;
                                        n16 = 0;
                                        Object var26_51 = null;
                                        Object var25_48 = null;
                                        boolean bl5 = false;
                                        boolean bl6 = false;
                                        object12 = object9;
                                        object9 = new UserUnratedItem(null, null, null, null, null, null, homePageRatingViewType, (ArrayList)object11, null, null, null, null, n22, null);
                                        ((ArrayList)object10).add((Object)object9);
                                    }
                                }
                                if ((object9 = objectArray.d) != null) {
                                    ((ArrayList)object9).clear();
                                }
                                objectArray.d = object10;
                            } else {
                                object9 = new ArrayList();
                                object10 = objectArray.d;
                                if (object10 != null) {
                                    object10 = object10.iterator();
                                    n14 = 0;
                                    HomePageRatingViewType homePageRatingViewType = null;
                                    while ((n15 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
                                        object12 = object10.next();
                                        n18 = n14 + 1;
                                        if (n14 >= 0) {
                                            object12 = (UserUnratedItem)object12;
                                            if (n14 < n19) {
                                                if (object12 != null) {
                                                    homePageRatingViewType = HomePageRatingViewType.RATE_ITEM_VIEW;
                                                    ((UserUnratedItem)object12).setViewType(homePageRatingViewType);
                                                }
                                                ((ArrayList)object9).add(object12);
                                            }
                                            n14 = n18;
                                            continue;
                                        }
                                        xx_2.n();
                                        throw null;
                                    }
                                }
                                if ((object10 = objectArray.d) != null) {
                                    ((ArrayList)object10).clear();
                                }
                                objectArray.d = object9;
                            }
                            object9 = objectArray.c;
                            if (object9 != null) {
                                object9.setVisibility(0);
                            }
                            objectArray.Qa((HomePageRatingResponse)object8);
                        } else {
                            object8 = objectArray.c;
                            if (object8 != null) {
                                object8.setVisibility(n14);
                            }
                        }
                    }
                } else {
                    n3 = (int)(objectArray.j ? 1 : 0);
                    if (n3 != 0) {
                        HomePageRatingViewType homePageRatingViewType = HomePageRatingViewType.RATING_COMPLETED;
                        int n24 = 4031;
                        boolean bl7 = false;
                        n15 = 0;
                        object12 = null;
                        boolean bl8 = false;
                        Object var23_44 = null;
                        boolean bl9 = false;
                        Object var24_46 = null;
                        boolean bl10 = false;
                        Object var26_52 = null;
                        Object var29_61 = null;
                        boolean bl11 = false;
                        object13 = object8;
                        object8 = new UserUnratedItem(null, null, null, null, null, null, homePageRatingViewType, null, null, null, null, null, n24, null);
                        object9 = new ArrayList();
                        ((ArrayList)object9).add(object8);
                        int n25 = 5;
                        object8 = new HomePageRatingResponse(null, (ArrayList)object9, null, n25, null);
                        object9 = objectArray.b;
                        if (object9 != null) {
                            object9.setVisibility(n14);
                        }
                        if ((object9 = ((HomePageRatingResponse)object8).getUserUnratedItems()) != null && (n8 = (int)(object9.isEmpty() ? 1 : 0)) == 0) {
                            object9 = objectArray.d;
                            if (object9 != null) {
                                ((ArrayList)object9).clear();
                            }
                            objectArray.d = object9 = ((HomePageRatingResponse)object8).getUserUnratedItems();
                            object9 = objectArray.c;
                            if (object9 != null) {
                                object9.setVisibility(0);
                            }
                            objectArray.Qa((HomePageRatingResponse)object8);
                        } else {
                            object8 = objectArray.c;
                            if (object8 != null) {
                                object8.setVisibility(n14);
                            }
                        }
                    } else {
                        object8 = objectArray.c;
                        if (object8 != null) {
                            object8.setVisibility(n14);
                        }
                        if ((object8 = objectArray.b) != null) {
                            object8.setVisibility(n14);
                        }
                        object8 = yn3_0.a;
                        objectArray = new Object[]{};
                        ((yn3$a)object8).a((String)object11, objectArray);
                    }
                }
            } else {
                n3 = ((DataCallback)object8).getStatus();
                if (n3 == n8) {
                    object8 = yn3_0.a;
                    object9 = new Object[]{};
                    ((yn3$a)object8).a((String)object11, (Object[])object9);
                    object8 = objectArray.c;
                    if (object8 != null) {
                        object8.setVisibility(n14);
                    }
                    if ((object8 = objectArray.b) != null) {
                        object8.setVisibility(n14);
                    }
                }
            }
        }
        return Unit.a;
    }
}

