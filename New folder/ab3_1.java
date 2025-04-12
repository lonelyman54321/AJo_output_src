/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$id;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AB3
 */
public final class ab3_1
extends RecyclerView$s {
    public final /* synthetic */ bb3_1 a;

    public ab3_1(bb3_1 bb3_12) {
        this.a = bb3_12;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onScrolled(RecyclerView recyclerView, int n3, int n4) {
        int n7;
        int n8;
        int n10;
        String string2;
        bb3_1 bb3_12;
        Object object;
        Object object2;
        block56: {
            int n14;
            block57: {
                int n15;
                int n16;
                Object object3;
                block58: {
                    float f5;
                    block60: {
                        float f6;
                        block59: {
                            float f7;
                            int n17;
                            block48: {
                                int n18;
                                RecyclerView$o recyclerView$o;
                                object2 = recyclerView;
                                object = "recyclerView";
                                Intrinsics.checkNotNullParameter(recyclerView, (String)object);
                                super.onScrolled(recyclerView, n3, n4);
                                bb3_12 = this.a;
                                bb3_12.getClass();
                                Intrinsics.checkNotNullParameter(recyclerView, (String)object);
                                object = bb3_12.a;
                                if (object != null) {
                                    object3 = ((RecyclerView)object).getLayoutManager();
                                } else {
                                    n16 = 0;
                                    object3 = null;
                                }
                                n16 = object3 instanceof LinearLayoutManager;
                                n14 = -1;
                                if (n16 != 0) {
                                    if (object != null) {
                                        object3 = ((RecyclerView)object).getLayoutManager();
                                    } else {
                                        n16 = 0;
                                        object3 = null;
                                    }
                                    object3 = (LinearLayoutManager)object3;
                                    Intrinsics.checkNotNull(object3);
                                    n16 = ((LinearLayoutManager)object3).findFirstVisibleItemPosition();
                                } else {
                                    n16 = -1;
                                }
                                if (object != null) {
                                    recyclerView$o = ((RecyclerView)object).getLayoutManager();
                                } else {
                                    n18 = 0;
                                    recyclerView$o = null;
                                }
                                n18 = recyclerView$o instanceof LinearLayoutManager;
                                string2 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager";
                                if (n18 != 0) {
                                    if (object != null) {
                                        recyclerView$o = ((RecyclerView)object).getLayoutManager();
                                    } else {
                                        n18 = 0;
                                        recyclerView$o = null;
                                    }
                                    Intrinsics.checkNotNull(recyclerView$o, string2);
                                    recyclerView$o = (LinearLayoutManager)recyclerView$o;
                                    n18 = ((LinearLayoutManager)recyclerView$o).findLastVisibleItemPosition();
                                } else {
                                    n18 = -1;
                                }
                                n15 = 1;
                                n17 = -1;
                                n10 = 0;
                                if (n16 > n18) break block48;
                                while (true) {
                                    block49: {
                                        float f8;
                                        block51: {
                                            float f11;
                                            block55: {
                                                RecyclerView$B recyclerView$B;
                                                block54: {
                                                    block53: {
                                                        block52: {
                                                            block50: {
                                                                lt2_1 lt2_12;
                                                                ma_2 ma_22;
                                                                ExoPlayer exoPlayer;
                                                                int n19;
                                                                if (object != null) {
                                                                    recyclerView$B = ((RecyclerView)object).findViewHolderForAdapterPosition(n16);
                                                                } else {
                                                                    n19 = 0;
                                                                    recyclerView$B = null;
                                                                }
                                                                if (recyclerView$B == null) break block49;
                                                                f8 = bb3_12.e(recyclerView$B);
                                                                Object object4 = recyclerView$B instanceof PDPVideoKYPHolder;
                                                                if (!object4) break block50;
                                                                float f12 = n17;
                                                                float f14 = f8 - f12;
                                                                object4 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                                if (object4 <= 0 || (exoPlayer = (ma_22 = ((PDPVideoKYPHolder)recyclerView$B).c).a((int)(object4 = ((PDPVideoKYPHolder)(recyclerView$B = (PDPVideoKYPHolder)recyclerView$B)).w()))) == null || (object4 = (Object)exoPlayer.isPlaying()) != n15 || (lt2_12 = ma_22.e((int)(object4 = ((PDPVideoKYPHolder)recyclerView$B).w()))) == null) break block49;
                                                                Integer n20 = lt2_12.e;
                                                                n19 = ((PDPVideoKYPHolder)recyclerView$B).w();
                                                                if (n20 == null || (n8 = n20.intValue()) != n19) break block49;
                                                                break block51;
                                                            }
                                                            n8 = recyclerView$B instanceof li2_2;
                                                            if (!n8) break block52;
                                                            f5 = n17;
                                                            float f15 = f8 - f5;
                                                            n8 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                            if (n8 <= 0) break block49;
                                                            break block51;
                                                        }
                                                        n8 = recyclerView$B instanceof qj2_0;
                                                        if (!n8) break block53;
                                                        f5 = n17;
                                                        float f16 = f8 - f5;
                                                        n8 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
                                                        if (n8 <= 0) break block49;
                                                        break block51;
                                                    }
                                                    n8 = recyclerView$B instanceof z71_0;
                                                    if (!n8) break block54;
                                                    RecyclerView$B recyclerView$B2 = recyclerView$B;
                                                    z71_0 z71_02 = (z71_0)recyclerView$B;
                                                    n8 = (int)(z71_02.d ? 1 : 0);
                                                    if (n8) break block55;
                                                }
                                                if (!(n8 = recyclerView$B instanceof xj2_0)) break block49;
                                            }
                                            if ((n8 = (int)((f11 = f8 - (f5 = (float)n17)) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) <= 0) break block49;
                                        }
                                        n17 = (int)f8;
                                        n10 = n16;
                                    }
                                    if (n16 == n18) break;
                                    ++n16;
                                }
                            }
                            if (n17 == n14 || n17 < (n7 = bb3_12.h)) {
                                n10 = -1;
                            }
                            if (n10 != n14) break block56;
                            n7 = bb3_12.d;
                            if (n7 == n14) return;
                            if ((object2 = ((RecyclerView)object2).findViewHolderForAdapterPosition(n7)) != null) {
                                f6 = bb3_12.e((RecyclerView$B)object2);
                                object = Float.valueOf(f6);
                            } else {
                                n7 = 0;
                                f6 = 0.0f;
                                object = null;
                            }
                            if (object == null || (n7 = (int)((f7 = (f6 = ((Float)object).floatValue()) - (f5 = (float)(n8 = bb3_12.h))) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) >= 0) break block57;
                            object = bb3_12.e;
                            if (object == null) break block58;
                            n8 = object.getId();
                            if (n8 != (n16 = R$id.layoutVideoKyp)) break block59;
                            object = bb3_12.g;
                            if (object != null) {
                                ((PDPVideoKYPHolder)object).A();
                                ((PDPVideoKYPHolder)object).y();
                            }
                            object = yn3_0.a;
                            Object[] objectArray = new Object[]{};
                            object3 = "VideoAutoPlayerHelper";
                            ((yn3$a)object).a((String)object3, objectArray);
                            break block58;
                        }
                        n8 = object.getId();
                        if (n8 != (n16 = R$id.cmsParent)) break block60;
                        n8 = ig2_2.a((RecyclerView)(object = bb3_12.c((View)object)));
                        if (n8 >= 0) {
                            if (object != null) {
                                object3 = ((RecyclerView)object).findViewHolderForAdapterPosition(n8);
                            } else {
                                n16 = 0;
                                object3 = null;
                            }
                            if (object3 != null) {
                                object = ((RecyclerView)object).findViewHolderForAdapterPosition(n8);
                                object3 = "null cannot be cast to non-null type com.ril.ajio.home.landingpage.viewholder.cms.HomeListSubViewHolder";
                                Intrinsics.checkNotNull(object, (String)object3);
                                object = (x71_0)object;
                            } else {
                                n7 = 0;
                                f6 = 0.0f;
                                object = null;
                            }
                            if (object != null) {
                                ((x71_0)object).y(n8);
                            }
                        }
                        break block58;
                    }
                    n8 = object.getId();
                    if (n8 == (n16 = R$id.layoutVideo)) {
                        if (object2 != null && (n8 = object2 instanceof zc3_2)) {
                            nh$b_0 nh$b_0;
                            void var21_32;
                            Object object5 = object2;
                            zc3_2 zc3_22 = (zc3_2)object2;
                            object3 = zc3_22.m;
                            if (object3 != null) {
                                Intrinsics.checkNotNull(object3);
                                object3.cancel();
                            }
                            if ((object3 = zc3_22.e) != null) {
                                n8 = zc3_22.f;
                                Fragment fragment = ((wd3_2)object3).i(n8);
                            } else {
                                n8 = 0;
                                f5 = 0.0f;
                                Object var21_31 = null;
                            }
                            object3 = "null cannot be cast to non-null type com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment";
                            Intrinsics.checkNotNull(var21_32, (String)object3);
                            nh_2 nh_22 = ((AjioExoPlayerFragment)var21_32).b;
                            if (nh_22 != null && (nh$b_0 = nh_22.b) != null) {
                                nh$b_0.cancel();
                            }
                        }
                        if ((object = bb3_1.d((View)object)) != null) {
                            object = bb3_1.b((ViewPager2)((Object)object));
                            ((AjioExoPlayerFragment)object).Qa();
                        }
                    }
                }
                if (object2 != null && (object = bb3_12.k) != null && (n7 = object2 instanceof li2_2) != 0) {
                    lt2_1 lt2_13;
                    object = object2;
                    object3 = ((li2_2)object).d;
                    object = (li2_2)object2;
                    n8 = ((li2_2)object).w();
                    ExoPlayer exoPlayer = ((ow_0)object3).a(n8);
                    if (exoPlayer != null && (n8 = (int)(exoPlayer.isPlaying() ? 1 : 0)) == n15 && (lt2_13 = ((ow_0)object3).e(n8 = ((li2_2)object).w())) != null) {
                        Integer n21 = lt2_13.e;
                        n16 = ((li2_2)object).w();
                        if (n21 != null && (n8 = n21.intValue()) == n16) {
                            ((li2_2)object).B(n15 != 0);
                            ((li2_2)object).z();
                        }
                    }
                }
                if (object2 != null && (object = bb3_12.m) != null && (n7 = object2 instanceof qj2_0) != 0) {
                    object = object2;
                    object = (qj2_0)object2;
                    ((qj2_0)object).w();
                }
                if (object2 != null && (n7 = object2 instanceof xj2_0) != 0) {
                    object2 = (xj2_0)object2;
                    ((xj2_0)object2).x();
                }
            }
            bb3_12.d = n14;
            return;
        }
        n7 = bb3_12.d;
        if (n7 == n10) return;
        bb3_12.d = n10;
        object = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(object, string2);
        object = (LinearLayoutManager)object;
        n8 = bb3_12.d;
        object = ((LinearLayoutManager)object).findViewByPosition(n8);
        bb3_12.f = object;
        n7 = bb3_12.d;
        object2 = ((RecyclerView)object2).findViewHolderForAdapterPosition(n7);
        n7 = object2 instanceof PDPVideoKYPHolder;
        if (n7 != 0) {
            bb3_12.g = object2 = (PDPVideoKYPHolder)object2;
        } else {
            n7 = object2 instanceof li2_2;
            if (n7 != 0) {
                bb3_12.l = object2 = (li2_2)object2;
                bb3_12.k = object2;
            } else {
                n7 = object2 instanceof qj2_0;
                if (n7 != 0) {
                    bb3_12.m = object2 = (qj2_0)object2;
                }
            }
        }
        object2 = bb3_12.f;
        bb3_12.a(n10, (View)object2);
        object2 = bb3_12.f;
        bb3_12.e = object2;
    }
}

