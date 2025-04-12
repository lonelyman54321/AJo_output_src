/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ajio.ril.core.network.model.DataError;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.UserProfileData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from by1
 */
public final class by1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ by1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = 0;
        var3_3 = null;
        var4_4 = "this$0";
        var5_5 = this.b;
        var6_6 = null;
        var7_7 = 1;
        var8_8 = this.a;
        switch (var8_8) {
            default: {
                var9_9 /* !! */  = var1_1;
                var9_9 /* !! */  = (DataCallback)var1_1;
                var5_5 = (ex1_0)var5_5;
                Intrinsics.checkNotNullParameter(var5_5, (String)var4_4);
                var4_4 = cp_1.Companion;
                var10_11 = nn_2.b((cp$a)var4_4, (DataCallback)var9_9 /* !! */ );
                if (var10_11 == 0) ** GOTO lbl721
                Intrinsics.checkNotNull(var9_9 /* !! */ );
                var10_11 = var9_9 /* !! */ .getStatus();
                if (var10_11 != 0) ** GOTO lbl707
                var5_5.K0 = var7_7;
                var4_4 = (Cart)var9_9 /* !! */ .getData();
                var8_8 = (int)h40_0.Q1();
                var11_13 = var5_5.a;
                if (var8_8 != 0) {
                    if (var4_4 != null && (var9_9 /* !! */  = var4_4.getDeliveryAddress()) != null) {
                        var9_9 /* !! */  = var9_9 /* !! */ .getFormattedAddress();
                    } else {
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        var12_15 = 0.0f;
                    }
                    if (var9_9 /* !! */  != null && (var8_8 = var9_9 /* !! */ .length()) != 0) {
                        if (var4_4 != null && (var9_9 /* !! */  = var4_4.getDeliveryAddress()) != null) {
                            var13_17 = AddressType.Address;
                            var9_9 /* !! */ .setAddressType((AddressType)var13_17);
                        }
                        if (var4_4 != null) {
                            var9_9 /* !! */  = var4_4.getDeliveryAddress();
                        } else {
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            var12_15 = 0.0f;
                        }
                        var11_13.F((CartDeliveryAddress)var9_9 /* !! */ );
                    }
                }
                if ((var9_9 /* !! */  = var5_5.S0) != null && (var8_8 = (int)var9_9 /* !! */ .isEmpty()) == 0 && var4_4 != null) {
                    var9_9 /* !! */  = var5_5.S0;
                    var4_4.setRestoredProducts((ArrayList)var9_9 /* !! */ );
                }
                var9_9 /* !! */  = ((fc0_2)var5_5.O0.getValue()).b;
                var13_17 = var5_5.getViewLifecycleOwner();
                var14_19 = new cz_1(var7_7, var5_5, var4_4);
                var15_21 = new eX1$d((Function1)var14_19);
                var9_9 /* !! */ .e((mu1_1)var13_17, (F62)var15_21);
                var5_5.Wa((Cart)var4_4);
                var9_9 /* !! */  = h40_0.a;
                var8_8 = (int)h40_0.J1();
                if (var8_8 == 0) ** GOTO lbl62
                if (var4_4 == null) ** GOTO lbl57
                var9_9 /* !! */  = var4_4.getCartValueLimitNew();
                ** GOTO lbl64
lbl57:
                // 2 sources

                while (true) {
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                    var12_15 = 0.0f;
                    ** GOTO lbl64
                    break;
                }
lbl62:
                // 1 sources

                if (var4_4 == null) ** continue;
                var9_9 /* !! */  = var4_4.getCartValueLimit();
lbl64:
                // 3 sources

                if (var9_9 /* !! */  != null) {
                    var13_17 = var9_9 /* !! */ .getType();
                } else {
                    var16_22 = 0;
                    var13_17 = null;
                    var17_24 = 0.0f;
                }
                var16_22 = kotlin.text.b.i((String)var13_17, "CommerceCartModificationError", (boolean)var7_7);
                var14_19 = "format(...)";
                var15_21 = "cartViewModel";
                if (var16_22 == 0) ** GOTO lbl-1000
                if (var9_9 /* !! */  != null) {
                    var13_17 = var9_9 /* !! */ .getReason();
                } else {
                    var16_22 = 0;
                    var13_17 = null;
                    var17_24 = 0.0f;
                }
                var18_26 /* !! */  = "MAX_CART_VALUE_LIMIT";
                var16_22 = kotlin.text.b.i((String)var13_17, (String)var18_26 /* !! */ , (boolean)var7_7);
                if (var16_22 != 0) {
                    var13_17 = var5_5.t;
                    if (var13_17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var16_22 = 0;
                        var13_17 = null;
                        var17_24 = 0.0f;
                    }
                    var13_17.i1 = var7_7;
                    var13_17 = StringCompanionObject.INSTANCE;
                    var16_22 = R$string.acc_error_message;
                    var13_17 = hv3_0.K(var16_22);
                    if (var9_9 /* !! */  != null) {
                        var18_26 /* !! */  = var9_9 /* !! */ .getErrorMessage();
                    } else {
                        var19_27 = 0;
                        var18_26 /* !! */  = null;
                    }
                    var20_28 = new Object[var7_7];
                    var20_28[0] = var18_26 /* !! */ ;
                    var13_17 = xh2_0.a((Object[])var20_28, var7_7, (String)var13_17, (String)var14_19);
                    if (var9_9 /* !! */  != null) {
                        var9_9 /* !! */  = var9_9 /* !! */ .getErrorMessage();
                    } else {
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        var12_15 = 0.0f;
                    }
                    var5_5.kb((String)var9_9 /* !! */ , (String)var13_17);
                } else lbl-1000:
                // 2 sources

                {
                    if ((var9_9 /* !! */  = var5_5.t) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        var12_15 = 0.0f;
                    }
                    var9_9 /* !! */ .i1 = false;
                }
                var5_5.Eb();
                var5_5.Db((Cart)var4_4);
                var5_5.rb();
                var8_8 = (int)cp$a.i();
                if (var8_8 != 0) {
                    var9_9 /* !! */  = var5_5.t;
                    if (var9_9 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        var12_15 = 0.0f;
                    }
                    if ((var9_9 /* !! */  = var9_9 /* !! */ .S0) != null && (var9_9 /* !! */  = var9_9 /* !! */ .getInternalWallets()) != null && (var8_8 = var9_9 /* !! */ .size()) > 0) {
                        var9_9 /* !! */  = var5_5.t;
                        if (var9_9 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            var12_15 = 0.0f;
                        }
                        if ((var9_9 /* !! */  = var9_9 /* !! */ .S0) != null && (var8_8 = (int)var9_9 /* !! */ .isOtpValidationRequired()) == 0) {
                            var9_9 /* !! */  = var5_5.t;
                            if (var9_9 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                                var8_8 = 0;
                                var9_9 /* !! */  = null;
                                var12_15 = 0.0f;
                            }
                            var13_17 = new HashSet();
                            var18_26 /* !! */  = var5_5.t;
                            if (var18_26 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                                var19_27 = 0;
                                var18_26 /* !! */  = null;
                            }
                            if ((var18_26 /* !! */  = var18_26 /* !! */ .S0) != null && (var18_26 /* !! */  = var18_26 /* !! */ .getInternalWallets()) != null) {
                                var18_26 /* !! */  = var18_26 /* !! */ .iterator();
                                while ((var21_29 = (int)var18_26 /* !! */ .hasNext()) != 0) {
                                    var20_28 = (PaymentInstrumentInfo)var18_26 /* !! */ .next();
                                    var22_30 = var20_28.isSelected();
                                    if (var22_30 == 0 || (var23_31 = var20_28.getCode()) == null || (var22_30 = var23_31.length()) == 0) continue;
                                    var20_28 = var20_28.getCode();
                                    Intrinsics.checkNotNull(var20_28);
                                    var13_17.add(var20_28);
                                }
                            }
                            var9_9 /* !! */ .getClass();
                            var18_26 /* !! */  = "<set-?>";
                            Intrinsics.checkNotNullParameter(var13_17, var18_26 /* !! */ );
                            var9_9 /* !! */ .p1 = var13_17;
                        }
                        if ((var9_9 /* !! */  = var5_5.t) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            var12_15 = 0.0f;
                        }
                        if ((var9_9 /* !! */  = var9_9 /* !! */ .S0) != null && (var9_9 /* !! */  = var9_9 /* !! */ .getNetPrice()) != null && (var9_9 /* !! */  = var9_9 /* !! */ .getValue()) != null) {
                            var12_15 = var9_9 /* !! */ .floatValue();
                            var13_17 = var5_5.t;
                            if (var13_17 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                                var16_22 = 0;
                                var13_17 = null;
                                var17_24 = 0.0f;
                            }
                            if ((var13_17 = var13_17.S0) != null) {
                                var9_9 /* !! */  = Float.valueOf(var12_15);
                                var13_17.setNetPayable((Float)var9_9 /* !! */ );
                            }
                        }
                    }
                    var9_9 /* !! */  = in_0.a;
                    var13_17 = var5_5.t;
                    if (var13_17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var16_22 = 0;
                        var13_17 = null;
                        var17_24 = 0.0f;
                    }
                    var13_17 = var13_17.p1;
                    var18_26 /* !! */  = var5_5.t;
                    if (var18_26 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var19_27 = 0;
                        var18_26 /* !! */  = null;
                    }
                    var18_26 /* !! */  = var18_26 /* !! */ .S0;
                    var9_9 /* !! */ .getClass();
                    in_0.a((HashSet)var13_17, (Cart)var18_26 /* !! */ );
                }
                if (var4_4 != null) {
                    var9_9 /* !! */  = var4_4.getEntries();
                } else {
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                    var12_15 = 0.0f;
                }
                if (var9_9 /* !! */  != null && (var8_8 = (int)var9_9 /* !! */ .isEmpty()) == 0) {
                    var9_9 /* !! */  = var5_5.X;
                    var8_8 = (int)var9_9 /* !! */ .isEmpty();
                    if (var8_8 != 0 && (var8_8 = (int)(var9_9 /* !! */  = var5_5.Y).isEmpty()) != 0) {
                        var5_5.Xa();
                        var5_5.Cb();
                    } else {
                        var5_5.Va();
                    }
                } else {
                    var5_5.Xa();
                    var5_5.Za(false);
                }
                if (var4_4 != null) {
                    var9_9 /* !! */  = var4_4.getPinCode();
                } else {
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                    var12_15 = 0.0f;
                }
                if (var9_9 /* !! */  == null || (var8_8 = var9_9 /* !! */ .length()) == 0) ** GOTO lbl-1000
                var9_9 /* !! */  = var5_5.t;
                if (var9_9 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                    var12_15 = 0.0f;
                }
                if ((var8_8 = (int)var9_9 /* !! */ .c()) != 0) {
                    var8_8 = (int)h40_0.Q1();
                    if (var8_8 != 0) {
                        var8_8 = (int)var5_5.f1;
                        if (var8_8 != 0) {
                            var5_5.Gb();
                            var5_5.f1 = false;
                        } else {
                            var5_5.hb();
                        }
                    } else {
                        var5_5.hb();
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var5_5.Gb();
                }
                pa_1.a = false;
                var9_9 /* !! */  = var5_5.t;
                if (var9_9 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                    var12_15 = 0.0f;
                }
                if ((var9_9 /* !! */  = var9_9 /* !! */ .S0) != null && (var9_9 /* !! */  = var9_9 /* !! */ .getTotalPriceWithTax()) != null && (var9_9 /* !! */  = var9_9 /* !! */ .getValue()) != null) {
                    var12_15 = mz3_0.J((String)var9_9 /* !! */ );
                    var8_8 = (int)var12_15;
                } else {
                    var8_8 = 0;
                    var12_15 = 0.0f;
                    var9_9 /* !! */  = null;
                }
                cp_1.Companion.getClass();
                var13_17 = z40_0.Companion;
                var13_17 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var13_17).a;
                var18_26 /* !! */  = "assured_gift_minimum_order_value";
                var16_22 = var13_17.g((String)var18_26 /* !! */ );
                var19_27 = og1_1.b();
                var21_29 = 3;
                if (var19_27 == 0 && (var19_27 = pa_1.a()) != 0 && (var19_27 = (var18_26 /* !! */  = cp$a.q()).has((String)(var23_31 = "cart_flag"))) != 0 && (var19_27 = (var18_26 /* !! */  = cp$a.q()).getBoolean((String)var23_31)) != 0 && var8_8 >= var16_22) {
                    var9_9 /* !! */  = var5_5.t;
                    if (var9_9 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        var12_15 = 0.0f;
                    }
                    if ((var9_9 /* !! */  = var9_9 /* !! */ .S0) != null && (var9_9 /* !! */  = var9_9 /* !! */ .getTotalPriceWithTax()) != null && (var9_9 /* !! */  = var9_9 /* !! */ .getValue()) != null) {
                        var13_17 = var5_5.t;
                        if (var13_17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                            var16_22 = 0;
                            var13_17 = null;
                            var17_24 = 0.0f;
                        }
                        if ((var13_17 = var13_17.S0) != null) {
                            var13_17 = var13_17.getEntries();
                        } else {
                            var16_22 = 0;
                            var13_17 = null;
                            var17_24 = 0.0f;
                        }
                        if (var13_17 != null && (var16_22 = (int)var13_17.isEmpty()) == 0) {
                            var17_24 = Float.parseFloat((String)var9_9 /* !! */ );
                            var11_13.o(var17_24);
                            var11_13 = var5_5.L;
                            if (var11_13 != null) {
                                var13_17 = new sw1_0(var5_5, 0);
                                var11_13.setOnClickListener((View.OnClickListener)var13_17);
                            }
                            if ((var11_13 = var5_5.t) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                                var24_32 = false;
                                var11_13 = null;
                                var25_33 = 0.0f;
                            }
                            var11_13.getClass();
                            Intrinsics.checkNotNullParameter("bag screen", "screenName");
                            var13_17 = md3_0.c((jD3)var11_13);
                            var18_26 /* !! */  = new bx1_0((wx1_1)var11_13, (String)var9_9 /* !! */ , null);
                            Ae3.d((i90_0)var13_17, null, null, (Function2)var18_26 /* !! */ , var21_29);
                            var9_9 /* !! */  = var5_5.t;
                            if (var9_9 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                                var8_8 = 0;
                                var9_9 /* !! */  = null;
                                var12_15 = 0.0f;
                            }
                            var9_9 /* !! */  = var9_9 /* !! */ .G0;
                            var11_13 = var5_5.getViewLifecycleOwner();
                            var13_17 = new YW1((ex1_0)var5_5);
                            var18_26 /* !! */  = new eX1$d((Function1)var13_17);
                            var9_9 /* !! */ .e((mu1_1)var11_13, (F62)var18_26 /* !! */ );
                        }
                    }
                }
                if ((var9_9 /* !! */  = var5_5.t) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                    var12_15 = 0.0f;
                }
                if ((var8_8 = (int)var9_9 /* !! */ .c()) != 0 && (var8_8 = (int)var5_5.u0) != 0) {
                    var9_9 /* !! */  = var5_5.t;
                    if (var9_9 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        var12_15 = 0.0f;
                    }
                    var9_9 /* !! */ .e1 = var7_7;
                    var8_8 = (int)kx3_0.a;
                    if (var8_8 == 0 && (var9_9 /* !! */  = kx3_0.b) != null && (var8_8 = (int)var5_5.Nb()) != 0) {
                        var9_9 /* !! */  = var5_5.t;
                        if (var9_9 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            var12_15 = 0.0f;
                        }
                        var9_9 /* !! */ .V0 = var11_13 = kx3_0.b;
                        var9_9 /* !! */  = var5_5.x;
                        if (var9_9 /* !! */  != null) {
                            var11_13 = var5_5.t;
                            if (var11_13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                                var24_32 = false;
                                var11_13 = null;
                                var25_33 = 0.0f;
                            }
                            var9_9 /* !! */ .a = var11_13 = var11_13.V0;
                        }
                        if ((var9_9 /* !! */  = var5_5.u) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("closetViewModel");
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            var12_15 = 0.0f;
                        }
                        if ((var11_13 = var5_5.t) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                            var24_32 = false;
                            var11_13 = null;
                            var25_33 = 0.0f;
                        }
                        var11_13 = var11_13.V0;
                        var9_9 /* !! */ .p((ProductsList)var11_13, false);
                        var9_9 /* !! */  = var5_5.t;
                        if (var9_9 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            var12_15 = 0.0f;
                        }
                        if ((var9_9 /* !! */  = var9_9 /* !! */ .V0) != null && (var9_9 /* !! */  = var9_9 /* !! */ .getProducts()) != null) {
                            var11_13 = var5_5.S;
                            if (var11_13 != null && (var11_13 = var11_13.m) != null) {
                                var13_17 = var11_13.l;
                                var13_17.clear();
                                var11_13 = var11_13.m;
                                var11_13.clear();
                            }
                            if ((var11_13 = var5_5.S) != null) {
                                var11_13.i((List)var9_9 /* !! */ );
                            }
                        }
                        var9_9 /* !! */  = yn3_0.a;
                        var11_13 = "loadWishList() called with cache data";
                        var13_17 = new Object[]{};
                        var9_9 /* !! */ .a((String)var11_13, (Object[])var13_17);
                        var9_9 /* !! */  = var5_5.v;
                        if (var9_9 /* !! */  != null) {
                            var24_32 = var5_5.Nb();
                            var9_9 /* !! */  = var9_9 /* !! */ .a(var24_32);
                        } else {
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            var12_15 = 0.0f;
                        }
                        Intrinsics.checkNotNull(var9_9 /* !! */ );
                        var5_5.Bb((ArrayList)var9_9 /* !! */ );
                    } else {
                        var9_9 /* !! */  = yn3_0.a;
                        var11_13 = "loadWishList() called for pagination";
                        var13_17 = new Object[]{};
                        var9_9 /* !! */ .a((String)var11_13, (Object[])var13_17);
                        var9_9 /* !! */  = var5_5.t;
                        if (var9_9 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                            var8_8 = 0;
                            var9_9 /* !! */  = null;
                            var12_15 = 0.0f;
                        }
                        var9_9 /* !! */ .getClass();
                        var24_32 = cp$a.y();
                        if (var24_32) {
                            var26_34 = 10;
                            var27_35 = 0;
                            var28_36 = null;
                            var23_31 = var9_9 /* !! */ .d;
                            var29_37 = 0;
                            var30_38 = null;
                            var31_39 = 4;
                            var32_40 /* !! */  = null;
                            var11_13 = WishListRepo.getWishList$default((WishListRepo)var23_31, 0, var26_34, false, var31_39, null);
                            var19_27 = 2;
                            var13_17 = new zl_2(var9_9 /* !! */ , var19_27);
                            var18_26 /* !! */  = new jw0_1(var7_7, (Function1)var13_17);
                            var13_17 = new t4_0(var9_9 /* !! */ , var7_7);
                            var23_31 = new kx1_0(0, (Function1)var13_17);
                            var11_13 = var11_13.f((o60_0)var18_26 /* !! */ , (o60_0)var23_31);
                            var9_9 /* !! */  = var9_9 /* !! */ .g;
                            var9_9 /* !! */ .b((yr0_2)var11_13);
                        }
                    }
                }
                ex1_0.yb();
                var9_9 /* !! */  = var5_5.t;
                if (var9_9 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var8_8 = 0;
                    var9_9 /* !! */  = null;
                    var12_15 = 0.0f;
                }
                if ((var8_8 = (int)var9_9 /* !! */ .c()) != 0) {
                    var9_9 /* !! */  = var5_5.t;
                    if (var9_9 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        var12_15 = 0.0f;
                    }
                    var9_9 /* !! */ .getClass();
                    var11_13 = md3_0.c((jD3)var9_9 /* !! */ );
                    var13_17 = new gx1_0((wx1_1)var9_9 /* !! */ , null);
                    Ae3.d((i90_0)var11_13, null, null, (Function2)var13_17, var21_29);
                }
                cp$a.h();
                var8_8 = (int)cp$a.h();
                if (var8_8 == 0 && (var8_8 = (int)og1_1.b()) == 0) {
                    var9_9 /* !! */  = var5_5.t;
                    if (var9_9 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var8_8 = 0;
                        var9_9 /* !! */  = null;
                        var12_15 = 0.0f;
                    }
                    if ((var8_8 = (var9_9 /* !! */  = var9_9 /* !! */ .q1).getPreference((String)(var11_13 = "cart_footer_coachmark_in_revamp"), false) ^ var7_7) != 0) {
                        var18_26 /* !! */  = var5_5.getActivity();
                        var9_9 /* !! */  = var5_5.Z;
                        if (var9_9 /* !! */  != null) {
                            var9_9 /* !! */  = var9_9 /* !! */ .getActionView();
                            var20_28 = var9_9 /* !! */ ;
                        } else {
                            var21_29 = 0;
                            var20_28 = null;
                        }
                        var22_30 = R$color.color_2c4152;
                        var29_37 = R$string.closet_got_a_new_look;
                        var26_34 = R$string.cart_closet_coachmark_desc;
                        var9_9 /* !! */  = FontsManager.getInstance();
                        var11_13 = AJIOApplication$a.a();
                        var33_41 /* !! */  = var9_9 /* !! */ .getTypefaceWithFont((Context)var11_13, 10);
                        var9_9 /* !! */  = FontsManager.getInstance();
                        var11_13 = AJIOApplication$a.a();
                        var16_22 = 9;
                        var17_24 = 1.3E-44f;
                        var32_40 /* !! */  = var9_9 /* !! */ .getTypefaceWithFont((Context)var11_13, var16_22);
                        var9_9 /* !! */  = new fX1((ex1_0)var5_5);
                        var27_35 = 50;
                        iw_2.a((FragmentActivity)var18_26 /* !! */ , (View)var20_28, var22_30, var29_37, var26_34, var27_35, var33_41 /* !! */ , var32_40 /* !! */ , (TapTargetView$Listener)var9_9 /* !! */ );
                    }
                }
                var9_9 /* !! */  = AnalyticsManager.Companion;
                var11_13 = var9_9 /* !! */ .getInstance().getGa();
                var11_13.pushCartCustomDimension((Cart)var4_4);
                var5_5.zb();
                var4_4 = var5_5.w;
                if (var4_4 != null) {
                    var11_13 = var4_4.a;
                    var13_17 = var11_13.S0;
                    if (var13_17 != null) {
                        var13_17 = var13_17.getPROFILE_HEALTH();
                    } else {
                        var16_22 = 0;
                        var13_17 = null;
                        var17_24 = 0.0f;
                    }
                    if (var13_17 != null && (var13_17 = var11_13.S0) != null && (var13_17 = var13_17.getPROFILE_HEALTH()) != null && (var23_31 = var13_17.getRule()) != null) {
                        var13_17 = var11_13.S0;
                        if (var13_17 != null && (var13_17 = var13_17.getPROFILE_HEALTH()) != null) {
                            var13_17 = var13_17.getAction();
                        } else {
                            var16_22 = 0;
                            var13_17 = null;
                            var17_24 = 0.0f;
                        }
                        var18_26 /* !! */  = "NO_ACTION";
                        var16_22 = (int)Intrinsics.areEqual(var13_17, var18_26 /* !! */ );
                        if (var16_22 == 0 && (var11_13 = var11_13.S0) != null && (var11_13 = var11_13.getPROFILE_HEALTH()) != null && (var30_38 = var11_13.getMessage()) != null) {
                            var11_13 = var4_4.d;
                            var13_17 = var4_4.e;
                            var34_42 = 1664;
                            var18_26 /* !! */  = var4_4.b;
                            var20_28 = "fraud engine";
                            var35_43 = "RVP_fraud_engine_response";
                            var28_36 = "bag screen";
                            var33_41 /* !! */  = "bag screen";
                            var36_44 = 0;
                            var32_40 /* !! */  = var11_13;
                            var37_45 = var13_17;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var18_26 /* !! */ , (String)var20_28, (String)var23_31, (String)var30_38, (String)var35_43, var28_36, (String)var33_41 /* !! */ , (String)var11_13, null, (String)var13_17, false, null, var34_42, null);
                        }
                    }
                }
                if ((var4_4 = var5_5.w) != null) {
                    var11_13 = var4_4.a;
                    var13_17 = var11_13.S0;
                    if (var13_17 != null) {
                        var13_17 = var13_17.getRvpReturnFee();
                    } else {
                        var16_22 = 0;
                        var13_17 = null;
                        var17_24 = 0.0f;
                    }
                    if (var13_17 != null) {
                        var13_17 = h40_0.a;
                        var16_22 = (int)h40_0.k2();
                        if (var16_22 != 0) {
                            var13_17 = DE.a();
                            var11_13 = var11_13.S0;
                            if (var11_13 != null && (var11_13 = var11_13.getRvpReturnFee()) != null && (var11_13 = var11_13.getActionContent()) != null && (var11_13 = var11_13.getReturn_fee()) != null) {
                                var25_33 = var11_13.floatValue();
                                var24_32 = (int)var25_33;
                            } else {
                                var24_32 = false;
                                var25_33 = 0.0f;
                                var11_13 = null;
                            }
                            var13_17.putInt("return_fee", (int)var24_32);
                            var11_13 = var4_4.d;
                            var35_43 = var4_4.e;
                            var34_42 = 1536;
                            var18_26 /* !! */  = var4_4.b;
                            var20_28 = "Fraud engine";
                            var23_31 = "Return_Processing_Fee";
                            var30_38 = "return_fee_value";
                            var4_4 = "RVP_fraud_engine_response";
                            var28_36 = "bag screen";
                            var33_41 /* !! */  = "bag screen";
                            var36_44 = 0;
                            var37_45 = var35_43;
                            var35_43 = var4_4;
                            var32_40 /* !! */  = var11_13;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var18_26 /* !! */ , (String)var20_28, (String)var23_31, (String)var30_38, (String)var4_4, var28_36, (String)var33_41 /* !! */ , (String)var11_13, (Bundle)var13_17, (String)var37_45, false, null, var34_42, null);
                        }
                    }
                }
                var4_4 = new HashMap();
                var11_13 = var5_5.t;
                if (var11_13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var24_32 = false;
                    var11_13 = null;
                    var25_33 = 0.0f;
                }
                if ((var11_13 = var11_13.S0) != null && (var11_13 = var11_13.getTotalPrice()) != null) {
                    var11_13 = var11_13.getValue();
                } else {
                    var24_32 = false;
                    var11_13 = null;
                    var25_33 = 0.0f;
                }
                if (var11_13 != null && (var24_32 = var11_13.length())) {
                    var11_13 = var5_5.t;
                    if (var11_13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var24_32 = false;
                        var11_13 = null;
                        var25_33 = 0.0f;
                    }
                    var11_13 = var11_13.S0;
                    Intrinsics.checkNotNull(var11_13);
                    var11_13 = var11_13.getTotalPrice();
                    Intrinsics.checkNotNull(var11_13);
                    var11_13 = var11_13.getValue();
                    Intrinsics.checkNotNull(var11_13);
                    var38_46 = Double.parseDouble((String)var11_13);
                } else {
                    var38_46 = 0.0;
                }
                var11_13 = var38_46;
                var13_17 = "order_total";
                var4_4.put(var13_17, var11_13);
                var11_13 = var5_5.t;
                if (var11_13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var24_32 = false;
                    var11_13 = null;
                    var25_33 = 0.0f;
                }
                if ((var11_13 = var11_13.S0) != null) {
                    var11_13 = var11_13.getAppliedVouchers();
                } else {
                    var24_32 = false;
                    var11_13 = null;
                    var25_33 = 0.0f;
                }
                var13_17 = "Y";
                var18_26 /* !! */  = "N";
                var11_13 = var11_13 == null ? var18_26 /* !! */  : var13_17;
                var20_28 = "coupon_applied";
                var4_4.put(var20_28, var11_13);
                var11_13 = var5_5.t;
                if (var11_13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var24_32 = false;
                    var11_13 = null;
                    var25_33 = 0.0f;
                }
                if ((var11_13 = var11_13.S0) != null) {
                    var11_13 = var11_13.getAppliedProductPromotions();
                } else {
                    var24_32 = false;
                    var11_13 = null;
                    var25_33 = 0.0f;
                }
                if (var11_13 == null) {
                    var13_17 = var18_26 /* !! */ ;
                }
                var4_4.put("promo_applied", var13_17);
                var5_5.gb("View_cart", (HashMap)var4_4);
                var9_9 /* !! */  = var9_9 /* !! */ .getInstance().getCt();
                var11_13 = new AnalyticsData$Builder();
                var4_4 = var11_13.eventMap((HashMap)var4_4).build();
                var9_9 /* !! */ .viewCart((AnalyticsData)var4_4);
                var4_4 = var5_5.t;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var10_11 = 0;
                    var4_4 = null;
                }
                if ((var4_4 = var4_4.S0) != null) {
                    var4_4 = var4_4.getEntries();
                } else {
                    var10_11 = 0;
                    var4_4 = null;
                }
                if (var4_4 != null && (var10_11 = (int)var4_4.isEmpty()) == 0 && (var10_11 = (int)var5_5.U0) == 0) {
                    var5_5.U0 = var7_7;
                    var4_4 = var5_5.w;
                    if (var4_4 != null) {
                        var4_4.a();
                    }
                    var18_26 /* !! */  = GAEcommerceEvents.INSTANCE;
                    var4_4 = var5_5.bb();
                    if (var4_4 != null) {
                        var30_38 = var4_4 = var4_4.getEntries();
                    } else {
                        var29_37 = 0;
                        var30_38 = null;
                    }
                    var37_45 = null;
                    var21_29 = 1;
                    var23_31 = "Bag Load";
                    var35_43 = "bag screen";
                    var28_36 = "begin_checkout";
                    var31_39 = 0;
                    var33_41 /* !! */  = null;
                    var32_40 /* !! */  = null;
                    var36_44 = 992;
                    var34_42 = 0;
                    GAEcommerceEvents.sendCheckoutOptions$default((GAEcommerceEvents)var18_26 /* !! */ , var21_29, (String)var23_31, (ArrayList)var30_38, (String)var35_43, var28_36, null, null, null, null, null, var36_44, null);
                }
                if ((var4_4 = var5_5.t) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                    var10_11 = 0;
                    var4_4 = null;
                }
                if ((var4_4 = var4_4.S0) == null) {
                    var2_2 = R$string.acc_page_header_cart_empty;
                    var3_3 = hv3_0.K(var2_2);
                } else {
                    var4_4 = var5_5.t;
                    if (var4_4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var15_21);
                        var10_11 = 0;
                        var4_4 = null;
                    }
                    if ((var4_4 = var4_4.S0) != null && (var4_4 = var4_4.getEntries()) != null) {
                        var2_2 = (int)var4_4.isEmpty();
                        if (var2_2 != 0) {
                            var2_2 = R$string.acc_page_header_cart_empty;
                            var3_3 = hv3_0.K(var2_2);
                        } else {
                            var2_2 = var4_4.size();
                            if (var2_2 > var7_7) {
                                var3_3 = StringCompanionObject.INSTANCE;
                                var2_2 = R$string.acc_page_header_cart_multiple_products;
                                var3_3 = hv3_0.K(var2_2);
                                var10_11 = var4_4.size();
                                var4_4 = var10_11;
                                var9_9 /* !! */  = new Object[var7_7];
                                var9_9 /* !! */ [0] = var4_4;
                                var3_3 = xh2_0.a(var9_9 /* !! */ , var7_7, (String)var3_3, (String)var14_19);
                            } else {
                                var3_3 = StringCompanionObject.INSTANCE;
                                var2_2 = R$string.acc_page_header_cart;
                                var3_3 = hv3_0.K(var2_2);
                                var10_11 = var4_4.size();
                                var4_4 = var10_11;
                                var9_9 /* !! */  = new Object[var7_7];
                                var9_9 /* !! */ [0] = var4_4;
                                var3_3 = xh2_0.a(var9_9 /* !! */ , var7_7, (String)var3_3, (String)var14_19);
                            }
                        }
                    }
                }
                var4_4 = var5_5.I;
                if (var4_4 != null && (var4_4 = var4_4.getToolbar()) != null) {
                    var4_4.setContentDescription((CharSequence)var3_3);
                }
                if ((var6_6 = var5_5.I) != null) {
                    var7_7 = R$drawable.ic_cancel_cart_refresh;
                    var2_2 = R$string.close;
                    var9_9 /* !! */  = var5_5.getString(var2_2);
                    var40_47 = 8;
                    var15_21 = null;
                    var11_13 = "cartpage";
                    var16_22 = 0;
                    var17_24 = 0.0f;
                    var13_17 = null;
                    CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)var6_6, var7_7, (String)var9_9 /* !! */ , (String)var11_13, null, var40_47, null);
                }
                var4_4 = Looper.getMainLooper();
                var3_3 = new Handler((Looper)var4_4);
                var4_4 = new rw1_0((ex1_0)var5_5);
                var41_48 = 300L;
                var3_3.postDelayed((Runnable)var4_4, var41_48);
                ** GOTO lbl721
lbl707:
                // 1 sources

                var2_2 = var9_9 /* !! */ .getStatus();
                if (var2_2 == var7_7) {
                    var5_5.Xa();
                    var5_5.Y.clear();
                    var5_5.X.clear();
                    var3_3 = var9_9 /* !! */ .getError();
                    var2_2 = (int)ex1_0.Ta((DataError)var3_3);
                    if (var2_2 != 0) {
                        var5_5.eb();
                    } else {
                        var3_3 = var9_9 /* !! */ .getError();
                        var2_2 = (int)var5_5.Ua((DataError)var3_3);
                        if (var2_2 == 0) {
                            var5_5.Ya((DataCallback)var9_9 /* !! */ );
                        }
                    }
                }
lbl721:
                // 8 sources

                return Unit.a;
            }
            case 0: 
        }
        var6_6 = var1_1;
        var6_6 = (DataCallback)var1_1;
        var6_6 = LoginActivityRevamp.Companion;
        var5_5 = (LoginActivityRevamp)var5_5;
        Intrinsics.checkNotNullParameter(var5_5, (String)var4_4);
        var4_4 = var5_5.q0;
        var6_6 = "loginViewModel";
        if (var4_4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
            var10_12 = 0;
            var4_4 = null;
        }
        if ((var4_4 = var4_4.J) != null) {
            var43_49 = var5_5.q0;
            if (var43_49 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                var7_7 = 0;
                var43_49 = null;
            }
            var7_7 = (int)var43_49.A;
            var9_10 = var5_5.q0;
            if (var9_10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                var8_8 = 0;
                var9_10 = null;
                var12_16 = 0.0f;
            }
            var9_10 = var9_10.B;
            var11_14 = var5_5.getAppPreferences();
            var13_18 = var4_4.getIdentity();
            if (var13_18 != null) {
                var14_20 = "IDENTITY";
                var11_14.putPreference((String)var14_20, (String)var13_18);
            } else {
                var11_14.getClass();
            }
            var11_14 = var5_5.getAppPreferences();
            var16_23 = var4_4.getDisplayEmail();
            var11_14.putPreference("user_email_account_screen", var16_23);
            var11_14 = var5_5.getAppPreferences();
            var16_23 = var4_4.getEmailVerified();
            var14_20 = "IS_RIL_EMAIL_VERIFIED";
            var11_14.putPreference((String)var14_20, var16_23);
            var11_14 = AnalyticsManager.Companion.getInstance().getCt();
            var11_14.userLogin((UserProfileData)var4_4);
            if (var7_7 == 0) {
                var2_2 = (int)var5_5.r0;
                if (var2_2 != 0) {
                    at2_1.d((Context)var5_5);
                    var5_5.finish();
                } else {
                    var3_3 = new Intent();
                    var6_6 = var4_4.getFirstName();
                    var3_3.putExtra("first_name", (String)var6_6);
                    var6_6 = var4_4.getDisplayUid();
                    var43_49 = "user_name";
                    var3_3.putExtra((String)var43_49, (String)var6_6);
                    var4_4 = var4_4.getPassword();
                    var3_3.putExtra("user_pwd", (String)var4_4);
                    var4_4 = "GAME_URL";
                    var6_6 = var5_5.J0;
                    var3_3.putExtra((String)var4_4, (String)var6_6);
                    var10_12 = -1;
                    var5_5.setResult(var10_12, (Intent)var3_3);
                    var5_5.finish();
                }
            } else {
                var5_5.stopLoader();
                var43_49 = xA1.Companion;
                var11_14 = var4_4.getDisplayUid();
                Intrinsics.checkNotNullExpressionValue(var11_14, "getDisplayUid(...)");
                var4_4 = var4_4.getName();
                var13_18 = var5_5.q0;
                if (var13_18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                    var16_23 = false;
                    var13_18 = null;
                    var17_25 = 0.0f;
                }
                var16_23 = var13_18.F;
                var14_20 = var5_5.q0;
                if (var14_20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_6);
                } else {
                    var3_3 = var14_20;
                }
                var3_3 = var3_3.G;
                var43_49.getClass();
                var3_3 = xA1$a.a((String)var11_14, (String)var9_10, (String)var4_4, (String)var3_3, var16_23);
                var4_4 = "SetPasswordFragment";
                var5_5.Z0((Fragment)var3_3, (String)var4_4);
            }
        }
        return Unit.a;
    }
}

