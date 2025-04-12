/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Message
 *  android.text.SpannableStringBuilder
 *  android.text.Spanned
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.UnderlineSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.viewpager2.widget.ViewPager2;
import com.google.gson.JsonParser;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.DynamicCirclePageIndicator;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.databinding.EpoxyCustomerPhotosReviewsBinding;
import com.ril.ajio.databinding.PdpRatingReviewParentBinding;
import com.ril.ajio.pdprefresh.data.AjiogramInterventions;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.services.data.Offers.BankOffer;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.AllOfferMerge;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductPromotion;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomResponse;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.Product.SectionData;
import com.ril.ajio.services.data.Product.SimilarProductWishlistDataHolder;
import com.ril.ajio.services.data.Product.SpotLight;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import com.ril.ajio.services.entity.Component;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from yh2
 */
public final class yh2_1
extends RecyclerView$f
implements M82 {
    public static final yh2$a Companion;
    public final HashMap A;
    public boolean B;
    public zi2_2 C;
    public List D;
    public final ArrayList E;
    public final boolean F;
    public final zh2_0 G;
    public final HashMap H;
    public final sj2_0 a;
    public final yi2_1 b;
    public final zi2_1 c;
    public final t82_0 d;
    public final cq1_2 e;
    public final q82_0 f;
    public final c92 g;
    public final s82_0 h;
    public final v82_0 i;
    public final ea2_1 j;
    public final mf1_0 k;
    public final WA l;
    public final hq_0 m;
    public final OnGAEventHandlerListener n;
    public final uh2_0 o;
    public final ma_2 p;
    public final hd2_0 q;
    public final bf3_1 r;
    public final Kq0 s;
    public final Av t;
    public final a92 u;
    public final LiveData v;
    public final mu1_1 w;
    public final Function0 x;
    public final hy0_0 y;
    public final boolean z;

    static {
        yh2$a yh2$a;
        Companion = yh2$a = new Object();
    }

    public yh2_1() {
        throw null;
    }

    public yh2_1(sj2_0 sj2_02, yi2_1 yi2_12, zi2_1 zi2_12, t82_0 t82_02, cq1_2 cq1_22, q82_0 q82_02, c92 c922, s82_0 s82_02, v82_0 v82_02, ea2_1 ea2_12, mf1_0 mf1_02, WA wA, hq_0 hq_02, OnGAEventHandlerListener onGAEventHandlerListener, uh2_0 uh2_02, ma_2 ma_22, hd2_0 hd2_02, bf3_1 bf3_12, Kq0 kq0, Av av2, a92 a922, LiveData liveData, mu1_1 mu1_12) {
        boolean bl2;
        JSONObject jSONObject;
        Object object;
        block3: {
            HashMap hashMap;
            block2: {
                boolean bl3;
                object = this;
                jSONObject = sj2_02;
                Object object2 = yi2_12;
                hashMap = zi2_12;
                Object object3 = t82_02;
                Object object4 = cq1_22;
                Object object5 = c922;
                object = hd2_02;
                Intrinsics.checkNotNullParameter(sj2_02, "pdpuiDelegateListener");
                Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
                Intrinsics.checkNotNullParameter(zi2_12, "pdpInfoSetter");
                Intrinsics.checkNotNullParameter(t82_02, "onPromotionClickListener");
                Intrinsics.checkNotNullParameter(cq1_22, "moreProductOfferCallback");
                Intrinsics.checkNotNullParameter(q82_02, "onColorClickListener");
                Intrinsics.checkNotNullParameter(c922, "onSizeClickListener");
                Intrinsics.checkNotNullParameter(s82_02, "onProductClickListener");
                Intrinsics.checkNotNullParameter(v82_02, "onCrossSellClickListener");
                Intrinsics.checkNotNullParameter(ea2_12, "productDetailListener");
                Intrinsics.checkNotNullParameter(mf1_02, "luxeFooterClickListener");
                Intrinsics.checkNotNullParameter(wA, "onBrandDescClickListener");
                Intrinsics.checkNotNullParameter(hq_02, "onAssuredGiftClickListener");
                Intrinsics.checkNotNullParameter(uh2_02, "referralWidgetInfo");
                Intrinsics.checkNotNullParameter(ma_22, "ajioVideoPlayer");
                Intrinsics.checkNotNullParameter(hd2_02, "rateReviewClickListener");
                Intrinsics.checkNotNullParameter(bf3_12, "stylishIdeasCallback");
                Intrinsics.checkNotNullParameter(kq0, "discoverBrandCallback");
                object = this;
                this.a = sj2_02;
                this.b = yi2_12;
                this.c = zi2_12;
                this.d = t82_02;
                this.e = cq1_22;
                this.f = q82_02;
                this.g = c922;
                this.h = s82_02;
                this.i = v82_02;
                this.j = ea2_12;
                this.k = mf1_02;
                this.l = wA;
                this.m = hq_02;
                jSONObject = onGAEventHandlerListener;
                this.n = onGAEventHandlerListener;
                this.o = uh2_02;
                jSONObject = ma_22;
                this.p = ma_22;
                this.q = hd2_02;
                jSONObject = bf3_12;
                hashMap = kq0;
                this.r = bf3_12;
                this.s = kq0;
                jSONObject = av2;
                this.t = av2;
                jSONObject = a922;
                this.u = a922;
                jSONObject = liveData;
                this.v = liveData;
                jSONObject = mu1_12;
                this.w = mu1_12;
                this.x = null;
                this.y = null;
                jSONObject = yi2_12.o5();
                hashMap = ld3_2.STORE_AJIOGRAM.getStoreId();
                this.z = bl3 = Intrinsics.areEqual(jSONObject, hashMap);
                this.A = hashMap = new HashMap();
                this.B = bl2 = true;
                cp_1.Companion.getClass();
                object3 = cp$a.e();
                boolean bl4 = yi2_12.S5();
                object4 = bl4;
                boolean bl5 = yi2_12.c9();
                object5 = yi2_12.a4();
                object3.getClass();
                jSONObject = ((HashMap)cp_1.u((Boolean)object4, bl5, (String)object5, bl3)).entrySet();
                object3 = "<get-entries>(...)";
                Intrinsics.checkNotNullExpressionValue(jSONObject, (String)object3);
                jSONObject = CollectionsKt.k0((Iterable)jSONObject);
                this.D = jSONObject;
                jSONObject = yi2_12.A8();
                this.E = jSONObject;
                jSONObject = od3_2.a();
                object2 = ld3_2.STORE_AJIO.getStoreId();
                bl3 = jSONObject.equals(object2);
                if (!bl3) break block2;
                jSONObject = h40_0.a;
                jSONObject = h40_0.d();
                bl3 = jSONObject.optBoolean((String)(object2 = "isPdpEnabled"));
                if (bl3) break block3;
            }
            bl2 = false;
            hashMap = null;
        }
        ((yh2_1)object).F = bl2;
        jSONObject = new JSONObject((yh2_1)object);
        ((yh2_1)object).G = jSONObject;
        ((yh2_1)object).H = jSONObject = new JSONObject();
    }

    public final void C(Product product, String string2) {
        s82_0 s82_02 = this.h;
        if (s82_02 != null) {
            s82_02.Y0(product, string2, false);
        }
    }

    public final void R4(Product product, String string2) {
        s82_0 s82_02 = this.h;
        if (s82_02 != null) {
            s82_02.x4(product, string2, false);
        }
    }

    public final void S6(String object, int n3, Product product, String string2, SaleGAData saleGAData, String string3) {
        object = this.h;
        if (object != null) {
            string2 = "Similar Products";
            object.F(product, n3, string2);
        }
    }

    public final Integer g(int n3) {
        Integer n4 = n3;
        return (Integer)this.H.get(n4);
    }

    public final int getItemCount() {
        return this.D.size();
    }

    public final int getItemViewType(int n3) {
        Object object = ((Map.Entry)this.D.get(n3)).getKey();
        Intrinsics.checkNotNullExpressionValue(object, "<get-key>(...)");
        object = (String)object;
        Locale locale = Locale.ROOT;
        String string2 = "toUpperCase(...)";
        String string3 = "HEADER MODEL";
        boolean bl2 = xh2_0.b(object, locale, string2, string3);
        if (bl2) {
            n3 = 1;
        } else {
            string3 = "PRICE BRAND MODEL";
            bl2 = xh2_0.b(object, locale, string2, string3);
            int n4 = 2;
            if (bl2) {
                n3 = 2;
            } else {
                string3 = "OFFER MODEL";
                bl2 = xh2_0.b(object, locale, string2, string3);
                if (bl2) {
                    n3 = 3;
                } else {
                    string3 = "RETURN MODEL";
                    bl2 = xh2_0.b(object, locale, string2, string3);
                    if (bl2) {
                        n3 = 4;
                    } else {
                        string3 = "PRICE REVEAL MODEL";
                        bl2 = xh2_0.b(object, locale, string2, string3);
                        if (bl2) {
                            n3 = 5;
                        } else {
                            string3 = "LUXE_SIZE_SELECTION_CONTAINER";
                            bl2 = xh2_0.b(object, locale, string2, string3);
                            if (bl2) {
                                n3 = 6;
                            } else {
                                string3 = "BANK_OFFERS";
                                bl2 = xh2_0.b(object, locale, string2, string3);
                                if (bl2) {
                                    n3 = 7;
                                } else {
                                    string3 = "STYLING_IDEAS";
                                    bl2 = xh2_0.b(object, locale, string2, string3);
                                    if (bl2) {
                                        n3 = 8;
                                    } else {
                                        string3 = "DISCOVER_BRANDS";
                                        bl2 = xh2_0.b(object, locale, string2, string3);
                                        if (bl2) {
                                            n3 = 9;
                                        } else {
                                            string3 = "TRUST MARKER IMAGE MODEL";
                                            bl2 = xh2_0.b(object, locale, string2, string3);
                                            if (bl2) {
                                                n3 = 10;
                                            } else {
                                                string3 = "TRUST_MARKER";
                                                bl2 = xh2_0.b(object, locale, string2, string3);
                                                if (bl2) {
                                                    n3 = 11;
                                                } else {
                                                    string3 = "COLOR MODEL";
                                                    bl2 = xh2_0.b(object, locale, string2, string3);
                                                    if (bl2) {
                                                        n3 = 12;
                                                    } else {
                                                        string3 = "SIZE MODEL";
                                                        bl2 = xh2_0.b(object, locale, string2, string3);
                                                        if (bl2) {
                                                            n3 = 13;
                                                        } else {
                                                            string3 = "RATING AND REVIEW MODEL";
                                                            bl2 = xh2_0.b(object, locale, string2, string3);
                                                            if (bl2) {
                                                                n3 = 14;
                                                            } else {
                                                                string3 = "CUSTOMER_PHOTOS";
                                                                bl2 = xh2_0.b(object, locale, string2, string3);
                                                                if (bl2) {
                                                                    n3 = 15;
                                                                } else {
                                                                    string3 = "CUSTOMER_REVIEWS";
                                                                    bl2 = xh2_0.b(object, locale, string2, string3);
                                                                    if (bl2) {
                                                                        n3 = 16;
                                                                    } else {
                                                                        string3 = "EDD MODEL";
                                                                        bl2 = xh2_0.b(object, locale, string2, string3);
                                                                        if (bl2) {
                                                                            n3 = 17;
                                                                        } else {
                                                                            string3 = "BANK_OFFERS_EDD";
                                                                            bl2 = xh2_0.b(object, locale, string2, string3);
                                                                            if (bl2) {
                                                                                n3 = 18;
                                                                            } else {
                                                                                string3 = "LUXE_PROMO_OFFER";
                                                                                bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                if (bl2) {
                                                                                    n3 = 19;
                                                                                } else {
                                                                                    string3 = "PDP_NEW_PRODUCT_DETAILS";
                                                                                    bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                    if (bl2) {
                                                                                        n3 = 20;
                                                                                    } else {
                                                                                        string3 = "INFO MODEL";
                                                                                        bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                        if (bl2) {
                                                                                            n3 = 21;
                                                                                        } else {
                                                                                            string3 = "TRUST MARKER IMAGE MODEL NEW";
                                                                                            bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                            if (bl2) {
                                                                                                n3 = 22;
                                                                                            } else {
                                                                                                string3 = "PRICE_DETAIL_VIEW_MODEL";
                                                                                                bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                if (bl2) {
                                                                                                    n3 = 23;
                                                                                                } else {
                                                                                                    string3 = "SHOPPING ASSISTANT MODEL";
                                                                                                    bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                    if (bl2) {
                                                                                                        n3 = 24;
                                                                                                    } else {
                                                                                                        string3 = "PRICE_ERROR_MODEL";
                                                                                                        bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                        if (bl2) {
                                                                                                            n3 = 25;
                                                                                                        } else {
                                                                                                            string3 = "FOOTER MODEL";
                                                                                                            bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                            if (bl2) {
                                                                                                                n3 = 26;
                                                                                                            } else {
                                                                                                                string3 = "REFERRAL_MODEL";
                                                                                                                bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                if (bl2) {
                                                                                                                    n3 = 27;
                                                                                                                } else {
                                                                                                                    string3 = "BRAND_DESC_MODEL";
                                                                                                                    bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                    if (bl2) {
                                                                                                                        n3 = 28;
                                                                                                                    } else {
                                                                                                                        string3 = "RV MODEL";
                                                                                                                        bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                        if (bl2) {
                                                                                                                            n3 = 29;
                                                                                                                        } else {
                                                                                                                            string3 = "CROSS CELL WIDGET";
                                                                                                                            bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                            if (bl2) {
                                                                                                                                n3 = 30;
                                                                                                                            } else {
                                                                                                                                string3 = "LUXE_BOTTOM_LINKS";
                                                                                                                                bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                                if (bl2) {
                                                                                                                                    n3 = 32;
                                                                                                                                } else {
                                                                                                                                    string3 = "LUXE_FOOTER_LINKS";
                                                                                                                                    bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                                    if (bl2) {
                                                                                                                                        n3 = 33;
                                                                                                                                    } else {
                                                                                                                                        string3 = "PDP_KNOW_THE_PRODUCT";
                                                                                                                                        bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                                        if (bl2) {
                                                                                                                                            n3 = 34;
                                                                                                                                        } else {
                                                                                                                                            string3 = "PDP_MORE_INFORMATION";
                                                                                                                                            bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                                            if (bl2) {
                                                                                                                                                n3 = 35;
                                                                                                                                            } else {
                                                                                                                                                string3 = "DRESS_TOOL";
                                                                                                                                                bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                                                if (bl2) {
                                                                                                                                                    n3 = 36;
                                                                                                                                                } else {
                                                                                                                                                    string3 = "AJIOGRAM_PRODUCT_WIDGET";
                                                                                                                                                    bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                                                    if (bl2) {
                                                                                                                                                        n3 = 37;
                                                                                                                                                    } else {
                                                                                                                                                        string3 = "SIMILAR_VIEW_MODEL_TITLE";
                                                                                                                                                        bl2 = xh2_0.b(object, locale, string2, string3);
                                                                                                                                                        if (bl2) {
                                                                                                                                                            n3 = 311;
                                                                                                                                                        } else {
                                                                                                                                                            String string4;
                                                                                                                                                            string3 = null;
                                                                                                                                                            String string5 = "SIMILAR_VIEW_MODEL_PRODUCT";
                                                                                                                                                            bl2 = StringsKt.F(object, string5, false);
                                                                                                                                                            n3 = bl2 ? ((n3 %= n4) == 0 ? 313 : 312) : ((n3 = (int)(xh2_0.b(object, locale, string2, string4 = "LUXE_BACK_TO_TOP") ? 1 : 0)) != 0 ? 40 : -1);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return n3;
    }

    public final boolean h() {
        Object object = this.b;
        String string2 = object.f8();
        int n3 = ((ArrayList)(object = object.M4(string2))).size();
        return n3 > 0;
    }

    public final void h9(Product product, String string2) {
    }

    public final boolean i() {
        int n3;
        int n4;
        Object object = this.b;
        object.f8();
        List list = object.c5().getFeatureData();
        boolean bl2 = true;
        if (list != null && (n4 = list.size()) > 0) {
            return bl2;
        }
        object.f8();
        list = object.n9().getFeatureData();
        if (list != null && (n4 = list.size()) > 0) {
            return bl2;
        }
        object.f8();
        object = object.U8().getFeatureData();
        if (object != null && (n3 = object.size()) > 0) {
            return bl2;
        }
        return false;
    }

    public final boolean j() {
        int n3;
        block2: {
            block3: {
                Object object = h40_0.a;
                int n4 = h40_0.s1();
                n3 = 1;
                if (n4 == 0 || (n4 = og1_1.c()) != 0) break block2;
                object = this.b;
                ArrayList arrayList = object.Y4();
                if (arrayList == null) break block3;
                object = object.Y4();
                Intrinsics.checkNotNull(object);
                n4 = ((ArrayList)object).size();
                if (n4 > n3) break block2;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public final void k() {
        int n3;
        SimilarProductWishlistDataHolder similarProductWishlistDataHolder;
        Object object = this.C;
        if (object != null) {
            similarProductWishlistDataHolder = this.b.j1();
            n3 = similarProductWishlistDataHolder != null ? similarProductWishlistDataHolder.getViewHolderPos() : -1;
            ((zi2_2)object).w(n3);
        }
        object = this.D;
        int n4 = object.size();
        n3 = 0;
        similarProductWishlistDataHolder = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object2 = ((Map.Entry)this.D.get(i3)).getKey();
            Intrinsics.checkNotNullExpressionValue(object2, "<get-key>(...)");
            object2 = (String)object2;
            String string2 = "SIMILAR_VIEW_MODEL_PRODUCT";
            boolean bl2 = kotlin.text.b.s(object2, string2, false);
            if (!bl2) continue;
            this.notifyItemChanged(i3);
        }
    }

    public final void n0() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        ViewPager2 viewPager2;
        ViewTreeObserver viewTreeObserver;
        RelativeLayout relativeLayout;
        Product product;
        m02 m022;
        ViewPager2 viewPager22;
        ViewPager2 viewPager23;
        ViewPager2 viewPager24;
        yi2_1 yi2_12;
        ArrayList arrayList;
        int n4;
        int n7;
        int n8;
        Object object;
        int n10;
        Object object2;
        block185: {
            void var9_98;
            int n14;
            block186: {
                block183: {
                    Iterator iterator;
                    int n15;
                    block187: {
                        String string2;
                        yi2_1 yi2_13;
                        String string3;
                        boolean bl2;
                        float f5;
                        float f6;
                        int n16;
                        yh2_1 yh2_12;
                        block188: {
                            void var9_130;
                            int n17;
                            void var21_298;
                            void var21_295;
                            TextView textView;
                            String string4;
                            String string5;
                            CharSequence charSequence;
                            Product product2;
                            Ref$BooleanRef ref$BooleanRef;
                            block190: {
                                String string6;
                                block189: {
                                    int n18;
                                    Object object3;
                                    boolean bl3;
                                    block184: {
                                        ArrayList arrayList2;
                                        h02_0 h02_02;
                                        DynamicCirclePageIndicator dynamicCirclePageIndicator;
                                        ViewPager2 viewPager25;
                                        LinearLayout linearLayout;
                                        int n19;
                                        yh2_12 = this;
                                        object2 = recyclerView$B;
                                        n10 = n3;
                                        n16 = 10;
                                        f6 = 1.4E-44f;
                                        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
                                        Integer n20 = this.getItemViewType(n3);
                                        Integer n21 = n3;
                                        object = this.H;
                                        ((HashMap)object).put(n20, n21);
                                        n8 = recyclerView$B instanceof M41;
                                        n7 = 0;
                                        Object var9_95 = null;
                                        n15 = 8;
                                        f5 = 1.1E-44f;
                                        n14 = -1;
                                        bl2 = false;
                                        string3 = null;
                                        n4 = 1;
                                        yi2_13 = this.b;
                                        if (n8 == 0) break block184;
                                        n10 = (int)(yi2_13.c9() ? 1 : 0);
                                        if (n10 == 0) {
                                            object2 = (M41)recyclerView$B;
                                            SpotLight spotLight = yi2_13.P();
                                            ArrayList arrayList3 = yi2_13.E2();
                                            yi2_13.T4();
                                            ((M41)object2).y(spotLight, arrayList3);
                                            return;
                                        }
                                        object2 = (M41)recyclerView$B;
                                        arrayList = yi2_13.E2();
                                        if (arrayList == null) {
                                            ViewPager2 viewPager26 = ((M41)object2).e;
                                            if (viewPager26 != null) {
                                                viewPager26.setAdapter(null);
                                            }
                                            ((M41)object2).B = null;
                                            return;
                                        }
                                        View view = ((M41)object2).j;
                                        if (view != null) {
                                            n19 = ((M41)object2).E;
                                            ConstraintLayout$LayoutParams constraintLayout$LayoutParams = new ConstraintLayout$LayoutParams(n14, n19);
                                            view.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
                                        }
                                        RecyclerView recyclerView = ((M41)object2).i;
                                        if (recyclerView != null) {
                                            recyclerView.setVisibility(n15);
                                        }
                                        if ((linearLayout = ((M41)object2).k) != null) {
                                            linearLayout.setVisibility(n15);
                                        }
                                        if ((viewPager25 = ((M41)object2).e) != null) {
                                            viewPager25.setVisibility(0);
                                        }
                                        if ((dynamicCirclePageIndicator = ((M41)object2).g) != null) {
                                            dynamicCirclePageIndicator.setVisibility(0);
                                        }
                                        tr2_2 tr2_22 = tr2_2.a;
                                        yi2_12 = ((M41)object2).c;
                                        n8 = tr2_2.t(yi2_12.c9());
                                        String string7 = "pdpSaleLayoutLuxe";
                                        if (n8 != 0 && (n8 = yi2_12.S5()) != 0) {
                                            void var8_19;
                                            void var23_340;
                                            int n22;
                                            AppCompatImageView appCompatImageView;
                                            void var8_16;
                                            void var8_13;
                                            View view2 = ((M41)object2).x;
                                            if (view2 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string7);
                                                n8 = 0;
                                                Object var8_12 = null;
                                            }
                                            var8_13.setVisibility(0);
                                            AjioTextView ajioTextView = ((M41)object2).y;
                                            if (ajioTextView == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("pdpSaleTvLuxe");
                                                n8 = 0;
                                                Object var8_15 = null;
                                            }
                                            String string8 = tr2_2.d().o;
                                            var8_16.setText((CharSequence)string8);
                                            AppCompatImageView appCompatImageView2 = ((M41)object2).z;
                                            String string9 = "pdpSaleImageLuxe";
                                            if (appCompatImageView2 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string9);
                                                n8 = 0;
                                                Object var8_18 = null;
                                            }
                                            if ((appCompatImageView = ((M41)object2).z) == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string9);
                                                n22 = 0;
                                                Object var23_339 = null;
                                            }
                                            Context context = var23_340.getContext();
                                            int n24 = R$string.acc_pdp_sales_banner;
                                            String string10 = context.getString(n24);
                                            var8_19.setContentDescription((CharSequence)string10);
                                            da$a da$a = new da$a();
                                            da$a.k = n4;
                                            da$a.r = n4;
                                            n22 = R$string.acc_banner;
                                            String string11 = hv3_0.K(n22);
                                            da$a.b(string11);
                                            String string12 = tr2_2.d().q;
                                            AppCompatImageView appCompatImageView3 = ((M41)object2).z;
                                            if (appCompatImageView3 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string9);
                                                n24 = 0;
                                                appCompatImageView3 = null;
                                            }
                                            da$a.n = string12;
                                            da$a.u = appCompatImageView3;
                                            da$a.a();
                                        } else {
                                            void var8_23;
                                            View view3 = ((M41)object2).x;
                                            if (view3 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string7);
                                                n8 = 0;
                                                Object var8_22 = null;
                                            }
                                            var8_23.setVisibility(n15);
                                        }
                                        ((M41)object2).z();
                                        ViewPager2 viewPager27 = ((M41)object2).e;
                                        if (viewPager27 != null) {
                                            ao0_0 ao0_02 = ((M41)object2).H;
                                            String string13 = "pdp_view_pager_page_offset";
                                            n19 = ao0_02.g(string13);
                                            viewPager27.setOffscreenPageLimit(n19);
                                        }
                                        if ((h02_02 = ((M41)object2).B) == null) {
                                            h02_0 h02_03;
                                            Fragment fragment = yi2_12.o1();
                                            ((M41)object2).B = h02_03 = new h02_0(yi2_12, fragment, arrayList, null);
                                            ViewPager2 viewPager28 = ((M41)object2).e;
                                            if (viewPager28 != null) {
                                                viewPager28.setAdapter(h02_03);
                                            }
                                        } else {
                                            ViewPager2 viewPager29;
                                            void var8_33;
                                            ViewPager2 viewPager210;
                                            h02_0 h02_04;
                                            ArrayList arrayList4;
                                            h02_0 h02_05;
                                            ArrayList arrayList5;
                                            ArrayList arrayList6 = new ArrayList();
                                            arrayList6.addAll(arrayList);
                                            h02_0 h02_06 = ((M41)object2).B;
                                            if (h02_06 != null && (arrayList5 = h02_06.k) != null) {
                                                arrayList5.clear();
                                            }
                                            if ((h02_05 = ((M41)object2).B) != null && (arrayList4 = h02_05.k) != null) {
                                                arrayList4.addAll(arrayList6);
                                            }
                                            if ((h02_04 = ((M41)object2).B) != null) {
                                                h02_04.notifyDataSetChanged();
                                            }
                                            if ((viewPager210 = ((M41)object2).e) != null) {
                                                RecyclerView$f recyclerView$f = viewPager210.getAdapter();
                                            } else {
                                                n8 = 0;
                                                Object var8_32 = null;
                                            }
                                            if (var8_33 == null && (viewPager29 = ((M41)object2).e) != null) {
                                                h02_0 h02_07 = ((M41)object2).B;
                                                viewPager29.setAdapter(h02_07);
                                            }
                                        }
                                        ((M41)object2).x();
                                        n8 = (int)(yi2_12.S5() ? 1 : 0);
                                        if (n8 == 0) {
                                            LinearLayout linearLayout2 = ((M41)object2).f;
                                            if (linearLayout2 != null) {
                                                linearLayout2.setVisibility(0);
                                            }
                                        } else {
                                            LinearLayout linearLayout3 = ((M41)object2).f;
                                            if (linearLayout3 != null) {
                                                linearLayout3.setVisibility(n15);
                                            }
                                        }
                                        h40_0 h40_02 = h40_0.a;
                                        n8 = (int)(h40_0.W0() ? 1 : 0);
                                        if (n8 != 0) {
                                            LinearLayout linearLayout4;
                                            hv3_0 hv3_02 = hv3_0.a;
                                            Product product3 = yi2_12.x5();
                                            hv3_02.getClass();
                                            n8 = (int)(hv3_0.V(product3) ? 1 : 0);
                                            if (n8 != 0 && (linearLayout4 = ((M41)object2).f) != null) {
                                                linearLayout4.setVisibility(n15);
                                            }
                                        }
                                        if ((arrayList2 = yi2_12.E2()) != null && (n8 = arrayList2.size()) == 0) break block185;
                                        ArrayList arrayList7 = yi2_12.E2();
                                        if (arrayList7 == null) break block186;
                                        iterator = arrayList7.iterator();
                                        n7 = 0;
                                        Object var9_96 = null;
                                        break block187;
                                    }
                                    n8 = recyclerView$B instanceof yy2_1;
                                    if (n8 != 0) {
                                        void var9_107;
                                        void var20_205;
                                        object2 = (yy2_1)recyclerView$B;
                                        Product product4 = yi2_13.x5();
                                        if (product4 != null) {
                                            String string14 = product4.getBrandName();
                                        } else {
                                            n10 = 0;
                                            Object var20_204 = null;
                                            float f7 = 0.0f;
                                        }
                                        Product product5 = yi2_13.x5();
                                        if (product5 != null) {
                                            String string15 = product5.getName();
                                        }
                                        Price price = yi2_13.D7();
                                        Price price2 = yi2_13.H8();
                                        object = yi2_13.x5();
                                        if ((object == null || (object = ((Product)object).getCatalogName()) == null) && (object = yi2_13.x5()) != null) {
                                            ((Product)object).getCatalog();
                                        }
                                        ((yy2_1)object2).y((String)var20_205, (String)var9_107, price, price2);
                                        return;
                                    }
                                    n8 = recyclerView$B instanceof m62_0;
                                    string2 = "parentView";
                                    if (n8 != 0) {
                                        boolean bl4;
                                        void var9_111;
                                        void var8_70;
                                        void var8_62;
                                        object2 = (m62_0)recyclerView$B;
                                        ArrayList arrayList8 = yi2_13.F7();
                                        n16 = (int)(yi2_13.m2() ? 1 : 0);
                                        View view = ((m62_0)object2).f;
                                        if (view == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                                            n8 = 0;
                                            Object var8_61 = null;
                                        }
                                        n14 = R$id.all_offer_container;
                                        View view4 = var8_62.findViewById(n14);
                                        Object object4 = ((m62_0)object2).f;
                                        if (object4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                                            n14 = 0;
                                            object4 = null;
                                        }
                                        int n25 = R$id.coupon_container;
                                        object4 = object4.findViewById(n25);
                                        h40_0 h40_03 = h40_0.a;
                                        n25 = (int)(h40_0.x1() ? 1 : 0);
                                        yi2_1 yi2_14 = ((m62_0)object2).b;
                                        if (n25 != 0 && (n25 = (int)(yi2_14.c9() ? 1 : 0)) == 0 && (n25 = (int)(((m62_0)object2).i ? 1 : 0)) == 0) {
                                            void var9_109;
                                            void var19_181;
                                            BankOffer bankOffer;
                                            void var20_209;
                                            view4.setVisibility(0);
                                            object4.setVisibility(n15);
                                            View view5 = ((m62_0)object2).f;
                                            if (view5 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                                n10 = 0;
                                                Object var20_208 = null;
                                                float f8 = 0.0f;
                                            }
                                            n16 = R$id.all_offers_rv;
                                            RecyclerView recyclerView = (RecyclerView)var20_209.findViewById(n16);
                                            Bundle bundle = new Bundle();
                                            object = ((m62_0)object2).g;
                                            object4 = ((NewCustomEventsRevamp)object).getPRODUCT_ID();
                                            String string16 = yi2_14.l6();
                                            bundle.putString((String)object4, string16);
                                            object = ((NewCustomEventsRevamp)object).getPRODUCT_NAME();
                                            object4 = yi2_14.x5();
                                            if (object4 != null) {
                                                object4 = ((Product)object4).getName();
                                            } else {
                                                n14 = 0;
                                                object4 = null;
                                            }
                                            bundle.putString((String)object, (String)object4);
                                            object = new ArrayList();
                                            object4 = yi2_14.F7();
                                            n25 = (int)(yi2_14.I8() ? 1 : 0);
                                            if ((n25 != 0 || (n25 = (int)(h40_0.B1() ? 1 : 0)) != 0 || (n25 = (int)(h40_0.A1() ? 1 : 0)) != 0) && (bankOffer = yi2_14.N9()) != null) {
                                                ArrayList arrayList9 = bankOffer.getAllBankOffer();
                                            } else {
                                                n25 = 0;
                                                Object var19_178 = null;
                                            }
                                            Object object5 = z40_0.Companion;
                                            object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a;
                                            String string17 = "offers_merge_order_configiration_key";
                                            int n26 = ((ao0_0)object5).g(string17);
                                            if (n26 == n4) {
                                                if (object4 != null && (n4 = (int)(object4.isEmpty() ? 1 : 0)) == 0) {
                                                    AllOfferMerge allOfferMerge = new AllOfferMerge((ArrayList)object4, null);
                                                    ((ArrayList)object).add(allOfferMerge);
                                                    ((m62_0)object2).x(bundle);
                                                }
                                                if (var19_181 != null && (n14 = (int)(var19_181.isEmpty() ? 1 : 0)) == 0) {
                                                    object4 = new AllOfferMerge(null, (ArrayList)var19_181);
                                                    ((ArrayList)object).add(object4);
                                                    ((m62_0)object2).w(bundle);
                                                }
                                            } else {
                                                AllOfferMerge allOfferMerge;
                                                if (var19_181 != null && (n4 = (int)(var19_181.isEmpty() ? 1 : 0)) == 0) {
                                                    allOfferMerge = new AllOfferMerge(null, (ArrayList)var19_181);
                                                    ((ArrayList)object).add(allOfferMerge);
                                                    ((m62_0)object2).w(bundle);
                                                }
                                                if (object4 != null && (n4 = (int)(object4.isEmpty() ? 1 : 0)) == 0) {
                                                    allOfferMerge = new AllOfferMerge((ArrayList)object4, null);
                                                    ((ArrayList)object).add(allOfferMerge);
                                                    ((m62_0)object2).x(bundle);
                                                }
                                            }
                                            cq1_2 cq1_22 = ((m62_0)object2).d;
                                            object4 = ((m62_0)object2).c;
                                            kd_0 kd_02 = new kd_0((ArrayList)object, cq1_22, (t82_0)object4, yi2_14);
                                            object2 = ((m62_0)object2).f;
                                            if (object2 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                            } else {
                                                Object object6 = object2;
                                            }
                                            object2 = var9_109.getContext();
                                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)object2, 0, false);
                                            recyclerView.setLayoutManager(linearLayoutManager);
                                            recyclerView.setAdapter(kd_02);
                                            return;
                                        }
                                        object4.setVisibility(0);
                                        view4.setVisibility(n15);
                                        View view6 = ((m62_0)object2).f;
                                        if (view6 == null) {
                                            return;
                                        }
                                        n8 = yi2_14.c9();
                                        if (n8 != 0) {
                                            return;
                                        }
                                        ArrayList<ProductPromotion> arrayList10 = new ArrayList<ProductPromotion>();
                                        View view7 = ((m62_0)object2).f;
                                        if (view7 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                                            n8 = 0;
                                            Object var8_69 = null;
                                        }
                                        n14 = R$id.pdp_more_offers;
                                        AjioTextView ajioTextView = (AjioTextView)var8_70.findViewById(n14);
                                        object4 = ((m62_0)object2).f;
                                        if (object4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        } else {
                                            View view8 = object4;
                                        }
                                        n14 = R$id.pdp_offer_view;
                                        View view9 = var9_111.findViewById(n14);
                                        object4 = "findViewById(...)";
                                        Intrinsics.checkNotNullExpressionValue(view9, (String)object4);
                                        n25 = R$id.promo_offer_rv;
                                        View view10 = view9.findViewById(n25);
                                        Intrinsics.checkNotNullExpressionValue(view10, (String)object4);
                                        RecyclerView recyclerView = (RecyclerView)view10;
                                        recyclerView.setPadding(0, 0, 0, 0);
                                        if (arrayList8 != null && (n14 = arrayList8.size()) > 0) {
                                            ProductPromotion productPromotion = (ProductPromotion)arrayList8.get(0);
                                            arrayList10.clear();
                                            arrayList10.add(productPromotion);
                                        } else {
                                            view9.setVisibility(n15);
                                            if (ajioTextView != null) {
                                                ajioTextView.setVisibility(n15);
                                            }
                                        }
                                        if (arrayList8 != null && (n7 = arrayList8.size()) > n4) {
                                            if (ajioTextView != null) {
                                                ajioTextView.setVisibility(0);
                                            }
                                            if (ajioTextView != null) {
                                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                                n7 = R$string.more_pdp_offer;
                                                String string18 = hv3_0.K(n7);
                                                n10 = arrayList8.size() - n4;
                                                Integer n27 = n10;
                                                object4 = new Object[n4];
                                                object4[0] = n27;
                                                String string19 = "format(...)";
                                                n40_0.a((Object[])object4, n4, string18, string19, ajioTextView);
                                            }
                                            if (ajioTextView != null) {
                                                ajioTextView.setOnClickListener((View.OnClickListener)object2);
                                            }
                                        } else if (ajioTextView != null) {
                                            ajioTextView.setVisibility(n15);
                                        }
                                        if ((n10 = arrayList10.size()) <= 0 && n16 == 0) {
                                            recyclerView.setVisibility(n15);
                                        } else {
                                            double d2;
                                            h32 h322;
                                            Object object7;
                                            Object object8;
                                            boolean bl5;
                                            Product product6 = yi2_14.x5();
                                            if (product6 != null && (n10 = (int)(product6.isBundleOfferAvailable() ? 1 : 0)) == n4) {
                                                ProductPromotion productPromotion;
                                                int n28 = 1023;
                                                bl5 = false;
                                                Object var36_386 = null;
                                                Object var37_389 = null;
                                                object8 = null;
                                                boolean bl6 = false;
                                                Object var40_398 = null;
                                                boolean bl7 = false;
                                                object7 = productPromotion;
                                                productPromotion = new ProductPromotion(null, null, null, null, null, 0.0f, null, null, null, null, n28, null);
                                                productPromotion.setTitle("Shop<br>the Look");
                                                n16 = R$string.pdp_bundleoffer_description;
                                                String string20 = hv3_0.K(n16);
                                                productPromotion.setDescription(string20);
                                                arrayList10.add(productPromotion);
                                            }
                                            recyclerView.setVisibility(0);
                                            Context context = recyclerView.getContext();
                                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
                                            recyclerView.setLayoutManager(linearLayoutManager);
                                            object7 = yi2_14.Aa();
                                            bl5 = yi2_14.c9();
                                            t82_0 t82_02 = ((m62_0)object2).c;
                                            yi2_1 yi2_15 = ((m62_0)object2).b;
                                            object2 = ((m62_0)object2).e;
                                            h32 h323 = h322;
                                            yi2_1 yi2_16 = yi2_15;
                                            object8 = object2;
                                            h322 = new h32(t82_02, arrayList10, (zi2_1)object7, bl5, yi2_15, (sj2_0)object2);
                                            object2 = yi2_14.la();
                                            Intrinsics.checkNotNull(object2);
                                            h322.j = d2 = ((Double)object2).doubleValue();
                                            object2 = yi2_14.x5();
                                            if (object2 != null) {
                                                ((Product)object2).getCode();
                                            }
                                            h322.G(n4 != 0);
                                            object2 = z40_0.Companion;
                                            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
                                            String string21 = "android_plp_offer";
                                            h322.k = bl4 = ((ao0_0)object2).a(string21);
                                            recyclerView.setAdapter(h322);
                                        }
                                        bl4 = yi2_14.u7();
                                        if (!bl4) return;
                                        if (ajioTextView == null) return;
                                        ajioTextView.setVisibility(n15);
                                        return;
                                    }
                                    n8 = recyclerView$B instanceof vi2_1;
                                    if (n8 == 0) break block188;
                                    object2 = (vi2_1)recyclerView$B;
                                    View view = ((vi2_1)object2).d;
                                    if (view == null) {
                                        return;
                                    }
                                    String string22 = "";
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)string22);
                                    ref$BooleanRef = new Ref$BooleanRef();
                                    yi2_1 yi2_17 = ((vi2_1)object2).b;
                                    product2 = yi2_17.x5();
                                    string6 = "click here";
                                    int n29 = 6;
                                    if (product2 != null && !(bl3 = TextUtils.isEmpty((CharSequence)(charSequence = product2.getReturnContent())))) {
                                        ref$BooleanRef.element = n4;
                                        object3 = product2.getReturnContent();
                                        charSequence = product2.getReturnTitle();
                                        bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                                        if (!bl3) {
                                            String string23 = hv3_0.f(product2.getReturnTitle()).toString();
                                            charSequence = new StringBuilder();
                                            ((StringBuilder)charSequence).append((String)object3);
                                            ((StringBuilder)charSequence).append(" ");
                                            ((StringBuilder)charSequence).append(string23);
                                            object3 = hv3_0.f(((StringBuilder)charSequence).toString()).toString();
                                            n29 = StringsKt.O((CharSequence)object3, string23, 0, false, n29);
                                            n14 = string23.length() + n29;
                                            int n30 = n29;
                                            n29 = n14;
                                            n14 = n30;
                                        } else {
                                            n29 = -1;
                                        }
                                    } else {
                                        Spanned spanned = hv3_0.f(hv3_0.K(R$string.returns_info_pdp));
                                        object3 = spanned.toString();
                                        n14 = StringsKt.O((CharSequence)object3, string6, 0, false, n29);
                                        n29 = n14 + 10;
                                    }
                                    charSequence = new SpannableStringBuilder((CharSequence)object3);
                                    cp$a cp$a = cp_1.Companion;
                                    boolean bl8 = km_1.b(cp$a);
                                    string5 = "returnInfoTv";
                                    string4 = "noReturnInfoTv";
                                    if (bl8) break block189;
                                    if (n14 < 0 || n29 < 0) break block190;
                                    if (object3 != null) {
                                        n18 = ((String)object3).length();
                                    } else {
                                        n18 = 0;
                                        string6 = null;
                                    }
                                    if (n14 >= n18) break block190;
                                    if (object3 != null) {
                                        n4 = ((String)object3).length();
                                    } else {
                                        n4 = 0;
                                        object3 = null;
                                    }
                                    if (n29 <= n4 && n14 <= n29) {
                                        void var9_120;
                                        object3 = new ui2_1((vi2_1)object2, ref$BooleanRef, product2);
                                        n18 = 18;
                                        charSequence.setSpan(object3, n14, n29, n18);
                                        object3 = ((vi2_1)object2).e;
                                        if (object3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                                            n4 = 0;
                                            object3 = null;
                                        }
                                        MovementMethod movementMethod = LinkMovementMethod.getInstance();
                                        object3.setMovementMethod(movementMethod);
                                        TextView textView2 = ((vi2_1)object2).f;
                                        if (textView2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                                            n7 = 0;
                                            Object var9_119 = null;
                                        }
                                        object3 = LinkMovementMethod.getInstance();
                                        var9_120.setMovementMethod((MovementMethod)object3);
                                        object3 = FontsManager.getInstance();
                                        object = ((vi2_1)object2).d;
                                        if (object == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                                            n15 = 0;
                                            f5 = 0.0f;
                                            object = null;
                                        }
                                        object = object.getContext();
                                        Typeface typeface = ((FontsManager)object3).getTypefaceWithFont((Context)object, n16);
                                        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string22, typeface);
                                        charSequence.setSpan((Object)ajioCustomTypefaceSpan, n14, n29, n18);
                                        n16 = (int)(yi2_17.c9() ? 1 : 0);
                                        if (n16 != 0) {
                                            UnderlineSpan underlineSpan = new UnderlineSpan();
                                            charSequence.setSpan((Object)underlineSpan, n14, n29, n18);
                                            String string24 = ((Object)charSequence.subSequence(n14, n29)).toString().toUpperCase();
                                            String string25 = "toUpperCase(...)";
                                            Intrinsics.checkNotNullExpressionValue(string24, string25);
                                        }
                                    }
                                    break block190;
                                }
                                String string26 = charSequence.toString();
                                Intrinsics.checkNotNullExpressionValue(string26, "toString(...)");
                                n8 = R$string.acc_visit_link_below;
                                String string27 = hv3_0.K(n8);
                                String string28 = kotlin.text.b.n(string26, string6, string27, false);
                                charSequence = new SpannableStringBuilder((CharSequence)string28);
                            }
                            if ((textView = ((vi2_1)object2).e) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                                n16 = 0;
                                f6 = 0.0f;
                                Object var21_294 = null;
                            }
                            var21_295.setText(charSequence);
                            TextView textView3 = ((vi2_1)object2).e;
                            if (textView3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                                n16 = 0;
                                f6 = 0.0f;
                                Object var21_297 = null;
                            }
                            var21_298.setContentDescription(charSequence);
                            cp_1 cp_12 = cp$a.e();
                            cp_12.getClass();
                            n16 = cp_1.f();
                            String string29 = "accClickHere";
                            if (n16 != 0) {
                                void var21_309;
                                void var21_306;
                                void var21_302;
                                LinearLayout linearLayout = ((vi2_1)object2).i;
                                String string30 = "returnsContainer";
                                if (linearLayout == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string30);
                                    n16 = 0;
                                    f6 = 0.0f;
                                    Object var21_301 = null;
                                }
                                Resources resources = var21_302.getResources();
                                n15 = R$dimen.dp25;
                                f6 = resources.getDimension(n15);
                                n16 = (int)f6;
                                object = ((vi2_1)object2).i;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string30);
                                    n15 = 0;
                                    f5 = 0.0f;
                                    object = null;
                                }
                                object.setPadding(n16, n16, n16, 0);
                                TextView textView4 = ((vi2_1)object2).h;
                                if (textView4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string29);
                                    n16 = 0;
                                    f6 = 0.0f;
                                    Object var21_305 = null;
                                }
                                ai0_2.B((View)var21_306);
                                TextView textView5 = ((vi2_1)object2).h;
                                if (textView5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string29);
                                    n16 = 0;
                                    f6 = 0.0f;
                                    Object var21_308 = null;
                                }
                                ti2_1 ti2_12 = new ti2_1((vi2_1)object2, ref$BooleanRef, product2);
                                var21_309.setOnClickListener((View.OnClickListener)ti2_12);
                            } else {
                                void var21_312;
                                TextView textView6 = ((vi2_1)object2).h;
                                if (textView6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string29);
                                    n16 = 0;
                                    f6 = 0.0f;
                                    Object var21_311 = null;
                                }
                                ai0_2.i((View)var21_312);
                            }
                            if (product2 != null && (n16 = product2.isReturnable()) == 0 && (n10 = (int)(ref$BooleanRef.element ? 1 : 0)) != 0) {
                                void var9_127;
                                void var20_230;
                                void var20_227;
                                void var20_224;
                                float f11;
                                TextView textView7 = ((vi2_1)object2).f;
                                if (textView7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                                    n10 = 0;
                                    f11 = 0.0f;
                                    Object var20_223 = null;
                                }
                                var20_224.setText(charSequence);
                                TextView textView8 = ((vi2_1)object2).f;
                                if (textView8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                                    n10 = 0;
                                    f11 = 0.0f;
                                    Object var20_226 = null;
                                }
                                var20_227.setVisibility(0);
                                TextView textView9 = ((vi2_1)object2).e;
                                if (textView9 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                                    n10 = 0;
                                    f11 = 0.0f;
                                    Object var20_229 = null;
                                }
                                n16 = 8;
                                f6 = 1.1E-44f;
                                var20_230.setVisibility(n16);
                                object2 = ((vi2_1)object2).f;
                                if (object2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                                    n7 = 0;
                                    Object var9_125 = null;
                                } else {
                                    Object object9 = object2;
                                }
                                var9_127.setContentDescription(charSequence);
                                return;
                            }
                            object2 = ((vi2_1)object2).f;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                                n17 = 8;
                                n7 = 0;
                                Object var9_128 = null;
                            } else {
                                Object object10 = object2;
                                n17 = 8;
                            }
                            var9_130.setVisibility(n17);
                            return;
                        }
                        n16 = recyclerView$B instanceof ri2_1;
                        if (n16 != 0) {
                            object2 = (ri2_1)recyclerView$B;
                            n10 = yi2_13.I6();
                            yi2_13.X1();
                            ((ri2_1)object2).y(n10);
                            return;
                        }
                        n16 = recyclerView$B instanceof gi2_2;
                        if (n16 != 0) {
                            object2 = (gi2_2)recyclerView$B;
                            ((gi2_2)object2).w();
                            return;
                        }
                        n16 = recyclerView$B instanceof ph2_2;
                        if (n16 != 0) {
                            object2 = (ph2_2)recyclerView$B;
                            ((ph2_2)object2).w();
                            return;
                        }
                        n8 = recyclerView$B instanceof ui2_2;
                        if (n8 != 0) {
                            object2 = (ui2_2)recyclerView$B;
                            ArrayList arrayList11 = yi2_13.z1();
                            ((ui2_2)object2).w(arrayList11);
                            return;
                        }
                        n8 = recyclerView$B instanceof rj2_1;
                        if (n8 != 0) {
                            object2 = (rj2_1)recyclerView$B;
                            String string31 = yi2_13.O5();
                            object2 = ((rj2_1)object2).b;
                            if (object2 == null) return;
                            object2.setText((CharSequence)string31);
                            return;
                        }
                        n8 = recyclerView$B instanceof ji2_1;
                        if (n8 != 0) {
                            object2 = (ji2_1)recyclerView$B;
                            ((ji2_1)object2).x();
                            return;
                        }
                        n8 = recyclerView$B instanceof yh2_0;
                        if (n8 != 0) {
                            object2 = (yh2_0)recyclerView$B;
                            ArrayList arrayList12 = yi2_13.Y4();
                            String string32 = yi2_13.ka();
                            String string33 = yi2_13.K9();
                            ((yh2_0)object2).w(string32, string33, arrayList12);
                            return;
                        }
                        n8 = recyclerView$B instanceof ij2_2;
                        if (n8 != 0) {
                            O63 o63;
                            View view;
                            object2 = (ij2_2)recyclerView$B;
                            View view11 = ((ij2_2)object2).f;
                            if (view11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                view = null;
                            } else {
                                view = view11;
                            }
                            zi2_1 zi2_12 = ((ij2_2)object2).e;
                            yi2_1 yi2_18 = ((ij2_2)object2).b;
                            c92 c922 = ((ij2_2)object2).c;
                            object = ((ij2_2)object2).d;
                            O63 o632 = o63;
                            yi2_1 yi2_19 = yi2_18;
                            Object object11 = c922;
                            o63 = new O63(yi2_18, c922, (sj2_0)object, zi2_12, view, null, false, null);
                            AJIOApplication.Companion.getClass();
                            AJIOApplication aJIOApplication = AJIOApplication$a.a();
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)aJIOApplication, 0, false);
                            object2 = ((ij2_2)object2).b;
                            object11 = object2.i2();
                            int n32 = 16;
                            boolean bl9 = true;
                            view = null;
                            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                            O63.p(o63, linearLayoutManager, (ArrayList)object11, false, bl9, false, n32);
                            Product product7 = object2.x5();
                            object2 = object2.K4();
                            o63.l(product7, (ProductUserSizeRecomResponse)object2);
                            NewCustomEventsRevamp newCustomEventsRevamp = o63.Q;
                            String string34 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTIONS();
                            boolean bl10 = false;
                            Object var30_373 = null;
                            boolean bl11 = false;
                            Object var33_382 = null;
                            object = "select size view";
                            String string35 = "";
                            string3 = "event_size_guide_interactions";
                            String string36 = "pdp screen";
                            String string37 = o63.R;
                            boolean bl12 = false;
                            Object var23_348 = null;
                            boolean bl13 = false;
                            Object var26_356 = null;
                            String string38 = o63.S;
                            int n34 = 1728;
                            boolean bl14 = false;
                            o632 = null;
                            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string34, (String)object, string35, string3, string36, string37, null, null, string38, false, null, n34, null);
                            return;
                        }
                        n8 = recyclerView$B instanceof pi2_2;
                        if (n8 != 0) {
                            object2 = (pi2_2)recyclerView$B;
                            EddResult eddResult = yi2_13.V4();
                            ((pi2_2)object2).A(eddResult);
                            return;
                        }
                        if (n16 != 0) {
                            object2 = (ph2_2)recyclerView$B;
                            ((ph2_2)object2).w();
                            return;
                        }
                        n16 = recyclerView$B instanceof lg1_2;
                        if (n16 != 0) {
                            object2 = (lg1_2)recyclerView$B;
                            ArrayList arrayList13 = yi2_13.F7();
                            n16 = (int)(yi2_13.m2() ? 1 : 0);
                            ((lg1_2)object2).w(arrayList13, n16 != 0);
                            return;
                        }
                        n16 = recyclerView$B instanceof si2_0;
                        if (n16 != 0) {
                            object2 = (si2_0)recyclerView$B;
                            String string39 = yi2_13.f8();
                            ArrayList arrayList14 = yi2_13.M4(string39);
                            ((si2_0)object2).x(arrayList14);
                            return;
                        }
                        n16 = recyclerView$B instanceof qh2_1;
                        if (n16 != 0) {
                            object2 = (qh2_1)recyclerView$B;
                            yi2_13.f8();
                            SectionData sectionData = yi2_13.c5();
                            yi2_13.f8();
                            SectionData sectionData2 = yi2_13.n9();
                            yi2_13.f8();
                            SectionData sectionData3 = yi2_13.U8();
                            yi2_13.p8();
                            ((qh2_1)object2).z(sectionData, sectionData2, sectionData3);
                            return;
                        }
                        n16 = recyclerView$B instanceof xi2_2;
                        if (n16 != 0) {
                            object2 = (xi2_2)recyclerView$B;
                            String string40 = yi2_13.f8();
                            ArrayList arrayList15 = yi2_13.M4(string40);
                            ArrayList arrayList16 = yi2_13.p8();
                            ((xi2_2)object2).x(arrayList15, arrayList16);
                            return;
                        }
                        n16 = recyclerView$B instanceof vi2_2;
                        if (n16 != 0) {
                            object2 = (vi2_2)recyclerView$B;
                            String string41 = yi2_13.U2();
                            ((vi2_2)object2).setData(string41);
                            return;
                        }
                        n16 = recyclerView$B instanceof li2_1;
                        if (n16 != 0) {
                            object2 = (li2_1)recyclerView$B;
                            gc3_2 gc3_22 = yi2_13.z7();
                            String string42 = yi2_13.f8();
                            ArrayList arrayList17 = yi2_13.H3(string42);
                            String string43 = yi2_13.f8();
                            String string44 = yi2_13.x7();
                            ((li2_1)object2).w((Context)gc3_22, arrayList17, string43, string44);
                            return;
                        }
                        n16 = recyclerView$B instanceof j43_0;
                        if (n16 != 0) return;
                        n16 = recyclerView$B instanceof vh2_1;
                        if (n16 != 0) {
                            new ArrayList();
                            ArrayList<String> arrayList18 = new ArrayList<String>();
                            arrayList18.add("AssuredGift");
                            String string45 = "InviteFlow";
                            arrayList18.add(string45);
                            RecyclerView$B recyclerView$B2 = recyclerView$B;
                            vh2_1 vh2_12 = (vh2_1)recyclerView$B;
                            f5 = yi2_13.u3();
                            bl2 = this.z;
                            uh2_0 uh2_02 = this.o;
                            hq_0 hq_02 = this.m;
                            vh2_12.x(uh2_02, arrayList18, f5, hq_02, bl2);
                            return;
                        }
                        n16 = recyclerView$B instanceof wh2_1;
                        if (n16 != 0) {
                            object2 = (wh2_1)recyclerView$B;
                            float f12 = yi2_13.u3();
                            wg2_1 wg2_12 = this.o.c;
                            ((wh2_1)object2).w(f12, wg2_12);
                            return;
                        }
                        n16 = recyclerView$B instanceof sh2_2;
                        if (n16 != 0) {
                            object2 = (sh2_2)recyclerView$B;
                            ((sh2_2)object2).w();
                            return;
                        }
                        n16 = recyclerView$B instanceof wf1_1;
                        if (n16 != 0) {
                            object2 = (wf1_1)recyclerView$B;
                            ((wf1_1)object2).w();
                            return;
                        }
                        n16 = recyclerView$B instanceof fi2_2;
                        if (n16 != 0) {
                            void var9_138;
                            void var8_92;
                            void var8_88;
                            object2 = (fi2_2)recyclerView$B;
                            ArrayList arrayList19 = yi2_13.K();
                            mf1_0 mf1_02 = ((fi2_2)object2).b;
                            uf1_1 uf1_12 = new uf1_1(arrayList19, mf1_02);
                            RecyclerView recyclerView = ((fi2_2)object2).c;
                            String string46 = "recyclerView";
                            if (recyclerView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string46);
                                n8 = 0;
                                Object var8_87 = null;
                            }
                            Context context = var8_88.getContext();
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, n4, false);
                            RecyclerView recyclerView2 = ((fi2_2)object2).c;
                            if (recyclerView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string46);
                                n8 = 0;
                                Object var8_91 = null;
                            }
                            var8_92.setLayoutManager(linearLayoutManager);
                            object2 = ((fi2_2)object2).c;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string46);
                                n7 = 0;
                                Object var9_136 = null;
                            } else {
                                Object object12 = object2;
                            }
                            var9_138.setAdapter(uf1_12);
                            return;
                        }
                        n16 = recyclerView$B instanceof id2_0;
                        if (n16 != 0) {
                            object2 = (id2_0)recyclerView$B;
                            ((id2_0)object2).w(yi2_13);
                            return;
                        }
                        n16 = recyclerView$B instanceof vh0;
                        if (n16 != 0) {
                            object2 = (vh0)recyclerView$B;
                            rz3_0.Companion.getClass();
                            ArrayList arrayList20 = Rz3$a.e(yi2_13);
                            Function0 function0 = this.x;
                            ((vh0)object2).w(yi2_13, arrayList20, function0);
                            return;
                        }
                        n16 = recyclerView$B instanceof bo2_0;
                        if (n16 != 0) {
                            RatingsResponse ratingsResponse;
                            object2 = (bo2_0)recyclerView$B;
                            RatingsResponse ratingsResponse2 = yi2_13.R6();
                            if (ratingsResponse2 != null) {
                                ratingsResponse2.getReviewIdChanged();
                            }
                            if ((ratingsResponse = yi2_13.R6()) != null) {
                                ratingsResponse.isFromLoginFlow();
                            }
                            ((bo2_0)object2).w();
                            return;
                        }
                        n16 = recyclerView$B instanceof hi2_2;
                        if (n16 != 0) {
                            object2 = (hi2_2)recyclerView$B;
                            ArrayList arrayList21 = yi2_13.p8();
                            ((hi2_2)object2).x(arrayList21);
                            return;
                        }
                        n16 = recyclerView$B instanceof oi2_1;
                        if (n16 != 0) {
                            object2 = (oi2_1)recyclerView$B;
                            String string47 = yi2_13.oa();
                            ((oi2_1)object2).setData(string47);
                            return;
                        }
                        n16 = recyclerView$B instanceof ih2_1;
                        if (n16 != 0) {
                            object2 = (ih2_1)recyclerView$B;
                            ArrayList arrayList22 = yi2_13.aa();
                            ((ih2_1)object2).y(arrayList22);
                            return;
                        }
                        n16 = recyclerView$B instanceof ni2_2;
                        if (n16 != 0) {
                            object2 = (ni2_2)recyclerView$B;
                            String string48 = yi2_13.p7();
                            ((ni2_2)object2).setData(string48);
                            return;
                        }
                        n16 = recyclerView$B instanceof si2_1;
                        if (n16 != 0) {
                            n10 = (int)(yi2_13.c9() ? 1 : 0);
                            if (n10 != 0) {
                                void var9_141;
                                RecyclerView$B recyclerView$B3 = recyclerView$B;
                                si2_1 si2_12 = (si2_1)recyclerView$B;
                                Product product8 = yi2_13.x5();
                                if (product8 != null) {
                                    String string49 = product8.getCode();
                                } else {
                                    n7 = 0;
                                    Object var9_140 = null;
                                }
                                n16 = (int)(yi2_13.d4((String)var9_141) ? 1 : 0);
                                si2_12.A(n16 != 0);
                            } else {
                                void var9_144;
                                RecyclerView$B recyclerView$B4 = recyclerView$B;
                                si2_1 si2_13 = (si2_1)recyclerView$B;
                                Product product9 = yi2_13.x5();
                                if (product9 != null) {
                                    String string50 = product9.getCode();
                                } else {
                                    n7 = 0;
                                    Object var9_143 = null;
                                }
                                n16 = (int)(yi2_13.d4((String)var9_144) ? 1 : 0);
                                si2_13.z(n16 != 0);
                            }
                            object2 = (si2_1)object2;
                            ((si2_1)object2).y();
                            return;
                        }
                        n16 = recyclerView$B instanceof xi2_1;
                        if (n16 != 0) {
                            object2 = (xi2_1)recyclerView$B;
                            ArrayList arrayList23 = yi2_13.W5();
                            ArrayList arrayList24 = yi2_13.Ba();
                            ((xi2_1)object2).x(arrayList23, arrayList24);
                            return;
                        }
                        n16 = recyclerView$B instanceof ai2_2;
                        if (n16 != 0) {
                            n10 = (int)(yi2_13.B9() ? 1 : 0);
                            if (n10 == 0) {
                                object2 = (ai2_2)recyclerView$B;
                                ArrayList arrayList25 = yi2_13.R2();
                                ArrayList arrayList26 = yi2_13.F1();
                                ((ai2_2)object2).y(arrayList25, arrayList26);
                                return;
                            }
                            object2 = (ai2_2)recyclerView$B;
                            SimilarProductWishlistDataHolder similarProductWishlistDataHolder = yi2_13.j1();
                            if (similarProductWishlistDataHolder != null) {
                                n14 = similarProductWishlistDataHolder.getViewHolderPos();
                            }
                            ((ai2_2)object2).w(n14);
                            return;
                        }
                        n16 = recyclerView$B instanceof qj2_0;
                        if (n16 != 0) {
                            object2 = (qj2_0)recyclerView$B;
                            n10 = ((qj2_0)object2).g;
                            ((qj2_0)object2).x(n10);
                            return;
                        }
                        n16 = recyclerView$B instanceof li2_2;
                        if (n16 != 0) {
                            object2 = (li2_2)recyclerView$B;
                            ((li2_2)object2).F();
                            ((li2_2)object2).C();
                            return;
                        }
                        n16 = recyclerView$B instanceof b32;
                        if (n16 != 0) {
                            HashMap hashMap = this.A;
                            n8 = hashMap.isEmpty() ^ n4;
                            if (n8 != 0) {
                                object2 = (b32)recyclerView$B;
                                n8 = n3 + 1;
                                Integer n35 = n8;
                                Product product10 = (Product)hashMap.get(n35);
                                b32.B((b32)object2, n3, product10);
                                return;
                            }
                            object2 = (b32)recyclerView$B;
                            ((b32)object2).C();
                            return;
                        }
                        n10 = recyclerView$B instanceof zi2_2;
                        if (n10 != 0) {
                            n10 = (int)(yi2_13.B9() ? 1 : 0);
                            if (n10 != 0) {
                                object2 = (zi2_2)recyclerView$B;
                                SimilarProductWishlistDataHolder similarProductWishlistDataHolder = yi2_13.j1();
                                if (similarProductWishlistDataHolder != null) {
                                    n14 = similarProductWishlistDataHolder.getViewHolderPos();
                                }
                                ((zi2_2)object2).w(n14);
                                return;
                            }
                            this.C = object2 = (zi2_2)recyclerView$B;
                            ArrayList arrayList27 = yi2_13.A5();
                            if (arrayList27 != null && (n10 = arrayList27.isEmpty() ^ n4) == n4) {
                                ArrayList arrayList28 = yi2_13.A5();
                                ArrayList arrayList29 = yi2_13.g3();
                                ((zi2_2)object2).x(arrayList28, arrayList29);
                                this.B = n4;
                                return;
                            }
                            n10 = (int)(yh2_12.B ? 1 : 0);
                            if (n10 == 0) return;
                            h40_0 h40_04 = h40_0.a;
                            String string51 = yi2_13.o5();
                            n10 = (int)(h40_0.t2(string51) ? 1 : 0);
                            if (n10 == 0) return;
                            n10 = 0;
                            float f14 = 0.0f;
                            Object var20_266 = null;
                            ((zi2_2)object2).x(null, null);
                            yh2_12.B = false;
                            return;
                        }
                        n10 = recyclerView$B instanceof aj2_2;
                        if (n10 != 0) {
                            object2 = (aj2_2)recyclerView$B;
                            ((aj2_2)object2).w();
                            return;
                        }
                        n10 = recyclerView$B instanceof ci2_2;
                        if (n10 != 0) {
                            object2 = (ci2_2)recyclerView$B;
                            ArrayList arrayList30 = this.E;
                            ma_2 ma_22 = this.p;
                            ((ci2_2)object2).w(arrayList30, ma_22);
                            return;
                        }
                        n10 = recyclerView$B instanceof lh2_2;
                        if (n10 != 0) {
                            object2 = (lh2_2)recyclerView$B;
                            ((lh2_2)object2).w();
                            return;
                        }
                        n10 = recyclerView$B instanceof yg_1;
                        if (n10 == 0) return;
                        object2 = (yg_1)recyclerView$B;
                        Component component = yi2_13.Q();
                        n16 = yg_1.r;
                        n16 = 0;
                        f6 = 0.0f;
                        Object var21_335 = null;
                        ((yg_1)object2).x(component, null, null);
                        return;
                    }
                    while ((n15 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        Boolean bl15;
                        object = ((ProductImage)iterator.next()).getFlagForImageAndVideo();
                        n15 = (int)(Intrinsics.areEqual(object, bl15 = Boolean.TRUE) ? 1 : 0);
                        if (n15 == 0) {
                            n7 += n4;
                            continue;
                        }
                        break block183;
                    }
                    n7 = -1;
                }
                Integer n36 = n7;
            }
            if (var9_98 != null && (n8 = var9_98.intValue()) != n14) {
                ((M41)object2).T = n8 = var9_98.intValue();
                ((M41)object2).A(n4 != 0);
            } else {
                ((M41)object2).A(false);
            }
        }
        if ((viewPager24 = ((M41)object2).e) != null && (n8 = (int)(viewPager24.e() ? 1 : 0)) == n4 && (viewPager23 = ((M41)object2).e) != null) {
            viewPager23.b();
        }
        if ((viewPager22 = ((M41)object2).e) != null) {
            J41 j41 = new J41(object2, 0);
            viewPager22.post(j41);
        }
        if ((n8 = yi2_12.Q2()) != 0) {
            ((M41)object2).U = n8 = yi2_12.Q2();
            ViewPager2 viewPager211 = ((M41)object2).e;
            if (viewPager211 != null) {
                n7 = yi2_12.Q2();
                viewPager211.setCurrentItem(n7);
            }
        }
        if ((m022 = ((M41)object2).C) == null) {
            DynamicCirclePageIndicator dynamicCirclePageIndicator;
            DynamicCirclePageIndicator dynamicCirclePageIndicator2;
            DynamicCirclePageIndicator dynamicCirclePageIndicator3;
            ViewPager2 viewPager212;
            m02 m023;
            m02 m024;
            ViewPager2 viewPager213 = ((M41)object2).e;
            object = ((M41)object2).b;
            ((M41)object2).C = m024 = new m02(yi2_12, viewPager213, (sj2_0)object, (th2_1)object2);
            ViewPager2 viewPager214 = ((M41)object2).e;
            if (viewPager214 != null) {
                Intrinsics.checkNotNull(m024);
                ArrayList arrayList31 = viewPager214.c.a;
                arrayList31.remove(m024);
            }
            if ((m023 = ((M41)object2).C) != null && (viewPager212 = ((M41)object2).e) != null) {
                Intrinsics.checkNotNull(m023);
                viewPager212.f(m023);
            }
            if ((dynamicCirclePageIndicator3 = ((M41)object2).g) != null) {
                n7 = arrayList.size();
                dynamicCirclePageIndicator3.setPageCount(n7);
            }
            if ((dynamicCirclePageIndicator2 = ((M41)object2).g) != null) {
                dynamicCirclePageIndicator2.setPageType(arrayList);
            }
            if ((dynamicCirclePageIndicator = ((M41)object2).g) != null) {
                dynamicCirclePageIndicator.setCurrentPageIndexChange(0);
            }
            if ((n10 = yi2_12.Q2()) != 0) {
                DynamicCirclePageIndicator dynamicCirclePageIndicator4;
                ViewPager2 viewPager215 = ((M41)object2).e;
                if (viewPager215 != null) {
                    n8 = yi2_12.Q2();
                    viewPager215.setCurrentItem(n8);
                }
                if ((dynamicCirclePageIndicator4 = ((M41)object2).g) != null) {
                    n8 = yi2_12.Q2();
                    dynamicCirclePageIndicator4.setCurrentPageIndexChange(n8);
                }
            }
        }
        h40_0 h40_05 = h40_0.a;
        n10 = (int)(h40_0.W0() ? 1 : 0);
        if (n10 != 0 && (product = yi2_12.x5()) != null && (n10 = (int)(product.isComingSoonProduct() ? 1 : 0)) == n4) {
            RelativeLayout relativeLayout2;
            LinearLayout linearLayout = ((M41)object2).n;
            if (linearLayout != null) {
                ai0_2.i((View)linearLayout);
            }
            if ((relativeLayout2 = ((M41)object2).m) != null) {
                ai0_2.i((View)relativeLayout2);
            }
        }
        if ((relativeLayout = ((M41)object2).h) != null && (viewTreeObserver = relativeLayout.getViewTreeObserver()) != null) {
            K41 k41 = new K41((M41)object2);
            viewTreeObserver.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)k41);
        }
        if ((viewPager2 = ((M41)object2).e) == null) return;
        Q41 q41 = new Q41((M41)object2);
        viewPager2.f(q41);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final RecyclerView$B onCreateViewHolder(ViewGroup var1_1, int var2_2) {
        block54: {
            block94: {
                block95: {
                    block93: {
                        block92: {
                            block91: {
                                block90: {
                                    block89: {
                                        block88: {
                                            block87: {
                                                block86: {
                                                    block83: {
                                                        block84: {
                                                            block85: {
                                                                block82: {
                                                                    block81: {
                                                                        block80: {
                                                                            block79: {
                                                                                block78: {
                                                                                    block77: {
                                                                                        block74: {
                                                                                            block76: {
                                                                                                block75: {
                                                                                                    block73: {
                                                                                                        block72: {
                                                                                                            block71: {
                                                                                                                block70: {
                                                                                                                    block69: {
                                                                                                                        block68: {
                                                                                                                            block67: {
                                                                                                                                block64: {
                                                                                                                                    block66: {
                                                                                                                                        block65: {
                                                                                                                                            block63: {
                                                                                                                                                block62: {
                                                                                                                                                    block61: {
                                                                                                                                                        block60: {
                                                                                                                                                            block59: {
                                                                                                                                                                block58: {
                                                                                                                                                                    block57: {
                                                                                                                                                                        block56: {
                                                                                                                                                                            block55: {
                                                                                                                                                                                var3_3 = this;
                                                                                                                                                                                var4_4 = var1_1;
                                                                                                                                                                                var5_5 = var2_2;
                                                                                                                                                                                Intrinsics.checkNotNullParameter(var1_1, "parent");
                                                                                                                                                                                var6_6 = this.b;
                                                                                                                                                                                var7_7 = var6_6.F7();
                                                                                                                                                                                var8_8 = 1;
                                                                                                                                                                                var9_9 = 0;
                                                                                                                                                                                var10_10 = null;
                                                                                                                                                                                if (var7_7 != null && (var11_11 = var7_7.isEmpty()) == 0) {
                                                                                                                                                                                    var11_11 = 0;
                                                                                                                                                                                    var7_7 = null;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var11_11 = 1;
                                                                                                                                                                                }
                                                                                                                                                                                var11_11 ^= var8_8;
                                                                                                                                                                                var12_12 = var6_6.N9();
                                                                                                                                                                                if (var12_12 != null) {
                                                                                                                                                                                    var13_13 = true;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var13_13 = false;
                                                                                                                                                                                    var12_12 = null;
                                                                                                                                                                                }
                                                                                                                                                                                var14_14 = var6_6.j2();
                                                                                                                                                                                var15_15 = var6_6.Ba();
                                                                                                                                                                                if (var15_15 != null) {
                                                                                                                                                                                    var16_16 = var15_15.isEmpty() ^ var8_8;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var16_16 = false;
                                                                                                                                                                                    var15_15 = null;
                                                                                                                                                                                }
                                                                                                                                                                                var17_17 = var6_6.R2();
                                                                                                                                                                                if (var17_17 != null) {
                                                                                                                                                                                    var18_18 = var17_17.isEmpty() ^ var8_8;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var18_18 = false;
                                                                                                                                                                                    var17_17 = null;
                                                                                                                                                                                }
                                                                                                                                                                                var19_19 = var6_6.K();
                                                                                                                                                                                if (var19_19 != null) {
                                                                                                                                                                                    var20_20 = var19_19.isEmpty() ^ var8_8;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var20_20 = false;
                                                                                                                                                                                    var19_19 = null;
                                                                                                                                                                                }
                                                                                                                                                                                var21_21 = var3_3.c;
                                                                                                                                                                                var22_22 = var3_3.a;
                                                                                                                                                                                var23_23 = "inflate(...)";
                                                                                                                                                                                if (var5_5 != var8_8) break block55;
                                                                                                                                                                                var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                                                var25_29 = R$layout.new_row_pdp_header;
                                                                                                                                                                                var4_4 = var24_24.inflate(var25_29, (ViewGroup)var4_4, false);
                                                                                                                                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                                                var24_24 = new M41((View)var4_4, var22_22, (yi2_1)var6_6, (zi2_1)var21_21);
                                                                                                                                                                                break block54;
                                                                                                                                                                            }
                                                                                                                                                                            var25_30 = 2;
                                                                                                                                                                            if (var5_5 != var25_30) break block56;
                                                                                                                                                                            var5_5 = (int)var6_6.c9();
                                                                                                                                                                            var5_5 = var5_5 != 0 ? R$layout.pdp_price_brand_layout_luxe : R$layout.pdp_price_brand_layout;
                                                                                                                                                                            var4_4 = LayoutInflater.from((Context)var1_1.getContext()).inflate(var5_5, (ViewGroup)var4_4, false);
                                                                                                                                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                                            var26_31 = var3_3.s;
                                                                                                                                                                            var24_24 = new yy2_1((View)var4_4, (yi2_1)var6_6, var26_31);
                                                                                                                                                                            break block54;
                                                                                                                                                                        }
                                                                                                                                                                        var25_30 = 3;
                                                                                                                                                                        if (var5_5 != var25_30 || (var25_30 = (int)var6_6.c9()) != 0) break block57;
                                                                                                                                                                        if (var11_11 == 0 && !var13_13) {
                                                                                                                                                                            var26_32 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                                            var27_36 = R$layout.cart_no_view_refresh;
                                                                                                                                                                            var4_4 = var26_32.inflate(var27_36, (ViewGroup)var4_4, false);
                                                                                                                                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                                            var24_25 = new r32_0((View)var4_4);
                                                                                                                                                                            return var24_25;
                                                                                                                                                                        }
                                                                                                                                                                        var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                                        var25_30 = R$layout.pdp_offers_layout;
                                                                                                                                                                        var28_50 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                                                                                        Intrinsics.checkNotNullExpressionValue(var28_50, var23_23);
                                                                                                                                                                        var15_15 = var3_3.b;
                                                                                                                                                                        var17_17 = var3_3.d;
                                                                                                                                                                        var19_19 = var3_3.e;
                                                                                                                                                                        var21_21 = var3_3.a;
                                                                                                                                                                        var12_12 = var24_24;
                                                                                                                                                                        var24_24 = new m62_0(var28_50, (yi2_1)var15_15, (t82_0)var17_17, (cq1_2)var19_19, (sj2_0)var21_21);
                                                                                                                                                                        break block54;
                                                                                                                                                                    }
                                                                                                                                                                    var25_30 = 4;
                                                                                                                                                                    if (var5_5 != var25_30 || (var25_30 = (int)var3_3.F) != 0) break block58;
                                                                                                                                                                    var5_5 = (int)var6_6.c9();
                                                                                                                                                                    var5_5 = var5_5 != 0 ? R$layout.luxe_new_row_pdp_return : R$layout.new_row_pdp_return;
                                                                                                                                                                    var26_33 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                                    var4_4 = var26_33.inflate(var5_5, (ViewGroup)var4_4, false);
                                                                                                                                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                                    var24_24 = new vi2_1((yi2_1)var6_6, var22_22, (View)var4_4);
                                                                                                                                                                    break block54;
                                                                                                                                                                }
                                                                                                                                                                var25_30 = 5;
                                                                                                                                                                if (var5_5 != var25_30 || (var25_30 = (int)var6_6.ua()) == 0 || (var25_30 = (int)tr2_2.m()) != 0) break block59;
                                                                                                                                                                var5_5 = (int)var6_6.c9();
                                                                                                                                                                var5_5 = var5_5 != 0 ? R$layout.luxe_pdp_price_reveal_widget : R$layout.pdp_price_reveal_widget;
                                                                                                                                                                var26_34 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                                var4_4 = var26_34.inflate(var5_5, (ViewGroup)var4_4, false);
                                                                                                                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                                var24_24 = new ri2_1((yi2_1)var6_6, var22_22, (View)var4_4);
                                                                                                                                                                break block54;
                                                                                                                                                            }
                                                                                                                                                            var25_30 = 6;
                                                                                                                                                            if (var5_5 != var25_30 || (var25_30 = (int)var6_6.c9()) == 0) break block60;
                                                                                                                                                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                            var25_30 = R$layout.pdp_luxe_size_selection_container_layout;
                                                                                                                                                            var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                            var24_24 = new gi2_2((View)var4_4, (yi2_1)var6_6);
                                                                                                                                                            break block54;
                                                                                                                                                        }
                                                                                                                                                        var25_30 = 7;
                                                                                                                                                        var7_7 = var3_3.e;
                                                                                                                                                        if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0 || (var25_30 = var6_6.b3()) != var8_8 || (var25_30 = (int)var6_6.B5()) == 0) break block61;
                                                                                                                                                        var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                        var25_30 = R$layout.pdp_bank_offers_layout;
                                                                                                                                                        var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                                                                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                        var24_24 = new ph2_2((View)var4_4, (yi2_1)var6_6, (cq1_2)var7_7);
                                                                                                                                                        break block54;
                                                                                                                                                    }
                                                                                                                                                    var25_30 = 8;
                                                                                                                                                    var13_13 = var3_3.z;
                                                                                                                                                    if (var5_5 == var25_30 && (var25_30 = (int)var6_6.u7()) == 0 && var13_13) {
                                                                                                                                                        var26_35 = var6_6.N6();
                                                                                                                                                        if (var26_35 != null) {
                                                                                                                                                            var26_35 = var26_35.getComponents();
                                                                                                                                                        } else {
                                                                                                                                                            var25_30 = 0;
                                                                                                                                                            var26_35 = null;
                                                                                                                                                        }
                                                                                                                                                        var26_35 = (Collection)var26_35;
                                                                                                                                                        if (var26_35 != null && (var25_30 = (int)var26_35.isEmpty()) == 0) {
                                                                                                                                                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                            var25_30 = R$layout.pdp_stylish_carousel_layout;
                                                                                                                                                            var24_24 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                                                                            Intrinsics.checkNotNullExpressionValue(var24_24, var23_23);
                                                                                                                                                            var4_4 = eb_2.b();
                                                                                                                                                            var4_4 = var4_4 != null ? var4_4.a() : null;
                                                                                                                                                            var6_6.R8((Boolean)var4_4);
                                                                                                                                                            var4_4 = var6_6.N6();
                                                                                                                                                            if (var4_4 != null) {
                                                                                                                                                                var26_35 = new ArrayList();
                                                                                                                                                                if (var6_6 != null && (var6_6 = var6_6.N6()) != null && (var6_6 = var6_6.getComponents()) != null) {
                                                                                                                                                                    var6_6 = var6_6.iterator();
                                                                                                                                                                    while ((var11_11 = var6_6.hasNext()) != 0) {
                                                                                                                                                                        var7_7 = (PostsResponse$Component)var6_6.next();
                                                                                                                                                                        if (var7_7 != null) {
                                                                                                                                                                            var29_54 = var7_7.getSubcomponent();
                                                                                                                                                                        } else {
                                                                                                                                                                            var8_8 = 0;
                                                                                                                                                                            var29_54 = null;
                                                                                                                                                                        }
                                                                                                                                                                        if ((var29_54 = (Collection)var29_54) == null || (var8_8 = (int)var29_54.isEmpty()) != 0) continue;
                                                                                                                                                                        var26_35.add(var7_7);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                var4_4.setComponents((List)var26_35);
                                                                                                                                                                var4_4 = Unit.a;
                                                                                                                                                            }
                                                                                                                                                            var7_7 = var3_3.r;
                                                                                                                                                            var26_35 = var3_3.b;
                                                                                                                                                            var6_6 = var3_3.p;
                                                                                                                                                            var4_4 = var10_10;
                                                                                                                                                            var29_54 = this;
                                                                                                                                                            var10_10 = new qj2_0((View)var24_24, (yi2_1)var26_35, (ma_2)var6_6, (bf3_1)var7_7, this);
lbl164:
                                                                                                                                                            // 2 sources

                                                                                                                                                            while (true) {
                                                                                                                                                                var24_24 = var10_10;
                                                                                                                                                                break block54;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (var5_5 == (var25_30 = 9) && (var25_30 = (int)var6_6.u7()) == 0 && var13_13) {
                                                                                                                                                        var26_35 = var6_6.P4();
                                                                                                                                                        if (var26_35 != null) {
                                                                                                                                                            var26_35 = var26_35.getBrand();
                                                                                                                                                        } else {
                                                                                                                                                            var25_30 = 0;
                                                                                                                                                            var26_35 = null;
                                                                                                                                                        }
                                                                                                                                                        if (var26_35 != null) {
                                                                                                                                                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                            var25_30 = R$layout.pdp_discover_brands_parent;
                                                                                                                                                            var24_24 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                                                                            Intrinsics.checkNotNullExpressionValue(var24_24, var23_23);
                                                                                                                                                            var4_4 = eb_2.b();
                                                                                                                                                            if (var4_4 != null) {
                                                                                                                                                                var26_35 = var4_4.a();
                                                                                                                                                            } else {
                                                                                                                                                                var25_30 = 0;
                                                                                                                                                                var26_35 = null;
                                                                                                                                                            }
                                                                                                                                                            var6_6.R8((Boolean)var26_35);
                                                                                                                                                            var26_35 = var3_3.b;
                                                                                                                                                            var6_6 = var3_3.s;
                                                                                                                                                            var7_7 = var3_3.p;
                                                                                                                                                            var4_4 = var10_10;
                                                                                                                                                            var29_55 = this;
                                                                                                                                                            var10_10 = new li2_2((View)var24_24, (yi2_1)var26_35, (Kq0)var6_6, (ma_2)var7_7, this);
                                                                                                                                                            ** continue;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (var5_5 != (var25_30 = 10) || (var25_30 = (int)var6_6.u7()) != 0 || (var25_30 = (int)var6_6.Z8()) == 0) break block62;
                                                                                                                                                    var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                    var25_30 = R$layout.row_pdp_image_trust_marker;
                                                                                                                                                    var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                    var24_24 = new ui2_2((View)var4_4);
                                                                                                                                                    break block54;
                                                                                                                                                }
                                                                                                                                                var25_30 = 11;
                                                                                                                                                if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0 || (var26_35 = var6_6.O5()) == null || (var25_30 = var26_35.length()) == 0) break block63;
                                                                                                                                                var5_5 = (int)var6_6.c9();
                                                                                                                                                var5_5 = var5_5 != 0 ? R$layout.luxe_row_pdp_trust_marker : R$layout.row_pdp_trust_marker;
                                                                                                                                                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                                var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                                                                                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                                var24_24 = new rj2_1((View)var4_4);
                                                                                                                                                break block54;
                                                                                                                                            }
                                                                                                                                            var25_30 = 12;
                                                                                                                                            if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0 || (var25_30 = (int)this.j()) == 0) break block64;
                                                                                                                                            var5_5 = (int)var6_6.S5();
                                                                                                                                            var26_35 = var3_3.f;
                                                                                                                                            if (var5_5 != 0) break block65;
                                                                                                                                            var24_24 = h40_0.a;
                                                                                                                                            var5_5 = (int)h40_0.e0();
                                                                                                                                            if (var5_5 == 0 || (var5_5 = (int)Intrinsics.areEqual(var24_24 = od3_2.a(), var7_7 = ld3_2.STORE_AJIO.getStoreId())) == 0 || (var5_5 = (int)var6_6.Ia()) == 0 || (var5_5 = (int)var6_6.c9()) != 0 || (var5_5 = (int)(var24_24 = var6_6.y4()).isEmpty()) != 0) break block65;
                                                                                                                                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                            var11_11 = R$layout.new_pdp_oos_color_rv;
                                                                                                                                            var4_4 = var24_24.inflate(var11_11, (ViewGroup)var4_4, false);
                                                                                                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                            var7_7 = var6_6.y4();
                                                                                                                                            var24_24 = new ji2_1((View)var4_4, (q82_0)var26_35, (yi2_1)var6_6, (ArrayList)var7_7);
                                                                                                                                            break block54;
                                                                                                                                        }
                                                                                                                                        if ((var5_5 = (int)var6_6.Ia()) == 0 || (var5_5 = (int)var6_6.c9()) != 0) break block66;
                                                                                                                                        var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                        var27_37 = R$layout.new_pdp_color_rv;
                                                                                                                                        var4_4 = var24_24.inflate(var27_37, (ViewGroup)var4_4, false);
                                                                                                                                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                        var24_24 = new yh2_0((View)var4_4, (q82_0)var26_35);
                                                                                                                                        break block54;
                                                                                                                                    }
                                                                                                                                    var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                    var27_38 = R$layout.no_view;
                                                                                                                                    var4_4 = var26_35.inflate(var27_38, (ViewGroup)var4_4, false);
                                                                                                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                                    var24_24 = new r32_0((View)var4_4);
                                                                                                                                    return var24_24;
                                                                                                                                }
                                                                                                                                var25_30 = 13;
                                                                                                                                if (var5_5 != var25_30 || (var25_30 = (int)var6_6.j9()) == 0 || (var25_30 = (int)var6_6.c9()) != 0) break block67;
                                                                                                                                var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                                var25_30 = R$layout.new_row_pdp_size;
                                                                                                                                var28_51 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                                                Intrinsics.checkNotNullExpressionValue(var28_51, var23_23);
                                                                                                                                var21_21 = var6_6.Aa();
                                                                                                                                var19_19 = var3_3.a;
                                                                                                                                var15_15 = var3_3.b;
                                                                                                                                var17_17 = var3_3.g;
                                                                                                                                var12_12 = var24_24;
                                                                                                                                var24_24 = new ij2_2(var28_51, (yi2_1)var15_15, (c92)var17_17, (sj2_0)var19_19, (zi2_1)var21_21);
                                                                                                                                break block54;
                                                                                                                            }
                                                                                                                            var25_30 = 14;
                                                                                                                            var29_56 = var3_3.q;
                                                                                                                            if (var5_5 != var25_30) break block68;
                                                                                                                            var26_35 = h40_0.a;
                                                                                                                            var25_30 = (int)h40_0.b2();
                                                                                                                            if (var25_30 == 0 || (var25_30 = (int)var6_6.c9()) != 0 || (var25_30 = (int)Intrinsics.areEqual(var26_35 = var6_6.h2(), var10_10 = Boolean.TRUE)) == 0) break block68;
                                                                                                                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                            var25_30 = 0;
                                                                                                                            var26_35 = null;
                                                                                                                            var4_4 = PdpRatingReviewParentBinding.inflate((LayoutInflater)var24_24, (ViewGroup)var4_4, false);
                                                                                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                            var24_24 = new id2_0((PdpRatingReviewParentBinding)var4_4, (hd2_0)var29_56);
                                                                                                                            break block54;
                                                                                                                        }
                                                                                                                        if (var5_5 != (var25_30 = 15)) break block69;
                                                                                                                        var26_35 = h40_0.a;
                                                                                                                        var25_30 = (int)h40_0.b2();
                                                                                                                        if (var25_30 == 0 || (var25_30 = (int)var6_6.c9()) != 0 || (var25_30 = (int)Intrinsics.areEqual(var26_35 = var6_6.h2(), var10_10 = Boolean.TRUE)) == 0) break block69;
                                                                                                                        var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                        var25_30 = 0;
                                                                                                                        var26_35 = null;
                                                                                                                        var4_4 = EpoxyCustomerPhotosReviewsBinding.inflate((LayoutInflater)var24_24, (ViewGroup)var4_4, false);
                                                                                                                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                        var24_24 = new vh0((EpoxyCustomerPhotosReviewsBinding)var4_4, (hd2_0)var29_56);
                                                                                                                        break block54;
                                                                                                                    }
                                                                                                                    if (var5_5 != (var25_30 = 16)) break block70;
                                                                                                                    var26_35 = h40_0.a;
                                                                                                                    var25_30 = (int)h40_0.b2();
                                                                                                                    if (var25_30 == 0 || (var25_30 = (int)var6_6.c9()) != 0 || (var25_30 = (int)Intrinsics.areEqual(var26_35 = var6_6.h2(), var10_10 = Boolean.TRUE)) == 0 || (var25_30 = (int)h40_0.l2()) == 0) break block70;
                                                                                                                    var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                    var25_30 = 0;
                                                                                                                    var26_35 = null;
                                                                                                                    var4_4 = EpoxyCustomerPhotosReviewsBinding.inflate((LayoutInflater)var24_24, (ViewGroup)var4_4, false);
                                                                                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                    var24_24 = new bo2_0((EpoxyCustomerPhotosReviewsBinding)var4_4, (yi2_1)var6_6, (hd2_0)var29_56);
                                                                                                                    break block54;
                                                                                                                }
                                                                                                                if (var5_5 != (var25_30 = 17) || (var25_30 = (int)var6_6.u7()) != 0) break block71;
                                                                                                                var26_35 = h40_0.a;
                                                                                                                var25_30 = (int)h40_0.W0();
                                                                                                                if (var25_30 != 0 && (var26_35 = var6_6.x5()) != null && (var25_30 = (int)var26_35.isComingSoonProduct()) == (var8_8 = 1)) break block71;
                                                                                                                var5_5 = (int)var6_6.c9();
                                                                                                                var5_5 = var5_5 != 0 ? R$layout.edd_layout_luxe : R$layout.edd_layout_ajio;
                                                                                                                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                                var11_11 = 0;
                                                                                                                var7_7 = null;
                                                                                                                var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                                                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                                var24_24 = new pi2_2((yi2_1)var6_6, var22_22, (View)var4_4);
                                                                                                                break block54;
                                                                                                            }
                                                                                                            if (var5_5 != (var25_30 = 18) || (var25_30 = (int)var6_6.u7()) != 0) break block72;
                                                                                                            var26_35 = h40_0.a;
                                                                                                            var25_30 = (int)h40_0.x1();
                                                                                                            if (var25_30 != 0 || (var25_30 = var6_6.b3()) != (var8_8 = 2) || (var25_30 = (int)var6_6.B5()) == 0) break block72;
                                                                                                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                            var25_30 = R$layout.pdp_bank_offers_layout;
                                                                                                            var8_8 = 0;
                                                                                                            var29_56 = null;
                                                                                                            var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                            var24_24 = new ph2_2((View)var4_4, (yi2_1)var6_6, (cq1_2)var7_7);
                                                                                                            break block54;
                                                                                                        }
                                                                                                        if (var5_5 != (var25_30 = 19) || (var25_30 = (int)var6_6.u7()) != 0 || (var25_30 = (int)var6_6.c9()) == 0 || (var26_35 = var6_6.F7()) == null || (var25_30 = (int)var26_35.isEmpty()) != 0) break block73;
                                                                                                        var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                        var25_30 = R$layout.luxe_promo_offer_layout;
                                                                                                        var8_8 = 0;
                                                                                                        var29_56 = null;
                                                                                                        var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                        Intrinsics.checkNotNull(var7_7);
                                                                                                        var26_35 = var3_3.d;
                                                                                                        var24_24 = new lg1_2((cq1_2)var7_7, (t82_0)var26_35, (yi2_1)var6_6, (View)var4_4);
                                                                                                        break block54;
                                                                                                    }
                                                                                                    var25_30 = 20;
                                                                                                    var7_7 = "isEnabled";
                                                                                                    if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0) break block74;
                                                                                                    var24_24 = h40_0.a;
                                                                                                    var24_24 = h40_0.k();
                                                                                                    var5_5 = (int)var24_24.optBoolean((String)var7_7);
                                                                                                    if (var5_5 == 0 || (var5_5 = (int)this.i()) == 0) break block75;
                                                                                                    var5_5 = (int)var6_6.c9();
                                                                                                    var5_5 = var5_5 != 0 ? R$layout.luxe_new_product_detail_card : R$layout.new_better_product_detail_card;
                                                                                                    var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                    var11_11 = 0;
                                                                                                    var7_7 = null;
                                                                                                    var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                                                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                    var24_24 = new qh2_1((View)var4_4, (yi2_1)var6_6);
                                                                                                    break block54;
                                                                                                }
                                                                                                var24_24 = h40_0.k();
                                                                                                var5_5 = (int)var24_24.optBoolean((String)var7_7);
                                                                                                if (var5_5 != 0) break block76;
                                                                                                cp_1.Companion.getClass();
                                                                                                var24_24 = cp$a.c();
                                                                                                var26_35 = var6_6.x5();
                                                                                                if (var26_35 != null) {
                                                                                                    var26_35 = var26_35.getBrickCode();
                                                                                                } else {
                                                                                                    var25_30 = 0;
                                                                                                    var26_35 = null;
                                                                                                }
                                                                                                var5_5 = (int)ai0_2.d((String)var26_35, (JSONArray)var24_24);
                                                                                                if (var5_5 == 0 || (var5_5 = (int)this.h()) == 0) break block76;
                                                                                                var5_5 = (int)var6_6.c9();
                                                                                                var5_5 = var5_5 != 0 ? R$layout.luxe_new_product_detail_card : R$layout.new_product_detail_card;
                                                                                                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                                var11_11 = 0;
                                                                                                var7_7 = null;
                                                                                                var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                                var24_24 = new si2_0((View)var4_4, (yi2_1)var6_6);
                                                                                                break block54;
                                                                                            }
                                                                                            var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                            var27_39 = R$layout.no_view;
                                                                                            var4_4 = var26_35.inflate(var27_39, (ViewGroup)var4_4, false);
                                                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                            var24_24 = new r32_0((View)var4_4);
                                                                                            return var24_24;
                                                                                        }
                                                                                        var25_30 = 21;
                                                                                        if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0) break block77;
                                                                                        var26_35 = h40_0.a;
                                                                                        var26_35 = h40_0.k();
                                                                                        var25_30 = (int)var26_35.optBoolean((String)var7_7);
                                                                                        if (var25_30 != 0) break block77;
                                                                                        cp_1.Companion.getClass();
                                                                                        var26_35 = cp$a.c();
                                                                                        var29_56 = var6_6.x5();
                                                                                        if (var29_56 != null) {
                                                                                            var29_56 = var29_56.getBrickCode();
                                                                                        } else {
                                                                                            var8_8 = 0;
                                                                                            var29_56 = null;
                                                                                        }
                                                                                        var25_30 = (int)ai0_2.d((String)var29_56, (JSONArray)var26_35);
                                                                                        if (var25_30 != 0) break block77;
                                                                                        var5_5 = (int)var6_6.c9();
                                                                                        var5_5 = var5_5 != 0 ? R$layout.luxe_new_row_product_detail : R$layout.new_row_product_detail;
                                                                                        var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                        var11_11 = 0;
                                                                                        var7_7 = null;
                                                                                        var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                                                                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                        var24_24 = new xi2_2((View)var4_4, (yi2_1)var6_6);
                                                                                        break block54;
                                                                                    }
                                                                                    if (var5_5 != (var25_30 = 22) || (var25_30 = (int)var6_6.u7()) != 0 || (var25_30 = (int)var6_6.c9()) != 0 || (var25_30 = (int)var6_6.Z8()) != 0 || (var26_35 = var6_6.U2()) == null || (var25_30 = var26_35.length()) == 0) break block78;
                                                                                    var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                    var25_30 = R$layout.row_pdp_image_trust_marker_new;
                                                                                    var27_40 = false;
                                                                                    var6_6 = null;
                                                                                    var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                    var24_24 = new vi2_2((View)var4_4);
                                                                                    break block54;
                                                                                }
                                                                                var25_30 = 23;
                                                                                if (var5_5 != var25_30 || (var25_30 = (int)var6_6.N2()) == 0) break block79;
                                                                                var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                                var25_30 = R$layout.pdp_price_detail_layout;
                                                                                var27_41 = false;
                                                                                var6_6 = null;
                                                                                var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                                var24_24 = new li2_1((View)var4_4);
                                                                                break block54;
                                                                            }
                                                                            var25_30 = 24;
                                                                            var29_56 = var3_3.h;
                                                                            if (var5_5 != var25_30 || (var25_30 = (int)var6_6.c9()) == 0) break block80;
                                                                            var26_35 = h40_0.a;
                                                                            var26_35 = h40_0.A0();
                                                                            var25_30 = var26_35.length();
                                                                            if (var25_30 == 0) {
                                                                                while (true) {
                                                                                    var25_30 = 0;
                                                                                    var26_35 = null;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                if ((var26_35 = JsonParser.parseString(h40_0.A0()).getAsJsonObject()) == null || !(var30_57 = var26_35.has((String)(var10_10 = "enable")))) ** continue;
                                                                                var26_35 = var26_35.get((String)var10_10);
                                                                                var25_30 = var26_35.getAsInt();
                                                                            }
                                                                            if (var25_30 == 0 || (var25_30 = (int)var6_6.S5()) == 0) break block80;
                                                                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                            var25_30 = R$layout.shopping_assistant_luxe;
                                                                            var11_11 = 0;
                                                                            var7_7 = null;
                                                                            var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                            var24_24 = new j43_0((View)var4_4, (yi2_1)var6_6, (s82_0)var29_56);
                                                                            break block54;
                                                                        }
                                                                        if (var5_5 != (var25_30 = 25) || (var25_30 = (int)var6_6.u7()) != 0 || (var25_30 = (int)var6_6.Fa()) == 0) break block81;
                                                                        var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                        var25_30 = R$layout.pdp_price_error_layout;
                                                                        var11_11 = 0;
                                                                        var7_7 = null;
                                                                        var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                        var24_24 = new ni2_2((View)var4_4, (zi2_1)var21_21, (yi2_1)var6_6);
                                                                        break block54;
                                                                    }
                                                                    var25_30 = 26;
                                                                    if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0) break block82;
                                                                    var5_5 = (int)var6_6.c9();
                                                                    var5_5 = var5_5 != 0 ? R$layout.luxe_new_pdp_footer_layout : R$layout.new_pdp_footer_layout;
                                                                    var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                    var11_11 = 0;
                                                                    var7_7 = null;
                                                                    var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                    var24_24 = new si2_1((View)var4_4, (zi2_1)var21_21, (yi2_1)var6_6);
                                                                    break block54;
                                                                }
                                                                var25_30 = 27;
                                                                if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0) break block83;
                                                                if (!var13_13) break block84;
                                                                var5_5 = (int)og1_1.b();
                                                                if (var5_5 != 0 || (var5_5 = (int)pa_1.a()) == 0) ** GOTO lbl-1000
                                                                cp_1.Companion.getClass();
                                                                var24_24 = cp$a.q();
                                                                var26_35 = "pdp_flag";
                                                                var5_5 = (int)var24_24.has((String)var26_35);
                                                                if (var5_5 != 0 && (var5_5 = (int)(var24_24 = cp$a.q()).getBoolean((String)var26_35)) != 0) {
                                                                    var8_8 = 1;
                                                                } else lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var8_8 = 0;
                                                                    var29_56 = null;
                                                                }
                                                                var24_24 = var3_3.o;
                                                                if (var8_8 == 0 || (var25_30 = (int)var24_24.d) == 0) break block85;
                                                                var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                                                var25_30 = R$layout.home_rotating_image_layout;
                                                                var27_42 = false;
                                                                var6_6 = null;
                                                                var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                var24_24 = new vh2_1((View)var4_4);
                                                                break block54;
                                                            }
                                                            var25_30 = (int)var24_24.d;
                                                            if (var25_30 != 0) {
                                                                var25_30 = (int)var24_24.a;
                                                                var25_30 = var25_30 != 0 ? R$layout.row_referral_widget : R$layout.row_referral_widget_2;
                                                                var6_6 = LayoutInflater.from((Context)var1_1.getContext());
                                                                var11_11 = 0;
                                                                var7_7 = null;
                                                                var4_4 = var6_6.inflate(var25_30, (ViewGroup)var4_4, false);
                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                var26_35 = new wh2_1((View)var4_4, (uh2_0)var24_24);
lbl511:
                                                                // 2 sources

                                                                while (true) {
                                                                    var24_24 = var26_35;
                                                                    break block54;
                                                                    break;
                                                                }
                                                            }
                                                            var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                            var27_43 = R$layout.no_view;
                                                            var4_4 = var26_35.inflate(var27_43, (ViewGroup)var4_4, false);
                                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                            var24_24 = new r32_0((View)var4_4);
                                                            return var24_24;
                                                        }
                                                        var24_26 = var6_6.Q();
                                                        if (var24_26 != null && (var24_26 = var24_26.getBanners()) != null) {
                                                            var5_5 = (int)var24_26.isEmpty();
                                                            var25_30 = 1;
                                                            if ((var5_5 ^= var25_30) == var25_30) {
                                                                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                                var27_44 = R$layout.item_cms_banner_layout;
                                                                var4_4 = var26_35.inflate(var27_44, (ViewGroup)var4_4, false);
                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                                var26_35 = xv$a_0.PDP;
                                                                var26_35 = var3_3.t;
                                                                var24_26 = new yg_1((View)var4_4, (Av)var26_35);
                                                                return var24_26;
                                                            }
                                                        }
                                                        var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                        var27_45 = R$layout.no_view;
                                                        var4_4 = var26_35.inflate(var27_45, (ViewGroup)var4_4, false);
                                                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                        var24_26 = new r32_0((View)var4_4);
                                                        return var24_26;
                                                    }
                                                    var25_30 = 28;
                                                    if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0 || !var14_14) break block86;
                                                    var5_5 = (int)var6_6.c9();
                                                    var5_5 = var5_5 != 0 ? R$layout.luxe_pdp_brand_desc : R$layout.pdp_brand_desc;
                                                    var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                    var11_11 = 0;
                                                    var7_7 = null;
                                                    var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                                    Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                    var26_35 = var3_3.l;
                                                    var24_24 = new sh2_2((View)var4_4, (yi2_1)var6_6, (WA)var26_35);
                                                    break block54;
                                                }
                                                var25_30 = 29;
                                                if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0 || !var16_16) break block87;
                                                var5_5 = (int)var6_6.c9();
                                                var5_5 = var5_5 != 0 ? R$layout.luxe_new_row_pdp_rv : R$layout.new_row_pdp_rv;
                                                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                                var11_11 = 0;
                                                var7_7 = null;
                                                var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                                var26_35 = var3_3.y;
                                                var24_24 = new xi2_1((View)var4_4, (yi2_1)var6_6, (hy0_0)var26_35);
                                                break block54;
                                            }
                                            var25_30 = 30;
                                            if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0 || !var18_18) break block88;
                                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                                            var25_30 = R$layout.new_row_pdp_rv;
                                            var11_11 = 0;
                                            var7_7 = null;
                                            var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                            var26_35 = var3_3.i;
                                            var24_24 = new ai2_2((View)var4_4, (yi2_1)var6_6, (s82_0)var29_56, (v82_0)var26_35);
                                            break block54;
                                        }
                                        var25_30 = 311;
                                        if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0) break block89;
                                        var26_35 = h40_0.a;
                                        var25_30 = (int)h40_0.W0();
                                        if (var25_30 != 0 && (var26_35 = var6_6.x5()) != null && (var25_30 = (int)var26_35.isComingSoonProduct()) == (var8_8 = 1)) break block89;
                                        var5_5 = (int)var6_6.c9();
                                        var5_5 = var5_5 != 0 ? R$layout.luxe_new_row_similar_to_title : R$layout.new_row_similar_to_title;
                                        var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                        var11_11 = 0;
                                        var7_7 = null;
                                        var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                        var26_35 = var3_3.u;
                                        var24_24 = new aj2_2((View)var4_4, (yi2_1)var6_6, (a92)var26_35);
                                        break block54;
                                    }
                                    if (var5_5 == (var25_30 = 313)) ** GOTO lbl727
                                    var8_8 = 312;
                                    if (var5_5 != var8_8 || (var8_8 = (int)var6_6.u7()) != 0) break block90;
                                    var29_56 = h40_0.a;
                                    var8_8 = (int)h40_0.W0();
                                    if (var8_8 != 0 && (var29_56 = var6_6.x5()) != null && (var8_8 = (int)var29_56.isComingSoonProduct()) == (var9_9 = 1)) break block90;
                                    ** GOTO lbl727
                                }
                                if (var5_5 != (var25_30 = 32) || (var25_30 = (int)var6_6.u7()) != 0) break block91;
                                var5_5 = (int)var6_6.c9();
                                var5_5 = var5_5 != 0 ? R$layout.luxe_pdp_bottom_links : R$layout.pdp_bottom_links;
                                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                                var11_11 = 0;
                                var7_7 = null;
                                var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                                var24_24 = new wf1_1((View)var4_4, (yi2_1)var6_6);
                                break block54;
                            }
                            var25_30 = 33;
                            if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0 || (var25_30 = (int)var6_6.c9()) == 0 || !var20_20) break block92;
                            var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                            var25_30 = R$layout.luxe_footer_link_main_view;
                            var27_46 = false;
                            var6_6 = null;
                            var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                            Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                            var26_35 = var3_3.k;
                            var24_24 = new fi2_2((View)var4_4, (mf1_0)var26_35);
                            break block54;
                        }
                        var25_30 = 34;
                        if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0) break block93;
                        cp_1.Companion.getClass();
                        var26_35 = z40_0.Companion;
                        var26_35 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var26_35).a;
                        var29_56 = "comprehensive_brickcode_prod_details_list";
                        var26_35 = var26_35.d((String)var29_56);
                        var10_10 = "brickCode";
                        var25_30 = (int)var26_35.has((String)var10_10);
                        if (var25_30 != 0) {
                            var26_35 = z40$a.a((Context)AJIOApplication$a.a()).a.d((String)var29_56).getJSONArray((String)var10_10);
                            Intrinsics.checkNotNull(var26_35);
                        } else {
                            var26_35 = new JSONArray();
                        }
                        var29_56 = var6_6.x5();
                        if (var29_56 != null) {
                            var29_56 = var29_56.getBrickCode();
                        } else {
                            var8_8 = 0;
                            var29_56 = null;
                        }
                        var25_30 = (int)ai0_2.d((String)var29_56, (JSONArray)var26_35);
                        if (var25_30 == 0 || (var25_30 = (int)(var26_35 = cp$a.d()).getEnableKyp()) == 0 || (var25_30 = (var26_35 = var3_3.E).size()) <= 0) break block93;
                        var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                        var25_30 = R$layout.pdp_know_the_product_card;
                        var11_11 = 0;
                        var7_7 = null;
                        var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                        Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                        var24_24 = new ci2_2((View)var4_4, (yi2_1)var6_6);
                        break block54;
                    }
                    if (var5_5 != (var25_30 = 35) || (var25_30 = (int)var6_6.u7()) != 0) break block94;
                    var26_35 = h40_0.a;
                    var26_35 = h40_0.k();
                    var25_30 = (int)var26_35.optBoolean((String)var7_7);
                    if (var25_30 != 0) break block95;
                    cp_1.Companion.getClass();
                    var26_35 = cp$a.c();
                    var7_7 = var6_6.x5();
                    if (var7_7 != null) {
                        var7_7 = var7_7.getBrickCode();
                    } else {
                        var11_11 = 0;
                        var7_7 = null;
                    }
                    var25_30 = (int)ai0_2.d((String)var7_7, (JSONArray)var26_35);
                    if (var25_30 == 0) break block94;
                }
                var5_5 = (var5_5 = (int)var6_6.c9()) != 0 ? R$layout.luxe_new_product_more_information_card : R$layout.new_product_more_information_card;
                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                var11_11 = 0;
                var7_7 = null;
                var4_4 = var26_35.inflate(var5_5, (ViewGroup)var4_4, false);
                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                var24_24 = new hi2_2((View)var4_4, (yi2_1)var6_6);
                break block54;
            }
            if (var5_5 == (var25_30 = 36) && (var25_30 = (int)var6_6.u7()) == 0) {
                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                var11_11 = R$layout.new_pdp_dress_tool_banner;
                var8_8 = 0;
                var29_56 = null;
                var4_4 = var26_35.inflate(var11_11, (ViewGroup)var4_4, false);
                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                var7_7 = var3_3.n;
                var26_35 = new oi2_1((View)var4_4, (yi2_1)var6_6, (OnGAEventHandlerListener)var7_7, var5_5);
                ** continue;
            }
            var25_30 = 37;
            if (var5_5 != var25_30 || (var25_30 = (int)var6_6.u7()) != 0 || (var25_30 = (int)var6_6.M1()) == 0) ** GOTO lbl-1000
            var26_35 = h40_0.a;
            var25_30 = (int)h40_0.n1();
            if (var25_30 != 0) {
                var19_19 = h40_0.f();
                var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                var25_30 = R$layout.item_row_ajiogram_products_pdp;
                var27_47 = false;
                var6_6 = null;
                var12_12 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                Intrinsics.checkNotNullExpressionValue(var12_12, var23_23);
                var17_17 = var3_3.n;
                var28_52 = var3_3.b;
                var15_15 = var3_3.G;
                var10_10 = var24_24;
                var24_24 = new ih2_1((View)var12_12, var28_52, (zh2_0)var15_15, (OnGAEventHandlerListener)var17_17, (AjiogramInterventions)var19_19);
            } else if (var5_5 == (var25_30 = 40) && (var5_5 = (int)var6_6.c9()) != 0) {
                var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                var25_30 = R$layout.luxe_pdp_back_to_top;
                var11_11 = 0;
                var7_7 = null;
                var4_4 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                var24_24 = new lh2_2((View)var4_4, (zi2_1)var21_21);
            } else {
                var26_35 = LayoutInflater.from((Context)var1_1.getContext());
                var27_48 = R$layout.no_view;
                var4_4 = var26_35.inflate(var27_48, (ViewGroup)var4_4, false);
                Intrinsics.checkNotNullExpressionValue(var4_4, var23_23);
                var24_27 = new r32_0((View)var4_4);
                return var24_27;
lbl727:
                // 2 sources

                var11_11 = 0;
                var7_7 = null;
                var8_8 = (int)var6_6.c9();
                if (var8_8 == 0) {
                    if (var5_5 == var25_30) {
                        var24_28 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var25_30 = R$layout.plp_product_row_odd;
                        var4_4 = var24_28 /* !! */ .inflate(var25_30, (ViewGroup)var4_4, false);
                    } else {
                        var24_28 /* !! */  = LayoutInflater.from((Context)var1_1.getContext());
                        var25_30 = R$layout.plp_product_row_even;
                        var4_4 = var24_28 /* !! */ .inflate(var25_30, (ViewGroup)var4_4, false);
                    }
                    Intrinsics.checkNotNull(var4_4);
                    var26_35 = tr2_2.a;
                    var25_30 = (int)tr2_2.t(var6_6.c9());
                    var24_28 /* !! */  = new b32((View)var4_4, var3_3, (boolean)var25_30, (yi2_1)var6_6);
                    return var24_28 /* !! */ ;
                }
                var24_24 = LayoutInflater.from((Context)var1_1.getContext());
                var25_30 = R$layout.new_row_similar_to_pdp;
                var27_49 = false;
                var6_6 = null;
                var12_12 = var24_24.inflate(var25_30, (ViewGroup)var4_4, false);
                Intrinsics.checkNotNullExpressionValue(var12_12, var23_23);
                var19_19 = var3_3.w;
                var15_15 = var3_3.h;
                var17_17 = var3_3.v;
                var28_53 = var3_3.b;
                var10_10 = var24_24;
                var24_24 = new zi2_2((View)var12_12, var28_53, (s82_0)var15_15, (LiveData)var17_17, (mu1_1)var19_19);
            }
        }
        return var24_24;
    }

    public final void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        super.onViewAttachedToWindow(recyclerView$B);
        boolean bl2 = recyclerView$B instanceof zi2_2;
        if (bl2) {
            object = recyclerView$B;
            object = (zi2_2)recyclerView$B;
            boolean bl3 = ((zi2_2)object).r;
            Object object2 = ((zi2_2)object).m;
            if (!bl3) {
                Object object3;
                Object object4;
                int n3;
                Object object5;
                if (object2 != null) {
                    object5 = object2.iterator();
                    while ((n3 = object5.hasNext()) != 0) {
                        object4 = (Product)object5.next();
                        object3 = ((Product)object4).getFnlColorVariantData();
                        object3 = object3 != null ? ((ProductFnlColorVariantData)object3).getBrandName() : null;
                        String string2 = ((Product)object4).getName();
                        object4 = ((Product)object4).getUrl();
                        String string3 = "controller > product details for impression ";
                        String string4 = " / ";
                        object3 = og_1.a(string3, (String)object3, string4, string2, string4);
                        string2 = "}";
                        object4 = h30_0.a((StringBuilder)object3, (String)object4, string2);
                        object3 = System.out;
                        ((PrintStream)object3).println(object4);
                    }
                }
                if (object2 != null) {
                    object5 = new Message();
                    ((Message)object5).what = n3 = 1001;
                    object4 = new JSONObject();
                    object4.put("productImpression", object2);
                    object4.put("listName", (Object)"pdp screen- similar product widget");
                    object4.put("sizeText", (Object)"NA");
                    object4.put("isPLP", false);
                    object4.put("screenName", (Object)"pdp screen - similar products widget");
                    object3 = "pdp screen";
                    object4.put("screenType", object3);
                    ((Message)object5).obj = object4;
                    object5 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object5);
                    object2 = this.n;
                    ((AnalyticsGAEventHandler)((Object)object5)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
                }
            }
            ((zi2_2)object).r = bl3 = true;
        }
        if (bl2 = recyclerView$B instanceof yg_1) {
            recyclerView$B = (yg_1)recyclerView$B;
            ((yg_1)recyclerView$B).w();
        }
    }

    public final void onViewDetachedFromWindow(RecyclerView$B object) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewDetachedFromWindow((RecyclerView$B)object);
        int n3 = object instanceof PDPVideoKYPHolder;
        Object object3 = null;
        String string2 = "parentView";
        if (n3 != 0) {
            object = (PDPVideoKYPHolder)object;
            object2 = ((PDPVideoKYPHolder)object).e;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object2 = Xv1.a(object3.getContext());
            object = ((PDPVideoKYPHolder)object).H;
            ((Xv1)object2).d((BroadcastReceiver)object);
        } else {
            n3 = object instanceof li2_2;
            if (n3 != 0) {
                object = (li2_2)object;
                object2 = ((li2_2)object).g;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object2;
                }
                object2 = Xv1.a(object3.getContext());
                object = ((li2_2)object).L;
                ((Xv1)object2).d((BroadcastReceiver)object);
            } else {
                boolean bl2 = object instanceof zi2_2;
                if (bl2) {
                    object = new Message();
                    ((Message)object).what = n3 = 1004;
                    object2 = AnalyticsGAEventHandler.Companion.getInstance();
                    object2.sendMessage((Message)object);
                }
            }
        }
    }
}

