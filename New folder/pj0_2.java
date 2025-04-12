/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.SparseIntArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.b;
import androidx.media3.common.e;
import androidx.media3.common.f;
import androidx.media3.datasource.c$a;
import androidx.media3.datasource.cache.a$a;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.o;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$s;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView$b;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.FleekVideoConfigValue;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.OfferPrice;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.FnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.PriceReveal;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import com.ril.ajio.services.data.fleek.feedModel.WasPriceData;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.json.JSONObject;

/*
 * Renamed from pJ0
 */
public final class pj0_2
extends Fragment
implements StoriesProgressView$b,
sz2_1,
yv0_1,
ik3_2,
View.OnClickListener {
    public static final pJ0$a Companion;
    public static final SparseIntArray U;
    public AppCompatImageView A;
    public AppCompatImageView B;
    public AppCompatImageView C;
    public StoriesProgressView D;
    public ProgressBar E;
    public TextView F;
    public View G;
    public View H;
    public AppCompatImageView I;
    public LinearLayoutCompat J;
    public TextView K;
    public AppCompatImageView L;
    public RelativeLayout M;
    public int N;
    public long O;
    public final Handler P;
    public final vw0_2 Q;
    public boolean R;
    public boolean S;
    public final pJ0$b T;
    public Float a;
    public boolean b;
    public ea2_1 c;
    public ea2_1 d;
    public lz1_1 e;
    public j3_0 f;
    public final D g;
    public dr0_0 h;
    public Subcomponent i;
    public Component j;
    public final hh3_2 k;
    public p83_0 l;
    public View m;
    public androidx.media3.exoplayer.e n;
    public qk2_0 o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public RecyclerView t;
    public AppCompatTextView u;
    public ShimmerFrameLayout v;
    public ImageView w;
    public ComposeView x;
    public g33_0 y;
    public PlayerView z;

    static {
        pJ0$a pJ0$a;
        Companion = pJ0$a = new Object();
        pJ0$a = new SparseIntArray();
        U = pJ0$a;
    }

    public pj0_2() {
        Object object = Float.valueOf(0.0f);
        this.a = object;
        object = Reflection.getOrCreateKotlinClass(f23_0.class);
        pJ0$e pJ0$e = new pJ0$e(this);
        pJ0$f pJ0$f = new pJ0$f(this);
        pJ0$g pJ0$g = new pJ0$g(this);
        this.g = object = LW0.a(this, (yn1_2)object, pJ0$e, pJ0$f, pJ0$g);
        object = new nj0_1(this, 0);
        this.k = object = yr1_2.b((Function0)object);
        pJ0$e = Looper.getMainLooper();
        object = new Handler((Looper)pJ0$e);
        this.P = object;
        this.Q = object = new vw0_2(this, 1);
        this.T = object = new Object();
    }

    public static final void Oa(pj0_2 pj0_22) {
        boolean bl2;
        pj0_22.getClass();
        Object object = h40_0.a;
        object = h40_0.y();
        Object object2 = ((FleekVideoConfigValue)object).isAutoPlayVideo();
        Boolean bl3 = Boolean.FALSE;
        boolean bl4 = Intrinsics.areEqual(object2, bl3);
        if (bl4 && (bl2 = Intrinsics.areEqual(object = ((FleekVideoConfigValue)object).isPlayInLoop(), bl3))) {
            bl2 = false;
            pj0_22.r = false;
            object = pj0_22.B;
            if (object != null) {
                ai0_2.B((View)object);
            }
        } else {
            pj0_22.r = bl2 = true;
            object2 = pj0_22.n;
            if (object2 != null) {
                ((androidx.media3.exoplayer.e)object2).setPlayWhenReady(bl2);
            }
        }
        if ((pj0_22 = pj0_22.E) != null) {
            gp0_1.a((View)pj0_22);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void A6(BannerData object, Product object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "bannerData");
        object = this.Qa().a.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        object = (UserInformation)object;
        boolean n3 = ((UserInformation)object).isUserOnline();
        Object object3 = null;
        if (!n3) {
            this.Qa().h.b = object2;
            object = this.e;
            if (object == null) {
                object = "loginListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object;
            }
            object = "source - add to closet";
            int n4 = 53;
            object3.z0(n4, (String)object);
        } else {
            void var4_8;
            Object object4;
            boolean bl2;
            object = this.getArguments();
            if (object != null && (bl2 = (object = this.requireArguments()).containsKey((String)(object4 = "PLP_TYPE")))) {
                object = this.requireArguments();
                int n7 = 100;
                int n8 = object.getInt((String)object4, n7);
            } else {
                int n10 = 103;
            }
            object4 = this.f;
            if (object4 == null) {
                object4 = "activityFragmentListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object3 = object4;
            }
            object3.startLoader();
            object3 = this.Qa().h;
            ((BH3)object3).b = object2;
            object2 = this.Qa();
            Intrinsics.checkNotNull(string2);
            ((e43_0)object2).c((int)var4_8, string2);
        }
    }

    public final void B0() {
        int n3 = this.p;
        int n4 = n3 + -1;
        if (n4 < 0) {
            return;
        }
        this.p = n3 += -1;
        U.put(0, n3);
        this.O = 0L;
        this.R = false;
        this.Xa();
    }

    public final void C(Product object, String object2) {
        int n3;
        object2 = ((Product)object).getFnlColorVariantData();
        if (object2 != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null && (n3 = ((String)object2).length()) > 0) {
            Object object3 = this.f;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                n3 = 0;
                object3 = null;
            }
            object3.startLoader();
            object3 = this.Qa().h;
            ((BH3)object3).c = object;
            object = this.Qa();
            ((e43_0)object).i((String)object2);
        }
    }

    public final void J() {
    }

    public final ArrayList Pa() {
        int n3;
        ArrayList<Product> arrayList = new ArrayList<Product>();
        Object object = this.l;
        if (object != null && (object = (Subcomponent)CollectionsKt.N(n3 = this.p, (List)object)) != null && (object = ((Subcomponent)object).getResources()) != null) {
            Collection<Object> collection = object;
            collection = (Collection)object;
            n3 = collection.isEmpty() ^ 1;
            if (n3 != 0) {
                boolean bl2;
                object = (Iterable)object;
                collection = new Collection<Object>();
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    Object object2;
                    Object object3;
                    boolean bl3;
                    Object object4;
                    Object object5 = (Resource)object.next();
                    ArrayList<Object> arrayList2 = new ArrayList<Object>();
                    Product product = new Product();
                    if (object5 != null && (object4 = ((Resource)object5).getFnlColorVariantData()) != null) {
                        object4 = ((FnlColorVariantData)object4).getColorGroup();
                    } else {
                        bl3 = false;
                        object4 = null;
                    }
                    product.setCode((String)object4);
                    object4 = new ProductFnlColorVariantData();
                    object3 = object5 != null && (object3 = ((Resource)object5).getFnlColorVariantData()) != null ? ((FnlColorVariantData)object3).getBrandName() : null;
                    ((ProductFnlColorVariantData)object4).setBrandName((String)object3);
                    object3 = object5 != null && (object3 = ((Resource)object5).getFnlColorVariantData()) != null ? ((FnlColorVariantData)object3).getColorGroup() : null;
                    ((ProductFnlColorVariantData)object4).setColorGroup((String)object3);
                    object3 = object5 != null && (object3 = ((Resource)object5).getFnlColorVariantData()) != null ? ((FnlColorVariantData)object3).getOutfitPictureURL() : null;
                    ((ProductFnlColorVariantData)object4).setOutfitPictureURL((String)object3);
                    product.setFnlColorVariantData((ProductFnlColorVariantData)object4);
                    object4 = new OfferPrice();
                    object3 = object5 != null && (object3 = ((Resource)object5).getOfferPrice()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.OfferPrice)object3).getFormattedValue() : null;
                    ((Price)object4).setFormattedValue((String)object3);
                    object3 = object5 != null && (object3 = ((Resource)object5).getOfferPrice()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.OfferPrice)object3).getValue() : null;
                    ((Price)object4).setValue((String)object3);
                    int n4 = 3;
                    float f5 = 4.2E-45f;
                    object3 = new com.ril.ajio.services.data.Product.PriceReveal(null, null, n4, null);
                    if (object5 != null && (object2 = ((Resource)object5).getOfferPrice()) != null && (object2 = ((com.ril.ajio.services.data.fleek.feedModel.OfferPrice)object2).getPriceReveal()) != null && (object2 = ((PriceReveal)object2).getBestPrice()) != null && (object2 = je3_2.e((String)object2)) != null) {
                        f5 = ((Float)object2).floatValue();
                    } else {
                        n4 = 0;
                        f5 = 0.0f;
                        object2 = null;
                    }
                    object2 = Float.valueOf(f5);
                    ((com.ril.ajio.services.data.Product.PriceReveal)object3).setBestPrice((Float)object2);
                    if (object5 != null && (object2 = ((Resource)object5).getOfferPrice()) != null && (object2 = ((com.ril.ajio.services.data.fleek.feedModel.OfferPrice)object2).getPriceReveal()) != null) {
                        object2 = ((PriceReveal)object2).getDiscountPercent();
                    } else {
                        n4 = 0;
                        object2 = null;
                        f5 = 0.0f;
                    }
                    ((com.ril.ajio.services.data.Product.PriceReveal)object3).setDiscountPercent((String)object2);
                    ((Price)object4).setPriceReveal((com.ril.ajio.services.data.Product.PriceReveal)object3);
                    product.setOfferPrice((OfferPrice)object4);
                    if (object5 != null) {
                        object4 = ((Resource)object5).getName();
                    } else {
                        bl3 = false;
                        object4 = null;
                    }
                    product.setName((String)object4);
                    n4 = 0;
                    f5 = 0.0f;
                    object2 = null;
                    Object object6 = null;
                    Object object7 = null;
                    ProductImage productImage = null;
                    int n7 = 0;
                    int n8 = 8191;
                    object3 = object4;
                    object4 = new Price(null, null, null, null, null, null, null, null, null, null, null, null, null, n8, null);
                    object3 = object5 != null && (object3 = ((Resource)object5).getPrice()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.Price)object3).getFormattedValue() : null;
                    ((Price)object4).setFormattedValue((String)object3);
                    object3 = object5 != null && (object3 = ((Resource)object5).getPrice()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.Price)object3).getDisplayformattedValue() : null;
                    ((Price)object4).setDisplayformattedValue((String)object3);
                    object3 = object5 != null && (object3 = ((Resource)object5).getPrice()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.Price)object3).getValue() : null;
                    ((Price)object4).setValue((String)object3);
                    object3 = object5 != null && (object3 = ((Resource)object5).getPrice()) != null ? ((com.ril.ajio.services.data.fleek.feedModel.Price)object3).getDisplayformattedValue() : null;
                    ((Price)object4).setDisplayformattedValue((String)object3);
                    product.setPrice((Price)object4);
                    if (object5 != null) {
                        object4 = ((Resource)object5).getDiscountPercent();
                    } else {
                        bl3 = false;
                        object4 = null;
                    }
                    product.setDiscountPercent((String)object4);
                    n4 = 0;
                    f5 = 0.0f;
                    object2 = null;
                    object6 = null;
                    object7 = null;
                    productImage = null;
                    n7 = 0;
                    n8 = 8191;
                    object3 = object4;
                    object4 = new Price(null, null, null, null, null, null, null, null, null, null, null, null, null, n8, null);
                    object3 = object5 != null && (object3 = ((Resource)object5).getWasPriceData()) != null ? ((WasPriceData)object3).getFormattedValue() : null;
                    ((Price)object4).setFormattedValue((String)object3);
                    object3 = object5 != null && (object3 = ((Resource)object5).getWasPriceData()) != null ? ((WasPriceData)object3).getValue() : null;
                    ((Price)object4).setValue((String)object3);
                    object3 = object5 != null && (object3 = ((Resource)object5).getWasPriceData()) != null ? ((WasPriceData)object3).getDisplayformattedValue() : null;
                    ((Price)object4).setDisplayformattedValue((String)object3);
                    product.setWasPriceData((Price)object4);
                    if (object5 != null && (object5 = ((Resource)object5).getImages()) != null) {
                        object5 = ((Iterable)object5).iterator();
                        while (bl3 = object5.hasNext()) {
                            object4 = (ProductImage)object5.next();
                            if (object4 != null) {
                                object2 = object3 = ((ProductImage)object4).getFormat();
                            } else {
                                n4 = 0;
                                object2 = null;
                                f5 = 0.0f;
                            }
                            object6 = object4 != null ? (object3 = ((ProductImage)object4).getUrl()) : null;
                            object7 = object4 != null ? (object4 = ((ProductImage)object4).getImageType()) : null;
                            bl3 = false;
                            object4 = null;
                            n7 = 504;
                            object3 = productImage;
                            productImage = null;
                            object3 = new ProductImage((String)object2, (String)object6, (String)object7, 0, null, null, null, null, null, n7, null);
                            arrayList2.add(object3);
                        }
                    }
                    product.setImages(arrayList2);
                    bl2 = arrayList.add(product);
                    object5 = bl2;
                    collection.add(object5);
                }
            }
        }
        return arrayList;
    }

    public final e43_0 Qa() {
        return (e43_0)this.k.getValue();
    }

    public final void Ra(boolean bl2) {
        block10: {
            block9: {
                block8: {
                    boolean bl3 = true;
                    if (bl2 != bl3) break block8;
                    ComposeView composeView = this.x;
                    if (composeView != null) {
                        ai0_2.B((View)composeView);
                    }
                    if ((composeView = this.M) != null) {
                        ai0_2.i((View)composeView);
                    }
                    break block9;
                }
                if (bl2) break block10;
                ComposeView composeView = this.x;
                if (composeView != null) {
                    ai0_2.i((View)composeView);
                }
                if ((composeView = this.M) != null) {
                    ai0_2.B((View)composeView);
                }
            }
            return;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    public final void Sa() {
        boolean bl2 = this.b;
        Object object = 0;
        float f5 = 0.0f;
        Object object2 = null;
        if (bl2) {
            float f6;
            Object object3 = this.a;
            if (object3 != null) {
                f6 = ((Number)object3).floatValue();
                float f7 = f6 - 0.0f;
                object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object > 0) {
                    object2 = this.n;
                    if (object2 != null) {
                        ((androidx.media3.exoplayer.e)object2).setVolume(f6);
                    }
                } else {
                    object3 = this.n;
                    if (object3 != null) {
                        object = 1065353216;
                        f5 = 1.0f;
                        ((androidx.media3.exoplayer.e)object3).setVolume(f5);
                    }
                }
            }
            bl2 = false;
            f6 = 0.0f;
            this.b = false;
            object3 = this.A;
            if (object3 != null) {
                object = R$string.video_mute;
                object2 = hv3_0.K(object);
                object3.setContentDescription((CharSequence)object2);
            }
            if ((object3 = this.A) != null) {
                object2 = this.requireContext();
                int n3 = R$drawable.ic_unmute_video;
                object2 = xn.a((Context)object2, n3);
                ((AppCompatImageView)((Object)object3)).setImageDrawable((Drawable)object2);
            }
        } else {
            float f8;
            Object object4 = this.n;
            if (object4 != null) {
                ((androidx.media3.exoplayer.e)object4).E();
                f8 = ((androidx.media3.exoplayer.e)object4).h0;
                this.a = object4 = Float.valueOf(f8);
            }
            if ((object4 = this.n) != null) {
                ((androidx.media3.exoplayer.e)object4).setVolume(0.0f);
            }
            bl2 = true;
            f8 = Float.MIN_VALUE;
            this.b = bl2;
            object4 = this.A;
            if (object4 != null) {
                object = R$string.video_unmute;
                object2 = hv3_0.K(object);
                object4.setContentDescription((CharSequence)object2);
            }
            if ((object4 = this.A) != null) {
                object2 = this.requireContext();
                int n4 = R$drawable.ic_mute_video;
                object2 = xn.a((Context)object2, n4);
                ((AppCompatImageView)((Object)object4)).setImageDrawable((Drawable)object2);
            }
        }
    }

    public final void Ta() {
        int n3;
        Object object = this.t;
        Object object2 = null;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.t;
            if (object != null) {
                object = ((RecyclerView)object).getLayoutManager();
            } else {
                n3 = 0;
                object = null;
            }
            boolean bl2 = object instanceof LinearLayoutManager;
            if (bl2) {
                object = (LinearLayoutManager)object;
            } else {
                n3 = 0;
                object = null;
            }
            bl2 = false;
            Object object3 = null;
            if (object != null) {
                n3 = ((LinearLayoutManager)object).findLastVisibleItemPosition();
            } else {
                n3 = 0;
                object = null;
            }
            int n4 = this.N;
            if (n3 >= n4) {
                String string2;
                int n7;
                Object object4 = new ArrayList();
                Object object5 = this.Pa();
                int n8 = ((ArrayList)object5).isEmpty() ^ 1;
                if (n8 != 0 && (n8 = this.N) <= n3) {
                    while (true) {
                        if (n8 < (n7 = ((ArrayList)object5).size())) {
                            ((Product)((ArrayList)object5).get(n8)).setPosition(n8);
                            string2 = ((ArrayList)object5).get(n8);
                            ((ArrayList)object4).add(string2);
                        }
                        if (n8 == n3) break;
                        ++n8;
                    }
                }
                object5 = (object5 = this.j) != null && (object5 = ((Component)object5).getSubComponentsOwner()) != null ? ((SubcomponentsOwner)object5).getName() : null;
                Object object6 = this.j;
                if (object6 != null) {
                    object6 = ((Component)object6).getSubType();
                } else {
                    n8 = 0;
                    object6 = null;
                }
                string2 = "SEEN-POSTS";
                n8 = (int)(Intrinsics.areEqual(object6, string2) ? 1 : 0);
                object6 = n8 != 0 ? "seen" : "unseen";
                string2 = "fleek_";
                String string3 = "_post_shop_product_";
                object6 = UX.c(string2, (String)object6, string3, (String)object5);
                n7 = ((ArrayList)object4).isEmpty() ^ 1;
                if (n7 != 0) {
                    int n10;
                    string2 = new Message();
                    ((Message)string2).what = n10 = 1001;
                    string3 = new JSONObject();
                    Object object7 = this.i;
                    if (object7 != null && (object7 = ((Subcomponent)object7).getId()) != null) {
                        object2 = object7;
                    } else {
                        object7 = this.j;
                        if (object7 != null) {
                            object2 = ((Component)object7).getPostId();
                        }
                    }
                    object7 = "post_id";
                    string3.put((String)object7, object2);
                    string3.put("productImpression", object4);
                    string3.put("listName", object6);
                    string3.put("sizeText", (Object)"");
                    string3.put("isPLP", false);
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object5);
                    object3 = "-post screen";
                    ((StringBuilder)object2).append((String)object3);
                    object2 = ((StringBuilder)object2).toString();
                    object4 = "screenName";
                    string3.put((String)object4, object2);
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object5);
                    ((StringBuilder)object2).append((String)object3);
                    object2 = ((StringBuilder)object2).toString();
                    string3.put("screenType", object2);
                    ((Message)string2).obj = string3;
                    object2 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)string2);
                    object3 = this.T;
                    ((AnalyticsGAEventHandler)((Object)object2)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object3);
                }
                this.N = ++n3;
            }
        }
    }

    public final void Ua(Component component) {
        Object object;
        Object object2;
        pj0_2 pj0_22 = this;
        Object object3 = component;
        boolean bl2 = true;
        int n3 = 0;
        Object object4 = null;
        Object object5 = component != null ? component.getSubcomponent() : null;
        pj0_22.l = object5;
        object5 = object5 != null ? (Subcomponent)CollectionsKt.firstOrNull((List)object5) : null;
        pj0_22.i = object5;
        pj0_22.j = object3;
        object3 = U;
        object5 = null;
        object3.put(0, 0);
        this.Xa();
        object3 = this.requireActivity();
        Object object6 = new uj0_1(pj0_22, (FragmentActivity)object3);
        object3 = pj0_22.w;
        if (object3 != null) {
            object3.setOnClickListener((View.OnClickListener)pj0_22);
        }
        if ((object3 = pj0_22.G) != null) {
            object3.setOnTouchListener((View.OnTouchListener)object6);
        }
        if ((object3 = pj0_22.H) != null) {
            object3.setOnTouchListener((View.OnTouchListener)object6);
        }
        if ((object3 = pj0_22.l) != null && (object6 = pj0_22.D) != null) {
            int n4 = ((p83_0)object3).size();
            ((StoriesProgressView)((Object)object6)).setStoriesCountDebug(n4, 0);
        }
        if ((object3 = pj0_22.D) != null) {
            object6 = pj0_22.l;
            if (object6 != null) {
                n3 = pj0_22.p;
                object4 = (Subcomponent)CollectionsKt.N(n3, (List)object6);
            }
            ((StoriesProgressView)((Object)object3)).setAllStoryDuration((Subcomponent)object4);
        }
        if ((object3 = pj0_22.D) != null) {
            ((StoriesProgressView)((Object)object3)).setStoriesListener(pj0_22);
        }
        if ((object3 = pj0_22.j) != null && (object3 = ((Component)object3).getSubComponentsOwner()) != null) {
            object4 = new da$a();
            ((da$a)object4).k = bl2;
            ((da$a)object4).g = bl2;
            ((da$a)object4).f = bl2;
            object6 = ((SubcomponentsOwner)object3).getLogo();
            object2 = pj0_22.I;
            Intrinsics.checkNotNull(object2);
            ((da$a)object4).n = object6;
            ((da$a)object4).u = object2;
            ((da$a)object4).a();
            object4 = pj0_22.K;
            if (object4 != null) {
                object6 = ((SubcomponentsOwner)object3).getName();
                object4.setText((CharSequence)object6);
            }
            if ((object4 = pj0_22.F) != null) {
                object3 = ((SubcomponentsOwner)object3).getType();
                object4.setText((CharSequence)object3);
            }
        }
        if ((object3 = pj0_22.I) != null) {
            object3.setOnClickListener((View.OnClickListener)pj0_22);
        }
        if ((object3 = pj0_22.J) != null) {
            object3.setOnClickListener((View.OnClickListener)pj0_22);
        }
        if ((object3 = pj0_22.x) != null) {
            object4 = new tj0_2(pj0_22);
            int n7 = 466484671;
            object6 = new u10(n7, object4, bl2);
            ((ComposeView)((Object)object3)).setContent((Function2)object6);
        }
        if ((object3 = pj0_22.t) != null) {
            object6 = this.requireActivity();
            object4 = new WrapperLinearLayoutManager((Context)object6, 0);
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object4);
            object4 = new z73_0((RecyclerView)object3);
            ((RecyclerView)object3).addOnItemTouchListener((RecyclerView$r)object4);
            object4 = this.Pa();
            boolean bl3 = ((ArrayList)object4).isEmpty();
            if (bl3) {
                object = pj0_22.u;
                if (object != null) {
                    ai0_2.i((View)object);
                }
                if ((object = pj0_22.m) != null) {
                    ai0_2.i((View)object);
                }
                ai0_2.i((View)object3);
            } else {
                object6 = pj0_22.u;
                if (object6 != null) {
                    ai0_2.B((View)object6);
                }
                if ((object6 = pj0_22.m) != null) {
                    ai0_2.B((View)object6);
                }
                if (bl3 = ((ArrayList)object4).isEmpty() ^ bl2) {
                    Banner banner;
                    ai0_2.B((View)object3);
                    object2 = new BannerData$Builder();
                    Object object7 = banner;
                    int n8 = -1 >>> 4;
                    object = banner;
                    banner = null;
                    ((Banner)object7)(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n8, null);
                    int n10 = hv3_0.F();
                    hv3_0 hv3_02 = hv3_0.a;
                    hv3_02.getClass();
                    int n14 = hv3_0.E();
                    object7 = new ScreenInfo(n10, n14);
                    Object object8 = h40_0.a;
                    object8 = h40_0.w();
                    object = ((BannerData$Builder)object2).build((Banner)object, (ScreenInfo)object7, (BaseValue)object8, 0);
                    pj0_22.y = object6 = new g33_0((BannerData)object, (List)object4, pj0_22);
                    ((RecyclerView)object3).setAdapter((RecyclerView$f)object6);
                    object = Looper.getMainLooper();
                    object3 = new Handler((Looper)object);
                    n3 = 1;
                    object = new uz_1(pj0_22, n3);
                    long l2 = 500L;
                    object3.postDelayed((Runnable)object, l2);
                }
            }
        }
        if ((object3 = pj0_22.t) != null) {
            object = new qj0_0(pj0_22);
            ((RecyclerView)object3).addOnScrollListener((RecyclerView$s)object);
        }
    }

    public final void V() {
        int n3;
        p83_0 p83_02 = this.l;
        if (p83_02 != null) {
            n3 = p83_02.size();
        } else {
            n3 = 0;
            p83_02 = null;
        }
        int n4 = this.p + 1;
        if (n3 <= n4) {
            return;
        }
        this.O = 0L;
        this.R = false;
        this.p = n4;
        U.put(0, n4);
        this.Xa();
    }

    public final void Va() {
        int n3;
        Object object;
        int n4;
        Object object2 = this.getArguments();
        if (object2 != null && (n4 = object2.getBoolean((String)(object = "IsFromDeepLink"))) == (n3 = 1)) {
            object2 = this.getArguments();
            Object object3 = "";
            Object object4 = "POSTID";
            if (object2 == null || (object2 = object2.getString((String)object4)) == null) {
                object2 = object3;
            }
            if ((n4 = object2.length()) > 0) {
                object2 = this.v;
                if (object2 != null) {
                    ai0_2.B((View)object2);
                }
                object2 = nu1_0.a(this);
                object = new sj0_2(this, null);
                int n7 = 3;
                Ae3.d((i90_0)object2, null, null, (Function2)object, n7);
                object2 = this.h;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                    n4 = 0;
                    object2 = null;
                }
                if ((object = this.getArguments()) != null && (object = object.getString((String)object4)) != null) {
                    object3 = object;
                }
                object2.getClass();
                Intrinsics.checkNotNullParameter(object3, "postId");
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n3 = vV1.e((Context)object);
                if (!n3) {
                    object3 = "No internet";
                    object = new Qw2$a((String)object3);
                    object2 = object2.K;
                    object2.getClass();
                    object2.k(null, object);
                } else {
                    object = md3_0.c((jD3)object2);
                    object4 = new kr0_1((dr0_0)object2, (String)object3, null);
                    Ae3.d((i90_0)object, null, null, (Function2)object4, n7);
                }
            } else {
                this.Ra(n3 != 0);
            }
        } else {
            n4 = 0;
            this.Ra(false);
            object2 = (Component)((f23_0)this.g.getValue()).b.getValue();
            this.Ua((Component)object2);
        }
    }

    public final void Wa() {
        Object object = this.M;
        if (object != null) {
            long l2;
            boolean bl2;
            if (object != null) {
                float f5 = object.getAlpha();
                object = Float.valueOf(f5);
            } else {
                bl2 = false;
                float f6 = 0.0f;
                object = null;
            }
            float f7 = 0.0f;
            bl2 = Intrinsics.areEqual((Float)object, 0.0f);
            if (bl2 && (object = this.M) != null && (object = object.animate()) != null && (object = object.setDuration(l2 = (long)100)) != null && (object = object.alpha(f7 = 1.0f)) != null) {
                object.start();
            }
        }
    }

    public final void X6(int n3) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void Xa() {
        int n3;
        int n4;
        pj0_2 pj0_22 = this;
        Object object = this.n;
        if (object != null) {
            ((androidx.media3.exoplayer.e)object).stop();
        }
        object = pj0_22.l;
        int n7 = 0;
        Object object2 = null;
        if (object != null && (object = (Subcomponent)CollectionsKt.N(n4 = pj0_22.p, (List)object)) != null) {
            object = ((Subcomponent)object).getPostMedia();
        } else {
            n3 = 0;
            object = null;
        }
        n3 = ov3.x((List)object);
        n4 = 1;
        if (n3 != 0) {
            Object object3;
            boolean bl2;
            int n8;
            Object object4;
            object = pj0_22.z;
            if (object != null) {
                gp0_1.c((View)object);
            }
            if ((object = pj0_22.C) != null) {
                gp0_1.a((View)object);
            }
            if ((object = pj0_22.E) != null) {
                gp0_1.c((View)object);
            }
            if ((object = pj0_22.n) == null) {
                object4 = this.requireActivity();
                object = new ExoPlayer$c((Context)object4);
                pj0_22.n = object = ((ExoPlayer$c)object).a();
            } else {
                ((androidx.media3.exoplayer.e)object).release();
                pj0_22.n = null;
                object4 = this.requireActivity();
                object = new ExoPlayer$c((Context)object4);
                pj0_22.n = object = ((ExoPlayer$c)object).a();
            }
            object = new c$a();
            ((c$a)object).c = object4 = gz3.y((Context)this.requireActivity(), "YourApp");
            Intrinsics.checkNotNullExpressionValue(object, "setUserAgent(...)");
            a$a a$a = new a$a();
            a$a.d = object;
            AJIOApplication.Companion.getClass();
            object = AJIOApplication.h;
            Intrinsics.checkNotNull(object);
            a$a.a = object;
            a$a.c = n4;
            a$a.e = n3 = 2;
            Intrinsics.checkNotNullExpressionValue(a$a, "setFlags(...)");
            object = new ll0_0();
            Yo2 yo2 = new Yo2(object);
            object4 = new Object();
            androidx.media3.exoplayer.upstream.a a2 = new Object();
            object = new MediaItem$a$a();
            Object object5 = new MediaItem$c$a();
            List list = Collections.emptyList();
            ImmutableList immutableList = ImmutableList.of();
            Object object6 = new MediaItem$d$a();
            MediaItem$f mediaItem$f = MediaItem$f.a;
            Object object7 = pj0_22.l;
            if (object7 != null && (object7 = (Subcomponent)CollectionsKt.N(n8 = pj0_22.p, (List)object7)) != null && (object7 = ((Subcomponent)object7).getPostMedia()) != null && (object7 = (Media)CollectionsKt.firstOrNull((List)object7)) != null) {
                object7 = ((Media)object7).getUrl();
            } else {
                bl2 = false;
                object7 = null;
            }
            Uri uri = Uri.parse((String)object7);
            object7 = ((MediaItem$c$a)object5).b;
            int n10 = 0;
            if (object7 != null && (object7 = ((MediaItem$c$a)object5).a) == null) {
                bl2 = false;
                object7 = null;
            } else {
                bl2 = true;
            }
            ct3.f(bl2);
            if (uri != null) {
                object3 = ((MediaItem$c$a)object5).a;
                Object object8 = object3 != null ? (object3 = new MediaItem$c((MediaItem$c$a)object5)) : null;
                long l2 = -9223372036854775807L;
                object3 = object7;
                object7 = new MediaItem$e(uri, null, (MediaItem$c)object8, list, null, immutableList, null, l2);
            } else {
                bl2 = false;
                object7 = null;
            }
            object5 = new MediaItem$a((MediaItem$a$a)object);
            object = new MediaItem$d((MediaItem$d$a)object6);
            e e2 = androidx.media3.common.e.I;
            String string2 = "";
            object3 = new MediaItem(string2, (MediaItem$b)object5, (MediaItem$e)object7, (MediaItem$d)object, e2, mediaItem$f);
            object7.getClass();
            ((MediaItem)object3).b.getClass();
            object5 = ((MediaItem)object3).b.c;
            if (object5 == null) {
                object2 = androidx.media3.exoplayer.drm.c.a;
            } else {
                // MONITORENTER : object4
                boolean bl3 = ((MediaItem$c)object5).equals(null);
                if (!bl3) {
                    object2 = androidx.media3.exoplayer.drm.a.b((MediaItem$c)object5);
                }
                object2.getClass();
                // MONITOREXIT : object4
            }
            object7 = object2;
            n7 = 0x100000;
            uri = null;
            object5 = object;
            object6 = object3;
            n8 = n7;
            object = new o((MediaItem)object3, a$a, yo2, (c)object2, a2, n7, false);
            Intrinsics.checkNotNullExpressionValue(object, "createMediaSource(...)");
            object2 = pj0_22.n;
            if (object2 != null) {
                ((androidx.media3.exoplayer.e)object2).setMediaSource((j)object);
            }
            if ((object = pj0_22.n) != null) {
                ((androidx.media3.exoplayer.e)object).prepare();
            }
            if ((object = pj0_22.z) != null) {
                n7 = -16777216;
                ((PlayerView)((Object)object)).setShutterBackgroundColor(n7);
            }
            if ((object = pj0_22.z) != null) {
                object2 = pj0_22.n;
                ((PlayerView)((Object)object)).setPlayer((f)object2);
            }
            object = h40_0.a;
            object = h40_0.y().isAudioMuted();
            if (object != null) {
                n10 = ((Boolean)object).booleanValue();
            }
            n3 = n10 ^ 1;
            pj0_22.b = n3;
            this.Sa();
            object = pj0_22.n;
            if (object != null) {
                object2 = new rj0_0(pj0_22);
                object = ((androidx.media3.exoplayer.e)object).l;
                ((vv1_0)object).a(object2);
            }
            if ((object = pj0_22.A) != null) {
                ai0_2.B((View)object);
            }
        } else {
            int n14;
            object = pj0_22.A;
            if (object != null) {
                ai0_2.i((View)object);
            }
            if ((object = pj0_22.z) != null) {
                gp0_1.a((View)object);
            }
            if ((object = pj0_22.E) != null) {
                gp0_1.a((View)object);
            }
            if ((object = pj0_22.C) != null) {
                gp0_1.c((View)object);
            }
            object = new da$a();
            ((da$a)object).k = n4;
            ((da$a)object).g = n4;
            Object object9 = pj0_22.l;
            if (object9 != null && (object9 = (Subcomponent)CollectionsKt.N(n14 = pj0_22.p, (List)object9)) != null && (object9 = ((Subcomponent)object9).getPostMedia()) != null && (object9 = (Media)CollectionsKt.firstOrNull((List)object9)) != null) {
                object2 = ((Media)object9).getUrl();
            }
            object9 = pj0_22.C;
            Intrinsics.checkNotNull(object9);
            ((da$a)object).n = object2;
            ((da$a)object).u = object9;
            ((da$a)object).a();
            object = pj0_22.L;
            if (object != null) {
                ai0_2.a((View)object);
            }
        }
        if ((object = pj0_22.D) == null) return;
        ai0_2.i((View)object);
    }

    public final void Y(int n3, Product product, String object, int n4, String string2, String object2) {
        Object object3;
        Object object4 = this.d;
        if (object4 == null) {
            object4 = "pdpListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object3 = null;
        } else {
            object3 = object4;
        }
        Object object5 = ld3_2.STORE_AJIOGRAM.getStoreId();
        String string3 = object;
        String string4 = object2;
        object3.S0(n4, (String)object, (String)object5, (String)object2, null);
        object4 = this.i;
        if (object4 != null) {
            object4 = ((Subcomponent)object4).isSeen();
            object = Boolean.TRUE;
            n3 = (int)(Intrinsics.areEqual(object4, object) ? 1 : 0);
        } else {
            n3 = 0;
            object4 = null;
        }
        object4 = n3 != 0 ? "seen" : "unseen";
        object = AnalyticsManager.Companion;
        Object object6 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        object2 = this.j;
        object2 = object2 != null && (object2 = ((Component)object2).getSubComponentsOwner()) != null ? ((SubcomponentsOwner)object2).getName() : null;
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append("-post screen");
        object2 = ((StringBuilder)object3).toString();
        ((GTMEvents)object6).setScreenName((String)object2);
        object6 = sq0_1.a;
        object6 = this.j;
        object5 = object6 != null ? (object6 = ((Component)object6).getPostId()) : null;
        object6 = this.j;
        if (object6 != null && (object6 = ((Component)object6).getSubComponentsOwner()) != null) {
            object6 = ((SubcomponentsOwner)object6).getName();
        } else {
            n4 = 0;
            object6 = null;
        }
        string4 = UX.c("fleek_", (String)object4, "_post_shop_product_", (String)object6);
        String string5 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        string3 = "post_id";
        Intrinsics.checkNotNullParameter(string3, "customDimensionKey");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        object3 = object4;
        object4 = new tq0_1(string5, string3, (String)object5, string4, product, null);
        Ae3.d(sq0_1.d, null, null, (Function2)object4, 3);
    }

    public final boolean d1(int n3, int n4) {
        int n7 = 53;
        if (n3 == n7 && n4 == (n3 = -1)) {
            Object object;
            Object object2 = this.getArguments();
            if (object2 != null && (n3 = (int)((object2 = this.requireArguments()).containsKey((String)(object = "PLP_TYPE")) ? 1 : 0)) != 0) {
                object2 = this.requireArguments();
                n7 = 100;
                n3 = object2.getInt((String)object, n7);
            } else {
                n3 = 103;
            }
            object = this.Qa().h.b;
            if (object != null && (object = ((Product)object).getFnlColorVariantData()) != null && (object = ((ProductFnlColorVariantData)object).getColorGroup()) != null && (n7 = ((String)object).length()) > 0) {
                Object object3 = this.f;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    n7 = 0;
                    object3 = null;
                }
                object3.startLoader();
                object3 = this.Qa();
                ((e43_0)object3).c(n3, (String)object);
            }
            object2 = new oj0_1(this, 0);
            gp0_1.b((Function0)object2, this);
            return true;
        }
        return false;
    }

    public final boolean l() {
        U.put(0, 0);
        Object object = this.D;
        if (object != null) {
            ((StoriesProgressView)((Object)object)).b();
        }
        if ((object = this.n) != null) {
            ((androidx.media3.exoplayer.e)object).stop();
        }
        if ((object = this.n) != null) {
            ((androidx.media3.exoplayer.e)object).release();
        }
        object = this.h;
        String string2 = "fleekViewModel";
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ((dr0_0)object).O.setValue(null);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        ((dr0_0)object2).N = false;
        return false;
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object object2 = object;
        object2 = (qk2_0)object;
        this.o = object2;
        boolean bl2 = object instanceof ea2_1;
        if (bl2) {
            Object object3 = object;
            object3 = (ea2_1)object;
            this.c = object3;
        }
        if (bl2) {
            object2 = object;
            object2 = (ea2_1)object;
            this.d = object2;
            bl2 = object instanceof lz1_1;
            if (bl2) {
                object2 = object;
                object2 = (lz1_1)object;
                this.e = object2;
                bl2 = object instanceof j3_0;
                if (bl2) {
                    object = (j3_0)object;
                    this.f = object;
                    return;
                }
                object = pn_2.b(object, " must implement ActivityFragmentListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement LoginListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ProductDetailListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        Component component;
        int n3;
        void var1_4;
        int n4;
        int n7 = 0;
        if (object != null) {
            n4 = object.getId();
            Integer n8 = n4;
        } else {
            n4 = 0;
            Object var1_3 = null;
        }
        int n10 = R$id.compTitleSubTitle;
        boolean bl2 = true;
        if (var1_4 == null || (n3 = var1_4.intValue()) != n10) {
            n10 = R$id.storyDisplayProfilePicture;
            if (var1_4 == null || (n3 = var1_4.intValue()) != n10) {
                androidx.media3.exoplayer.e e2;
                n7 = R$id.imgReplay;
                if (var1_4 != null && (n10 = var1_4.intValue()) == n7) {
                    StoriesProgressView storiesProgressView;
                    androidx.media3.exoplayer.e e5;
                    this.S = bl2;
                    ImageView imageView = this.w;
                    if (imageView != null) {
                        ai0_2.i((View)imageView);
                    }
                    if ((e5 = this.n) != null) {
                        n7 = 5;
                        long l2 = 0L;
                        e5.c(n7, l2);
                    }
                    if ((n4 = (int)(this.r ? 1 : 0)) == 0) return;
                    androidx.media3.exoplayer.e e7 = this.n;
                    if (e7 != null) {
                        e7.setPlayWhenReady(bl2);
                    }
                    if ((storiesProgressView = this.D) == null) return;
                    n7 = this.p;
                    storiesProgressView.g(n7);
                    return;
                }
                n7 = R$id.imgPlay;
                if (var1_4 == null) {
                    return;
                }
                n4 = var1_4.intValue();
                if (n4 != n7) return;
                AppCompatImageView appCompatImageView = this.B;
                if (appCompatImageView != null) {
                    ai0_2.i((View)appCompatImageView);
                }
                if ((e2 = this.n) == null) return;
                e2.setPlayWhenReady(bl2);
                return;
            }
        }
        if ((component = this.j) == null) return;
        SubcomponentsOwner subcomponentsOwner = component.getSubComponentsOwner();
        if (subcomponentsOwner == null) return;
        String string2 = subcomponentsOwner.getId();
        if (string2 == null) return;
        Object object2 = this.getActivity();
        n3 = object2 instanceof AjioHomeActivity;
        if (n3 != 0) {
            object2 = (AjioHomeActivity)object2;
        } else {
            n10 = 0;
            object2 = null;
        }
        if (object2 != null) {
            ((AjioHomeActivity)object2).t1 = bl2;
        }
        object2 = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        String string3 = "https://ajiogram.ajio.com/brand/".concat(string2);
        Boolean bl3 = Boolean.TRUE;
        ((kj0_1)object2).s(fragmentActivity, string3, null, bl3);
    }

    public final void onComplete() {
        Object object = this.n;
        if (object != null) {
            ((androidx.media3.exoplayer.e)object).release();
        }
        if ((object = this.o) != null) {
            object.R();
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
        String string2 = "factory";
        object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
        String string3 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string3, (rd3_0)object3, (E$b)object2, (Wd0)object);
        object2 = dr0_0.class;
        object3 = "modelClass";
        object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.h = object = (dr0_0)((pD3)object).a((yn1_2)object2, (String)object3);
            object2 = "post screen";
            object = E1.a("screen_type", (String)object2);
            vb0_0.a(AnalyticsManager.Companion, (String)object2, (Bundle)object);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.story_display_item;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        Object object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
            object = null;
        }
        object = ((dr0_0)object).L;
        Qw2$b qw2$b = Qw2$b.a;
        ((kb3_2)object).setValue(qw2$b);
        super.onDestroy();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Object object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
            object = null;
        }
        object = ((dr0_0)object).L;
        Qw2$b qw2$b = Qw2$b.a;
        ((kb3_2)object).setValue(qw2$b);
        object = U;
        qw2$b = null;
        object.put(0, 0);
        object = this.D;
        if (object != null) {
            ((StoriesProgressView)((Object)object)).b();
        }
        if ((object = this.n) != null) {
            ((androidx.media3.exoplayer.e)object).stop();
        }
        if ((object = this.n) != null) {
            ((androidx.media3.exoplayer.e)object).release();
        }
    }

    public final void onPause() {
        int n3;
        int n4;
        super.onPause();
        Object object = this.n;
        ArrayList arrayList = null;
        if (object != null) {
            object.setPlayWhenReady(false);
        }
        if ((object = this.n) != null) {
            ((androidx.media3.exoplayer.e)object).setPlayWhenReady(false);
        }
        if ((object = this.D) != null && (n4 = (arrayList = ((StoriesProgressView)((Object)object)).a).size()) > (n3 = ((StoriesProgressView)((Object)object)).d) && n3 >= 0) {
            object = (PausableProgressBar)((Object)arrayList.get(n3));
            ((PausableProgressBar)((Object)object)).setMinWithoutCallback();
        }
    }

    public final void onResume() {
        int n3;
        boolean bl2;
        super.onResume();
        this.q = bl2 = true;
        Object object = this.l;
        if (object != null && (object = (Subcomponent)CollectionsKt.N(n3 = this.p, (List)object)) != null) {
            object = ((Subcomponent)object).getPostMedia();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = ov3.x((List)object);
        if (bl2 && !(bl2 = this.s) && (object = this.n) != null) {
            n3 = 0;
            ((androidx.media3.exoplayer.e)object).setPlayWhenReady(false);
        }
        if ((object = this.n) != null) {
            n3 = 5;
            long l2 = 0L;
            ((b)object).c(n3, l2);
        }
        if ((object = this.D) != null) {
            n3 = this.p;
            ((StoriesProgressView)((Object)object)).g(n3);
        }
        object = new oj0_1(this, 0);
        gp0_1.b((Function0)object, this);
    }

    public final void onStop() {
        super.onStop();
        Message message = new Message();
        message.what = 1002;
        AnalyticsGAEventHandler.Companion.getInstance().sendMessage(message);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.shimmer_stl_products;
        object2 = (ShimmerFrameLayout)object.findViewById(n4);
        this.v = object2;
        n4 = R$id.imgReplay;
        object2 = (ImageView)object.findViewById(n4);
        this.w = object2;
        if (object2 != null) {
            n3 = R$string.video_replay;
            object3 = this.getString(n3);
            object2.setContentDescription((CharSequence)object3);
        }
        n4 = R$id.composeError;
        object2 = (ComposeView)object.findViewById(n4);
        this.x = object2;
        n4 = R$id.stlHRv;
        object2 = (RecyclerView)object.findViewById(n4);
        this.t = object2;
        n4 = R$id.stlTitleTv;
        object2 = (AppCompatTextView)object.findViewById(n4);
        this.u = object2;
        n4 = R$id.storyDisplayVideo;
        object2 = (PlayerView)object.findViewById(n4);
        this.z = object2;
        n4 = R$id.imgVolume;
        object2 = (AppCompatImageView)object.findViewById(n4);
        this.A = object2;
        n4 = R$id.imgPlay;
        object2 = (AppCompatImageView)object.findViewById(n4);
        this.B = object2;
        n4 = R$id.feedDisplayImage;
        object2 = (AppCompatImageView)object.findViewById(n4);
        this.C = object2;
        n4 = R$id.storiesProgressView;
        object2 = (StoriesProgressView)object.findViewById(n4);
        this.D = object2;
        n4 = R$id.storyDisplayVideoProgress;
        object2 = (ProgressBar)object.findViewById(n4);
        this.E = object2;
        n4 = R$id.storyDisplayDesc;
        object2 = (TextView)object.findViewById(n4);
        this.F = object2;
        n4 = R$id.previous;
        object2 = object.findViewById(n4);
        this.G = object2;
        n4 = R$id.next;
        object2 = object.findViewById(n4);
        this.H = object2;
        n4 = R$id.layerBottomShadow;
        object2 = object.findViewById(n4);
        this.m = object2;
        n4 = R$id.storyDisplayProfilePicture;
        object2 = (AppCompatImageView)object.findViewById(n4);
        this.I = object2;
        n4 = R$id.compTitleSubTitle;
        object2 = (LinearLayoutCompat)object.findViewById(n4);
        this.J = object2;
        n4 = R$id.storyDisplayNick;
        object2 = (TextView)object.findViewById(n4);
        this.K = object2;
        n4 = R$id.icCross;
        object2 = (AppCompatImageView)object.findViewById(n4);
        this.L = object2;
        if (object2 != null) {
            n3 = R$string.video_close_btn;
            object3 = this.getString(n3);
            object2.setContentDescription((CharSequence)object3);
        }
        n4 = R$id.storyOverlay;
        object = (RelativeLayout)object.findViewById(n4);
        this.M = object;
        object = this.z;
        if (object != null) {
            n4 = 0;
            object2 = null;
            object.setUseController(false);
        }
        if ((object = this.A) != null) {
            object2 = new mj0_0(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.B) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.L) != null) {
            n3 = 1;
            object2 = new k4_0(n3, this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.x) != null) {
            object2 = new pJ0$c(this);
            int n7 = 537766678;
            boolean bl2 = true;
            object3 = new u10(n7, object2, bl2);
            object.setContent((Function2)object3);
        }
        this.Va();
    }
}

