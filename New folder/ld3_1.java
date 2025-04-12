/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
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
import android.app.Activity;
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
import androidx.constraintlayout.widget.ConstraintLayout;
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
import androidx.media3.datasource.DataSource$Factory;
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
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView$b;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.PostData;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.user.UserInformation;
import java.io.Serializable;
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
 * Renamed from Ld3
 */
public final class ld3_1
extends Fragment
implements StoriesProgressView$b,
sz2_1,
View.OnClickListener {
    public static final ld3$a_0 Companion;
    public static final SparseIntArray S;
    public ProgressBar A;
    public TextView B;
    public View C;
    public View D;
    public AppCompatImageView E;
    public LinearLayoutCompat F;
    public TextView G;
    public ImageView H;
    public RelativeLayout I;
    public String J;
    public int K;
    public long L;
    public ComposeView M;
    public ConstraintLayout N;
    public final Handler O;
    public final Vt2 P;
    public boolean Q;
    public final Ld3$b R;
    public Float a;
    public boolean b;
    public final hh3_2 c;
    public ea2_1 d;
    public ea2_1 e;
    public dr0_0 f;
    public lz1_1 g;
    public j3_0 h;
    public final D i;
    public Subcomponent j;
    public final hh3_2 k;
    public final hh3_2 l;
    public androidx.media3.exoplayer.e m;
    public qk2_0 n;
    public int o;
    public boolean p;
    public boolean q;
    public ShimmerFrameLayout r;
    public RecyclerView s;
    public AppCompatTextView t;
    public View u;
    public g33_0 v;
    public PlayerView w;
    public AppCompatImageView x;
    public AppCompatImageView y;
    public StoriesProgressView z;

    static {
        ld3$a_0 ld3$a_0;
        Companion = ld3$a_0 = new Object();
        ld3$a_0 = new SparseIntArray();
        S = ld3$a_0;
    }

    public ld3_1() {
        Object object = Float.valueOf(0.0f);
        this.a = object;
        object = new jd3_2(this);
        this.c = object = yr1_2.b((Function0)object);
        object = Reflection.getOrCreateKotlinClass(f23_0.class);
        Ld3$e ld3$e = new Ld3$e(this);
        Ld3$f ld3$f = new Ld3$f(this);
        Ld3$g ld3$g = new Ld3$g(this);
        this.i = object = LW0.a(this, (yn1_2)object, ld3$e, ld3$f, ld3$g);
        object = new qg0_2(this, 1);
        this.k = object = yr1_2.b((Function0)object);
        object = new kd3_1(this);
        this.l = object = yr1_2.b((Function0)object);
        this.J = "";
        ld3$e = Looper.getMainLooper();
        object = new Handler((Looper)ld3$e);
        this.O = object;
        this.P = object = new Vt2(this, 1);
        this.R = object = new Object();
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
            object = this.g;
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
            object4 = this.h;
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
        int n3 = this.o;
        int n4 = n3 + -1;
        if (n4 < 0) {
            return;
        }
        this.o = n3 += -1;
        SparseIntArray sparseIntArray = S;
        int n7 = this.Oa();
        sparseIntArray.put(n7, n3);
        this.Za();
    }

    public final void C(Product object, String object2) {
        int n3;
        object2 = ((Product)object).getFnlColorVariantData();
        if (object2 != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null && (n3 = ((String)object2).length()) > 0) {
            Object object3 = this.h;
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
        Object object = this.Pa();
        Object object2 = Boolean.TRUE;
        object = ((f23_0)object).d;
        object.getClass();
        String string2 = null;
        ((kb3_2)object).k(null, object2);
        object = this.j;
        if (object != null) {
            int n3;
            object = this.Pa();
            object2 = this.Ra();
            if (object2 != null && (object2 = (Resource)CollectionsKt.N(n3 = this.o, (List)object2)) != null && (object2 = ((Resource)object2).getPostData()) != null) {
                string2 = ((PostData)object2).getPostId();
            }
            if (string2 != null) {
                object = ((f23_0)object).c;
                boolean bl2 = ((ArrayList)object).contains(string2);
                if (!bl2) {
                    ((ArrayList)object).add(string2);
                }
            } else {
                object.getClass();
            }
        }
    }

    public final int Oa() {
        return ((Number)this.c.getValue()).intValue();
    }

    public final f23_0 Pa() {
        return (f23_0)this.i.getValue();
    }

    public final e43_0 Qa() {
        return (e43_0)this.k.getValue();
    }

    public final List Ra() {
        return (List)this.l.getValue();
    }

    public final void Sa(RecyclerView recyclerView) {
        AppCompatTextView appCompatTextView = this.t;
        if (appCompatTextView != null) {
            ai0_2.i((View)appCompatTextView);
        }
        if ((appCompatTextView = this.u) != null) {
            ai0_2.i((View)appCompatTextView);
        }
        ai0_2.i((View)recyclerView);
    }

    public final void Ta(boolean bl2) {
        block12: {
            block11: {
                block10: {
                    boolean bl3 = true;
                    if (bl2 != bl3) break block10;
                    ViewGroup viewGroup = this.M;
                    if (viewGroup != null) {
                        ai0_2.B((View)viewGroup);
                    }
                    if ((viewGroup = this.N) != null) {
                        ai0_2.B((View)viewGroup);
                    }
                    if ((viewGroup = this.I) != null) {
                        ai0_2.i((View)viewGroup);
                    }
                    break block11;
                }
                if (bl2) break block12;
                ViewGroup viewGroup = this.M;
                if (viewGroup != null) {
                    ai0_2.i((View)viewGroup);
                }
                if ((viewGroup = this.N) != null) {
                    ai0_2.i((View)viewGroup);
                }
                if ((viewGroup = this.I) != null) {
                    ai0_2.B((View)viewGroup);
                }
            }
            return;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    public final void Ua() {
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
                    object2 = this.m;
                    if (object2 != null) {
                        ((androidx.media3.exoplayer.e)object2).setVolume(f6);
                    }
                } else {
                    object3 = this.m;
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
            object3 = this.x;
            if (object3 != null) {
                object = R$string.video_mute;
                object2 = hv3_0.K(object);
                object3.setContentDescription((CharSequence)object2);
            }
            if ((object3 = this.x) != null) {
                object2 = this.requireContext();
                int n3 = R$drawable.ic_unmute_video;
                object2 = xn.a((Context)object2, n3);
                ((AppCompatImageView)((Object)object3)).setImageDrawable((Drawable)object2);
            }
        } else {
            float f8;
            Object object4 = this.m;
            if (object4 != null) {
                ((androidx.media3.exoplayer.e)object4).E();
                f8 = ((androidx.media3.exoplayer.e)object4).h0;
                this.a = object4 = Float.valueOf(f8);
            }
            if ((object4 = this.m) != null) {
                ((androidx.media3.exoplayer.e)object4).setVolume(0.0f);
            }
            bl2 = true;
            f8 = Float.MIN_VALUE;
            this.b = bl2;
            object4 = this.x;
            if (object4 != null) {
                object = R$string.video_unmute;
                object2 = hv3_0.K(object);
                object4.setContentDescription((CharSequence)object2);
            }
            if ((object4 = this.x) != null) {
                object2 = this.requireContext();
                int n4 = R$drawable.ic_mute_video;
                object2 = xn.a((Context)object2, n4);
                ((AppCompatImageView)((Object)object4)).setImageDrawable((Drawable)object2);
            }
        }
    }

    public final void V() {
        int n3;
        List list = this.Ra();
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        int n4 = this.o + 1;
        if (n3 <= n4) {
            return;
        }
        this.o = n4;
        list = S;
        int n7 = this.Oa();
        list.put(n7, n4);
        this.Za();
    }

    public final void Va() {
        boolean bl2 = this.p;
        if (bl2) {
            Object object = this.m;
            if (object != null) {
                boolean bl3 = true;
                ((androidx.media3.exoplayer.e)object).setPlayWhenReady(bl3);
            }
            this.Xa();
            object = this.z;
            if (object != null) {
                ((StoriesProgressView)((Object)object)).d();
            }
        }
    }

    public final void Wa() {
        int n3;
        Object object = this.s;
        Object object2 = null;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.s;
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
            int n4 = this.K;
            if (n3 >= n4) {
                int n7;
                Object object4;
                Object object5;
                int n8;
                int n10;
                Object object6 = new ArrayList();
                Object object7 = new ArrayList();
                Object object8 = this.Ra();
                if (object8 != null && (object8 = (Resource)CollectionsKt.N(n10 = this.o, (List)object8)) != null && (object8 = ((Resource)object8).getPostData()) != null) {
                    object8 = ((PostData)object8).getInnerResources();
                } else {
                    n8 = 0;
                    object8 = null;
                }
                if (object8 != null && (n10 = (int)(((Collection)object8).isEmpty() ? 1 : 0)) == 0) {
                    object8 = ((Iterable)object8).iterator();
                    while ((n10 = (int)(object8.hasNext() ? 1 : 0)) != 0) {
                        object5 = (Product)object8.next();
                        object4 = ((Product)object5).getFnlColorVariantData();
                        if (object4 != null) {
                            object4 = ((ProductFnlColorVariantData)object4).getColorGroup();
                        } else {
                            n7 = 0;
                            object4 = null;
                        }
                        ((Product)object5).setCode((String)object4);
                        ((ArrayList)object7).add(object5);
                    }
                }
                if ((n8 = ((ArrayList)object7).isEmpty() ^ 1) != 0 && (n8 = this.K) <= n3) {
                    while (true) {
                        if (n8 < (n10 = ((ArrayList)object7).size())) {
                            ((Product)((ArrayList)object7).get(n8)).setPosition(n8);
                            object5 = ((ArrayList)object7).get(n8);
                            ((ArrayList)object6).add(object5);
                        }
                        if (n8 == n3) break;
                        ++n8;
                    }
                }
                object7 = (object7 = this.j) != null && (object7 = ((Subcomponent)object7).getResourceOwner()) != null ? ((ResourceOwner)object7).getName() : null;
                object8 = this.j;
                if (object8 != null && (object8 = ((Subcomponent)object8).getResources()) != null && (object8 = (Resource)CollectionsKt.N(n10 = this.o, (List)object8)) != null && (object8 = ((Resource)object8).getPostData()) != null) {
                    ((PostData)object8).getSubTitle();
                }
                object8 = (n8 = (int)(Intrinsics.areEqual(object8 = this.J, object5 = "BRAND_THUMBNAIL") ? 1 : 0)) != 0 ? "tile" : "bubble";
                object5 = "fleek_story_";
                object4 = "_shop_product_widget_";
                object8 = UX.c((String)object5, (String)object8, (String)object4, (String)object7);
                n10 = ((ArrayList)object6).isEmpty() ^ 1;
                if (n10 != 0) {
                    int n14;
                    object5 = new Message();
                    ((Message)object5).what = n7 = 1001;
                    object4 = new JSONObject();
                    String string2 = "productImpression";
                    object4.put(string2, object6);
                    object6 = this.j;
                    if (object6 != null && (object6 = ((Subcomponent)object6).getResources()) != null && (object6 = (Resource)CollectionsKt.N(n14 = this.o, (List)object6)) != null && (object6 = ((Resource)object6).getPostData()) != null) {
                        object2 = ((PostData)object6).getPostId();
                    }
                    object4.put("story_id", object2);
                    object4.put("listName", object8);
                    object4.put("sizeText", (Object)"");
                    object4.put("isPLP", false);
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object7);
                    object3 = "-story screen";
                    ((StringBuilder)object2).append((String)object3);
                    object2 = ((StringBuilder)object2).toString();
                    object6 = "screenName";
                    object4.put((String)object6, object2);
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object7);
                    ((StringBuilder)object2).append((String)object3);
                    object2 = ((StringBuilder)object2).toString();
                    object4.put("screenType", object2);
                    ((Message)object5).obj = object4;
                    object2 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object5);
                    object3 = this.R;
                    ((AnalyticsGAEventHandler)((Object)object2)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object3);
                }
                this.K = ++n3;
            }
        }
    }

    public final void X6(int n3) {
        int n4;
        Object object = this.J;
        Object object2 = "BRAND_THUMBNAIL";
        int n7 = Intrinsics.areEqual(object, object2);
        object = n7 != 0 ? "tile" : "bubble";
        object2 = this.j;
        object2 = object2 != null && (object2 = ((Subcomponent)object2).getResourceOwner()) != null ? ((ResourceOwner)object2).getName() : null;
        String string2 = "fleek_story_";
        String string3 = "_";
        String string4 = UX.c(string2, (String)object, string3, (String)object2);
        object = this.Ra();
        object2 = "";
        Object object3 = object != null && (object = (Resource)CollectionsKt.N(n4 = this.o, (List)object)) != null && (object = ((Resource)object).getPostData()) != null && (object = ((PostData)object).getPostId()) != null ? object : object2;
        object = this.Ra();
        Object object4 = object != null && (object = (Resource)CollectionsKt.N(n4 = this.o, (List)object)) != null && (object = ((Resource)object).getPostData()) != null && (object = ((PostData)object).getSubTitle()) != null ? object : object2;
        n7 = this.Oa();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(n7);
        ((StringBuilder)object2).append("|");
        ((StringBuilder)object2).append(n3);
        String string5 = ((StringBuilder)object2).toString();
        sq0_1.i("story screen", (String)object3, string4, (String)object4, string5, false);
    }

    public final void Xa() {
        Object object = this.I;
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
            if (bl2 && (object = this.I) != null && (object = object.animate()) != null && (object = object.setDuration(l2 = (long)100)) != null && (object = object.alpha(f7 = 1.0f)) != null) {
                object.start();
            }
        }
    }

    public final void Y(int n3, Product product, String object, int n4, String object2, String string2) {
        int n7;
        Object object3;
        Object object4 = this.Pa();
        object2 = Boolean.TRUE;
        object4 = ((f23_0)object4).e;
        object4.getClass();
        ((kb3_2)object4).k(null, object2);
        object4 = this.e;
        if (object4 == null) {
            object4 = "pdpListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object3 = null;
        } else {
            object3 = object4;
        }
        Object object5 = ld3_2.STORE_AJIOGRAM.getStoreId();
        String string3 = object;
        String string4 = string2;
        object3.S0(n4, (String)object, (String)object5, string2, null);
        object4 = this.J;
        object = "BRAND_THUMBNAIL";
        n3 = (int)(Intrinsics.areEqual(object4, object) ? 1 : 0);
        object4 = n3 != 0 ? "tile" : "bubble";
        object = this.j;
        object = object != null && (object = ((Subcomponent)object).getResourceOwner()) != null ? ((ResourceOwner)object).getName() : null;
        Object object6 = this.j;
        if (object6 != null && (object6 = ((Subcomponent)object6).getResources()) != null && (object6 = (Resource)CollectionsKt.N(n7 = this.o, (List)object6)) != null && (object6 = ((Resource)object6).getPostData()) != null) {
            ((PostData)object6).getSubTitle();
        }
        object6 = sq0_1.a;
        object6 = this.j;
        object5 = object6 != null && (object6 = ((Subcomponent)object6).getResources()) != null && (object6 = (Resource)CollectionsKt.N(n7 = this.o, (List)object6)) != null && (object6 = ((Resource)object6).getPostData()) != null ? (object6 = ((PostData)object6).getPostId()) : null;
        string4 = UX.c("fleek_story_", (String)object4, "_shop_product_widget_", (String)object);
        object4 = new StringBuilder();
        ((StringBuilder)object4).append((String)object);
        ((StringBuilder)object4).append("-story screen");
        String string5 = ((StringBuilder)object4).toString();
        string3 = "story_id";
        Intrinsics.checkNotNullParameter(string3, "customDimensionKey");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        object3 = object4;
        object4 = new tq0_1(string5, string3, (String)object5, string4, product, null);
        Ae3.d(sq0_1.d, null, null, (Function2)object4, 3);
    }

    public final void Ya(RecyclerView object, boolean bl2, List object2) {
        ai0_2.B((View)object);
        object = this.t;
        if (object != null) {
            ai0_2.B((View)object);
        }
        if ((object = this.u) != null) {
            ai0_2.B((View)object);
        }
        Object object3 = Looper.getMainLooper();
        object = new Handler(object3);
        int n3 = 1;
        object3 = new SV0(this, n3);
        long l2 = 500L;
        object.postDelayed((Runnable)object3, l2);
        if (bl2 && (object = this.v) != null) {
            List list;
            if (object2 == null || (list = CollectionsKt.k0((Iterable)(object2 = (Iterable)object2))) == null) {
                list = mz0_2.a;
            }
            object2 = "productList";
            Intrinsics.checkNotNullParameter(list, (String)object2);
            ((g33_0)object).b = list;
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void Za() {
        int n3;
        int n4;
        int n15;
        boolean bl3;
        Object object;
        Object object2;
        String string2;
        e e2;
        Object object3;
        Object object4;
        Object object5;
        Uri uri;
        boolean bl2;
        int n7;
        Serializable serializable;
        MediaItem$f mediaItem$f;
        Object object6;
        ImmutableList immutableList;
        List list;
        Object object7;
        androidx.media3.exoplayer.upstream.a a2;
        Yo2 yo2;
        Object object8;
        Object object9;
        int n8;
        int n10;
        ld3_1 ld3_12 = this;
        Object object12 = null;
        this.Q = false;
        Object object11 = this.m;
        if (object11 != null) {
            ((androidx.media3.exoplayer.e)object11).stop();
        }
        object11 = this.Ra();
        int n14 = 0;
        Object object10 = null;
        if (object11 != null && (object11 = (Resource)CollectionsKt.N(n10 = ld3_12.o, (List)object11)) != null && (object11 = ((Resource)object11).getPostData()) != null) {
            object11 = ((PostData)object11).getPostMedia();
        } else {
            n8 = 0;
            object11 = null;
        }
        n8 = ov3.x((List)object11);
        n10 = 1;
        if (n8 != 0) {
            object11 = ld3_12.w;
            if (object11 != null) {
                gp0_1.c((View)object11);
            }
            if ((object11 = ld3_12.y) != null) {
                gp0_1.a((View)object11);
            }
            if ((object11 = ld3_12.A) != null) {
                gp0_1.c((View)object11);
            }
            if ((object11 = ld3_12.m) == null) {
                object9 = this.requireActivity();
                object11 = new ExoPlayer$c((Context)object9);
                ld3_12.m = object11 = ((ExoPlayer$c)object11).a();
            } else {
                ((androidx.media3.exoplayer.e)object11).release();
                ld3_12.m = null;
                object9 = this.requireActivity();
                object11 = new ExoPlayer$c((Context)object9);
                object11 = ((ExoPlayer$c)object11).a();
                ld3_12.m = object11;
            }
            object11 = new c$a();
            object9 = gz3.y((Context)this.requireActivity(), "YourApp");
            ((c$a)object11).c = object9;
            Intrinsics.checkNotNullExpressionValue(object11, "setUserAgent(...)");
            object8 = new a$a();
            ((a$a)object8).d = object11;
            AJIOApplication.Companion.getClass();
            object11 = AJIOApplication.h;
            Intrinsics.checkNotNull(object11);
            ((a$a)object8).a = object11;
            ((a$a)object8).c = n10;
            ((a$a)object8).e = n8 = 2;
            Intrinsics.checkNotNullExpressionValue(object8, "setFlags(...)");
            object11 = new ll0_0();
            yo2 = new Yo2(object11);
            object11 = new Object();
            a2 = new Object();
            object9 = new MediaItem$a$a();
            object7 = new MediaItem$c$a();
            list = Collections.emptyList();
            immutableList = ImmutableList.of();
            object6 = new MediaItem$d$a();
            mediaItem$f = MediaItem$f.a;
            serializable = this.Ra();
            if (serializable != null && (serializable = (Resource)CollectionsKt.N(n7 = ld3_12.o, serializable)) != null && (serializable = ((Resource)((Object)serializable)).getPostData()) != null && (serializable = ((PostData)((Object)serializable)).getPostMedia()) != null && (serializable = (Media)CollectionsKt.firstOrNull(serializable)) != null) {
                serializable = ((Media)((Object)serializable)).getUrl();
            } else {
                bl2 = false;
                serializable = null;
            }
            uri = Uri.parse((String)((Object)serializable));
            serializable = ((MediaItem$c$a)object7).b;
            if (serializable != null && (serializable = ((MediaItem$c$a)object7).a) == null) {
                bl2 = false;
                serializable = null;
            } else {
                bl2 = true;
            }
            ct3.f(bl2);
            if (uri != null) {
                object5 = ((MediaItem$c$a)object7).a;
                object4 = object5 != null ? (object5 = new MediaItem$c((MediaItem$c$a)object7)) : null;
                long l2 = -9223372036854775807L;
                object3 = serializable;
                serializable = new Serializable(uri, null, (MediaItem$c)object4, list, null, immutableList, null, l2);
            } else {
                bl2 = false;
                serializable = null;
            }
            object7 = new MediaItem$a((MediaItem$a$a)object9);
            object9 = new MediaItem$d((MediaItem$d$a)object6);
            e2 = androidx.media3.common.e.I;
            string2 = "";
            object2 = new MediaItem(string2, (MediaItem$b)object7, (MediaItem$e)((Object)serializable), (MediaItem$d)object9, e2, mediaItem$f);
            serializable.getClass();
            ((MediaItem)object2).b.getClass();
            object7 = ((MediaItem)object2).b.c;
            if (object7 == null) {
                object = object11 = androidx.media3.exoplayer.drm.c.a;
            } else {
                block50: {
                    block49: {
                        // MONITORENTER : object11
                        bl3 = ((MediaItem$c)object7).equals(null);
                        if (bl3) break block49;
                        object7 = androidx.media3.exoplayer.drm.a.b((MediaItem$c)object7);
                        break block50;
                    }
                    n15 = 0;
                    object7 = null;
                }
                object7.getClass();
                // MONITOREXIT : object11
                object = object7;
            }
            n4 = 0x100000;
            uri = null;
            object5 = object9;
            object9 = new o((MediaItem)object2, (DataSource$Factory)object8, yo2, (c)object, a2, n4, false);
            Intrinsics.checkNotNullExpressionValue(object9, "createMediaSource(...)");
            object11 = ld3_12.m;
            if (object11 != null) {
                ((androidx.media3.exoplayer.e)object11).setMediaSource((j)object9);
            }
            if ((object11 = ld3_12.m) != null) {
                ((androidx.media3.exoplayer.e)object11).prepare();
            }
            if ((n8 = (int)(ld3_12.p ? 1 : 0)) != 0 && (object11 = ld3_12.m) != null) {
                ((androidx.media3.exoplayer.e)object11).setPlayWhenReady(n10 != 0);
            }
            if ((object11 = ld3_12.w) != null) {
                n3 = -16777216;
                ((PlayerView)((Object)object11)).setShutterBackgroundColor(n3);
            }
            if ((object11 = ld3_12.w) != null) {
                object9 = ld3_12.m;
                ((PlayerView)((Object)object11)).setPlayer((f)object9);
            }
            if ((object11 = ld3_12.m) != null) {
                object9 = new od3_1(ld3_12);
                object11 = ((androidx.media3.exoplayer.e)object11).l;
                ((vv1_0)object11).a(object9);
            }
            if ((object11 = ld3_12.x) != null) {
                ai0_2.B((View)object11);
            }
        } else {
            object9 = Looper.getMainLooper();
            object11 = new Handler((Looper)object9);
            object9 = new gd3_1(ld3_12);
            object11.post((Runnable)object9);
            object11 = ld3_12.x;
            if (object11 != null) {
                ai0_2.i((View)object11);
            }
            if ((object11 = ld3_12.w) != null) {
                gp0_1.a((View)object11);
            }
            if ((object11 = ld3_12.A) != null) {
                gp0_1.a((View)object11);
            }
            if ((object11 = ld3_12.y) != null) {
                gp0_1.c((View)object11);
            }
            object11 = new da$a();
            ((da$a)object11).k = n10;
            ((da$a)object11).g = n10;
            object9 = this.Ra();
            if (object9 != null && (object9 = (Resource)CollectionsKt.N(n15 = ld3_12.o, (List)object9)) != null && (object9 = ((Resource)object9).getPostData()) != null && (object9 = ((PostData)object9).getPostMedia()) != null && (object9 = (Media)CollectionsKt.firstOrNull((List)object9)) != null) {
                object9 = ((Media)object9).getUrl();
            } else {
                n3 = 0;
                object9 = null;
            }
            object7 = ld3_12.y;
            Intrinsics.checkNotNull(object7);
            ((da$a)object11).n = object9;
            ((da$a)object11).u = object7;
            ((da$a)object11).a();
        }
        if ((object7 = ld3_12.s) == null) return;
        object9 = this.requireActivity();
        object11 = new LinearLayoutManager((Context)object9, 0, false);
        ((RecyclerView)object7).setLayoutManager((RecyclerView$o)object11);
        object11 = new z73_0((RecyclerView)object7);
        ((RecyclerView)object7).addOnItemTouchListener((RecyclerView$r)object11);
        object11 = this.Ra();
        if (object11 != null && (object11 = (Resource)CollectionsKt.N(n3 = ld3_12.o, (List)object11)) != null) {
            object6 = object11 = ((Resource)object11).getPostData();
        } else {
            bl3 = false;
            object6 = null;
        }
        if (object6 != null && (object11 = ((PostData)object6).getInnerResources()) != null) {
            n3 = object11.isEmpty() ^ n10;
            if (n3 == 0) {
                ld3_12.Sa((RecyclerView)object7);
                return;
            }
            object9 = object11.iterator();
        } else {
            ld3_12.Sa((RecyclerView)object7);
            return;
        }
        while (bl2 = object9.hasNext()) {
            serializable = (Product)object9.next();
            object5 = ((Product)serializable).getFnlColorVariantData();
            if (object5 != null) {
                object5 = ((ProductFnlColorVariantData)object5).getColorGroup();
            } else {
                n7 = 0;
                object5 = null;
            }
            ((Product)serializable).setCode((String)object5);
        }
        serializable = new Serializable();
        object5 = object3;
        int n16 = -1 >>> 4;
        yo2 = null;
        object = null;
        a2 = null;
        uri = null;
        object10 = object3;
        n4 = 0;
        object3 = null;
        object4 = null;
        list = null;
        immutableList = null;
        string2 = null;
        e2 = null;
        mediaItem$f = null;
        object5 = new Banner(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n16, null);
        int n17 = hv3_0.F();
        object8 = hv3_0.a;
        object8.getClass();
        int n18 = hv3_0.E();
        object5 = new ScreenInfo(n17, n18);
        object2 = h40_0.a;
        object2 = h40_0.w();
        serializable = ((BannerData$Builder)((Object)serializable)).build((Banner)object10, (ScreenInfo)object5, (BaseValue)object2, 0);
        ld3_12.v = object9 = new g33_0((BannerData)((Object)serializable), (List)object11, ld3_12);
        ((RecyclerView)object7).setAdapter((RecyclerView$f)object9);
        object9 = ld3_12.J;
        serializable = "BRAND_THUMBNAIL";
        n3 = (int)(Intrinsics.areEqual(object9, serializable) ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(object9 = ld3_12.J, serializable = "TOP_STORIES") ? 1 : 0)) == 0) {
            n3 = 0;
            object9 = null;
        } else {
            n3 = 1;
        }
        serializable = new Serializable();
        if (n3 != 0) {
            object11 = object11.iterator();
            while ((n3 = (int)(object11.hasNext() ? 1 : 0)) != 0) {
                object9 = (Product)object11.next();
                object10 = ((Product)object9).getName();
                if (object10 != null && (n14 = ((String)object10).length()) != 0 && (object10 = (Collection)((Product)object9).getImages()) != null && (n14 = (int)(object10.isEmpty() ? 1 : 0)) == 0 || (object10 = ((Product)object9).getId()) == null || (n14 = ((String)object10).length()) == 0) continue;
                object9 = ((Product)object9).getId();
                Intrinsics.checkNotNull(object9);
                serializable.add(object9);
            }
        }
        if ((n8 = serializable.isEmpty() ^ n10) == 0) {
            n10 = 0;
            ld3_12.Ya((RecyclerView)object7, false, null);
            return;
        }
        object12 = ld3_12.r;
        if (object12 != null) {
            ai0_2.B((View)object12);
        }
        object12 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object12, "getViewLifecycleOwner(...)");
        object12 = nu1_0.a((mu1_1)object12);
        n7 = 0;
        object5 = null;
        object11 = object10;
        object9 = serializable;
        bl2 = false;
        serializable = null;
        object10 = new nd3_2(this, (ArrayList)object9, (RecyclerView)object7, (PostData)object6, null);
        n8 = 3;
        n10 = 0;
        Ae3.d((i90_0)object12, null, null, (Function2)object10, n8);
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object object2 = object;
        object2 = (qk2_0)object;
        this.n = object2;
        boolean bl2 = object instanceof ea2_1;
        if (bl2) {
            Object object3 = object;
            object3 = (ea2_1)object;
            this.d = object3;
        }
        if (bl2) {
            object2 = object;
            object2 = (ea2_1)object;
            this.e = object2;
            bl2 = object instanceof lz1_1;
            if (bl2) {
                object2 = object;
                object2 = (lz1_1)object;
                this.g = object2;
                bl2 = object instanceof j3_0;
                if (bl2) {
                    object = (j3_0)object;
                    this.h = object;
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

    public final void onClick(View object) {
        block14: {
            Object object2;
            int n3;
            int n4;
            int n7;
            block13: {
                if (object != null) {
                    n7 = object.getId();
                    object = n7;
                } else {
                    n7 = 0;
                    object = null;
                }
                n4 = R$id.compTitleSubTitle;
                if (object != null && (n3 = ((Integer)object).intValue()) == n4) break block13;
                n4 = R$id.storyDisplayProfilePicture;
                if (object == null || (n7 = ((Integer)object).intValue()) != n4) break block14;
            }
            if ((n7 = (int)(Intrinsics.areEqual(object = this.J, object2 = "BRAND_THUMBNAIL") ? 1 : 0)) == 0 && (n7 = (int)(Intrinsics.areEqual(object = this.J, object2 = "TOP_STORIES") ? 1 : 0)) == 0) {
                object = this.n;
                if (object != null) {
                    object.z1();
                }
            } else {
                object = this.j;
                if (object != null && (object = ((Subcomponent)object).getResourceOwner()) != null && (object = ((ResourceOwner)object).getId()) != null) {
                    object2 = sq0_1.a;
                    object2 = this.j;
                    if (object2 == null || (object2 = ((Subcomponent)object2).getResourceOwner()) == null || (object2 = ((ResourceOwner)object2).getName()) == null) {
                        object2 = "";
                    }
                    Object object3 = "story";
                    sq0_1.g((String)object2, (String)object3);
                    object2 = this.getActivity();
                    n3 = object2 instanceof AjioHomeActivity;
                    if (n3 != 0) {
                        object2 = (AjioHomeActivity)object2;
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        n3 = 1;
                        ((AjioHomeActivity)object2).t1 = n3;
                    }
                    object2 = kj0_1.g();
                    object3 = this.getActivity();
                    object = "https://ajiogram.ajio.com/brand/".concat((String)object);
                    Boolean bl2 = Boolean.TRUE;
                    ((kj0_1)object2).s((Activity)object3, (String)object, null, bl2);
                }
            }
        }
    }

    public final void onComplete() {
        Object object = this.m;
        if (object != null) {
            ((androidx.media3.exoplayer.e)object).release();
        }
        if ((object = this.n) != null) {
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
            this.f = object = (dr0_0)((pD3)object).a((yn1_2)object2, (String)object3);
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

    public final void onDestroyView() {
        super.onDestroyView();
        Object object = S;
        int n3 = this.Oa();
        object.put(n3, 0);
        object = this.z;
        if (object != null) {
            ((StoriesProgressView)((Object)object)).b();
        }
        if ((object = this.m) != null) {
            ((androidx.media3.exoplayer.e)object).stop();
        }
        if ((object = this.m) != null) {
            ((androidx.media3.exoplayer.e)object).release();
        }
    }

    public final void onPause() {
        int n3;
        int n4;
        ArrayList arrayList;
        super.onPause();
        Object object = this.m;
        if (object != null) {
            arrayList = null;
            ((androidx.media3.exoplayer.e)object).setPlayWhenReady(false);
        }
        if ((object = this.z) != null && (n4 = (arrayList = ((StoriesProgressView)((Object)object)).a).size()) > (n3 = ((StoriesProgressView)((Object)object)).d) && n3 >= 0) {
            object = (PausableProgressBar)((Object)arrayList.get(n3));
            ((PausableProgressBar)((Object)object)).setMinWithoutCallback();
        }
    }

    public final void onResume() {
        Object object;
        int n3;
        int n4;
        boolean bl2;
        super.onResume();
        this.p = bl2 = true;
        Object object2 = S;
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String string2 = "EXTRA_POSITION";
            n4 = bundle.getInt(string2);
        } else {
            n4 = 0;
            bundle = null;
        }
        this.o = n3 = object2.get(n4);
        object2 = this.Ra();
        if (object2 != null && (object2 = (Resource)CollectionsKt.N(n4 = this.o, (List)object2)) != null && (object2 = ((Resource)object2).getPostData()) != null) {
            object2 = ((PostData)object2).getPostMedia();
        } else {
            n3 = 0;
            object2 = null;
        }
        n3 = (int)(ov3.x((List)object2) ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(this.q ? 1 : 0)) == 0 && (object2 = this.m) != null) {
            ((androidx.media3.exoplayer.e)object2).setPlayWhenReady(false);
        }
        if ((object2 = this.m) != null) {
            n4 = 5;
            long l2 = 0L;
            ((b)object2).c(n4, l2);
        }
        if ((object2 = this.m) != null) {
            ((androidx.media3.exoplayer.e)object2).setPlayWhenReady(bl2);
        }
        if ((object = this.z) != null) {
            n3 = this.o;
            ((StoriesProgressView)((Object)object)).g(n3);
        }
        object = new ph_2(this, 1);
        gp0_1.b((Function0)object, this);
    }

    public final void onStart() {
        int n3;
        super.onStart();
        SparseIntArray sparseIntArray = S;
        int n4 = this.Oa();
        this.o = n3 = sparseIntArray.get(n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        var3_3 = "view";
        Intrinsics.checkNotNullParameter(var1_1, (String)var3_3);
        super.onViewCreated((View)var1_1, var2_2 /* !! */ );
        var2_2 /* !! */  = this.getArguments();
        if (var2_2 /* !! */  == null || (var2_2 /* !! */  = var2_2 /* !! */ .getString((String)(var3_3 = "KEY_PAGE"))) == null) {
            var2_2 /* !! */  = "";
        }
        this.J = var2_2 /* !! */ ;
        var2_2 /* !! */  = this.Pa().a;
        var3_3 = this.J;
        var2_2 /* !! */  = (p83_0)var2_2 /* !! */ .get(var3_3);
        var3_3 = null;
        if (var2_2 /* !! */  != null) {
            var4_4 = this.Oa();
            var2_2 /* !! */  = (Subcomponent)CollectionsKt.N(var4_4, (List)var2_2 /* !! */ );
        } else {
            var5_5 = 0;
            var2_2 /* !! */  = null;
        }
        this.j = var2_2 /* !! */ ;
        var5_5 = R$id.shimmer_stl_products;
        var2_2 /* !! */  = (ShimmerFrameLayout)var1_1.findViewById(var5_5);
        this.r = var2_2 /* !! */ ;
        var5_5 = R$id.composeError;
        var2_2 /* !! */  = (ComposeView)var1_1.findViewById(var5_5);
        this.M = var2_2 /* !! */ ;
        var5_5 = R$id.stlTopRlTest;
        var2_2 /* !! */  = (ConstraintLayout)var1_1.findViewById(var5_5);
        this.N = var2_2 /* !! */ ;
        var5_5 = R$id.stlHRv;
        var2_2 /* !! */  = (RecyclerView)var1_1.findViewById(var5_5);
        this.s = var2_2 /* !! */ ;
        if (var2_2 /* !! */  != null) {
            var6_6 = new md3_2(this);
            var2_2 /* !! */ .addOnScrollListener((RecyclerView$s)var6_6);
        }
        var5_5 = R$id.stlTitleTv;
        var2_2 /* !! */  = (AppCompatTextView)var1_1.findViewById(var5_5);
        this.t = var2_2 /* !! */ ;
        var5_5 = R$id.layerBottomShadow;
        var2_2 /* !! */  = var1_1.findViewById(var5_5);
        this.u = var2_2 /* !! */ ;
        var5_5 = R$id.storyDisplayVideo;
        var2_2 /* !! */  = (PlayerView)var1_1.findViewById(var5_5);
        this.w = var2_2 /* !! */ ;
        var5_5 = R$id.imgVolume;
        var2_2 /* !! */  = (AppCompatImageView)var1_1.findViewById(var5_5);
        this.x = var2_2 /* !! */ ;
        var5_5 = R$id.storyDisplayImage;
        var2_2 /* !! */  = (AppCompatImageView)var1_1.findViewById(var5_5);
        this.y = var2_2 /* !! */ ;
        var5_5 = R$id.storiesProgressView;
        var2_2 /* !! */  = (StoriesProgressView)var1_1.findViewById(var5_5);
        this.z = var2_2 /* !! */ ;
        var5_5 = R$id.storyDisplayVideoProgress;
        var2_2 /* !! */  = (ProgressBar)var1_1.findViewById(var5_5);
        this.A = var2_2 /* !! */ ;
        var5_5 = R$id.storyDisplayDesc;
        var2_2 /* !! */  = (TextView)var1_1.findViewById(var5_5);
        this.B = var2_2 /* !! */ ;
        var5_5 = R$id.previous;
        var2_2 /* !! */  = var1_1.findViewById(var5_5);
        this.C = var2_2 /* !! */ ;
        var5_5 = R$id.next;
        var2_2 /* !! */  = var1_1.findViewById(var5_5);
        this.D = var2_2 /* !! */ ;
        var5_5 = R$id.storyDisplayProfilePicture;
        var2_2 /* !! */  = (AppCompatImageView)var1_1.findViewById(var5_5);
        this.E = var2_2 /* !! */ ;
        var5_5 = R$id.compTitleSubTitle;
        var2_2 /* !! */  = (LinearLayoutCompat)var1_1.findViewById(var5_5);
        this.F = var2_2 /* !! */ ;
        var5_5 = R$id.storyDisplayNick;
        var2_2 /* !! */  = (TextView)var1_1.findViewById(var5_5);
        this.G = var2_2 /* !! */ ;
        var5_5 = R$id.icCross;
        var2_2 /* !! */  = (ImageView)var1_1.findViewById(var5_5);
        this.H = var2_2 /* !! */ ;
        if (var2_2 /* !! */  != null) {
            var4_4 = R$string.video_close_btn;
            var6_6 = this.getString(var4_4);
            var2_2 /* !! */ .setContentDescription((CharSequence)var6_6);
        }
        var5_5 = R$id.storyOverlay;
        var1_1 = (RelativeLayout)var1_1.findViewById(var5_5);
        this.I = var1_1;
        var1_1 = this.w;
        var5_5 = 0;
        var2_2 /* !! */  = null;
        if (var1_1 != null) {
            var1_1.setUseController(false);
        }
        if ((var1_1 = this.x) != null) {
            var6_6 = new hd3_1(this);
            var1_1.setOnClickListener((View.OnClickListener)var6_6);
        }
        if ((var1_1 = this.H) != null) {
            var6_6 = new id3_2(this);
            var1_1.setOnClickListener((View.OnClickListener)var6_6);
        }
        var1_1 = this.Pa().c;
        var7_7 = var1_1.isEmpty();
        var4_4 = 1;
        if ((var7_7 ^= var4_4) != 0 && (var1_1 = this.j) != null && (var1_1 = var1_1.getResources()) != null) {
            var1_1 = ((Iterable)var1_1).iterator();
            while ((var8_8 = var1_1.hasNext()) != 0) {
                var9_9 = (Resource)var1_1.next();
                var10_10 /* !! */  = this.Pa().c;
                if (var9_9 != null && (var11_11 = var9_9.getPostData()) != null) {
                    var11_11 = var11_11.getPostId();
                } else {
                    var12_12 = 0;
                    var11_11 = null;
                }
                if ((var13_13 = (int)var10_10 /* !! */ .contains(var11_11)) == 0 || var9_9 == null || (var9_9 = var9_9.getPostData()) == null) continue;
                var10_10 /* !! */  = Boolean.TRUE;
                var9_9.setSeen((Boolean)var10_10 /* !! */ );
            }
        }
        if ((var1_1 = this.j) != null) {
            var1_1 = var1_1.getResources();
        } else {
            var7_7 = 0;
            var1_1 = null;
        }
        var9_9 = this.j;
        if (var9_9 != null) {
            var9_9 = var9_9.isSeen();
            var10_10 /* !! */  = Boolean.TRUE;
            var8_8 = Intrinsics.areEqual(var9_9, var10_10 /* !! */ );
        } else {
            var8_8 = 0;
            var9_9 = null;
        }
        var13_13 = -1;
        if (var8_8 != 0) ** GOTO lbl-1000
        if (var1_1 != null && (var9_9 = (Resource)CollectionsKt.T((List)var1_1)) != null && (var9_9 = var9_9.getPostData()) != null) {
            var9_9 = var9_9.isSeen();
            var11_11 = Boolean.TRUE;
            var8_8 = Intrinsics.areEqual(var9_9, var11_11);
        } else {
            var8_8 = 0;
            var9_9 = null;
        }
        if (var8_8 != 0) ** GOTO lbl-1000
        if (var1_1 != null) {
            block61: {
                var9_9 = var1_1.iterator();
                var12_12 = 0;
                var11_11 = null;
                while (var14_14 = var9_9.hasNext()) {
                    var15_15 = (Resource)var9_9.next();
                    if (var15_15 != null && (var15_15 = var15_15.getPostData()) != null) {
                        var15_15 = var15_15.isSeen();
                        var16_16 = Boolean.FALSE;
                        var14_14 = Intrinsics.areEqual(var15_15, var16_16);
                    } else {
                        var14_14 = false;
                        var15_15 = null;
                    }
                    if (!var14_14) {
                        ++var12_12;
                        continue;
                    }
                    break block61;
                }
                var12_12 = -1;
            }
            var9_9 = var12_12;
        } else {
            var8_8 = 0;
            var9_9 = null;
        }
        if (var9_9 == null || (var12_12 = var9_9.intValue()) != var13_13) {
            var12_12 = 1;
        } else {
            var12_12 = 0;
            var11_11 = null;
        }
        if (var12_12 == 0) {
            var8_8 = 0;
            var9_9 = null;
        }
        if (var9_9 != null) {
            var7_7 = var9_9.intValue();
        } else {
            if (var1_1 != null) {
                block62: {
                    var8_8 = var1_1.size();
                    var1_1 = var1_1.listIterator(var8_8);
                    while ((var8_8 = (int)var1_1.hasPrevious()) != 0) {
                        var9_9 = (Resource)var1_1.previous();
                        if (var9_9 != null && (var9_9 = var9_9.getPostData()) != null) {
                            var9_9 = var9_9.isSeen();
                            var11_11 = Boolean.TRUE;
                            var8_8 = (int)Intrinsics.areEqual(var9_9, var11_11);
                        } else {
                            var8_8 = 0;
                            var9_9 = null;
                        }
                        if (var8_8 == 0) continue;
                        var7_7 = var1_1.nextIndex();
                        break block62;
                    }
                    var7_7 = -1;
                }
                var1_1 = var7_7;
            } else {
                var7_7 = 0;
                var1_1 = null;
            }
            if (var1_1 == null || (var8_8 = var1_1.intValue()) != var13_13) {
                var8_8 = 1;
            } else {
                var8_8 = 0;
                var9_9 = null;
            }
            if (var8_8 == 0) {
                var7_7 = 0;
                var1_1 = null;
            }
            if (var1_1 != null) {
                var7_7 = var1_1.intValue();
            } else lbl-1000:
            // 3 sources

            {
                var7_7 = 0;
                var1_1 = null;
            }
        }
        this.o = var7_7;
        var9_9 = ld3_1.S;
        var12_12 = this.Oa();
        var9_9.put(var12_12, var7_7);
        this.Za();
        var1_1 = this.requireActivity();
        var9_9 = new qd3_1(this, (FragmentActivity)var1_1);
        var1_1 = this.C;
        if (var1_1 != null) {
            var1_1.setOnTouchListener((View.OnTouchListener)var9_9);
        }
        if ((var1_1 = this.D) != null) {
            var1_1.setOnTouchListener((View.OnTouchListener)var9_9);
        }
        if ((var1_1 = this.Ra()) != null && (var9_9 = this.z) != null) {
            var7_7 = var1_1.size();
            var11_11 = this.getArguments();
            if (var11_11 != null) {
                var10_10 /* !! */  = "EXTRA_POSITION";
                var13_13 = var11_11.getInt((String)var10_10 /* !! */ );
            }
            var9_9.setStoriesCountDebug(var7_7, var13_13);
        }
        if ((var1_1 = this.z) != null) {
            var9_9 = this.Ra();
            if (var9_9 != null && (var9_9 = (Resource)CollectionsKt.N(var13_13 = this.o, (List)var9_9)) != null) {
                var9_9 = var9_9.getPostData();
            } else {
                var8_8 = 0;
                var9_9 = null;
            }
            var1_1.setAllStoryDuration((PostData)var9_9);
        }
        if ((var1_1 = this.z) != null) {
            var1_1.setStoriesListener(this);
        }
        var1_1 = new da$a();
        var1_1.k = var4_4;
        var1_1.g = var4_4;
        var1_1.f = var4_4;
        var9_9 = this.j;
        if (var9_9 != null && (var9_9 = var9_9.getResourceOwner()) != null) {
            var9_9 = var9_9.getLogo();
        } else {
            var8_8 = 0;
            var9_9 = null;
        }
        var10_10 /* !! */  = this.E;
        Intrinsics.checkNotNull(var10_10 /* !! */ );
        var1_1.n = var9_9;
        var1_1.u = var10_10 /* !! */ ;
        var1_1.a();
        var1_1 = this.G;
        if (var1_1 != null) {
            var9_9 = this.j;
            if (var9_9 != null && (var9_9 = var9_9.getResourceOwner()) != null) {
                var9_9 = var9_9.getName();
            } else {
                var8_8 = 0;
                var9_9 = null;
            }
            var1_1.setText((CharSequence)var9_9);
        }
        if ((var1_1 = this.B) != null) {
            var9_9 = this.j;
            if (var9_9 != null && (var9_9 = var9_9.getResourceOwner()) != null) {
                var9_9 = var9_9.getDescription();
            } else {
                var8_8 = 0;
                var9_9 = null;
            }
            var1_1.setText((CharSequence)var9_9);
        }
        if ((var1_1 = this.E) != null) {
            var1_1.setOnClickListener((View.OnClickListener)this);
        }
        if ((var1_1 = this.F) != null) {
            var1_1.setOnClickListener((View.OnClickListener)this);
        }
        if ((var7_7 = (int)Intrinsics.areEqual(var1_1 = this.J, var9_9 = "BRAND_THUMBNAIL")) == 0 && (var7_7 = (int)Intrinsics.areEqual(var1_1 = this.J, var9_9 = "TOP_STORIES")) == 0) ** GOTO lbl-1000
        var1_1 = this.j;
        if (var1_1 != null) {
            var3_3 = var1_1.getType();
        }
        if ((var7_7 = (int)kotlin.text.b.i((String)var3_3, (String)(var1_1 = "SHOW_ERROR_SCREEN"), false)) != 0) {
            this.Ta((boolean)var4_4);
        } else lbl-1000:
        // 2 sources

        {
            this.Ta(false);
        }
        var1_1 = this.M;
        if (var1_1 != null) {
            var2_2 /* !! */  = new Ld3$c(this);
            var8_8 = -13292715;
            var3_3 = new u10(var8_8, var2_2 /* !! */ , (boolean)var4_4);
            var1_1.setContent((Function2)var3_3);
        }
    }
}

