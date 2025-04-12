/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.stl.fragment;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ShopTheLookFragment$b
extends RecyclerView$s {
    public final /* synthetic */ ShopTheLookFragment a;

    public ShopTheLookFragment$b(ShopTheLookFragment shopTheLookFragment) {
        this.a = shopTheLookFragment;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onScrollStateChanged(RecyclerView object, int n3) {
        ShopTheLookFragment shopTheLookFragment;
        Object object2;
        block37: {
            Object object3;
            int n4;
            int n7;
            int n8;
            Intrinsics.checkNotNullParameter(object, "recyclerView");
            super.onScrollStateChanged((RecyclerView)object, n3);
            object2 = null;
            Object object4 = "selectedBanner";
            Object object5 = "shopTheLookBannerDetailsAdapter";
            String string2 = "bannersList";
            shopTheLookFragment = this.a;
            if (n3 != 0) {
                Object object6;
                int n10 = 1;
                if (n3 != n10) {
                    return;
                }
                object = shopTheLookFragment.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n10 = 0;
                    object = null;
                }
                if ((object6 = shopTheLookFragment.d) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n3 = 0;
                    object6 = null;
                }
                if ((n10 = object.indexOf(object6)) == (n3 = -1)) return;
                object6 = shopTheLookFragment.f;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n3 = 0;
                    object6 = null;
                }
                if ((n3 = (int)(((w33)object6).g ? 1 : 0)) == 0) return;
                object6 = shopTheLookFragment.f;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n3 = 0;
                    object6 = null;
                }
                boolean bl2 = false;
                object4 = null;
                ((w33)object6).g = false;
                object6 = shopTheLookFragment.f;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                } else {
                    object2 = object6;
                }
                ((RecyclerView$f)object2).notifyItemChanged(n10);
                return;
            }
            shopTheLookFragment.getClass();
            n3 = ShopTheLookFragment.Pa((RecyclerView)object);
            Object object7 = shopTheLookFragment.e;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n8 = 0;
                object7 = null;
            }
            object7 = (BannerData)object7.get(n3);
            Object object8 = shopTheLookFragment.d;
            if (object8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n7 = 0;
                object8 = null;
            }
            if ((n7 = Intrinsics.areEqual(object7, object8)) != 0) {
                return;
            }
            shopTheLookFragment.d = object7;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n8 = 0;
                object7 = null;
            }
            if ((object4 = ((BannerData)object7).getUuid()) != null) {
                object4 = shopTheLookFragment.Ra();
                object8 = ((BannerData)object7).getUuid();
                if (object8 == null) {
                    object8 = "";
                }
                object4 = ((e43_0)object4).f((String)object8);
            } else {
                n4 = 0;
                object4 = null;
            }
            if (object4 == null) {
                object8 = shopTheLookFragment.Ra();
                object3 = shopTheLookFragment.e;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object3 = null;
                }
                ((e43_0)object8).g((BannerData)object7, (List)object3);
            }
            object7 = "stlHomeRv";
            if (object4 != null) {
                object8 = shopTheLookFragment.f;
                if (object8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n7 = 0;
                    object8 = null;
                }
                object8.getClass();
                object3 = "productList";
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                ((w33)object8).b = object4;
                object8 = shopTheLookFragment.a;
                if (object8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n7 = 0;
                    object8 = null;
                }
                n7 = ShopTheLookFragment.Pa((RecyclerView)object8);
                object3 = shopTheLookFragment.f;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    object3 = null;
                }
                ((RecyclerView$f)object3).notifyItemChanged(n7);
                object5 = shopTheLookFragment.Ra();
                object5.getClass();
                Intrinsics.checkNotNullParameter(object4, "products");
                object5 = md3_0.c((jD3)object5);
                object8 = new z33_0((List)object4, null);
                n4 = 3;
                Ae3.d((i90_0)object5, null, null, (Function2)object8, n4);
            }
            try {
                object4 = shopTheLookFragment.e;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object4 = null;
                }
                int n14 = shopTheLookFragment.n;
                object4 = object4.get(n14);
                object4 = (BannerData)object4;
                n14 = shopTheLookFragment.n;
                if (n14 == n3) break block37;
                string2 = "null cannot be cast to non-null type com.ril.ajio.stl.viewHolder.ShopTheLookBannerDetailsViewHolder";
                if (n14 > n3) {
                    object5 = eb_2.a;
                    object5 = ((BannerData)object4).getDynamicPageMetadata();
                    if (object5 != null) {
                        object5 = ((DynamicPageMetadata)object5).getDuration();
                    } else {
                        n14 = 0;
                        object5 = null;
                    }
                    n14 = (int)(eb_2.d((Long)object5) ? 1 : 0);
                    if (n14 != 0) {
                        object5 = shopTheLookFragment.a;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                            n14 = 0;
                            object5 = null;
                        }
                        if ((object8 = shopTheLookFragment.a) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                            n7 = 0;
                            object8 = null;
                        }
                        n8 = ShopTheLookFragment.Pa((RecyclerView)object8);
                        object5 = ((RecyclerView)object5).findViewHolderForAdapterPosition(n8);
                        Intrinsics.checkNotNull(object5, string2);
                        object5 = (b33_0)object5;
                        ((b33_0)object5).x((BannerData)object4);
                    }
                    break block37;
                }
                object5 = eb_2.a;
                object5 = ((BannerData)object4).getDynamicPageMetadata();
                if (object5 != null) {
                    object5 = ((DynamicPageMetadata)object5).getDuration();
                } else {
                    n14 = 0;
                    object5 = null;
                }
                n14 = (int)(eb_2.d((Long)object5) ? 1 : 0);
                if (n14 != 0) {
                    object5 = shopTheLookFragment.a;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n14 = 0;
                        object5 = null;
                    }
                    if ((object8 = shopTheLookFragment.a) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n7 = 0;
                        object8 = null;
                    }
                    n8 = ShopTheLookFragment.Pa((RecyclerView)object8);
                    object5 = ((RecyclerView)object5).findViewHolderForAdapterPosition(n8);
                    Intrinsics.checkNotNull(object5, string2);
                    object5 = (b33_0)object5;
                    ((b33_0)object5).w((BannerData)object4);
                }
            }
            catch (Exception exception) {}
        }
        ShopTheLookFragment.Oa(shopTheLookFragment, n3);
        int n15 = ig2_2.a((RecyclerView)object);
        Object object9 = shopTheLookFragment.m;
        if (object9 == null) {
            object9 = "ajioVideoPlayer";
            Intrinsics.throwUninitializedPropertyAccessException((String)object9);
        } else {
            object2 = object9;
        }
        ((ma_2)object2).r = n15;
    }
}

