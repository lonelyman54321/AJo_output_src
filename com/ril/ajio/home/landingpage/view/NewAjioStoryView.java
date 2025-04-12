/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.LinearInterpolator
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ProgressBar
 *  android.widget.Space
 */
package com.ril.ajio.home.landingpage.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.activity.NewAjioStoryActivity;
import com.ril.ajio.home.landingpage.view.BaseNewAjioStoryView;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView$a;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView$b;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView$c;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView$e;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$h;
import com.ril.ajio.home.landingpage.widgets.view.InnerLandingViewPager;
import com.ril.ajio.services.data.Home.BannerDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class NewAjioStoryView
extends BaseNewAjioStoryView
implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {
    public static final /* synthetic */ int s;
    public ProgressBar d;
    public ProgressBar e;
    public ProgressBar f;
    public Space g;
    public Space h;
    public final ArrayList i;
    public kZ0 j;
    public int k;
    public View l;
    public InnerLandingViewPager m;
    public ArrayList n;
    public ObjectAnimator o;
    public ObjectAnimator p;
    public ObjectAnimator q;
    public boolean r;

    public NewAjioStoryView(Context context) {
        super(context);
        ArrayList arrayList;
        this.i = arrayList = new ArrayList();
        this.r = false;
        this.e(context);
    }

    public NewAjioStoryView(Context context, AttributeSet object) {
        super(context, (AttributeSet)object);
        super();
        this.i = object;
        this.r = false;
        this.e(context);
    }

    public NewAjioStoryView(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3);
        super();
        this.i = object;
        this.r = false;
        this.e(context);
    }

    private String getBannerName() {
        String string2;
        Object object;
        int n3;
        Object object2 = this.m;
        int n4 = object2.getCurrentItem();
        if (n4 < (n3 = ((ArrayList)(object = this.i)).size())) {
            n4 = this.m.getCurrentItem();
            object2 = (BannerDetails)((ArrayList)object).get(n4);
        } else {
            n4 = 0;
            object2 = null;
        }
        object = "";
        if (object2 != null && (n3 = (int)(TextUtils.isEmpty((CharSequence)(string2 = ((BannerDetails)object2).getImageUrl())) ? 1 : 0)) == 0) {
            object2 = ((BannerDetails)object2).getImageUrl();
            n3 = ((String)object2).lastIndexOf("/") + 1;
            int n7 = ((String)object2).length();
            return ((String)object2).substring(n3, n7).replaceAll(".jpg", (String)object).replaceAll("%20", (String)object);
        }
        return object;
    }

    private String getTitle() {
        ArrayList arrayList;
        int n3;
        Object object = this.m;
        int n4 = object.getCurrentItem();
        if (n4 < (n3 = (arrayList = this.i).size())) {
            n4 = this.m.getCurrentItem();
            object = (BannerDetails)arrayList.get(n4);
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null) {
            return ((BannerDetails)object).getTitle();
        }
        return "";
    }

    public static void i(float f5, View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
        layoutParams.weight = f5;
        view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.o.end();
            objectAnimator = this.o;
            objectAnimator.cancel();
        }
        this.d.setProgress(0);
    }

    public final void b() {
        ObjectAnimator objectAnimator = this.q;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.q.end();
            objectAnimator = this.q;
            objectAnimator.cancel();
        }
        this.f.setProgress(0);
    }

    public final void c() {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.p.end();
            objectAnimator = this.p;
            objectAnimator.cancel();
        }
        this.e.setProgress(0);
    }

    public final void d() {
        Uk2 uk2;
        Object object = this.i;
        if (object != null && (uk2 = this.m.getAdapter()) != null) {
            int n3;
            int n4 = object.size();
            if (n4 != (n3 = 1)) {
                int n7 = 2;
                int n8 = 100;
                if (n4 != n7) {
                    int n10 = 3;
                    if (n4 == n10) {
                        object = this.m;
                        n4 = ((NewAjioStoryViewPager)((Object)object)).getCurrentItem();
                        if (n4 == 0) {
                            n4 = this.k;
                            hv3_0.f0(n4, n3);
                            this.j();
                            this.a();
                            this.d.setProgress(n8);
                            this.e.setProgress(0);
                            object = this.f;
                            object.setProgress(0);
                            this.o();
                        } else {
                            object = this.m;
                            n4 = ((NewAjioStoryViewPager)((Object)object)).getCurrentItem();
                            if (n4 == n3) {
                                n4 = this.k;
                                hv3_0.f0(n4, n7);
                                this.j();
                                this.c();
                                this.d.setProgress(n8);
                                this.e.setProgress(n8);
                                object = this.f;
                                object.setProgress(0);
                                this.n();
                            } else {
                                object = this.m;
                                n4 = ((NewAjioStoryViewPager)((Object)object)).getCurrentItem();
                                if (n4 == n7) {
                                    this.d.setProgress(n8);
                                    object = this.e;
                                    object.setProgress(n8);
                                    this.f();
                                }
                            }
                        }
                    }
                } else {
                    hv3_0.f0(this.k, n3);
                    object = this.m;
                    n4 = ((NewAjioStoryViewPager)((Object)object)).getCurrentItem();
                    if (n4 == n3) {
                        this.f();
                        return;
                    }
                    object = this.m;
                    n4 = ((NewAjioStoryViewPager)((Object)object)).getCurrentItem();
                    if (n4 == 0) {
                        this.a();
                        this.d.setProgress(n8);
                        this.j();
                        this.o();
                        object = this.f;
                        object.setProgress(0);
                    }
                }
            } else {
                this.f();
            }
        }
    }

    public final void e(Context object) {
        InnerLandingViewPager innerLandingViewPager;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.view_new_ajio_story;
        object = object.inflate(n3, (ViewGroup)this, true);
        n3 = R$id.new_ajio_story_viewpager;
        this.m = innerLandingViewPager = (InnerLandingViewPager)object.findViewById(n3);
        innerLandingViewPager.setMaxSettleDuration(1000);
        n3 = R$id.new_ajio_story_progress_one;
        innerLandingViewPager = (ProgressBar)object.findViewById(n3);
        this.d = innerLandingViewPager;
        n3 = R$id.new_ajio_story_progress_two;
        innerLandingViewPager = (ProgressBar)object.findViewById(n3);
        this.e = innerLandingViewPager;
        n3 = R$id.new_ajio_story_progress_three;
        innerLandingViewPager = (ProgressBar)object.findViewById(n3);
        this.f = innerLandingViewPager;
        n3 = R$id.new_ajio_story_space_one;
        innerLandingViewPager = (Space)object.findViewById(n3);
        this.h = innerLandingViewPager;
        n3 = R$id.new_ajio_story_space_two;
        innerLandingViewPager = (Space)object.findViewById(n3);
        this.g = innerLandingViewPager;
        n3 = R$id.swipe_up_layout;
        object = object.findViewById(n3);
        this.l = object;
        innerLandingViewPager = this.getContext();
        object = new kZ0((Context)innerLandingViewPager, this);
        this.j = object;
        object.a.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener)this);
    }

    public final void f() {
        int n3;
        Object object = this.b;
        int bl3 = 3;
        if (object != null && (n3 = this.k) < bl3) {
            object = ((NewAjioStoryActivity)object).y2();
            int n4 = this.k;
            n3 = 1;
            int n7 = n4 + n3;
            int n8 = 1000;
            ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(n7, n3 != 0, n8);
        } else if (object != null && (n3 = this.k) == bl3) {
            ((NewAjioStoryActivity)object).onBackPressed();
        }
    }

    public final void g() {
        Serializable serializable;
        int n3;
        Object object = this.m;
        int n4 = object.getCurrentItem();
        if (n4 < (n3 = (serializable = this.i).size())) {
            n4 = this.m.getCurrentItem();
            object = (BannerDetails)serializable.get(n4);
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null) {
            hp1_2 hp1_22;
            String string2 = ((BannerDetails)object).getPage();
            String string3 = ((BannerDetails)object).getUrlLink();
            int n7 = ((BannerDetails)object).getComponentPosition();
            String string4 = ((BannerDetails)object).getQuery();
            String string5 = ((BannerDetails)object).getTitle();
            int n8 = ((BannerDetails)object).getBannerPosition();
            String string6 = ((BannerDetails)object).getImageUrl();
            String string7 = " newAjioStory";
            serializable = hp1_22;
            hp1_22 = new hp1_2(string2, string3, n7, string4, string5, n8, string6, string7);
            object = this.c;
            if (object != null) {
                object.j0(hp1_22);
            }
        }
    }

    public final void h() {
        boolean bl2;
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null && (bl2 = objectAnimator.isPaused())) {
            objectAnimator = this.o;
            objectAnimator.resume();
        }
        if ((objectAnimator = this.p) != null && (bl2 = objectAnimator.isPaused())) {
            objectAnimator = this.p;
            objectAnimator.resume();
        }
        if ((objectAnimator = this.q) != null && (bl2 = objectAnimator.isPaused())) {
            objectAnimator = this.q;
            objectAnimator.resume();
        }
    }

    public final void j() {
        int n3;
        Object object = this.m;
        int n4 = object.getCurrentItem();
        if (n4 < (n3 = 2) && (object = this.m.getAdapter()) != null) {
            object = this.m;
            n3 = object.getCurrentItem();
            int n7 = 1;
            int n8 = 10;
            object.setCurrentItem(n3 += n7, n7 != 0, n8);
        }
    }

    public final void k() {
        Object object = this.m;
        int n3 = object.getCurrentItem();
        if (n3 > 0 && (object = this.m.getAdapter()) != null) {
            object = this.m;
            int n4 = object.getCurrentItem();
            int n7 = 1;
            int n8 = 10;
            object.setCurrentItem(n4 -= n7, n7 != 0, n8);
        }
    }

    public final void l() {
        Object object;
        int n3;
        int n4;
        Object object2;
        int n7;
        block12: {
            n7 = 1;
            int n8 = this.k;
            object2 = hv3_0.a;
            AJIOApplication.Companion.getClass();
            Serializable serializable = AJIOApplication$a.a();
            object2 = new jo_2((Context)serializable);
            String string2 = "";
            object2 = ((sw_0)object2).getPreference("AJIOSTORY_CATEGORY_NAME", string2);
            n4 = "men".equalsIgnoreCase((String)object2);
            n3 = 0;
            serializable = null;
            if (n4 != 0) {
                object2 = hv3_0.d;
                if (object2 != null) {
                    object = n8;
                    object = ((HashMap)object2).get(object);
                    serializable = object;
                    serializable = (ArrayList)object;
                }
            } else {
                object2 = hv3_0.e;
                if (object2 != null) {
                    object = n8;
                    object = ((HashMap)object2).get(object);
                    serializable = object;
                    serializable = (ArrayList)object;
                }
            }
            if (serializable == null) {
                serializable = new ArrayList();
            }
            this.n = serializable;
            this.a();
            this.c();
            this.b();
            n8 = 0;
            object = null;
            object2 = null;
            for (n4 = 0; n4 < (n3 = ((ArrayList)(serializable = this.n)).size()); n4 += n7) {
                serializable = (Boolean)this.n.get(n4);
                n3 = (int)(((Boolean)serializable).booleanValue() ? 1 : 0);
                if (n3 != 0) {
                    continue;
                }
                break block12;
            }
            n4 = 0;
            object2 = null;
        }
        if (n4 != 0) {
            n3 = 100;
            if (n4 != n7) {
                n7 = 2;
                if (n4 == n7) {
                    this.d.setProgress(n3);
                    this.e.setProgress(n3);
                    object2 = this.f;
                    object2.setProgress(0);
                    object = this.m;
                    ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(n7);
                    this.n();
                }
            } else {
                this.d.setProgress(n3);
                this.e.setProgress(0);
                object2 = this.f;
                object2.setProgress(0);
                object = this.m;
                ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(n7);
                this.o();
            }
        } else {
            this.d.setProgress(0);
            this.e.setProgress(0);
            this.f.setProgress(0);
            InnerLandingViewPager innerLandingViewPager = this.m;
            innerLandingViewPager.setCurrentItem(0);
            this.m();
        }
    }

    public final void m() {
        hv3_0.f0(this.k, 0);
        ProgressBar progressBar = this.d;
        Object object = new int[]{0, 100};
        progressBar = ObjectAnimator.ofInt((Object)progressBar, (String)"progress", (int[])object);
        this.o = progressBar;
        progressBar.setDuration(5000L);
        this.o.setAutoCancel(true);
        progressBar = this.o;
        object = new LinearInterpolator;
        object();
        progressBar.setInterpolator((TimeInterpolator)object);
        progressBar = this.o;
        object = new NewAjioStoryView$a;
        object(this);
        progressBar.addListener((Animator.AnimatorListener)object);
        this.o.start();
    }

    public final void n() {
        hv3_0.f0(this.k, 2);
        ProgressBar progressBar = this.f;
        Object object = new int[]{0, 100};
        progressBar = ObjectAnimator.ofInt((Object)progressBar, (String)"progress", (int[])object);
        this.q = progressBar;
        progressBar.setDuration(5000L);
        this.q.setAutoCancel(true);
        progressBar = this.q;
        object = new LinearInterpolator;
        object();
        progressBar.setInterpolator((TimeInterpolator)object);
        progressBar = this.q;
        object = new NewAjioStoryView$c;
        object(this);
        progressBar.addListener((Animator.AnimatorListener)object);
        this.q.start();
    }

    public final void o() {
        int n3 = this.k;
        boolean bl2 = true;
        hv3_0.f0(n3, (int)(bl2 ? 1 : 0));
        ProgressBar progressBar = this.e;
        int[] nArray = new int[]{0, 100};
        progressBar = ObjectAnimator.ofInt((Object)progressBar, (String)"progress", (int[])nArray);
        this.p = progressBar;
        progressBar.setDuration(5000L);
        this.p.setAutoCancel(bl2);
        progressBar = this.p;
        Object object = new LinearInterpolator();
        progressBar.setInterpolator((TimeInterpolator)object);
        progressBar = this.p;
        object = new NewAjioStoryView$b(this);
        progressBar.addListener((Animator.AnimatorListener)object);
        this.p.start();
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent object, MotionEvent motionEvent, float f5, float f6) {
        block13: {
            boolean bl2;
            block15: {
                block14: {
                    Object object2;
                    float f7;
                    float f8;
                    float f11;
                    block12: {
                        try {
                            f11 = motionEvent.getY();
                        }
                        catch (Exception exception) {}
                        float f12 = object.getY();
                        f11 -= f12;
                        f8 = motionEvent.getX();
                        f7 = object.getX();
                        f8 -= f7;
                        f7 = Math.abs(f8);
                        f8 = Math.abs(f11);
                        object2 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1);
                        if (object2 <= 0) break block12;
                        return false;
                    }
                    f7 = Math.abs(f11);
                    int bl22 = 1132068864;
                    f8 = 250.0f;
                    object2 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1);
                    if (object2 <= 0) break block13;
                    f7 = Math.abs(f6);
                    int n3 = 1120403456;
                    f8 = 100.0f;
                    object2 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1);
                    if (object2 <= 0) break block13;
                    f7 = 0.0f;
                    object = null;
                    bl2 = true;
                    f8 = Float.MIN_VALUE;
                    float f12 = f11 - 0.0f;
                    object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (object2 >= 0) break block14;
                    this.g();
                    return bl2;
                }
                object = this.b;
                if (object == null) break block15;
                ((NewAjioStoryActivity)object).onBackPressed();
            }
            return bl2;
        }
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        boolean bl2;
        this.r = bl2 = true;
        motionEvent = this.o;
        if (motionEvent != null) {
            motionEvent.pause();
        }
        if ((motionEvent = this.p) != null) {
            motionEvent.pause();
        }
        if ((motionEvent = this.q) != null) {
            motionEvent.pause();
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent object) {
        View view;
        float f5 = object.getX();
        int n3 = Math.round(f5);
        float f6 = object.getY();
        int n4 = Math.round(f6);
        View view2 = this.l;
        int n7 = view2.getLeft();
        boolean bl2 = true;
        if (n3 > n7 && n3 < (n7 = (view2 = this.l).getRight()) && n4 > (n3 = (view = this.l).getTop()) && n4 < (n3 = (view = this.l).getBottom())) {
            this.g();
            return bl2;
        }
        n3 = this.a;
        f5 = n3;
        float f7 = object.getRawX();
        float f8 = f5 - f7;
        Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            object = this.i;
            if (object != null) {
                object2 = object.size();
                n3 = 2;
                f5 = 2.8E-45f;
                n4 = 0;
                f6 = 0.0f;
                if (object2 != n3) {
                    n7 = 3;
                    if (object2 == n7) {
                        object = this.m;
                        object2 = object.getCurrentItem();
                        if (object2 == false) {
                            this.e.setProgress(0);
                            object = this.f;
                            object.setProgress(0);
                        } else {
                            object = this.m;
                            object2 = object.getCurrentItem();
                            if (object2 == bl2) {
                                this.c();
                                this.d.setProgress(0);
                                object = this.f;
                                object.setProgress(0);
                                this.m();
                                this.k();
                            } else {
                                object = this.m;
                                object2 = object.getCurrentItem();
                                if (object2 == n3) {
                                    this.b();
                                    object = this.d;
                                    n3 = 100;
                                    f5 = 1.4E-43f;
                                    object.setProgress(n3);
                                    object = this.e;
                                    object.setProgress(0);
                                    this.o();
                                    this.k();
                                }
                            }
                        }
                    }
                } else {
                    object = this.m;
                    object2 = object.getCurrentItem();
                    if (object2 == bl2) {
                        this.c();
                        object = this.d;
                        object.setProgress(0);
                        this.m();
                        this.k();
                    } else {
                        object = this.m;
                        object2 = object.getCurrentItem();
                        if (object2 == false) {
                            this.c();
                        }
                    }
                }
            }
        } else {
            this.d();
        }
        return bl2;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public void setData(ArrayList object, int n3) {
        int n4;
        if (object == null) {
            return;
        }
        this.k = n3;
        ArrayList arrayList = this.i;
        arrayList.clear();
        this.a();
        this.c();
        this.b();
        int n7 = 0;
        Object object2 = null;
        for (int i3 = 0; i3 < (n4 = ((ArrayList)object).size()); ++i3) {
            BannerDetails bannerDetails = (BannerDetails)((ArrayList)object).get(i3);
            String string2 = bannerDetails.getImageUrl();
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (bl2) continue;
            arrayList.add(bannerDetails);
        }
        object = this.m;
        object2 = new NewAjioStoryView$e(this);
        ((NewAjioStoryViewPager)((Object)object)).setAdapter((Uk2)object2);
        object = this.m;
        object2 = new Object();
        ((NewAjioStoryViewPager)((Object)object)).setPageTransformer(false, (NewAjioStoryViewPager$h)object2);
        int n8 = arrayList.size();
        n3 = 1;
        float f5 = Float.MIN_VALUE;
        n7 = 8;
        if (n8 != n3) {
            n3 = 2;
            f5 = 2.8E-45f;
            if (n8 != n3) {
                n3 = 3;
                f5 = 4.2E-45f;
                if (n8 == n3) {
                    object = this.d;
                    n3 = 0x40400000;
                    f5 = 3.0f;
                    NewAjioStoryView.i(f5, (View)object);
                    object = this.e;
                    NewAjioStoryView.i(f5, (View)object);
                    object = this.f;
                    NewAjioStoryView.i(f5, (View)object);
                }
            } else {
                object = this.d;
                n3 = 0x40900000;
                f5 = 4.5f;
                NewAjioStoryView.i(f5, (View)object);
                object = this.e;
                NewAjioStoryView.i(f5, (View)object);
                this.g.setVisibility(n7);
                object = this.f;
                object.setVisibility(n7);
            }
        } else {
            object = this.d;
            NewAjioStoryView.i(9.0f, (View)object);
            this.h.setVisibility(n7);
            this.g.setVisibility(n7);
            this.e.setVisibility(n7);
            this.f.setVisibility(n7);
            object = this.d;
            n3 = 100;
            f5 = 1.4E-43f;
            object.setProgress(n3);
        }
    }

    public void setSwipeLayoutVisibility(boolean bl2) {
        View view = this.l;
        if (view == null) {
            return;
        }
        if (bl2) {
            int n3 = 8;
            view.setVisibility(n3);
        } else {
            boolean bl3 = false;
            view.setVisibility(0);
        }
    }
}

