/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from s21
 */
public final class s21_0
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ s21_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        var2_2 = 4;
        var3_3 = "format(...)";
        var4_4 = 0;
        var5_5 = null;
        var6_6 = "this$0";
        var7_7 = this.b;
        var8_8 = 0;
        var9_9 /* !! */  = null;
        var10_10 = 1;
        var11_11 = this.a;
        switch (var11_11) {
            default: {
                var12_12 = var1_1;
                var12_12 = (DataCallback)var1_1;
                var7_7 = (pA1)var7_7;
                Intrinsics.checkNotNullParameter(var7_7, (String)var6_6);
                var6_6 = cp_1.Companion;
                var13_14 = nn_2.b((cp$a)var6_6, (DataCallback)var12_12);
                if (var13_14 == 0) ** GOTO lbl189
                var6_6 = "";
                var14_16 = "login - password screen";
                if (var12_12 == null || (var15_18 = var12_12.getStatus()) != 0) ** GOTO lbl88
                var16_19 = (User)var12_12.getData();
                if (var16_19 != null) {
                    var2_2 = (int)var16_19.isSuspiciousUserAskForLogin();
                    var16_19 = (boolean)var2_2;
                } else {
                    var2_2 = 0;
                    var16_19 = null;
                }
                Intrinsics.checkNotNull(var16_19);
                var2_2 = (int)var16_19.booleanValue();
                if (var2_2 != 0) {
                    var7_7.y = var10_10;
                    var7_7.Ta(false);
                } else {
                    var7_7.y = false;
                    var16_19 = AnalyticsManager.Companion;
                    var17_23 = var16_19.getInstance().getGtmEvents();
                    var18_26 = R$string.glad_you_are_back;
                    var19_28 = hv3_0.K(var18_26);
                    var20_31 = "Start shopping - Success";
                    var17_23.pushButtonTapEvent(var19_28, var20_31, (String)var14_16);
                    var14_16 = new HashMap();
                    var19_28 = "Success";
                    var14_16.put("LoginStatus", var19_28);
                    var16_19 = var16_19.getInstance().getCt();
                    var17_23 = new AnalyticsData$Builder();
                    var14_16 = var17_23.eventMap((HashMap)var14_16).build();
                    var16_19.loginComplete((AnalyticsData)var14_16);
                    var14_16 = var16_19 = var12_12.getData();
                    var14_16 = (User)var16_19;
                    if (var14_16 != null) {
                        var16_19 = var7_7.o;
                        var14_16.setPwd((String)var16_19);
                    }
                    if ((var16_19 = var7_7.g) != null && (var12_12 = var7_7.w) != null) {
                        Intrinsics.checkNotNull(var16_19);
                        var2_2 = var16_19.isSocialLogin();
                        var12_12.f0((String)var6_6, (boolean)var10_10, (boolean)var2_2);
                    }
                    bv1_0.f = var16_19 = "PASSWORD";
                    bv1_0.g = var10_10;
                    if (var14_16 != null) {
                        var12_12 = var7_7.w;
                        if (var12_12 != null) {
                            var20_31 = null;
                            var21_34 = "";
                            var15_18 = 0;
                            var17_23 = null;
                            var19_28 = "";
                            var2_2 = (int)var12_12.Q0((User)var14_16, false, var19_28, false, var21_34);
                            var5_5 = (boolean)var2_2;
                        }
                        if ((var2_2 = Intrinsics.areEqual(var5_5, var16_19 = Boolean.FALSE)) != 0) {
                            var16_19 = var7_7.w;
                            if (var16_19 != null) {
                                var16_19.stopLoader();
                            }
                            var16_19 = StringCompanionObject.INSTANCE;
                            var2_2 = R$string.acc_error_message;
                            var16_19 = hv3_0.K(var2_2);
                            var4_4 = R$string.cannot_login;
                            var5_5 = hv3_0.K(var4_4);
                            var6_6 = new Object[var10_10];
                            var6_6[0] = var5_5;
                            var16_19 = xh2_0.a((Object[])var6_6, var10_10, (String)var16_19, (String)var3_3);
                            var22_37 = R$string.cannot_login;
                            var3_3 = hv3_0.K(var22_37);
                            hv3_0.o0(0, (String)var3_3, (String)var16_19);
                        }
                    }
                }
                ** GOTO lbl189
lbl88:
                // 1 sources

                var22_38 = var12_12.getStatus();
                if (var22_38 != var10_10) ** GOTO lbl189
                var3_3 = var7_7.w;
                if (var3_3 != null) {
                    var3_3.stopLoader();
                }
                var3_3 = AnalyticsManager.Companion;
                var17_24 = var3_3.getInstance().getGtmEvents();
                var18_27 = R$string.glad_you_are_back;
                var19_29 = hv3_0.K(var18_27);
                var20_32 = "Start shopping - Failure";
                var17_24.pushButtonTapEvent((String)var19_29, var20_32, (String)var14_16);
                var17_24 = var12_12.getError();
                var19_29 = "Error - ";
                if (var17_24 == null) ** GOTO lbl-1000
                var17_24 = var12_12.getError();
                if (var17_24 != null) {
                    var17_24 = var17_24.getErrorMessage();
                } else {
                    var15_18 = 0;
                    var17_24 = null;
                }
                if (var17_24 == null) ** GOTO lbl-1000
                var17_24 = var12_12.getError();
                Intrinsics.checkNotNull(var17_24);
                var17_24 = var17_24.getErrorMessage().getMessage();
                var15_18 = (int)TextUtils.isEmpty((CharSequence)var17_24);
                if (var15_18 == 0) {
                    if ((var12_12 = var12_12.getError()) != null) {
                        var12_12 = var12_12.getErrorMessage();
                    } else {
                        var11_11 = 0;
                        var12_12 = null;
                    }
                    if (var12_12 != null) {
                        var17_24 = var12_12.getMessage();
                    } else {
                        var15_18 = 0;
                        var17_24 = null;
                    }
                    var20_32 = var3_3.getInstance().getGtmEvents();
                    var23_42 = R$string.glad_you_are_back;
                    var21_35 = hv3_0.K(var23_42);
                    cP.b((String)var19_29, (String)var17_24, (GTMEvents)var20_32, var21_35, (String)var14_16);
                    var3_3 = var3_3.getInstance();
                    var19_29 = var3_3.getGtmEvents();
                    var24_44 = var12_12 != null ? (var3_3 = var12_12.getMessage()) : null;
                    var20_32 = "formErrorEvent";
                    var21_35 = "Login Form";
                    var25_46 = "login - password screen";
                    var26_48 = false;
                    var27_50 = null;
                    var28_52 = 112;
                    GTMEvents.gtmEventsToGa$default((GTMEvents)var19_29, (String)var20_32, var21_35, (String)var24_44, var25_46, null, null, null, var28_52, null);
                    var3_3 = var7_7.q;
                    if (var3_3 != null) {
                        var5_5 = var3_3.f();
                    }
                    if (var5_5 == null || (var3_3 = var7_7.q) != null && (var3_3 = var3_3.f()) != null && (var22_38 = (int)var3_3.isRefreshCaptcha()) == 0) {
                        var3_3 = var7_7.r;
                        var5_5 = "Bad credentials - ";
                        var29_53 = 15;
                        if (var3_3 != null && (var22_38 = var3_3.getVisibility()) == 0) {
                            var16_20 = var7_7.v;
                            if (var16_20 != null) {
                                var16_20.setVisibility(0);
                            }
                            if ((var16_20 = var7_7.v) != null) {
                                if (var17_24 != null && (var22_38 = var17_24.length()) > var29_53) {
                                    var17_24 = kotlin.text.b.n((String)var17_24, (String)var5_5, (String)var6_6, false);
                                }
                                var16_20.setText((CharSequence)var17_24);
                            }
                        } else {
                            var3_3 = var7_7.v;
                            if (var3_3 != null) {
                                var3_3.setVisibility(var2_2);
                            }
                            if ((var16_20 = var7_7.h) != null) {
                                if (var17_24 != null && (var22_38 = var17_24.length()) > var29_53) {
                                    var17_24 = kotlin.text.b.n((String)var17_24, (String)var5_5, (String)var6_6, false);
                                }
                                var16_20.setError((CharSequence)var17_24);
                            }
                        }
                    }
                    var5_5 = var12_12;
                } else lbl-1000:
                // 3 sources

                {
                    if ((var6_6 = var7_7.r) != null && (var13_14 = var6_6.getVisibility()) == 0) {
                        var16_20 = var7_7.v;
                        if (var16_20 != null) {
                            var16_20.setVisibility(0);
                        }
                        if ((var16_20 = var7_7.v) != null) {
                            var13_14 = R$string.incorrect_password;
                            var6_6 = hv3_0.K(var13_14);
                            var16_20.setText(var6_6);
                        }
                    } else {
                        var6_6 = var7_7.v;
                        if (var6_6 != null) {
                            var6_6.setVisibility(var2_2);
                        }
                        if ((var16_20 = var7_7.h) != null) {
                            var13_14 = R$string.incorrect_password;
                            var6_6 = hv3_0.K(var13_14);
                            var16_20.setError((CharSequence)var6_6);
                        }
                    }
                    var16_20 = var3_3.getInstance().getGtmEvents();
                    var22_38 = R$string.glad_you_are_back;
                    var3_3 = hv3_0.K(var22_38);
                    var13_14 = R$string.incorrect_password;
                    var6_6 = hv3_0.K(var13_14);
                    cP.b((String)var19_29, (String)var6_6, (GTMEvents)var16_20, (String)var3_3, (String)var14_16);
                }
                var7_7.Qa(false);
                if (var5_5 != null && (var2_2 = (int)TextUtils.isEmpty((CharSequence)(var16_20 = var5_5.getSubject()))) == 0 && (var2_2 = kotlin.text.b.i((String)(var16_20 = var5_5.getSubject()), (String)(var3_3 = "captchaInputRequired"), (boolean)var10_10)) != 0 && (var2_2 = TextUtils.isEmpty((CharSequence)(var16_20 = var5_5.getReason()))) == 0) {
                    var16_20 = var5_5.getReason();
                    var7_7.Sa((String)var16_20);
                }
lbl189:
                // 7 sources

                return;
            }
            case 0: 
        }
        var12_13 = var1_1;
        var12_13 = (DataCallback)var1_1;
        var7_7 = (t21_0)var7_7;
        Intrinsics.checkNotNullParameter(var7_7, (String)var6_6);
        var6_6 = cp_1.Companion;
        var13_15 = nn_2.b((cp$a)var6_6, (DataCallback)var12_13);
        if (var13_15 != 0) {
            Intrinsics.checkNotNull(var12_13);
            var13_15 = var12_13.getStatus();
            var14_17 = "emptyClosetBtn";
            var17_25 = "closetViewAll";
            if (var13_15 == 0) {
                var22_39 = var7_7.isAdded();
                if (var22_39 != 0) {
                    var3_3 = yn3_0.a;
                    var19_30 /* !! */  = new Object[]{};
                    var3_3.a("getShowWishListObservable() called in halfCloset", var19_30 /* !! */ );
                    var3_3 = (ProductsList)var12_13.getData();
                    var6_6 = var7_7.p;
                    var19_30 /* !! */  = "cartClosetSVM";
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var19_30 /* !! */ );
                        var13_15 = 0;
                        var6_6 = null;
                    }
                    if ((var6_6 = var6_6.b) != null && var3_3 != null && (var20_33 = var3_3.getProducts()) != null) {
                        var20_33 = ((Iterable)var20_33).iterator();
                        while (var23_43 = var20_33.hasNext()) {
                            var21_36 = (Product)var20_33.next();
                            var24_45 = var6_6;
                            var24_45 = ((Iterable)var6_6).iterator();
                            var30_55 = false;
                            var25_47 = null;
                            while (var26_49 = var24_45.hasNext()) {
                                var27_51 = (CartEntry)var24_45.next();
                                var16_21 = var21_36.getCode();
                                if (var16_21 != null) {
                                    if (var27_51 != null && (var27_51 = var27_51.getProduct()) != null) {
                                        var27_51 = var27_51.getBaseProduct();
                                        var9_9 /* !! */  = var27_51;
                                    } else {
                                        var8_8 = 0;
                                        var9_9 /* !! */  = null;
                                    }
                                    var2_2 = (int)var16_21.equals(var9_9 /* !! */ );
                                    if (var2_2 == var10_10) {
                                        var30_55 = true;
                                    }
                                }
                                var2_2 = 4;
                                var8_8 = 0;
                                var9_9 /* !! */  = null;
                            }
                            if (var30_55) {
                                var21_36.setAddedToCart((boolean)var10_10);
                            }
                            var2_2 = 4;
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                        }
                    }
                    if (var3_3 != null) {
                        var16_21 = var7_7.h;
                        if (var16_21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("closetViewModel");
                            var2_2 = 0;
                            var16_21 = null;
                        }
                        var16_21.p((ProductsList)var3_3, (boolean)var10_10);
                        var16_21 = var7_7.p;
                        if (var16_21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var19_30 /* !! */ );
                            var2_2 = 0;
                            var16_21 = null;
                        }
                        var16_21.a = var3_3;
                        var16_21 = tr2_2.a;
                        var2_2 = (int)tr2_2.y(og1_1.b());
                        if (var2_2 != 0 && (var16_21 = var3_3.getPagination()) != null && (var2_2 = var16_21.getCurrentPage()) == 0) {
                            var16_21 = var3_3.getSaleStartTime();
                            if (var16_21 != null && (var16_21 = var3_3.getSaleEndTime()) != null) {
                                var16_21 = var3_3.getSaleStartTime();
                                var3_3 = var3_3.getSaleEndTime();
                                tr2_2.B((Long)var16_21, (Long)var3_3);
                            }
                            var7_7.Oa();
                        }
                        if ((var16_21 = (ProductsList)var12_13.getData()) != null && (var16_21 = var16_21.getProducts()) != null) {
                            var2_2 = var16_21.size();
                        } else {
                            var2_2 = 0;
                            var16_21 = null;
                        }
                        var3_3 = "emptyClosetLayout";
                        if (var2_2 > 0) {
                            var16_21 = var7_7.u;
                            var6_6 = var12_13.getData();
                            Intrinsics.checkNotNull(var6_6);
                            var6_6 = ((ProductsList)var6_6).getProducts();
                            Intrinsics.checkNotNull(var6_6);
                            var6_6 = (Collection)var6_6;
                            var16_21.addAll(var6_6);
                            var16_21 = var7_7.v;
                            var16_21.clear();
                            var6_6 = var7_7.u.iterator();
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            while ((var11_11 = (int)var6_6.hasNext()) != 0) {
                                var12_13 = var6_6.next();
                                var29_54 = var8_8 + 1;
                                if (var8_8 >= 0) {
                                    var12_13 = (Product)var12_13;
                                    var9_9 /* !! */  = n00.a;
                                    var9_9 /* !! */  = n00.b((Product)var12_13);
                                    var16_21.add(var9_9 /* !! */ );
                                    var8_8 = var29_54;
                                    continue;
                                }
                                xx_2.n();
                                throw null;
                            }
                            var16_21 = var7_7.j;
                            if (var16_21 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("closetListAdaptor");
                                var2_2 = 0;
                                var16_21 = null;
                            }
                            var16_21.notifyDataSetChanged();
                            var7_7.Sa();
                            var16_21 = var7_7.k;
                            if (var16_21 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                                var2_2 = 0;
                                var16_21 = null;
                            }
                            var22_39 = 8;
                            var16_21.setVisibility(var22_39);
                            var16_21 = yn3_0.a;
                            var3_3 = "setting data for halfcloset success";
                            var13_15 = 0;
                            var6_6 = new Object[]{};
                            var16_21.a((String)var3_3, (Object[])var6_6);
                        } else {
                            var16_21 = (ProductsList)var12_13.getData();
                            if (var16_21 != null) {
                                var16_21 = var16_21.getProducts();
                            } else {
                                var2_2 = 0;
                                var16_21 = null;
                            }
                            if (var16_21 != null) {
                                var16_21 = (ProductsList)var12_13.getData();
                                if (var16_21 != null) {
                                    var16_21 = var16_21.getPagination();
                                } else {
                                    var2_2 = 0;
                                    var16_21 = null;
                                }
                                if (var16_21 != null && (var16_21 = (ProductsList)var12_13.getData()) != null && (var16_21 = var16_21.getPagination()) != null && (var2_2 = var16_21.getTotalPages()) == 0) {
                                    var16_21 = var7_7.k;
                                    if (var16_21 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var3_3);
                                        var2_2 = 0;
                                        var16_21 = null;
                                    }
                                    var22_39 = 0;
                                    var3_3 = null;
                                    var16_21.setVisibility(0);
                                    var16_21 = var7_7.l;
                                    if (var16_21 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var17_25);
                                        var2_2 = 0;
                                        var16_21 = null;
                                    }
                                    var22_39 = 4;
                                    var16_21.setVisibility(var22_39);
                                    var16_21 = var7_7.m;
                                    if (var16_21 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var14_17);
                                        var2_2 = 0;
                                        var16_21 = null;
                                    }
                                    var22_39 = var7_7.a;
                                    var3_3 = var22_39;
                                    var16_21.setTag(var3_3);
                                }
                            }
                        }
                        var7_7.Pa();
                        var16_21 = var7_7.getFragmentManager();
                        if (var16_21 != null) {
                            var3_3 = "cart_list";
                            var5_5 = var16_21.E((String)var3_3);
                        }
                        if (var5_5 != null) {
                            var5_5 = (ex1_0)var5_5;
                            var16_21 = var7_7.u;
                            var3_3 = var5_5.x;
                            if (var3_3 != null && (var3_3 = var3_3.a) != null) {
                                var3_3.setProducts((List)var16_21);
                            }
                        }
                    }
                }
            } else {
                var2_2 = var12_13.getStatus();
                if (var2_2 == var10_10) {
                    var16_22 = var12_13.getError();
                    if (var16_22 != null && (var6_6 = var16_22.getErrorMessage()) != null) {
                        var6_6 = var6_6.getMessage();
                    } else {
                        var13_15 = 0;
                        var6_6 = null;
                    }
                    var13_15 = (int)TextUtils.isEmpty((CharSequence)var6_6);
                    if (var13_15 == 0) {
                        if (var16_22 != null && (var16_22 = var16_22.getErrorMessage()) != null && (var16_22 = var16_22.getMessage()) != null) {
                            var22_40 = 0;
                            var3_3 = null;
                            hv3_0.o0(0, (String)var16_22, null);
                        }
                    } else {
                        var16_22 = StringCompanionObject.INSTANCE;
                        var2_2 = R$string.acc_error_message;
                        var16_22 = hv3_0.K(var2_2);
                        var13_15 = R$string.wish_list_alert;
                        var6_6 = hv3_0.K(var13_15);
                        var9_9 /* !! */  = new Object[var10_10];
                        var11_11 = 0;
                        var12_13 = null;
                        var9_9 /* !! */ [0] = var6_6;
                        var16_22 = xh2_0.a(var9_9 /* !! */ , var10_10, (String)var16_22, (String)var3_3);
                        var22_40 = R$string.wish_list_alert;
                        var3_3 = hv3_0.K(var22_40);
                        var7_7.Ra((String)var3_3, (String)var16_22);
                    }
                    if ((var16_22 = var7_7.l) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var17_25);
                        var2_2 = 0;
                        var16_22 = null;
                    }
                    var22_40 = 4;
                    var16_22.setVisibility(var22_40);
                    var16_22 = var7_7.m;
                    if (var16_22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var14_17);
lbl408:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var5_5 = var16_22;
                    ** continue;
                    var2_2 = 0;
                    var16_22 = null;
                    var16_22 = 0;
                    var5_5.setTag(var16_22);
                } else {
                    var2_2 = var12_13.getStatus();
                    if (var2_2 == (var22_41 = 3)) {
                        var7_7.Pa();
                    }
                }
            }
        }
    }
}

