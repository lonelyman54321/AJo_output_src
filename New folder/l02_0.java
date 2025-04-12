/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.CookieManager
 *  android.webkit.WebView
 */
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.lifecycle.LiveData;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.pdp.data.VideoConfig;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.SpotLight;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from l02
 */
public final class l02_0
extends RecyclerView$f {
    public static final l02$a Companion;
    public final SpotLight a;
    public final ArrayList b;
    public final int c;
    public final yi2_1 d;
    public final boolean e;
    public final NewCustomEventsRevamp f;
    public final String g;
    public final String h;
    public int i;

    static {
        l02$a l02$a;
        Companion = l02$a = new Object();
    }

    public l02_0(SpotLight object, ArrayList object2, int n3, yi2_1 object3, boolean bl2) {
        Intrinsics.checkNotNullParameter(object3, "pdpInfoProvider");
        this.a = object;
        this.b = object2;
        this.c = n3;
        this.d = object3;
        this.e = bl2;
        object3 = AnalyticsManager.Companion;
        Object object4 = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        this.f = object4;
        object3 = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp();
        this.g = object4 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
        this.h = object3 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
        this.i = -1;
        object3 = h40_0.a;
        object3 = z40_0.Companion;
        object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
        boolean bl3 = ((ao0_0)object3).a("is_product_key_feature_enabled");
        object4 = null;
        if (bl3 && object2 != null && !(bl3 = object2.isEmpty())) {
            int n4;
            ArrayList arrayList;
            object3 = ((ArrayList)object2).get(0);
            Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
            object3 = (ProductImage)object3;
            int n7 = 0;
            ArrayList arrayList2 = null;
            if (object != null) {
                arrayList = ((SpotLight)object).getSpotLightAttributes();
            } else {
                n4 = 0;
                arrayList = null;
            }
            if (arrayList != null) {
                if (object != null) {
                    arrayList2 = ((SpotLight)object).getSpotLightAttributes();
                }
                Intrinsics.checkNotNull(arrayList2);
                n7 = arrayList2.size();
                n4 = 1;
                if (n7 > n4) {
                    if (object != null) {
                        n7 = ((SpotLight)object).getImageToDisplay();
                        ((ArrayList)object2).add(n7, object3);
                    }
                    if (object != null) {
                        int n8 = ((SpotLight)object).getImageToDisplay();
                        this.notifyItemInserted(n8);
                    }
                }
            }
        }
        if (bl2 && n3 >= 0) {
            object = yn3_0.a;
            object2 = hj0_0.a(n3, "size chart enabled ");
            Object[] objectArray = new Object[]{};
            ((yn3$a)object).a((String)object2, objectArray);
        }
    }

    public static void g(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((RecyclerView)object).findViewHolderForAdapterPosition(n3);
        n3 = object instanceof fj2_1;
        object = n3 != 0 ? (fj2_1)object : null;
        if (object != null) {
            ((fj2_1)object).w();
        }
    }

    public final int getItemCount() {
        int n3;
        Object object = this.b;
        if (object == null) {
            object = yn3_0.a;
            n3 = 0;
            Object[] objectArray = new Object[]{};
            String string2 = "Imageurls are null";
            ((yn3$a)object).a(string2, objectArray);
        } else {
            n3 = this.e;
            if (n3 != 0 && (n3 = this.c) >= 0) {
                int n4 = ((ArrayList)object).size();
                n3 = n4 + 1;
            } else {
                n3 = ((ArrayList)object).size();
            }
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        int n4;
        block5: {
            block7: {
                block6: {
                    Serializable serializable;
                    Serializable serializable2;
                    int n7;
                    int n8 = this.e;
                    n4 = 1;
                    if (n8 != 0 && n3 == (n8 = this.c)) break block5;
                    n8 = 0;
                    if (n3 < 0 || n3 >= (n7 = (serializable2 = this.b) != null ? serializable2.size() : 0)) break block6;
                    if (serializable2 != null && (serializable = (ProductImage)CollectionsKt.N(n3, serializable2)) != null) {
                        serializable = serializable.getFlagForImageAndVideo();
                        serializable2 = Boolean.TRUE;
                        n3 = (int)(Intrinsics.areEqual(serializable, serializable2) ? 1 : 0);
                    } else {
                        n3 = 0;
                        serializable = null;
                    }
                    if (n3 != 0) break block7;
                }
                n4 = 0;
            }
            n4 = n4 != 0 ? 2 : 0;
        }
        return n4;
    }

    public final void h(RecyclerView recyclerView, int n3) {
        boolean bl2;
        l02_0 l02_02 = this;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Bundle bundle = new Bundle();
        Object object = this.d;
        Object object2 = object.x5();
        Object object3 = null;
        object2 = object2 != null ? ((Product)object2).getCode() : null;
        String string2 = "product_id";
        bundle.putString(string2, (String)object2);
        object = object.x5();
        if (object != null) {
            object = ((Product)object).getName();
        } else {
            bl2 = false;
            object = null;
        }
        bundle.putString("product_name", (String)object);
        int n4 = 1600;
        object2 = l02_02.f;
        string2 = "pdp_catalog_video_interactions";
        String string3 = "video impression";
        String string4 = "";
        String string5 = "pdp_catalog_video_interactions";
        String string6 = "pdp screen";
        String string7 = "new";
        String string8 = "";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string2, string3, string4, string5, string6, string7, null, bundle, string8, false, null, n4, null);
        object = h40_0.a;
        object = h40_0.Z();
        bl2 = ((VideoConfig)object).getAutoplayEnabled();
        if (!bl2) {
            return;
        }
        object = recyclerView.findViewHolderForAdapterPosition(n3);
        boolean bl3 = object instanceof fj2_1;
        if (bl3) {
            object3 = object;
            object3 = (fj2_1)object;
        }
        if (object3 != null) {
            ((fj2_1)object3).x();
        }
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        l02_0 l02_02 = this;
        Object object = recyclerView$B;
        int n4 = n3;
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object2);
        boolean bl2 = recyclerView$B instanceof wi2_2;
        int n7 = 1;
        Object[] objectArray = null;
        Object object3 = this.b;
        int n8 = 0;
        Object object4 = null;
        if (bl2) {
            Object object5;
            bl2 = this.e;
            int n10 = this.c;
            if (!bl2 || n10 < 0) {
                n7 = 0;
                object5 = null;
            }
            object2 = l02_02.a;
            if (n7 != 0) {
                if (n4 < n10) {
                    object = (wi2_2)object;
                    if (object3 != null) {
                        object4 = object5 = CollectionsKt.N(n4, (List)object3);
                        object4 = (ProductImage)object5;
                    }
                    ((wi2_2)object).w(n4, (SpotLight)object2, (ProductImage)object4);
                } else {
                    object = (wi2_2)object;
                    if (object3 != null) {
                        n7 = n4 + -1;
                        object4 = object5 = CollectionsKt.N(n7, (List)object3);
                        object4 = (ProductImage)object5;
                    }
                    ((wi2_2)object).w(n4, (SpotLight)object2, (ProductImage)object4);
                }
            } else {
                object = (wi2_2)object;
                if (object3 != null) {
                    object4 = object5 = CollectionsKt.N(n4, (List)object3);
                    object4 = (ProductImage)object5;
                }
                ((wi2_2)object).w(n4, (SpotLight)object2, (ProductImage)object4);
            }
        } else {
            bl2 = recyclerView$B instanceof cj2_1;
            if (bl2) {
                object = (cj2_1)recyclerView$B;
                af3_2.b(((cj2_1)object).c, (a)object);
                Object object6 = ((cj2_1)object).b;
                object2 = object6.G8();
                boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl3) {
                    Object object7;
                    Object object8;
                    String string2 = "true";
                    object3 = p3.a("isPDP", string2);
                    boolean bl4 = ((cj2_1)object).e;
                    int n14 = 10;
                    if (bl4 && (bl4 = r32.a((Product)(object8 = object6.x5()), (String)(object7 = ((cj2_1)object).f)))) {
                        int n15;
                        int n16;
                        if (object2 != null && (n16 = StringsKt.F((CharSequence)object2, (CharSequence)(object8 = "availableSizes"), false)) == 0) {
                            object7 = object6.i2();
                            if (object7 != null) {
                                boolean bl5;
                                Object object9 = new ArrayList();
                                object7 = ((ArrayList)object7).iterator();
                                while (bl5 = object7.hasNext()) {
                                    Object e2 = object7.next();
                                    Object object10 = e2;
                                    object10 = (ProductOptionVariant)e2;
                                    int n17 = ((ProductOptionVariant)object10).getStockLevel();
                                    if (n17 <= 0) continue;
                                    ((ArrayList)object9).add(e2);
                                }
                                n16 = yx_2.o(object9, n14);
                                ArrayList<Object> arrayList = new ArrayList<Object>(n16);
                                object7 = ((ArrayList)object9).iterator();
                                while ((n15 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                                    object9 = ((ProductOptionVariant)object7.next()).getSizeValue();
                                    arrayList.add(object9);
                                }
                                int n18 = 62;
                                String string3 = ",";
                                object7 = CollectionsKt.R(arrayList, string3, null, null, null, n18);
                            } else {
                                n16 = 0;
                                object7 = null;
                            }
                            object7 = String.valueOf(object7);
                            ((HashMap)object3).put(object8, object7);
                        }
                        if (object2 != null && (n16 = StringsKt.F((CharSequence)object2, (CharSequence)(object8 = "sizeDisplayType"), false)) == 0) {
                            object7 = object6.x5();
                            if (object7 != null && (object7 = ((Product)object7).getBaseOptions()) != null && (object7 = (ProductOption)object7.get(0)) != null && (object7 = ((ProductOption)object7).getOptions()) != null && (object7 = (ProductOptionItem)object7.get(0)) != null) {
                                object7 = ((ProductOptionItem)object7).getSizeDisplayType();
                            } else {
                                n16 = 0;
                                object7 = null;
                            }
                            if (object7 == null || (n15 = ((String)object7).length()) == 0) {
                                if ((object6 = object6.x5()) != null && (object6 = ((Product)object6).getVariantOptions()) != null && (object6 = (ProductOptionItem)object6.get(0)) != null) {
                                    object4 = ((ProductOptionItem)object6).getSizeDisplayType();
                                }
                                object7 = object4;
                            }
                            if (object7 == null) {
                                object7 = "";
                            }
                            ((HashMap)object3).put(object8, object7);
                        }
                        if (object2 != null && (n8 = StringsKt.F((CharSequence)object2, (CharSequence)(object6 = "standardSizeFlag"), false)) == 0) {
                            n8 = hv3_0.Y();
                            object4 = String.valueOf(n8 != 0);
                            ((HashMap)object3).put(object6, object4);
                        }
                        object6 = "showOnlySizeChartForPdp";
                        ((HashMap)object3).put(object6, string2);
                    }
                    object6 = UrlHelper.Companion.getInstance();
                    Intrinsics.checkNotNull(object2);
                    object6 = ((UrlHelper)object6).addParams((String)object2, (HashMap)object3);
                    object2 = ((cj2_1)object).c;
                    object2.getSettings().setJavaScriptEnabled(n7 != 0);
                    object3 = new cj2$a((cj2_1)object);
                    object2.addJavascriptInterface(object3, "GamificationAndroidJSBridge");
                    object = CookieManager.getInstance();
                    object.setAcceptCookie(n7 != 0);
                    object.acceptCookie();
                    object.acceptThirdPartyCookies((WebView)object2);
                    Object object11 = new String[]{";"};
                    object3 = "key=test1;key2=test2;key3=test3";
                    n8 = 6;
                    object11 = ((Iterable)StringsKt.a0((CharSequence)object3, (String[])object11, false, 0, n8)).iterator();
                    while (bl3 = object11.hasNext()) {
                        object3 = (String)object11.next();
                        object4 = "https://qa.services.ajio.com";
                        object.setCookie((String)object4, (String)object3);
                    }
                    object = yn3_0.a;
                    object11 = "Cookies set.";
                    objectArray = new Object[]{};
                    ((yn3$a)object).a((String)object11, objectArray);
                    object = tf3_2.a(n14, (String)object6);
                    object2.loadUrl((String)object);
                }
            } else {
                bl2 = recyclerView$B instanceof fj2_1;
                if (bl2) {
                    Object object12;
                    object = (fj2_1)recyclerView$B;
                    if (object3 != null) {
                        object4 = object12 = CollectionsKt.N(n3, (List)object3);
                        object4 = (ProductImage)object12;
                    }
                    object.getClass();
                    if (object4 != null) {
                        Intrinsics.checkNotNullParameter(object4, "videoItem");
                        object12 = ((fj2_1)object).l;
                        if (object12 != null) {
                            ((ob_2)object12).l();
                        }
                        object2 = ((RecyclerView$B)object).itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(object2, "getContext(...)");
                        object3 = ((ProductImage)object4).getVideoUrl();
                        PlayerView playerView = ((fj2_1)object).f;
                        ((fj2_1)object).l = object12 = new ob_2((Context)object2, playerView, (pb_2)object, (String)object3);
                        object2 = ((fj2_1)object).b;
                        object2.v2((ob_2)object12);
                        object12 = new da$a();
                        ((da$a)object12).k = n7;
                        ((da$a)object12).r = n7;
                        int n19 = R$string.acc_banner;
                        object3 = hv3_0.K(n19);
                        ((da$a)object12).b((String)object3);
                        object3 = UrlHelper.Companion.getInstance();
                        object4 = ((ProductImage)object4).getVideoThumbnail();
                        ((da$a)object12).n = object3 = ((UrlHelper)object3).getImageUrl((String)object4);
                        object3 = ((fj2_1)object).h;
                        ((da$a)object12).u = object3;
                        ((da$a)object12).a();
                        ai0_2.B((View)object3);
                        object12 = ((fj2_1)object).l;
                        if (object12 != null) {
                            ((ob_2)object12).g = n7;
                        }
                        if (object12 != null) {
                            long l2 = 0L;
                            ob_2.h((ob_2)object12, l2, 0, n7);
                        }
                        object12 = ((fj2_1)object).l;
                        Intrinsics.checkNotNull(object12);
                        object12 = ((ob_2)object12).o;
                        object2 = object2.y();
                        objectArray = null;
                        ej2_0 ej2_02 = new ej2_0(object, 0);
                        ((LiveData)object12).e((mu1_1)object2, ej2_02);
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        yi2_1 yi2_12 = this.d;
        String string2 = "inflate(...)";
        if (n3 != 0) {
            int n4 = 2;
            if (n3 != n4) {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.pdp_size_chart_pager;
                viewGroup = object.inflate(n4, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                object = new cj2_1((View)viewGroup, yi2_12);
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.exoplayer_view;
                viewGroup = object.inflate(n4, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                object = new fj2_1((View)viewGroup, yi2_12);
            }
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.new_pdp_rv_image_row;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = new wi2_2((View)viewGroup, yi2_12);
        }
        return object;
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        super.onViewDetachedFromWindow(recyclerView$B);
        boolean bl2 = recyclerView$B instanceof fj2_1;
        if (bl2) {
            recyclerView$B = (fj2_1)recyclerView$B;
            ((fj2_1)recyclerView$B).w();
        }
    }
}

