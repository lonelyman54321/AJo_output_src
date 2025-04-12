/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity$a;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity$b;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity$c;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity$d;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity$e;
import com.ril.ajio.myaccount.order.exchangereturn.activity.Hilt_ExchangeReturnTabActivity;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ImageFileInfo;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class ExchangeReturnTabActivity
extends Hilt_ExchangeReturnTabActivity
implements View.OnClickListener,
gD0$d,
nd0_0 {
    public static final ExchangeReturnTabActivity$a Companion;
    public AjioTextView A0;
    public AjioTextView B0;
    public AjioTextView C0;
    public CardView D0;
    public CardView E0;
    public CardView F0;
    public CardView G0;
    public CardView H0;
    public AjioTextView I0;
    public final NewCustomEventsRevamp J0;
    public AjioTextView Y;
    public AjioLoaderView Z;
    public rc0_2 k0;
    public dn2_2 p0;
    public CartEntry q0;
    public TextView r0;
    public db2_1 s0;
    public final D t0;
    public int u0;
    public int v0;
    public int w0;
    public AjioTextView x0;
    public AjioTextView y0;
    public AjioTextView z0;

    static {
        ExchangeReturnTabActivity$a exchangeReturnTabActivity$a;
        Companion = exchangeReturnTabActivity$a = new Object();
    }

    public ExchangeReturnTabActivity() {
        D d2;
        Object object = new ExchangeReturnTabActivity$c(this);
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(NM2.class);
        ExchangeReturnTabActivity$d exchangeReturnTabActivity$d = new ExchangeReturnTabActivity$d(this);
        ExchangeReturnTabActivity$e exchangeReturnTabActivity$e = new ExchangeReturnTabActivity$e(this);
        this.t0 = d2 = new D(yn1_22, exchangeReturnTabActivity$d, (Function0)object, exchangeReturnTabActivity$e);
        this.J0 = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void A2() {
        Object object;
        int n3;
        this.w0 = n3 = 1;
        rc0_2.Companion.getClass();
        Object object2 = new rc0_2();
        this.k0 = object2;
        object2 = this.getIntent().getExtras();
        Object object3 = this.q0;
        Intrinsics.checkNotNull(object3);
        object3 = ((CartEntry)object3).getReason();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        Object object4 = null;
        if (!bl2) {
            object3 = this.q0;
            Intrinsics.checkNotNull(object3);
            object3 = ((CartEntry)object3).getSubReason();
            bl2 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl2) {
                if (object2 == null) {
                    object2 = new Bundle();
                }
                object2.putString("RETURN_REASON", null);
                object3 = "RETURN_SUB_REASON";
                object2.putString((String)object3, null);
            }
        }
        if ((object3 = this.k0) != null) {
            ((Fragment)object3).setArguments((Bundle)object2);
        }
        if ((object2 = this.k0) != null) {
            object2 = this.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object2, "getSupportFragmentManager(...)");
            object2.getClass();
            object3 = new a((FragmentManager)object2);
            object2 = "beginTransaction(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            n3 = R$id.exchange_return_content_frame;
            object = this.k0;
            Intrinsics.checkNotNull(object);
            String string2 = "tag";
            ((k)object3).j(n3, (Fragment)object, string2);
            ((a)object3).d();
        }
        object2 = this.x0;
        object3 = "btnSaveFullWidth";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        object = "Save";
        object2.setText((CharSequence)object);
        n3 = (int)(h40_0.l1() ? 1 : 0);
        if (n3 != 0) {
            object2 = this.x0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                object2 = null;
            }
            object3 = "Proceed";
            object2.setText((CharSequence)object3);
        }
        n3 = 0;
        this.f1(false);
        this.B(false);
        object2 = this.D0;
        if (object2 == null) {
            object2 = "layout_product_tag";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object4 = object2;
        }
        ai0_2.i((View)object4);
    }

    /*
     * WARNING - void declaration
     */
    public final void B(boolean bl2) {
        Object object = h40_0.a;
        object = h40_0.F();
        boolean bl3 = object.optBoolean("tryNudge");
        Object object2 = null;
        if (bl3) {
            void var1_4;
            object = this.H0;
            if (object == null) {
                object = "layout_exchange_in_return_new";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            if (bl2) {
                boolean bl4 = false;
                Object var5_8 = null;
            } else {
                int n3 = 8;
            }
            object2.setVisibility((int)var1_4);
        } else {
            object = "layout_exchange_in_return";
            if (bl2) {
                CardView cardView = this.G0;
                if (cardView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object2 = cardView;
                }
                ai0_2.B((View)object2);
            } else {
                CardView cardView = this.G0;
                if (cardView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object2 = cardView;
                }
                ai0_2.i((View)object2);
            }
        }
    }

    public final void C2() {
        int n3;
        this.w0 = n3 = 2;
        dn2_2.Companion.getClass();
        Object object = new dn2_2();
        this.p0 = object;
        Object object2 = this.getIntent().getExtras();
        ((Fragment)object).setArguments((Bundle)object2);
        object = this.p0;
        if (object != null) {
            object = this.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
            object.getClass();
            object2 = new a((FragmentManager)object);
            object = "beginTransaction(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            n3 = R$id.exchange_return_content_frame;
            dn2_2 dn2_22 = this.p0;
            Intrinsics.checkNotNull(dn2_22);
            String string2 = "tag";
            ((k)object2).j(n3, dn2_22, string2);
            ((a)object2).d();
        }
        object = this.y2();
        n3 = (int)(((NM2)object).b ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
            this.f1(n3 != 0);
        } else {
            n3 = 0;
            object = null;
            this.f1(false);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void D2(int n3) {
        void var4_9;
        int n4;
        ArrayList arrayList;
        t30_0 t30_02 = null;
        int n7 = 1;
        CartEntry cartEntry = this.q0;
        int n8 = 0;
        Object object = null;
        if (cartEntry != null && (arrayList = cartEntry.getImageInfoList()) != null) {
            n4 = arrayList.size();
            Integer n10 = n4;
        } else {
            n4 = 0;
            Object var4_8 = null;
        }
        if (var4_9 != null && (n4 = var4_9.intValue()) > n3) {
            void var4_15;
            ArrayList arrayList2;
            CartEntry cartEntry2 = this.q0;
            if (cartEntry2 != null && (arrayList2 = cartEntry2.getImageInfoList()) != null) {
                ImageFileInfo imageFileInfo = (ImageFileInfo)arrayList2.get(n3);
            } else {
                n4 = 0;
                Object var4_14 = null;
            }
            if (var4_15 != null) {
                void var4_22;
                ImageFileInfo imageFileInfo;
                ArrayList arrayList3;
                CartEntry cartEntry3 = this.q0;
                if (cartEntry3 != null && (arrayList3 = cartEntry3.getImageInfoList()) != null && (imageFileInfo = (ImageFileInfo)arrayList3.get(n3)) != null) {
                    String string2 = imageFileInfo.getFilePath();
                } else {
                    n4 = 0;
                    Object var4_21 = null;
                }
                if (var4_22 != null) {
                    String string3;
                    ux2_1 ux2_12;
                    String string4;
                    Object object2;
                    Object object3;
                    Object object4;
                    Object object5;
                    db2_1 db2_12;
                    block25: {
                        AjioLoaderView ajioLoaderView = this.Z;
                        if (ajioLoaderView != null) {
                            ajioLoaderView.startLoader();
                        }
                        if ((db2_12 = this.s0) == null) return;
                        long l2 = System.currentTimeMillis();
                        int n14 = 1000;
                        long l3 = n14;
                        object5 = new StringBuilder();
                        ((StringBuilder)object5).append(l2 /= l3);
                        object4 = ((StringBuilder)object5).toString();
                        object3 = this.q0;
                        if (object3 != null && (object3 = ((CartEntry)object3).getImageInfoList()) != null) {
                            object2 = (ImageFileInfo)((ArrayList)object3).get(n3);
                        } else {
                            n3 = 0;
                            object2 = null;
                        }
                        object3 = "imageName";
                        Intrinsics.checkNotNullParameter(object4, (String)object3);
                        object5 = db2_12.c().getUserId();
                        Intrinsics.checkNotNullExpressionValue(object5, "getUserId(...)");
                        string4 = ServiceUtil.getToken(db2_12.c());
                        ux2_12 = db2_12.a;
                        ux2_12.getClass();
                        Intrinsics.checkNotNullParameter(object4, (String)object3);
                        Intrinsics.checkNotNullParameter(object5, "userId");
                        object3 = UrlHelper.Companion.getInstance();
                        Object[] objectArray = new Object[n7];
                        objectArray[0] = object5;
                        object5 = "order";
                        string3 = "return_upload_image";
                        object3 = ((UrlHelper)object3).getApiUrl((String)object5, string3, objectArray);
                        if (object2 != null) {
                            object2 = ((ImageFileInfo)object2).getFilePath();
                            if (object2 == null) break block25;
                            n14 = ((String)object2).length();
                            if (n14 <= 0) break block25;
                            object5 = new File((String)object2);
                            object2 = pj2_2.Companion;
                            Pattern pattern = jn1_0.d;
                            String string5 = "multipart/form-data";
                            jn1_0 jn1_02 = JN1$a.b(string5);
                            object2.getClass();
                            object2 = PJ2$a.a(jn1_02, (File)object5);
                            object5 = "file";
                            try {
                                object = cR1$c$a.a((String)object5, (String)object4, (pj2_2)object2);
                            }
                            catch (Exception exception) {
                                object4 = yn3_0.a;
                                ((yn3$a)object4).e(exception);
                            }
                        }
                    }
                    if (object != null) {
                        object2 = new StringBuilder("Bearer ");
                        ((StringBuilder)object2).append(string4);
                        object2 = ((StringBuilder)object2).toString();
                        Intrinsics.checkNotNullExpressionValue("Android", "clientType");
                        object4 = ux2_12.a;
                        object5 = ux2_12.b;
                        object2 = object4.f((String)object3, (String)object2, (String)object5, (cr1$c_0)object);
                        object = qt2_2.c;
                        object2 = ((g53_0)object2).h((Scheduler)object);
                        object = ti_2.a();
                        object2 = ((g53_0)object2).e((Scheduler)object);
                        object = new Object();
                        object4 = new iX1(n7, (Function1)object);
                        object = new s53_0((q63_0)object2, (bx0_2)object4);
                        object2 = new Object();
                        object4 = new u53_0((q63_0)object, (bx0_2)object2);
                    } else {
                        object5 = new IllegalArgumentException("Invalid URL");
                        object3 = ApiErrorRepo.INSTANCE;
                        Object var19_42 = null;
                        string3 = null;
                        string4 = "RETURN_UPLOAD_IMAGE";
                        boolean bl2 = true;
                        int n15 = 24;
                        object4 = g53_0.d(ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object5, string4, bl2, null, null, n15, null));
                        object2 = "run(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
                    }
                    n8 = 2;
                    object2 = new ln_2(db2_12, n8);
                    object = new Sa2(0, (Function1)object2);
                    object2 = new bf1_0(db2_12, n7);
                    ta2_0 ta2_02 = new ta2_0(0, (Function1)object2);
                    object2 = ((g53_0)object4).f((o60_0)object, ta2_02);
                    t30_02 = db2_12.b;
                    t30_02.b((yr0_2)object2);
                    return;
                }
            }
        }
        this.z2();
    }

    public final void E(Pair object) {
        Intrinsics.checkNotNullParameter(object, "productTagPair");
        Object object2 = (Boolean)this.y2().h.getValue();
        boolean n3 = (Boolean)object2;
        String string2 = "layout_product_tag";
        Object object3 = null;
        if (!n3) {
            object = this.D0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            ai0_2.i((View)object3);
        } else {
            object2 = this.y2();
            boolean bl2 = ((NM2)object2).c;
            if (!bl2) {
                object2 = (Boolean)object.a;
                boolean bl3 = (Boolean)object2;
                int n4 = 1;
                if (bl3) {
                    object2 = this.q0;
                    if (object2 != null) {
                        int n7;
                        String string3;
                        int n8;
                        if ((object2 = ((CartEntry)object2).getReason()) != null && (n8 = ((String)object2).equals(string3 = this.getString(n7 = R$string.size_colour_issue))) == n4) {
                            object2 = this.D0;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                boolean bl4 = false;
                                object2 = null;
                            }
                            ai0_2.i((View)object2);
                        } else {
                            object2 = this.D0;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                boolean bl5 = false;
                                object2 = null;
                            }
                            ai0_2.B((View)object2);
                        }
                    } else {
                        object2 = this.D0;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            boolean bl6 = false;
                            object2 = null;
                        }
                        ai0_2.B((View)object2);
                    }
                    object = (Boolean)object.b;
                    boolean bl7 = (Boolean)object;
                    object2 = "tvProductDetailsSubmitted";
                    string2 = "tvDontHaveProductTag";
                    if (bl7) {
                        object = this.A0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            bl7 = false;
                            object = null;
                        }
                        ai0_2.i((View)object);
                        object = this.B0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            object3 = object;
                        }
                        ai0_2.B((View)object3);
                    } else {
                        object = this.A0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            bl7 = false;
                            object = null;
                        }
                        ai0_2.B((View)object);
                        object = this.B0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            object3 = object;
                        }
                        ai0_2.i((View)object3);
                    }
                } else {
                    object = this.y2();
                    boolean bl8 = ((NM2)object).b;
                    if (bl8) {
                        boolean bl9 = false;
                        object2 = null;
                        ((NM2)object).b = false;
                        object = this.p0;
                        if (object != null && (object = ((dn2_2)object).G) != null) {
                            ((ArrayList)object).clear();
                        }
                        if ((object = this.p0) != null && (object = ((dn2_2)object).i) != null) {
                            int n10;
                            Object object4 = ((CartEntry)object).getCancelComments();
                            if (object4 != null) {
                                String[] stringArray = new String[]{":"};
                                int n14 = 6;
                                object4 = StringsKt.a0((CharSequence)object4, stringArray, false, 0, n14);
                            } else {
                                boolean bl10 = false;
                                object4 = null;
                            }
                            if (object4 != null && (n10 = object4.size()) == 0) {
                                object2 = (String)object4.get(n4);
                            } else if (object4 == null || (object2 = (String)object4.get(0)) == null) {
                                object2 = "";
                            }
                            ((CartEntry)object).setCancelComments((String)object2);
                        }
                    }
                    if ((object = this.D0) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object;
                    }
                    ai0_2.i((View)object3);
                }
            }
        }
    }

    public final void L() {
        boolean bl2;
        String string2 = "Save";
        Intrinsics.checkNotNullParameter(string2, "text");
        Object object = this.x0;
        AjioTextView ajioTextView = null;
        String string3 = "btnSaveFullWidth";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            bl2 = false;
            object = null;
        }
        object.setText((CharSequence)string2);
        bl2 = h40_0.l1();
        if (bl2) {
            object = this.x0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                ajioTextView = object;
            }
            object = "Proceed";
            ajioTextView.setText((CharSequence)object);
        }
    }

    public final void b2(boolean bl2) {
        int n3 = 1;
        Object object = null;
        String string2 = "btnSaveFullWidth";
        if (bl2) {
            AjioTextView ajioTextView = this.x0;
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl3 = false;
                ajioTextView = null;
            }
            ajioTextView.setClickable(n3 != 0);
            ajioTextView = this.x0;
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl4 = false;
                ajioTextView = null;
            }
            ajioTextView.setEnabled(n3 != 0);
            ajioTextView = this.x0;
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl5 = false;
                ajioTextView = null;
            }
            n3 = R$drawable.bg_black_button;
            Drawable drawable2 = hv3_0.r(n3);
            ajioTextView.setBackground(drawable2);
            ajioTextView = this.x0;
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl6 = false;
                ajioTextView = null;
            }
            n3 = hv3_0.m(R$color.white);
            ajioTextView.setTextColor(n3);
            boolean bl7 = h40_0.l1();
            if (bl7) {
                ajioTextView = this.x0;
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl8 = false;
                    ajioTextView = null;
                }
                n3 = R$drawable.rounded_rect_black_stroke;
                drawable2 = t70.getDrawable((Context)this, n3);
                ajioTextView.setBackground(drawable2);
                ajioTextView = this.x0;
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object = ajioTextView;
                }
                int n4 = hv3_0.m(R$color.color_202020);
                object.setTextColor(n4);
            }
        } else {
            Object object2 = cp_1.Companion;
            boolean bl9 = km_1.b((cp$a)object2);
            if (bl9) {
                object2 = this.x0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl10 = false;
                    object2 = null;
                }
                object2.setClickable(n3 != 0);
                object2 = this.x0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl11 = false;
                    object2 = null;
                }
                object2.setEnabled(n3 != 0);
                object2 = this.x0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl12 = false;
                    object2 = null;
                }
                n3 = R$drawable.bg_black_button;
                Drawable drawable3 = hv3_0.r(n3);
                object2.setBackground(drawable3);
                object2 = this.x0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl13 = false;
                    object2 = null;
                }
                n3 = hv3_0.m(R$color.white);
                object2.setTextColor(n3);
                boolean bl14 = h40_0.l1();
                if (bl14) {
                    object2 = this.x0;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        boolean bl15 = false;
                        object2 = null;
                    }
                    n3 = R$drawable.rounded_rect_black_stroke;
                    drawable3 = t70.getDrawable((Context)this, n3);
                    object2.setBackground(drawable3);
                    object2 = this.x0;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object = object2;
                    }
                    int n7 = hv3_0.m(R$color.color_202020);
                    object.setTextColor(n7);
                }
            } else {
                object2 = this.x0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl16 = false;
                    object2 = null;
                }
                n3 = 0;
                Drawable drawable4 = null;
                object2.setClickable(false);
                object2 = this.x0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl17 = false;
                    object2 = null;
                }
                object2.setEnabled(false);
                object2 = this.x0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl18 = false;
                    object2 = null;
                }
                n3 = R$drawable.bg_button_disabled;
                drawable4 = hv3_0.r(n3);
                object2.setBackground(drawable4);
                object2 = this.x0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl19 = false;
                    object2 = null;
                }
                n3 = hv3_0.m(R$color.color_a5a5a5);
                object2.setTextColor(n3);
                boolean bl20 = h40_0.l1();
                if (bl20) {
                    object2 = this.x0;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        boolean bl21 = false;
                        object2 = null;
                    }
                    n3 = R$drawable.rounded_rect_black_stroke;
                    drawable4 = t70.getDrawable((Context)this, n3);
                    object2.setBackground(drawable4);
                    object2 = this.x0;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object = object2;
                    }
                    int n8 = hv3_0.m(R$color.color_A5A5A5);
                    object.setTextColor(n8);
                }
            }
        }
    }

    public final void f1(boolean bl2) {
        String string2 = "exchange_return_footer_two_button";
        String string3 = "exchange_return_footer";
        CardView cardView = null;
        if (bl2) {
            CardView cardView2 = this.E0;
            if (cardView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                cardView2 = null;
            }
            ai0_2.i((View)cardView2);
            cardView2 = this.F0;
            if (cardView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                cardView = cardView2;
            }
            ai0_2.B((View)cardView);
        } else {
            CardView cardView3 = this.E0;
            if (cardView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                cardView3 = null;
            }
            ai0_2.B((View)cardView3);
            cardView3 = this.F0;
            if (cardView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                cardView = cardView3;
            }
            ai0_2.i((View)cardView);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onClick(View var1_1) {
        block106: {
            block104: {
                block115: {
                    block114: {
                        block113: {
                            block111: {
                                block112: {
                                    block108: {
                                        block110: {
                                            block109: {
                                                block107: {
                                                    block105: {
                                                        var2_2 = this;
                                                        var3_3 = -1;
                                                        var4_4 = "v";
                                                        var5_5 = var1_1;
                                                        Intrinsics.checkNotNullParameter(var1_1, (String)var4_4);
                                                        var6_6 = var1_1.getId();
                                                        var7_7 = R$id.reset_button;
                                                        var8_8 = null;
                                                        var9_9 = 1;
                                                        if (var6_6 == var7_7 || var6_6 == (var7_7 = R$id.reset_button_return)) break block104;
                                                        var7_7 = R$id.init_exchange_in_return;
                                                        if (var6_6 == var7_7 || var6_6 == (var7_7 = R$id.tv_try_exchange)) ** GOTO lbl414
                                                        var7_7 = R$id.tvDontHaveProductTag;
                                                        var10_10 = "ProductCodeFragment";
                                                        var11_12 = 4;
                                                        if (var6_6 != var7_7) break block105;
                                                        var3_3 = (int)this.isFinishing();
                                                        if (var3_3 == 0) {
                                                            var12_13 = Yz2.Companion;
                                                            var4_4 = Boolean.FALSE;
                                                            var12_13.getClass();
                                                            var12_13 = Yz2$a.a(var11_12, false, (boolean)var9_9, (Boolean)var4_4);
                                                            var4_4 = this.getSupportFragmentManager();
                                                            var12_13.show((FragmentManager)var4_4, (String)var10_10);
                                                        }
                                                        break block106;
                                                    }
                                                    var7_7 = R$id.tvProductDetailsSubmitted;
                                                    if (var6_6 != var7_7) break block107;
                                                    var3_3 = (int)this.isFinishing();
                                                    if (var3_3 == 0) {
                                                        var12_14 = Yz2.Companion;
                                                        var4_4 = Boolean.TRUE;
                                                        var12_14.getClass();
                                                        var12_14 = Yz2$a.a(var11_12, false, (boolean)var9_9, (Boolean)var4_4);
                                                        var4_4 = this.getSupportFragmentManager();
                                                        var12_14.show((FragmentManager)var4_4, (String)var10_10);
                                                    }
                                                    break block106;
                                                }
                                                var7_7 = R$id.done_button;
                                                if (var6_6 != var7_7 && var6_6 != (var7_7 = R$id.btnSaveFullWidth) && var6_6 != (var7_7 = R$id.done_button_return)) break block106;
                                                var6_6 = var2_2.w0;
                                                var13_21 = "format(...)";
                                                if (var6_6 != var9_9) break block108;
                                                var4_4 = var2_2.k0;
                                                if (var4_4 == null) break block109;
                                                var10_10 = var4_4.h;
                                                if (var10_10 == null) ** GOTO lbl-1000
                                                Intrinsics.checkNotNull(var10_10);
                                                var10_10 = var10_10.getProduct();
                                                if (var10_10 == null) ** GOTO lbl-1000
                                                var4_4 = var4_4.h;
                                                Intrinsics.checkNotNull(var4_4);
                                                var4_4 = var4_4.getProduct().getSelectedSize();
                                                if (var4_4 != null) {
                                                    var6_6 = 1;
                                                } else lbl-1000:
                                                // 3 sources

                                                {
                                                    var6_6 = 0;
                                                    var4_4 = null;
                                                }
                                                var4_4 = (boolean)var6_6;
                                                break block110;
                                            }
                                            var6_6 = 0;
                                            var4_4 = null;
                                        }
                                        Intrinsics.checkNotNull(var4_4);
                                        var6_6 = var4_4.booleanValue();
                                        if (var6_6 == 0) {
                                            var12_15 = StringCompanionObject.INSTANCE;
                                            var12_15 = hv3_0.K(R$string.acc_alert_message);
                                            var4_4 = hv3_0.K(R$string.please_select_size);
                                            var5_5 = new Object[var9_9];
                                            var5_5[0] = var4_4;
                                            var12_15 = xh2_0.a((Object[])var5_5, var9_9, (String)var12_15, (String)var13_21);
                                            mq0_2.a(R$string.please_select_size, (String)var12_15);
                                            return;
                                        }
                                    }
                                    if ((var6_6 = km_1.b((cp$a)(var4_4 = cp_1.Companion))) == 0) break block111;
                                    var4_4 = var2_2.q0;
                                    if (var4_4 != null) {
                                        var4_4 = var4_4.getReason();
                                    } else {
                                        var6_6 = 0;
                                        var4_4 = null;
                                    }
                                    if (var4_4 == null || (var6_6 = var4_4.length()) == 0) break block112;
                                    var4_4 = var2_2.q0;
                                    if (var4_4 != null) {
                                        var4_4 = var4_4.getSubReason();
                                    } else {
                                        var6_6 = 0;
                                        var4_4 = null;
                                    }
                                    if (var4_4 != null && (var6_6 = var4_4.length()) != 0) break block111;
                                }
                                var12_16 = StringCompanionObject.INSTANCE;
                                var12_16 = hv3_0.K(R$string.acc_alert_message);
                                var4_4 = hv3_0.K(R$string.pls_enter_the_required_details);
                                var5_5 = new Object[var9_9];
                                var5_5[0] = var4_4;
                                var12_16 = xh2_0.a((Object[])var5_5, var9_9, (String)var12_16, (String)var13_21);
                                mq0_2.a(R$string.pls_enter_the_required_details, (String)var12_16);
                                return;
                            }
                            var4_4 = new Intent();
                            var7_7 = var2_2.w0;
                            if (var7_7 != var9_9) break block113;
                            var5_5 = var2_2.q0;
                            if (var5_5 == null) {
                                return;
                            }
                            var5_5.setIsExchangeItem((boolean)var9_9);
                            var5_5 = var2_2.q0;
                            if (var5_5 != null) {
                                var5_5.setIsReturnItem(false);
                            }
                            var13_21 = var2_2.q0;
                            var4_4.putExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY", (Serializable)var13_21);
                            var7_7 = var2_2.u0;
                            var4_4.putExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY_POSITION", var7_7);
                            var5_5 = "RETURN_ITEMS_CONSIGNMENT_ENTRY_TYPE";
                            var4_4.putExtra((String)var5_5, var9_9);
                            var2_2.setResult(var3_3, (Intent)var4_4);
                            this.finish();
                            break block106;
                        }
                        var4_4 = var2_2.p0;
                        if (var4_4 == null) break block114;
                        var13_21 = var4_4.k;
                        if (var13_21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("barcodeLayout");
                            var7_7 = 0;
                            var13_21 = null;
                        }
                        var7_7 = var13_21.getVisibility();
                        var10_10 = var4_4.G;
                        var14_22 = ":";
                        if (var7_7 != 0) ** GOTO lbl285
                        var7_7 = (int)var4_4.J;
                        var15_24 = 32;
                        if (var7_7 != 0) ** GOTO lbl-1000
                        var13_21 = var4_4.m;
                        if (var13_21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("barcodeEt");
                            var7_7 = 0;
                            var13_21 = null;
                        }
                        var13_21 = var13_21.getText().toString();
                        var16_26 = var13_21.length() - var9_9;
                        var17_28 = 0;
                        var18_29 = null;
                        var19_31 = 0;
                        while (var17_28 <= var16_26) {
                            var20_33 = var19_31 == 0 ? var17_28 : var16_26;
                            if ((var20_33 = Intrinsics.compare(var13_21.charAt(var20_33), var15_24)) <= 0) {
                                var20_33 = 1;
                            } else {
                                var20_33 = 0;
                                var21_34 = null;
                            }
                            if (var19_31 == 0) {
                                if (var20_33 == 0) {
                                    var19_31 = 1;
                                    continue;
                                }
                                var17_28 += var9_9;
                                continue;
                            }
                            if (var20_33 == 0) break;
                            var16_26 += var3_3;
                        }
                        if ((var7_7 = (int)TextUtils.isEmpty((CharSequence)(var13_21 = var13_21.subSequence(var17_28, var16_26 += var9_9).toString()))) == 0 && (var7_7 = (int)var4_4.E) == 0) {
                            var12_17 = var4_4.Pa().returnLayoutBarcode.lblErrorEan;
                            var4_4 = "lblErrorEan";
                            Intrinsics.checkNotNullExpressionValue(var12_17, (String)var4_4);
                            ai0_2.B((View)var12_17);
lbl172:
                            // 2 sources

                            while (true) {
                                var9_9 = 0;
                                var22_36 = null;
                                break;
                            }
                        } else if ((var7_7 = (int)var10_10.isEmpty()) == 0 && ((var7_7 = (int)var4_4.K) == 0 || (var16_26 = var10_10.size()) >= (var17_28 = 2))) {
                            var23_38 = var4_4.Da();
                            var18_29 = var4_4.i;
                            Intrinsics.checkNotNull(var18_29);
                            var18_29.setCancelComments((String)var23_38);
                            var23_38 = var4_4.i;
                            Intrinsics.checkNotNull(var23_38);
                            var17_28 = var4_4.E ^ var9_9;
                            var23_38.setTagAvailable((boolean)var17_28);
                            var16_26 = var10_10.size();
                            if (var16_26 > 0) {
                                var23_38 = new ArrayList();
                                var17_28 = var10_10.size();
                                for (var19_31 = 0; var19_31 < var17_28; var19_31 += var9_9) {
                                    var21_34 = new ImageFileInfo();
                                    var24_41 = (uy2_2)var10_10.get(var19_31);
                                    if (var24_41 != null) {
                                        var24_41 = var24_41.c;
                                    } else {
                                        var25_43 = 0;
                                        var24_41 = null;
                                    }
                                    var25_43 = TextUtils.isEmpty((CharSequence)var24_41);
                                    if (var25_43 == 0) {
                                        var24_41 = (uy2_2)var10_10.get(var19_31);
                                        if (var24_41 != null) {
                                            var24_41 = var24_41.c;
                                        } else {
                                            var25_43 = 0;
                                            var24_41 = null;
                                        }
                                        var21_34.setFilePath((String)var24_41);
                                    } else {
                                        var24_41 = (uy2_2)var10_10.get(var19_31);
                                        if (var24_41 != null) {
                                            var24_41 = var24_41.e;
                                        } else {
                                            var25_43 = 0;
                                            var24_41 = null;
                                        }
                                        if (var24_41 != null) {
                                            var24_41 = (uy2_2)var10_10.get(var19_31);
                                            if (var24_41 != null) {
                                                var24_41 = var24_41.e;
                                            } else {
                                                var25_43 = 0;
                                                var24_41 = null;
                                            }
                                            var24_41 = String.valueOf(var24_41);
                                            var21_34.setFileUri((String)var24_41);
                                        }
                                    }
                                    if (var7_7 != 0) {
                                        var24_41 = (uy2_2)var10_10.get(var19_31);
                                        if (var24_41 != null) {
                                            var24_41 = var24_41.d;
                                        } else {
                                            var25_43 = 0;
                                            var24_41 = null;
                                        }
                                        var21_34.setImageName((String)var24_41);
                                    }
                                    var23_38.add(var21_34);
                                }
                                var13_21 = var4_4.i;
                                if (var13_21 != null) {
                                    var13_21.setImageInfoList((ArrayList)var23_38);
                                }
                            } else if (var7_7 == 0 && (var13_21 = var4_4.i) != null) {
                                var13_21.setImageInfoList(null);
                            }
                            if ((var13_21 = var4_4.i) != null) {
                                var10_10 = var4_4.Qa();
                                var23_38 = var4_4.l;
                                if (var23_38 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("commentEt");
                                    var16_26 = 0;
                                    var23_38 = null;
                                }
                                var23_38 = var23_38.getText().toString();
                                var17_28 = var23_38.length() - var9_9;
                                var19_31 = 0;
                                var20_33 = 0;
                                var21_34 = null;
                                while (var19_31 <= var17_28) {
                                    var25_43 = var20_33 == 0 ? var19_31 : var17_28;
                                    if ((var25_43 = Intrinsics.compare(var23_38.charAt(var25_43), var15_24)) <= 0) {
                                        var25_43 = 1;
                                    } else {
                                        var25_43 = 0;
                                        var24_41 = null;
                                    }
                                    if (var20_33 == 0) {
                                        if (var25_43 == 0) {
                                            var20_33 = 1;
                                            continue;
                                        }
                                        var19_31 += var9_9;
                                        continue;
                                    }
                                    if (var25_43 == 0) break;
                                    var17_28 += var3_3;
                                }
                                var12_17 = com.jio.jioads.adinterfaces.a.a(var17_28, var9_9, var19_31, (String)var23_38);
                                var26_44 /* !! */  = var10_10.d;
                                if (var26_44 /* !! */  != null && (var15_24 = var26_44 /* !! */ .length()) != 0) {
                                    var26_44 /* !! */  = new StringBuilder();
                                    var10_10 = var10_10.d;
                                    var12_17 = BW0.b((StringBuilder)var26_44 /* !! */ , (String)var10_10, var14_22, (String)var12_17);
                                }
                                var13_21.setWrongItemComments((String)var12_17);
                            }
                            if ((var12_17 = var4_4.i) != null) {
                                var4_4 = var4_4.u6();
                                var12_17.setBarCode((String)var4_4);
                            }
                        } else {
                            var12_17 = var4_4.p;
                            if (var12_17 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("lblImageError");
                                var3_3 = 0;
                                var12_17 = null;
                            }
                            ai0_2.B((View)var12_17);
                            ** continue;
lbl285:
                            // 1 sources

                            var12_17 = var4_4.Qa();
                            var3_3 = (int)var12_17.b;
                            if (var3_3 != 0) {
                                var12_17 = var4_4.i;
                                Intrinsics.checkNotNull(var12_17);
                                var13_21 = var4_4.Qa();
                                var26_45 = var4_4.i;
                                Intrinsics.checkNotNull(var26_45);
                                var26_45 = var26_45.getCancelComments();
                                var23_39 = var13_21.e;
                                if (var23_39 != null) {
                                    var23_39 = (String)var23_39.a;
                                } else {
                                    var16_27 = 0;
                                    var23_39 = null;
                                }
                                if (var23_39 != null && (var16_27 = var23_39.length()) != 0) {
                                    var23_39 = new StringBuilder();
                                    var13_21 = var13_21.e;
                                    if (var13_21 != null) {
                                        var13_21 = (String)var13_21.a;
                                    } else {
                                        var7_7 = 0;
                                        var13_21 = null;
                                    }
                                    var26_45 = BW0.b((StringBuilder)var23_39, (String)var13_21, var14_22, (String)var26_45);
                                }
                                var12_17.setCancelComments((String)var26_45);
                                var12_17 = var4_4.i;
                                Intrinsics.checkNotNull(var12_17);
                                var12_17.setTagAvailable(false);
                                var3_3 = var10_10.size();
                                if (var3_3 > 0) {
                                    var12_17 = new ArrayList();
                                    var7_7 = var10_10.size();
                                    var14_22 = null;
                                    for (var11_12 = 0; var11_12 < var7_7; var11_12 += var9_9) {
                                        var26_45 = new ImageFileInfo();
                                        var23_39 = (uy2_2)var10_10.get(var11_12);
                                        if (var23_39 != null) {
                                            var23_39 = var23_39.c;
                                        } else {
                                            var16_27 = 0;
                                            var23_39 = null;
                                        }
                                        var16_27 = (int)TextUtils.isEmpty((CharSequence)var23_39);
                                        if (var16_27 == 0) {
                                            var23_39 = (uy2_2)var10_10.get(var11_12);
                                            if (var23_39 != null) {
                                                var23_39 = var23_39.c;
                                            } else {
                                                var16_27 = 0;
                                                var23_39 = null;
                                            }
                                            var26_45.setFilePath((String)var23_39);
                                        } else {
                                            var23_39 = (uy2_2)var10_10.get(var11_12);
                                            if (var23_39 != null) {
                                                var23_39 = var23_39.e;
                                            } else {
                                                var16_27 = 0;
                                                var23_39 = null;
                                            }
                                            if (var23_39 != null) {
                                                var23_39 = (uy2_2)var10_10.get(var11_12);
                                                if (var23_39 != null) {
                                                    var23_39 = var23_39.e;
                                                } else {
                                                    var16_27 = 0;
                                                    var23_39 = null;
                                                }
                                                var23_39 = String.valueOf(var23_39);
                                                var26_45.setFileUri((String)var23_39);
                                            }
                                        }
                                        var23_39 = (uy2_2)var10_10.get(var11_12);
                                        if (var23_39 != null) {
                                            var23_39 = var23_39.d;
                                        } else {
                                            var16_27 = 0;
                                            var23_39 = null;
                                        }
                                        var23_39 = String.valueOf(var23_39);
                                        var26_45.setImageName((String)var23_39);
                                        var12_17.add(var26_45);
                                    }
                                    var4_4 = var4_4.i;
                                    if (var4_4 != null) {
                                        var4_4.setImageInfoList((ArrayList)var12_17);
                                    }
                                } else {
                                    var12_17 = var4_4.i;
                                    if (var12_17 != null) {
                                        var12_17.setImageInfoList(null);
                                    }
                                }
                            } else {
                                var12_17 = var4_4.i;
                                if (var12_17 != null) {
                                    var12_17.setImageInfoList(null);
                                }
                                if ((var12_17 = var4_4.i) != null) {
                                    var12_17.setTagAvailable((boolean)var9_9);
                                }
                            }
                        }
                        var12_17 = (boolean)var9_9;
                        break block115;
                    }
                    var3_3 = 0;
                    var12_17 = null;
                }
                if (var12_17 != null && (var3_3 = (int)var12_17.booleanValue()) != 0) {
                    var3_3 = var1_1.getId();
                    if (var3_3 == (var6_6 = R$id.done_button_return)) {
                        var12_17 = h40_0.a;
                        var3_3 = (int)h40_0.u1();
                        if (var3_3 == 0) {
                            var2_2.v0 = 0;
                            var2_2.D2(0);
                        } else {
                            this.z2();
                        }
                    } else {
                        var2_2.v0 = 0;
                        var2_2.D2(0);
                    }
                } else {
                    var12_17 = cp_1.Companion;
                    var3_3 = (int)km_1.b((cp$a)var12_17);
                    if (var3_3 != 0 && (var12_17 = var2_2.p0) != null) {
                        var4_4 = var12_17.r;
                        var5_5 = "lblCaptureImage";
                        if (var4_4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var6_6 = 0;
                            var4_4 = null;
                        }
                        var7_7 = R$string.error_image_upload_new;
                        var13_21 = hv3_0.K(var7_7);
                        var4_4.setContentDescription((CharSequence)var13_21);
                        var12_17 = var12_17.r;
                        if (var12_17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                        } else {
                            var8_8 = var12_17;
                        }
                        ai0_2.a((View)var8_8);
                    }
                    return;
lbl414:
                    // 1 sources

                    var24_42 = new Bundle();
                    var12_18 /* !! */  = this.getIntent().getExtras();
                    var4_4 = "product_id";
                    if (var12_18 /* !! */  != null) {
                        var12_18 /* !! */  = var12_18 /* !! */ .getString((String)var4_4);
                    } else {
                        var3_3 = 0;
                        var12_18 /* !! */  = null;
                    }
                    var24_42.putString((String)var4_4, (String)var12_18 /* !! */ );
                    var12_18 /* !! */  = this.getIntent().getExtras();
                    var4_4 = "order_status";
                    if (var12_18 /* !! */  != null) {
                        var12_18 /* !! */  = var12_18 /* !! */ .getString((String)var4_4);
                    } else {
                        var3_3 = 0;
                        var12_18 /* !! */  = null;
                    }
                    var24_42.putString((String)var4_4, (String)var12_18 /* !! */ );
                    var12_18 /* !! */  = this.getIntent().getExtras();
                    var4_4 = "order_id";
                    if (var12_18 /* !! */  != null) {
                        var8_8 = var12_18 /* !! */ .getString((String)var4_4);
                    }
                    var24_42.putString((String)var4_4, (String)var8_8);
                    var12_18 /* !! */  = AnalyticsManager.Companion;
                    var21_35 = bv_0.a((AnalyticsManager$Companion)var12_18 /* !! */ );
                    var27_47 = cv_0.a((AnalyticsManager$Companion)var12_18 /* !! */ );
                    var22_37 = var2_2.J0;
                    var10_11 = "buttonTap";
                    var14_23 = "try exchange";
                    var15_25 = false;
                    var26_46 = null;
                    var23_40 = "buttonTap";
                    var18_30 = "return size & reason selection screen";
                    var19_32 = false;
                    var28_48 = 1572;
                    NewCustomEventsRevamp.newPushCustomEvent$default(var22_37, var10_11, var14_23, null, var23_40, var18_30, null, var21_35, var24_42, var27_47, false, null, var28_48, null);
                    this.A2();
                }
                break block106;
            }
            var3_3 = var2_2.w0;
            if (var3_3 == var9_9) {
                var12_19 = var2_2.k0;
                if (var12_19 != null) {
                    var4_4 = var12_19.q;
                    Intrinsics.checkNotNull(var4_4);
                    var4_4.g();
                    var4_4 = var12_19.h;
                    Intrinsics.checkNotNull(var4_4);
                    var4_4.getProduct().setSelectedProductSizeCode(null);
                    var4_4 = var12_19.g.iterator();
                    while (var29_49 = var4_4.hasNext()) {
                        var5_5 = (ProductOptionVariant)var4_4.next();
                        var5_5.setSelected(false);
                    }
                    var12_19 = var12_19.k;
                    if (var12_19 != null) {
                        Intrinsics.checkNotNull(var12_19);
                        var12_19.notifyDataSetChanged();
                    }
                }
            } else {
                var12_20 = var2_2.p0;
                if (var12_20 != null) {
                    var12_20 = var12_20.B;
                    Intrinsics.checkNotNull(var12_20);
                    var12_20.g();
                }
            }
            var2_2.b2(false);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onCreate(Bundle var1_1) {
        block35: {
            block36: {
                block37: {
                    super.onCreate(var1_1 /* !! */ );
                    var2_2 = R$layout.exchange_return_tab_layout_revamp;
                    this.setContentView(var2_2);
                    var1_1 /* !! */  = "owner";
                    Intrinsics.checkNotNullParameter(this, (String)var1_1 /* !! */ );
                    var3_3 = this.getViewModelStore();
                    Intrinsics.checkNotNullParameter(this, (String)var1_1 /* !! */ );
                    var4_4 = this.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullParameter(this, (String)var1_1 /* !! */ );
                    var1_1 /* !! */  = this.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullParameter(var3_3, "store");
                    Intrinsics.checkNotNullParameter(var4_4, "factory");
                    var1_1 /* !! */  = li_2.a((Wd0)var1_1 /* !! */ , "defaultCreationExtras", (rd3_0)var3_3, (E$b)var4_4, (Wd0)var1_1 /* !! */ );
                    var3_3 = db2_1.class;
                    var4_4 = "modelClass";
                    Intrinsics.checkNotNullParameter(var3_3, (String)var4_4);
                    var5_5 = "<this>";
                    Intrinsics.checkNotNullParameter(var3_3, (String)var5_5);
                    var3_3 = Reflection.getOrCreateKotlinClass((Class)var3_3);
                    Intrinsics.checkNotNullParameter(var3_3, (String)var4_4);
                    Intrinsics.checkNotNullParameter(var3_3, (String)var4_4);
                    Intrinsics.checkNotNullParameter(var3_3, (String)var5_5);
                    var4_4 = var3_3.getQualifiedName();
                    if (var4_4 == null) break block35;
                    var5_5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                    var4_4 = var5_5.concat((String)var4_4);
                    var1_1 /* !! */  = (db2_1)var1_1 /* !! */ .a((yn1_2)var3_3, (String)var4_4);
                    this.s0 = var1_1 /* !! */ ;
                    if (var1_1 /* !! */  != null && (var1_1 /* !! */  = var1_1 /* !! */ .v) != null) {
                        var3_3 = new ld0_2(this);
                        var1_1 /* !! */ .e(this, (F62)var3_3);
                    }
                    AB0.a().register(this);
                    var2_2 = R$id.notification_text;
                    var1_1 /* !! */  = (TextView)this.findViewById(var2_2);
                    this.r0 = var1_1 /* !! */ ;
                    var2_2 = R$id.reset_button;
                    var1_1 /* !! */  = (AjioTextView)this.findViewById(var2_2);
                    this.Y = var1_1 /* !! */ ;
                    var2_2 = R$id.progressView;
                    var1_1 /* !! */  = (AjioLoaderView)this.findViewById(var2_2);
                    this.Z = var1_1 /* !! */ ;
                    var1_1 /* !! */  = this.getIntent();
                    var3_3 = "RETURN_ITEMS_CONSIGNMENT_ENTRY";
                    var1_1 /* !! */ .hasExtra((String)var3_3);
                    var1_1 /* !! */  = this.getIntent();
                    var4_4 = "getIntent(...)";
                    Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , (String)var4_4);
                    var6_6 = Build.VERSION.SDK_INT;
                    var7_7 = 33;
                    if (var6_6 >= var7_7) {
                        var1_1 /* !! */  = id0_1.a((Intent)var1_1 /* !! */ );
                    } else {
                        var8_8 = (var1_1 /* !! */  = var1_1 /* !! */ .getSerializableExtra((String)var3_3)) instanceof CartEntry;
                        if (var8_8 == 0) {
                            var2_2 = 0;
                            var1_1 /* !! */  = null;
                        }
                        var1_1 /* !! */  = (CartEntry)var1_1 /* !! */ ;
                    }
                    var1_1 /* !! */  = (CartEntry)var1_1 /* !! */ ;
                    this.q0 = var1_1 /* !! */ ;
                    var1_1 /* !! */  = this.getIntent();
                    var6_6 = 0;
                    var4_4 = null;
                    this.u0 = var2_2 = var1_1 /* !! */ .getIntExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY_POSITION", 0);
                    var1_1 /* !! */  = this.getIntent();
                    var3_3 = "RETURN_ITEMS_CONSIGNMENT_ENTRY_TYPE";
                    this.w0 = var2_2 = var1_1 /* !! */ .getIntExtra((String)var3_3, 0);
                    var1_1 /* !! */  = this.q0;
                    if (var1_1 /* !! */  != null) {
                        var1_1 /* !! */  = var1_1 /* !! */ .getReason();
                    } else {
                        var2_2 = 0;
                        var1_1 /* !! */  = null;
                    }
                    var3_3 = this.q0;
                    if (var3_3 != null) {
                        var3_3 = var3_3.getSubReason();
                    } else {
                        var8_8 = 0;
                        var3_3 = null;
                    }
                    var2_2 = (int)ce0_2.a((String)var1_1 /* !! */ , (String)var3_3);
                    var8_8 = 1;
                    if (var2_2 != 0) break block36;
                    var1_1 /* !! */  = this.q0;
                    if (var1_1 /* !! */  != null && (var1_1 /* !! */  = var1_1 /* !! */ .getImageInfoList()) != null) {
                        var2_2 = var1_1 /* !! */ .size();
                        var1_1 /* !! */  = Integer.valueOf(var2_2);
                    } else {
                        var2_2 = 0;
                        var1_1 /* !! */  = null;
                    }
                    if (var1_1 /* !! */  == null) break block36;
                    var5_5 = Boolean.TRUE;
                    var1_1 /* !! */  = new Pair(var5_5, var5_5);
                    this.E((Pair)var1_1 /* !! */ );
                    this.y2().b = var8_8;
                    this.y2().c = var8_8;
                    var1_1 /* !! */  = this.y2();
                    var9_9 = this.y2();
                    var10_10 /* !! */  = this.q0;
                    var10_10 /* !! */  = var10_10 /* !! */  != null ? var10_10 /* !! */ .getCancelComments() : null;
                    var11_11 = var9_9.b;
                    if (!var11_11) break block37;
                    if (var10_10 /* !! */  == null) ** GOTO lbl-1000
                    var9_9 = new String[]{":"};
                    var12_12 = 6;
                    if ((var9_9 = StringsKt.a0((CharSequence)var10_10 /* !! */ , (String[])var9_9, false, 0, var12_12)) != null) {
                        var9_9 = (String)var9_9.get(0);
                        var10_10 /* !! */  = var9_9;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var10_10 /* !! */  = null;
                    }
                }
                var9_9 = this.y2();
                var13_13 = this.q0;
                if (var13_13 != null) {
                    var13_13 = var13_13.getImageInfoList();
                } else {
                    var12_12 = 0;
                    var13_13 = null;
                }
                Intrinsics.checkNotNull(var13_13);
                var9_9.getClass();
                Intrinsics.checkNotNullParameter(var13_13, "list");
                var9_9 = new ArrayList();
                var14_14 = var13_13.size();
                for (var15_15 = 0; var15_15 < var14_14; ++var15_15) {
                    var16_16 = new uy2_2();
                    var16_16.c = var17_17 = ((ImageFileInfo)var13_13.get(var15_15)).getFilePath();
                    var17_17 = ((ImageFileInfo)var13_13.get(var15_15)).getFileUri();
                    if (var17_17 != null) {
                        var17_17 = Uri.parse((String)((ImageFileInfo)var13_13.get(var15_15)).getFileUri());
                        var16_16.e = var17_17;
                    }
                    var16_16.a = var17_17 = ((ImageFileInfo)var13_13.get(var15_15)).getImageName();
                    var9_9.add(var16_16);
                }
                var5_5 = new Pair(var10_10 /* !! */ , var9_9);
                var1_1 /* !! */ .getClass();
                var9_9 = "pair";
                Intrinsics.checkNotNullParameter(var5_5, (String)var9_9);
                var1_1 /* !! */ .e = var5_5;
            }
            var2_2 = R$id.btnSaveFullWidth;
            var1_1 /* !! */  = (AjioTextView)this.findViewById(var2_2);
            this.x0 = var1_1 /* !! */ ;
            var2_2 = R$id.reset_button_return;
            var1_1 /* !! */  = (AjioTextView)this.findViewById(var2_2);
            this.y0 = var1_1 /* !! */ ;
            var2_2 = R$id.done_button_return;
            var1_1 /* !! */  = (AjioTextView)this.findViewById(var2_2);
            this.z0 = var1_1 /* !! */ ;
            var2_2 = R$id.tvDontHaveProductTag;
            var1_1 /* !! */  = (AjioTextView)this.findViewById(var2_2);
            this.A0 = var1_1 /* !! */ ;
            var2_2 = R$id.tvProductDetailsSubmitted;
            var1_1 /* !! */  = (AjioTextView)this.findViewById(var2_2);
            this.B0 = var1_1 /* !! */ ;
            var2_2 = R$id.init_exchange_in_return;
            var1_1 /* !! */  = (AjioTextView)this.findViewById(var2_2);
            this.C0 = var1_1 /* !! */ ;
            var2_2 = R$id.layout_product_tag;
            var1_1 /* !! */  = (CardView)this.findViewById(var2_2);
            this.D0 = var1_1 /* !! */ ;
            var2_2 = R$id.tv_try_exchange;
            var1_1 /* !! */  = (AjioTextView)this.findViewById(var2_2);
            this.I0 = var1_1 /* !! */ ;
            var2_2 = R$id.exchange_return_footer;
            var1_1 /* !! */  = (CardView)this.findViewById(var2_2);
            this.E0 = var1_1 /* !! */ ;
            var2_2 = R$id.exchange_return_footer_two_button;
            var1_1 /* !! */  = (CardView)this.findViewById(var2_2);
            this.F0 = var1_1 /* !! */ ;
            var2_2 = R$id.layout_exchange_in_return;
            var1_1 /* !! */  = (CardView)this.findViewById(var2_2);
            this.G0 = var1_1 /* !! */ ;
            var2_2 = R$id.layout_exchange_in_return_new;
            var1_1 /* !! */  = (CardView)this.findViewById(var2_2);
            this.H0 = var1_1 /* !! */ ;
            var1_1 /* !! */  = this.x0;
            var5_5 = "btnSaveFullWidth";
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setClickable(false);
            var1_1 /* !! */  = this.x0;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setEnabled(false);
            var1_1 /* !! */  = this.x0;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setOnClickListener((View.OnClickListener)this);
            var1_1 /* !! */  = this.Y;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resetButton");
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setOnClickListener((View.OnClickListener)this);
            var1_1 /* !! */  = this.y0;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reset_button_return");
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setOnClickListener((View.OnClickListener)this);
            var1_1 /* !! */  = this.z0;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("done_button_return");
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setOnClickListener((View.OnClickListener)this);
            var1_1 /* !! */  = this.A0;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDontHaveProductTag");
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setOnClickListener((View.OnClickListener)this);
            var1_1 /* !! */  = this.B0;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvProductDetailsSubmitted");
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setOnClickListener((View.OnClickListener)this);
            var1_1 /* !! */  = this.C0;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("init_exchange_in_return");
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setOnClickListener((View.OnClickListener)this);
            var1_1 /* !! */  = this.I0;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tv_try_exchange");
                var2_2 = 0;
                var1_1 /* !! */  = null;
            }
            var1_1 /* !! */ .setOnClickListener((View.OnClickListener)this);
            var2_2 = this.w0;
            if (var2_2 == var8_8) {
                rc0_2.Companion.getClass();
                var1_1 /* !! */  = new rc0_2();
                this.k0 = var1_1 /* !! */ ;
                var3_3 = this.getIntent().getExtras();
                var1_1 /* !! */ .setArguments((Bundle)var3_3);
                var1_1 /* !! */  = this.k0;
                if (var1_1 /* !! */  != null) {
                    var1_1 /* !! */  = this.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , "getSupportFragmentManager(...)");
                    var1_1 /* !! */ .getClass();
                    var3_3 = new a((FragmentManager)var1_1 /* !! */ );
                    var1_1 /* !! */  = "beginTransaction(...)";
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var1_1 /* !! */ );
                    var2_2 = R$id.exchange_return_content_frame;
                    var9_9 = this.k0;
                    Intrinsics.checkNotNull(var9_9);
                    var10_10 /* !! */  = "tag";
                    var3_3.j(var2_2, (Fragment)var9_9, (String)var10_10 /* !! */ );
                    var3_3.d();
                }
                if ((var1_1 /* !! */  = this.x0) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    var2_2 = 0;
                    var1_1 /* !! */  = null;
                }
                var3_3 = "Save";
                var1_1 /* !! */ .setText((CharSequence)var3_3);
                var2_2 = (int)h40_0.l1();
                if (var2_2 != 0) {
                    var1_1 /* !! */  = this.x0;
                    if (var1_1 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                        var2_2 = 0;
                        var1_1 /* !! */  = null;
                    }
                    var3_3 = "Proceed";
                    var1_1 /* !! */ .setText((CharSequence)var3_3);
                }
                this.f1(false);
                var1_1 /* !! */  = this.D0;
                if (var1_1 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layout_product_tag");
                    var2_2 = 0;
                    var1_1 /* !! */  = null;
                }
                ai0_2.i((View)var1_1 /* !! */ );
            } else {
                this.C2();
            }
            var2_2 = (int)h40_0.l1();
            if (var2_2 != 0) {
                var1_1 /* !! */  = this.x0;
                if (var1_1 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    var2_2 = 0;
                    var1_1 /* !! */  = null;
                }
                var8_8 = R$drawable.rounded_rect_black_stroke;
                var3_3 = t70.getDrawable((Context)this, var8_8);
                var1_1 /* !! */ .setBackground((Drawable)var3_3);
            }
            var1_1 /* !! */  = this.getSupportFragmentManager();
            var3_3 = new md0_2(this);
            var1_1 /* !! */ .h0("key_missing_product_tag", this, (wW0)var3_3);
            var1_1 /* !! */  = nu1_0.a(this);
            var3_3 = new ExchangeReturnTabActivity$b(this, null);
            var1_1 /* !! */ .c((Function2)var3_3);
            return;
        }
        var3_3 = "Local and anonymous classes can not be ViewModels".toString();
        var1_1 /* !! */  = new IllegalArgumentException((String)var3_3);
        throw var1_1 /* !! */ ;
    }

    public final boolean onSupportNavigateUp() {
        this.finish();
        return true;
    }

    public final NM2 y2() {
        return (NM2)this.t0.getValue();
    }

    public final void z2() {
        Object object = this.q0;
        if (object == null) {
            return;
        }
        object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "enable_return_image_upload_debug_logs";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            object2 = new kd0_0(this, 0);
            long l2 = 2000L;
            object.postDelayed((Runnable)object2, l2);
        }
        if ((object = this.Z) != null) {
            ((AjioLoaderView)((Object)object)).stopLoader();
        }
        object = this.q0;
        boolean bl3 = true;
        if (object != null) {
            ((CartEntry)object).setIsReturnItem(bl3);
        }
        if ((object = this.q0) != null) {
            ((CartEntry)object).setIsExchangeItem(false);
        }
        if (bl2 = ((Boolean)(object = (Boolean)this.y2().h.getValue())).booleanValue()) {
            object = this.y2();
            bl2 = ((NM2)object).b;
            if (bl2 && (object = this.q0) != null) {
                ((CartEntry)object).setProductTag(bl3);
            }
        }
        object = this.getIntent();
        CartEntry cartEntry = this.q0;
        object.putExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY", (Serializable)cartEntry);
        object = this.getIntent();
        int n3 = this.u0;
        object.putExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY_POSITION", n3);
        this.getIntent().putExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY_TYPE", 0);
        object = this.getIntent();
        this.setResult(-1, (Intent)object);
        this.finish();
    }
}

