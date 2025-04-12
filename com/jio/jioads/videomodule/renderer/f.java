/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 */
package com.jio.jioads.videomodule.renderer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.videomodule.config.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class f {
    public TextView A;
    public String B;
    public TextView C;
    public RelativeLayout D;
    public Drawable E;
    public ImageView F;
    public Drawable G;
    public RelativeLayout.LayoutParams H;
    public TextView I;
    public TextView J;
    public ViewGroup K;
    public TextView L;
    public TextView M;
    public TextView N;
    public ViewGroup O;
    public String P;
    public Integer a;
    public final a b;
    public final View c;
    public Context d;
    public RelativeLayout e;
    public ProgressBar f;
    public ProgressBar g;
    public TextView h;
    public RelativeLayout i;
    public ImageView j;
    public TextView k;
    public Drawable l;
    public Drawable m;
    public Drawable n;
    public Drawable o;
    public RelativeLayout p;
    public ImageView q;
    public ImageView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public Drawable[] x;
    public Drawable[] y;
    public String z;

    public f(Context object, Integer n3, a a2, View view) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(a2, "inStreamConfig");
        this.a = n3;
        this.b = a2;
        this.c = view;
        this.d = object;
        this.P = "VideoAdProgressCountDefault";
        object = object.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.LayoutInflater");
        object = (LayoutInflater)object;
        this.b((LayoutInflater)object);
        this.a();
    }

    public final void a() {
        String string2;
        int n3;
        int n4;
        boolean bl2;
        Object object = this.e;
        Intrinsics.checkNotNull(object);
        object = (ProgressBar)object.findViewWithTag((Object)"VideoAdLoader");
        this.g = object;
        Object object2 = this.b;
        if (object == null) {
            object2.getClass();
        }
        if ((object = this.g) != null) {
            object.setVisibility(0);
        }
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (ProgressBar)object.findViewWithTag((Object)"VideoAdProgressBar");
        this.f = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        String string3 = "VideoAdProgressCount";
        object = (TextView)object.findViewWithTag((Object)string3);
        this.v = object;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object = object.getContentDescription();
            if (object != null) {
                object = this.v;
                Intrinsics.checkNotNull(object);
                object = ((Object)object.getContentDescription()).toString();
                string3 = "VideoAdProgressCountUp";
                bl2 = true;
                n4 = kotlin.text.b.i((String)object, string3, bl2);
                if (n4 != 0) {
                    this.P = string3;
                } else {
                    string3 = "VideoAdProgressCountTotalDuration";
                    n3 = kotlin.text.b.i((String)object, string3, bl2);
                    if (n3 != 0) {
                        this.P = string3;
                    }
                }
            }
        }
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (ViewGroup)object.findViewWithTag((Object)"ContainerAdParams");
        this.O = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (TextView)object.findViewWithTag((Object)"VideoAdTitle");
        this.I = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (TextView)object.findViewWithTag((Object)"VideoAdDescription");
        this.J = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (ViewGroup)object.findViewWithTag((Object)"VideoAdIconLayout");
        this.K = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (TextView)object.findViewWithTag((Object)"VideoAdCTA");
        this.L = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (TextView)object.findViewWithTag((Object)"VideoAdCTAButtonFocused");
        this.N = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        string3 = "SecondaryVideoAdCta";
        object = (TextView)object.findViewWithTag((Object)string3);
        this.M = object;
        object = this.I;
        int n7 = 8;
        if (object != null) {
            object.setVisibility(n7);
        }
        object = this.J;
        if (object != null) {
            object.setVisibility(n7);
        }
        object = this.K;
        if (object != null) {
            object.setVisibility(n7);
        }
        object = this.L;
        if (object != null) {
            object.setVisibility(n7);
        }
        object = this.N;
        if (object != null) {
            object.setVisibility(n7);
        }
        object = this.e;
        Intrinsics.checkNotNull(object);
        String string4 = "VideoAdCounter";
        object = (TextView)object.findViewWithTag((Object)string4);
        this.u = object;
        if (object != null) {
            object.setVisibility(n7);
        }
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (TextView)object.findViewWithTag((Object)"VideoAdSkipElement");
        this.w = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (TextView)object.findViewWithTag((Object)"VideoAdSkipElementFocused");
        this.t = object;
        object = this.w;
        bl2 = false;
        string4 = null;
        if (object != null) {
            object = object.getCompoundDrawables();
        } else {
            n3 = 0;
            object = null;
        }
        this.x = object;
        object = this.w;
        if (object != null) {
            object = object.getText();
        } else {
            n3 = 0;
            object = null;
        }
        object = String.valueOf(object);
        n3 = ((String)object).length();
        if (n3 > 0) {
            object = this.w;
            if (object != null) {
                object = object.getText();
            } else {
                n3 = 0;
                object = null;
            }
            object = String.valueOf(object);
        } else {
            object = this.w;
            if (object != null) {
                object = object.getContentDescription();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                object = this.w;
                if (object != null) {
                    object = object.getContentDescription();
                } else {
                    n3 = 0;
                    object = null;
                }
                object = String.valueOf(object);
            } else {
                n3 = 0;
                object = null;
            }
        }
        this.z = object;
        object = this.e;
        if (object != null) {
            string2 = "RewardTimer";
            object = (TextView)object.findViewWithTag((Object)string2);
        } else {
            n3 = 0;
            object = null;
        }
        n4 = object instanceof TextView;
        if (n4 == 0) {
            n3 = 0;
            object = null;
        }
        this.C = (TextView)object;
        object = this.e;
        if (object != null) {
            string2 = "JioInterstitialCloseAd";
            object = (TextView)object.findViewWithTag((Object)string2);
        } else {
            n3 = 0;
            object = null;
        }
        n4 = object instanceof TextView;
        if (n4 == 0) {
            n3 = 0;
            object = null;
        }
        this.A = (TextView)object;
        object = this.C;
        if (object != null) {
            object = object.getCompoundDrawables();
        } else {
            n3 = 0;
            object = null;
        }
        this.y = (Drawable[])object;
        object = this.C;
        if (object != null && (object = object.getText()) != null) {
            object = object.toString();
        } else {
            n3 = 0;
            object = null;
        }
        this.B = (String)object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        string2 = "NativeVideoPlayAgain";
        object = (TextView)object.findViewWithTag((Object)string2);
        this.h = object;
        if (object != null) {
            object.setVisibility(n7);
        }
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (TextView)object.findViewWithTag((Object)"VideoAdThumbnailSkipElement");
        this.k = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (ImageView)object.findViewWithTag((Object)"VideoAdSkipThumbnail");
        this.j = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        string2 = this.d;
        Intrinsics.checkNotNull(string2);
        string2 = string2.getResources();
        Object object3 = this.d;
        Intrinsics.checkNotNull(object3);
        object3 = object3.getPackageName();
        String string5 = "id";
        n4 = string2.getIdentifier("layout_skip", string5, (String)object3);
        object = (RelativeLayout)object.findViewById(n4);
        this.i = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        string2 = this.d;
        Intrinsics.checkNotNull(string2);
        string2 = string2.getResources();
        object3 = this.d;
        Intrinsics.checkNotNull(object3);
        object3 = object3.getPackageName();
        String string6 = "adDetailsLayout";
        n4 = string2.getIdentifier(string6, string5, (String)object3);
        object = (RelativeLayout)object.findViewById(n4);
        this.p = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (TextView)object.findViewWithTag((Object)"VastAdProgressLabel");
        this.s = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (ImageView)object.findViewWithTag((Object)"VideoAdResizeIcon");
        this.r = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = (ImageView)object.findViewWithTag((Object)"VideoAdPlaybackIcon");
        this.q = object;
        object = this.e;
        Intrinsics.checkNotNull(object);
        string2 = "VideoAdAudioIcon";
        object = (ImageView)object.findViewWithTag((Object)string2);
        this.F = object;
        object = this.q;
        if (object != null) {
            n4 = (int)(((a)object2).d ? 1 : 0);
            if (n4 != 0) {
                n4 = 0;
                string2 = null;
            } else {
                n4 = 8;
            }
            object.setVisibility(n4);
        }
        if ((object = this.r) != null) {
            n4 = (int)(((a)object2).e ? 1 : 0);
            if (n4 != 0) {
                n4 = 0;
                string2 = null;
            } else {
                n4 = 8;
            }
            object.setVisibility(n4);
        }
        if ((object = this.F) != null) {
            n4 = (int)(((a)object2).f ? 1 : 0);
            if (n4 != 0) {
                n7 = 0;
                string3 = null;
            }
            object.setVisibility(n7);
        }
        if ((n3 = (int)(((a)object2).d ? 1 : 0)) != 0 && (object = this.q) != null) {
            Intrinsics.checkNotNull(object);
            object = object.getDrawable();
            this.n = object;
            object = this.q;
            Intrinsics.checkNotNull(object);
            object = object.getBackground();
            this.o = object;
            object = this.q;
            Intrinsics.checkNotNull(object);
            object.setBackground(null);
        }
        if ((n3 = (int)(((a)object2).f ? 1 : 0)) != 0 && (object = this.F) != null) {
            Intrinsics.checkNotNull(object);
            object = object.getDrawable();
            this.G = object;
            object = this.F;
            Intrinsics.checkNotNull(object);
            object = object.getBackground();
            this.E = object;
            object = this.F;
            Intrinsics.checkNotNull(object);
            object.setBackground(null);
            object = this.F;
            Intrinsics.checkNotNull(object);
            object.setVisibility(0);
        }
        if ((n3 = (int)(((a)object2).e ? 1 : 0)) != 0 && (object = this.r) != null) {
            Intrinsics.checkNotNull(object);
            object = object.getDrawable();
            this.l = object;
            object = this.r;
            Intrinsics.checkNotNull(object);
            object = object.getBackground();
            this.m = object;
            object = this.r;
            Intrinsics.checkNotNull(object);
            object.setBackground(null);
        }
        int n8 = -1;
        object = new RelativeLayout.LayoutParams(n8, n8);
        this.H = object;
        n8 = 13;
        object.addRule(n8);
        object = this.D;
        object2 = "null cannot be cast to non-null type android.view.ViewGroup";
        if (object != null && (string3 = this.c) != null) {
            object.removeAllViews();
            object = string3.getParent();
            if (object != null) {
                object = string3.getParent();
                Intrinsics.checkNotNull(object, (String)object2);
                object = (ViewGroup)object;
                object.removeView((View)string3);
            }
            if ((object = this.D) != null) {
                string4 = this.H;
                object.addView((View)string3, (ViewGroup.LayoutParams)string4);
            }
        }
        if ((object = this.e) != null) {
            Intrinsics.checkNotNull(object);
            object = object.getParent();
            if (object != null) {
                object = this.e;
                Intrinsics.checkNotNull(object);
                object = object.getParent();
                Intrinsics.checkNotNull(object, (String)object2);
                object = (ViewGroup)object;
                object2 = this.e;
                object.removeView((View)object2);
            }
        }
        if ((object = this.d) != null && (n3 = (int)(j_0.l((Context)object) ? 1 : 0)) == 0) {
            object = this.e;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.f;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.g;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.h;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.i;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.j;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.k;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.p;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.q;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.r;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.s;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.t;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.u;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.v;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.w;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.D;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.F;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.I;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.J;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.K;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.L;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.M;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.N;
            if (object != null) {
                object.setFocusableInTouchMode(false);
            }
            object = this.e;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.f;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.g;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.h;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.i;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.j;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.k;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.p;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.q;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.r;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.s;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.t;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.u;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.v;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.w;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.D;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.F;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.I;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.J;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.K;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.L;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.M;
            if (object != null) {
                object.setFocusable(false);
            }
            object = this.N;
            if (object != null) {
                object.setFocusable(false);
            }
        }
    }

    public final void b(LayoutInflater layoutInflater) {
        Integer n3 = this.a;
        Intrinsics.checkNotNull(n3);
        int n4 = n3;
        layoutInflater = layoutInflater.inflate(n4, null);
        Intrinsics.checkNotNull(layoutInflater, "null cannot be cast to non-null type android.widget.RelativeLayout");
        layoutInflater = (RelativeLayout)layoutInflater;
        this.e = layoutInflater;
        Intrinsics.checkNotNull(layoutInflater);
        layoutInflater = (RelativeLayout)layoutInflater.findViewWithTag((Object)"VideoAdPlayerContainer");
        this.D = layoutInflater;
    }

    public final boolean c() {
        boolean bl2;
        TextView textView = this.C;
        if (textView != null) {
            bl2 = true;
        } else {
            bl2 = false;
            textView = null;
        }
        return bl2;
    }
}

