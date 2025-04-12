/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.MediaItem;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$id;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BB3
 */
public final class bb3_1 {
    public RecyclerView a;
    public ob_2 b;
    public ma_2 c;
    public int d;
    public View e;
    public View f;
    public PDPVideoKYPHolder g;
    public int h;
    public RecyclerView$B i;
    public RecyclerView$B j;
    public li2_2 k;
    public li2_2 l;
    public qj2_0 m;
    public RecyclerView n;

    public static AjioExoPlayerFragment b(ViewPager2 object) {
        RecyclerView$f recyclerView$f = object.getAdapter();
        Intrinsics.checkNotNull(recyclerView$f, "null cannot be cast to non-null type com.ril.ajio.videoPlayer.adapter.ViewPagerVideoPlayerAdapter");
        recyclerView$f = (wd3_2)recyclerView$f;
        int n3 = object.getCurrentItem();
        object = ((wd3_2)recyclerView$f).i(n3);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment");
        return (AjioExoPlayerFragment)object;
    }

    public static ViewPager2 d(View object) {
        block3: {
            String string2 = "null cannot be cast to non-null type android.view.ViewGroup";
            Intrinsics.checkNotNull(object, string2);
            object = (ViewGroup)object;
            int n3 = object.getChildCount();
            if (n3 >= 0) {
                int n4 = 0;
                while (true) {
                    View view;
                    boolean bl2;
                    if (bl2 = (view = object.getChildAt(n4)) instanceof ViewPager2) {
                        object = (ViewPager2)object.getChildAt(n4);
                        break block3;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
            object = null;
        }
        return object;
    }

    public final void a(int n3, View object) {
        int n4;
        Object object2;
        Object object3;
        int n7;
        int n8;
        Object object4;
        RecyclerView recyclerView = this.a;
        int n10 = 0;
        Object object5 = null;
        if (recyclerView != null) {
            object4 = recyclerView.findViewHolderForAdapterPosition(n3);
        } else {
            n3 = 0;
            object4 = null;
        }
        boolean bl2 = false;
        recyclerView = null;
        int n14 = 1;
        if (object != null && (n8 = object.getId()) == (n7 = R$id.layoutVideo)) {
            if ((object = bb3_1.d((View)object)) != null) {
                object3 = this.b;
                if ((object3 == null || (n8 = (int)(Intrinsics.areEqual(object3, object2 = bb3_1.b((ViewPager2)((Object)object)).a) ? 1 : 0)) == 0) && (object3 = this.b) != null) {
                    ((ob_2)object3).j();
                }
                bb3_1.b((ViewPager2)((Object)object)).Ra();
                this.b = object3 = bb3_1.b((ViewPager2)((Object)object)).a;
                if (object4 != null && (n8 = object4 instanceof zc3_2) != 0) {
                    object3 = object4;
                    object3 = (zc3_2)object4;
                    n4 = ((ViewPager2)((Object)object)).getCurrentItem();
                    ((zc3_2)object3).x(n4);
                    object = ((zc3_2)object3).e;
                    if (object != null) {
                        n8 = ((zc3_2)object3).f;
                        object = ((wd3_2)object).i(n8);
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    object3 = "null cannot be cast to non-null type com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment";
                    Intrinsics.checkNotNull(object, (String)object3);
                    object = ((AjioExoPlayerFragment)object).b;
                    if (object != null) {
                        ((nh_2)object).b();
                    }
                }
            }
        } else if (object != null && (n8 = object.getId()) == (n7 = R$id.cmsParent)) {
            n8 = ig2_2.a((RecyclerView)(object = this.c((View)object)));
            if (n8 >= 0) {
                if (object != null) {
                    object2 = ((RecyclerView)object).findViewHolderForAdapterPosition(n8);
                } else {
                    n7 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object = ((RecyclerView)object).findViewHolderForAdapterPosition(n8);
                    object2 = "null cannot be cast to non-null type com.ril.ajio.home.landingpage.viewholder.cms.HomeListSubViewHolder";
                    Intrinsics.checkNotNull(object, (String)object2);
                    object = (x71_0)object;
                } else {
                    n4 = 0;
                    object = null;
                }
                if (object != null) {
                    object2 = eb_2.a;
                    object2 = ((x71_0)object).e;
                    if (object2 != null) {
                        object2 = ((BannerData)object2).getBannerType();
                    } else {
                        n7 = 0;
                        object2 = null;
                    }
                    n7 = (int)(eb_2.e((String)object2) ? 1 : 0);
                    if (n7 != 0) {
                        object2 = ((x71_0)object).m;
                        if (object2 != null) {
                            object2 = ((ow_0)object2).a(n8);
                        } else {
                            n7 = 0;
                            object2 = null;
                        }
                        if (object2 == null || (n7 = (int)(object2.isPlaying() ? 1 : 0)) != n14) {
                            int n15;
                            object2 = ((x71_0)object).f;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("videoView");
                                n7 = 0;
                                object2 = null;
                            }
                            if ((object2 = ((PlayerView)((Object)object2)).getPlayer()) != null) {
                                object2 = object2.getCurrentMediaItem();
                            } else {
                                n7 = 0;
                                object2 = null;
                            }
                            if (object2 != null) {
                                n7 = ((MediaItem)object2).hashCode();
                            } else {
                                n7 = 0;
                                object2 = null;
                            }
                            LinkedHashMap linkedHashMap = ((x71_0)object).n;
                            int n16 = ((RecyclerView$B)object).getLayoutPosition();
                            Integer n17 = n16;
                            linkedHashMap = linkedHashMap.get(n17);
                            if (linkedHashMap != null) {
                                n15 = ((Object)linkedHashMap).hashCode();
                            } else {
                                n15 = 0;
                                linkedHashMap = null;
                            }
                            if (n7 != n15) {
                                object3 = ((x71_0)object).e;
                                Intrinsics.checkNotNull(object3);
                                ((x71_0)object).w((BannerData)object3);
                            } else {
                                ((x71_0)object).z(n8);
                            }
                        }
                    }
                }
            }
        } else {
            n4 = object4 instanceof xj2_0;
            if (n4 != 0) {
                object = this.c;
                if (object != null && (object = ((ma_2)object).v) != null) {
                    object.setPlayWhenReady(false);
                }
                object = object4;
                object = (xj2_0)object4;
                ((xj2_0)object).y();
                this.c = object = ((xj2_0)object).b;
            }
        }
        if (object4 != null && (object = this.m) != null) {
            n4 = object4 instanceof qj2_0;
            if (n4 != 0) {
                this.i = object4;
            } else {
                object = this.i;
                if (object != null && (n8 = object instanceof qj2_0) != 0) {
                    object3 = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.holders.PDPStylishIdeaAdapterHolder";
                    Intrinsics.checkNotNull(object, (String)object3);
                    object = (qj2_0)object;
                    ((qj2_0)object).w();
                    this.i = null;
                }
            }
        }
        if (object4 != null && (object = this.l) != null) {
            n4 = object4 instanceof li2_2;
            if (n4 != 0) {
                object = object4;
                object3 = ((li2_2)object).d;
                object = (li2_2)object4;
                n10 = ((li2_2)object).w();
                object5 = ((ow_0)object3).a(n10);
                if (object5 != null && (n10 = (int)(object5.isPlaying() ? 1 : 0)) == 0) {
                    object5 = ((li2_2)object).I;
                    if (object5 != null) {
                        object5 = ((yr0_1)object5).a();
                        object2 = Boolean.TRUE;
                        n10 = (int)(Intrinsics.areEqual(object5, object2) ? 1 : 0);
                    } else {
                        n10 = 0;
                        object5 = null;
                    }
                    if (n10 != 0) {
                        bl2 = true;
                    }
                }
                if (bl2) {
                    n3 = ((li2_2)object).w();
                    object4 = ((ow_0)object3).a(n3);
                    if (object4 == null || (n3 = (int)(object4.isPlaying() ? 1 : 0)) != n14) {
                        ((ma_2)object3).r = n3 = ((li2_2)object).w();
                        ((li2_2)object).y();
                    }
                    ((li2_2)object).z();
                } else {
                    this.j = object4;
                }
            } else {
                object4 = this.j;
                if (object4 != null && (n4 = object4 instanceof li2_2) != 0) {
                    object = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.holders.PDPDiscoverBrandHolder";
                    Intrinsics.checkNotNull(object4, (String)object);
                    object4 = (li2_2)object4;
                    ((li2_2)object4).B(n14 != 0);
                    this.j = null;
                }
            }
        }
    }

    public final RecyclerView c(View object) {
        String string2 = "null cannot be cast to non-null type android.view.ViewGroup";
        Intrinsics.checkNotNull(object, string2);
        object = (ViewGroup)object;
        int n3 = object.getChildCount();
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                View view;
                boolean bl2;
                if (bl2 = (view = object.getChildAt(n4)) instanceof RecyclerView) {
                    object = (RecyclerView)object.getChildAt(n4);
                    this.n = object;
                    break;
                }
                view = object.getChildAt(n4);
                bl2 = view instanceof ViewGroup;
                if (bl2) {
                    view = object.getChildAt(n4);
                    String string3 = "getChildAt(...)";
                    Intrinsics.checkNotNullExpressionValue(view, string3);
                    this.c(view);
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return this.n;
    }

    public final float e(RecyclerView$B recyclerView$B) {
        Rect rect = new Rect();
        Object object = this.a;
        if (object != null) {
            object.getGlobalVisibleRect(rect);
        }
        object = new int[2];
        recyclerView$B.itemView.getLocationOnScreen((int[])object);
        Object object2 = object[0];
        int n3 = 1;
        Object object3 = object[n3];
        int n4 = recyclerView$B.itemView.getWidth() + object2;
        Object object4 = object[n3];
        int n7 = recyclerView$B.itemView.getHeight() + object4;
        Rect rect2 = new Rect((int)object2, (int)object3, n4, n7);
        n7 = rect2.right;
        object4 = rect2.left;
        object4 = n7 - object4;
        int n8 = rect2.bottom;
        n3 = rect2.top;
        float f5 = (n8 - n3) * object4;
        int n10 = rect.right;
        n7 = Math.min(n7, n10);
        int n14 = rect2.left;
        n3 = rect.left;
        int n15 = Math.max(n14, n3);
        float f6 = Math.max(0, n7 -= n15);
        int n16 = rect2.bottom;
        n3 = rect.bottom;
        int n17 = Math.min(n16, n3);
        int n18 = rect2.top;
        int n19 = rect.top;
        n19 = Math.max(n18, n19);
        int n20 = n17 - n19;
        float f7 = Math.max(0, n20);
        return f6 * f7 / f5 * 100.0f;
    }

    public final void f(int n3) {
        int n4 = this.d;
        if (n4 != n3) {
            View view;
            int n7;
            RecyclerView$o recyclerView$o;
            this.d = n3;
            Object object = this.a;
            if (object != null) {
                recyclerView$o = ((RecyclerView)object).getLayoutManager();
            } else {
                n7 = 0;
                recyclerView$o = null;
            }
            String string2 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager";
            Intrinsics.checkNotNull(recyclerView$o, string2);
            recyclerView$o = (LinearLayoutManager)recyclerView$o;
            int n8 = this.d;
            recyclerView$o = ((LinearLayoutManager)recyclerView$o).findViewByPosition(n8);
            this.f = recyclerView$o;
            if (object != null && (object = ((RecyclerView)object).findViewHolderForAdapterPosition(n7 = this.d)) != null) {
                n7 = object instanceof PDPVideoKYPHolder;
                if (n7 != 0) {
                    this.g = object = (PDPVideoKYPHolder)object;
                } else {
                    n7 = object instanceof li2_2;
                    if (n7 != 0) {
                        this.l = object = (li2_2)object;
                        this.k = object;
                    } else {
                        n7 = object instanceof qj2_0;
                        if (n7 != 0) {
                            this.m = object = (qj2_0)object;
                        }
                    }
                }
            }
            object = this.f;
            this.a(n3, (View)object);
            this.e = view = this.f;
        }
    }
}

