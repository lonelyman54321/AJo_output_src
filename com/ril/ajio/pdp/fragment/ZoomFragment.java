/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.ImageButton
 *  android.widget.ImageView
 */
package com.ril.ajio.pdp.fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$h;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.DynamicCirclePageIndicator;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.pdp.data.ZoomExtras;
import com.ril.ajio.pdp.fragment.ZoomFragment$a;
import com.ril.ajio.pdp.fragment.ZoomFragment$b;
import com.ril.ajio.pdp.fragment.ZoomFragment$onViewCreated$1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ZoomFragment
extends ew_2
implements Handler.Callback,
View.OnClickListener,
vu_1 {
    public static final ZoomFragment$a Companion;
    public ViewPager b;
    public int c;
    public ArrayList d;
    public ArrayList e;
    public DynamicCirclePageIndicator f;
    public ImageView g;
    public ImageView h;
    public OnFragmentInteractionListener i;
    public ob_2 j;
    public String k;
    public String l;
    public Long m;
    public final NewCustomEventsRevamp n;
    public View o;

    static {
        ZoomFragment$a zoomFragment$a;
        Companion = zoomFragment$a = new Object();
    }

    public ZoomFragment() {
        Object object = new ArrayList();
        this.d = object;
        object = new ArrayList();
        this.e = object;
        this.n = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void T9(ob_2 ob_22) {
        Intrinsics.checkNotNullParameter(ob_22, "ajioVideoPlayer");
        this.j = ob_22;
    }

    public final boolean handleMessage(Message message) {
        Intrinsics.checkNotNullParameter(message, "msg");
        return false;
    }

    public final void k0() {
        Bundle bundle = new Bundle();
        String string2 = this.k;
        bundle.putString("product_id", string2);
        string2 = this.l;
        bundle.putString("product_name", string2);
        NewCustomEventsRevamp.newPushCustomEvent$default(this.n, "pdp_catalog_video_interactions", "video played", "full screen", "pdp_catalog_video_interactions", "pdp screen", "new", null, bundle, "", false, null, 1600, null);
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        try {
            object = (OnFragmentInteractionListener)object;
            this.i = object;
            return;
        }
        catch (ClassCastException classCastException) {
            yn3_0.a.e(classCastException);
            object = pn_2.b(object, " must implement OnFragmentInteractionListener");
            ClassCastException classCastException2 = new ClassCastException((String)object);
            throw classCastException2;
        }
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, object2);
        int n3 = object.getId();
        int n4 = R$id.product_gallery_close;
        Object object3 = null;
        if (n3 == n4) {
            object = this.i;
            if (object != null) {
                object2 = "ZoomFragment";
                int n7 = 2;
                object.onFragmentInteraction((String)object2, n7, null);
            }
        } else {
            n4 = R$id.iv_zoomimage_lefticon;
            String string2 = "zoomViewPager";
            if (n3 == n4) {
                object = this.b;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                }
                if ((object2 = this.b) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object2;
                }
                n4 = ((ViewPager)((Object)object3)).getCurrentItem() + -1;
                object.setCurrentItem(n4);
            } else {
                n4 = R$id.iv_zoomimage_righticon;
                if (n3 == n4) {
                    object = this.b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object = null;
                    }
                    if ((object2 = this.b) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object2;
                    }
                    n4 = ((ViewPager)((Object)object3)).getCurrentItem() + 1;
                    object.setCurrentItem(n4);
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            boolean bl2;
            Object object2;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            Boolean bl3 = null;
            if (n3 >= n4) {
                object = (Parcelable)lj3_2.a(object);
            } else {
                object2 = "ZOOM_EXTRAS";
                n3 = (object = object.getParcelable((String)object2)) instanceof ZoomExtras;
                if (n3 == 0) {
                    bl2 = false;
                    object = null;
                }
                object = (ZoomExtras)object;
            }
            object = (ZoomExtras)object;
            if (object != null) {
                this.c = n3 = object.a;
                object2 = object.b;
                Intrinsics.checkNotNull(object2);
                this.d = object2;
                this.e = object2 = object.d;
                this.k = object2 = object.e;
                this.l = object2 = object.f;
                object = object.g;
                this.m = object;
            } else {
                object = this.getActivity();
                if (object != null) {
                    bl2 = object.isFinishing();
                    bl3 = bl2;
                }
                Intrinsics.checkNotNull(bl3);
                bl2 = bl3;
                if (!bl2 && (object = this.getActivity()) != null) {
                    object.finish();
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_zoom_pager;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        ob_2 ob_22 = this.j;
        if (ob_22 != null) {
            ob_22.l();
        }
    }

    public final void onPause() {
        super.onPause();
        ob_2 ob_22 = this.j;
        if (ob_22 != null) {
            ob_22.j();
        }
    }

    public final void onStop() {
        super.onStop();
        ob_2 ob_22 = this.j;
        if (ob_22 != null) {
            ob_22.j();
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        Object object4;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.product_gallery_close;
        object2 = (ImageButton)object.findViewById(n4);
        int n7 = R$id.iv_zoomimage_lefticon;
        Object object5 = (ImageView)object.findViewById(n7);
        this.g = object5;
        n7 = R$id.iv_zoomimage_righticon;
        object5 = (ImageView)object.findViewById(n7);
        this.h = object5;
        n7 = R$id.viewpager;
        object5 = (ViewPager)object.findViewById(n7);
        this.b = object5;
        String string2 = "zoomViewPager";
        Object object6 = null;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object5 = null;
        }
        Object object7 = this.e;
        int n8 = object7.size();
        ((ViewPager)((Object)object5)).setOffscreenPageLimit(n8);
        n7 = R$id.view_pager_indicator;
        object = (DynamicCirclePageIndicator)object.findViewById(n7);
        this.f = object;
        object = this.g;
        object5 = "#2D4153";
        if (object != null) {
            n8 = Color.parseColor((String)object5);
            object4 = PorterDuff.Mode.MULTIPLY;
            object.setColorFilter(n8, (PorterDuff.Mode)object4);
        }
        if ((object = this.h) != null) {
            n7 = Color.parseColor((String)object5);
            object7 = PorterDuff.Mode.MULTIPLY;
            object.setColorFilter(n7, (PorterDuff.Mode)object7);
        }
        if ((object = this.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        ArrayList arrayList = this.e;
        object7 = this.f;
        String string3 = "circlePageIndicator";
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            object3 = null;
        } else {
            object3 = object7;
        }
        Long l2 = this.m;
        n8 = this.c;
        Integer n10 = n8;
        object7 = object5;
        object4 = this;
        object5 = new tj3_2(this, arrayList, (DynamicCirclePageIndicator)((Object)object3), this, l2, n10);
        object.setAdapter((Uk2)object5);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        n7 = this.c;
        object.setCurrentItem(n7);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n3 = 0;
            object = null;
        }
        if ((object5 = this.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object5 = null;
        }
        object5 = ((ViewPager)((Object)object5)).getAdapter();
        object7 = "null cannot be cast to non-null type com.ril.ajio.pdp.adapter.ZoomPagerAdapter";
        Intrinsics.checkNotNull(object5, (String)object7);
        object5 = ((tj3_2)object5).d;
        n7 = ((ArrayList)object5).size();
        object.setPageCount(n7);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n3 = 0;
            object = null;
        }
        object5 = this.e;
        object.setPageType((ArrayList)object5);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n3 = 0;
            object = null;
        }
        n7 = this.c;
        object.setCurrentPageIndexChange(n7);
        n3 = this.c;
        n7 = 1;
        n8 = 8;
        if (n3 == 0) {
            object = this.g;
            if (object != null) {
                object.setVisibility(n8);
            }
        } else {
            object4 = this.d;
            int n14 = ((ArrayList)object4).size() - n7;
            if (n3 == n14) {
                object = this.h;
                if (object != null) {
                    object.setVisibility(n8);
                }
            } else {
                object = this.g;
                n14 = 0;
                object4 = null;
                if (object != null) {
                    object.setVisibility(0);
                }
                if ((object = this.h) != null) {
                    object.setVisibility(0);
                }
            }
        }
        if ((n3 = (object = this.d).size()) == n7) {
            object = this.g;
            if (object != null) {
                object.setVisibility(n8);
            }
            if ((object = this.h) != null) {
                object.setVisibility(n8);
            }
        }
        if ((object = this.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        object5 = new ZoomFragment$b(this);
        object.addOnPageChangeListener((ViewPager$h)object5);
        object = this.g;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.h) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        object2.setOnClickListener((View.OnClickListener)this);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object6 = object;
        }
        object = object6.getViewTreeObserver();
        object2 = new ZoomFragment$onViewCreated$1(this);
        object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object2);
    }

    public final void t8(long l2) {
        Bundle bundle = new Bundle();
        Object object = this.k;
        bundle.putString("product_id", (String)object);
        object = this.k;
        bundle.putString("product_name", (String)object);
        int n3 = 1600;
        NewCustomEventsRevamp newCustomEventsRevamp = this.n;
        String string2 = "minimized";
        String string3 = "minimize full screen";
        String string4 = "pdp_catalog_video_interactions";
        String string5 = "pdp screen";
        String string6 = "new";
        String string7 = "";
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "pdp_catalog_video_interactions", string2, string3, string4, string5, string6, null, bundle, string7, false, null, n3, null);
        newCustomEventsRevamp = new Bundle();
        newCustomEventsRevamp.putLong("playBackTime", l2);
        int n4 = this.c;
        newCustomEventsRevamp.putInt("playBackPosition", n4);
        object = this.i;
        if (object != null) {
            string2 = "ZoomFragment";
            int n7 = 2;
            object.onFragmentInteraction(string2, n7, (Bundle)newCustomEventsRevamp);
        }
    }
}

