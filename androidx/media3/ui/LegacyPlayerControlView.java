/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.f;
import androidx.media3.common.f$c;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.ui.LegacyPlayerControlView$a;
import androidx.media3.ui.LegacyPlayerControlView$b;
import androidx.media3.ui.LegacyPlayerControlView$c;
import androidx.media3.ui.R$drawable;
import androidx.media3.ui.R$id;
import androidx.media3.ui.R$integer;
import androidx.media3.ui.R$layout;
import androidx.media3.ui.R$string;
import androidx.media3.ui.R$styleable;
import androidx.media3.ui.b;
import androidx.media3.ui.b$a;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public class LegacyPlayerControlView
extends FrameLayout {
    public static final /* synthetic */ int u0;
    public final Drawable A;
    public final Drawable B;
    public final float C;
    public final float D;
    public final String E;
    public final String F;
    public f G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public final LegacyPlayerControlView$a a;
    public final CopyOnWriteArrayList b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final ImageView j;
    public final View k;
    public long[] k0;
    public final TextView l;
    public final TextView m;
    public final b n;
    public final StringBuilder o;
    public final Formatter p;
    public boolean[] p0;
    public final g$b q;
    public long[] q0;
    public final g$c r;
    public boolean[] r0;
    public final St1 s;
    public long s0;
    public final Tt1 t;
    public long t0;
    public final Drawable u;
    public final Drawable v;
    public final Drawable w;
    public final String x;
    public final String y;
    public final String z;

    static {
        im1_0.a("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context object, AttributeSet object2, int n3) {
        super(object, (AttributeSet)object2, n3);
        int n4;
        int n7;
        Object object3;
        Object object4;
        Object object5;
        long l2;
        int n8;
        int n10;
        int n14 = R$layout.exo_legacy_player_control_view;
        this.J = n10 = 1;
        this.M = 5000;
        this.O = 0;
        this.N = n8 = 200;
        this.U = l2 = -9223372036854775807L;
        this.P = n10;
        this.Q = n10;
        this.R = n10;
        this.S = n10;
        this.T = false;
        if (object2 != null) {
            object5 = object.getTheme();
            object4 = R$styleable.LegacyPlayerControlView;
            object3 = object5.obtainStyledAttributes((AttributeSet)object2, object4, n3, 0);
            try {
                n10 = R$styleable.LegacyPlayerControlView_show_timeout;
                n7 = this.M;
                this.M = n10 = object3.getInt(n10, n7);
                n10 = R$styleable.LegacyPlayerControlView_controller_layout_id;
                n14 = object3.getResourceId(n10, n14);
                n10 = this.O;
                n7 = R$styleable.LegacyPlayerControlView_repeat_toggle_modes;
                this.O = n10 = object3.getInt(n7, n10);
                n10 = R$styleable.LegacyPlayerControlView_show_rewind_button;
                n7 = (int)(this.P ? 1 : 0);
                n10 = (int)(object3.getBoolean(n10, n7 != 0) ? 1 : 0);
                this.P = n10;
                n10 = R$styleable.LegacyPlayerControlView_show_fastforward_button;
                n7 = this.Q;
                n10 = (int)(object3.getBoolean(n10, n7 != 0) ? 1 : 0);
                this.Q = n10;
                n10 = R$styleable.LegacyPlayerControlView_show_previous_button;
                n7 = this.R;
                n10 = (int)(object3.getBoolean(n10, n7 != 0) ? 1 : 0);
                this.R = n10;
                n10 = R$styleable.LegacyPlayerControlView_show_next_button;
                n7 = this.S;
                n10 = (int)(object3.getBoolean(n10, n7 != 0) ? 1 : 0);
                this.S = n10;
                n10 = R$styleable.LegacyPlayerControlView_show_shuffle_button;
                n7 = this.T;
                n10 = (int)(object3.getBoolean(n10, n7 != 0) ? 1 : 0);
                this.T = n10;
                n10 = R$styleable.LegacyPlayerControlView_time_bar_min_update_interval;
                n7 = this.N;
                n10 = object3.getInt(n10, n7);
                this.setTimeBarMinUpdateInterval(n10);
            }
            finally {
                object3.recycle();
            }
        }
        object3 = new CopyOnWriteArrayList();
        this.b = object3;
        this.q = object3 = new g$b();
        this.r = object3 = new g$c();
        this.o = object3 = new StringBuilder();
        object4 = Locale.getDefault();
        super((Appendable)object3, (Locale)object4);
        this.p = object5;
        object3 = new long[0];
        this.k0 = (long[])object3;
        object3 = new boolean[0];
        this.p0 = (boolean[])object3;
        object3 = new long[0];
        this.q0 = (long[])object3;
        object3 = new boolean[0];
        this.r0 = (boolean[])object3;
        this.a = object3 = new LegacyPlayerControlView$a(this);
        n7 = 0;
        object4 = null;
        super((Object)this, 0);
        this.s = object5;
        super((Object)this, 0);
        this.t = object5;
        LayoutInflater.from((Context)object).inflate(n14, (ViewGroup)this);
        float f5 = 3.67342E-40f;
        this.setDescendantFocusability(262144);
        n14 = R$id.exo_progress;
        b b2 = (b)this.findViewById(n14);
        n10 = R$id.exo_progress_placeholder;
        object5 = this.findViewById(n10);
        if (b2 != null) {
            this.n = b2;
        } else if (object5 != null) {
            object4 = b2;
            super((Context)object, null, 0, (AttributeSet)object2, 0);
            n4 = R$id.exo_progress;
            b2.setId(n4);
            object2 = object5.getLayoutParams();
            b2.setLayoutParams((ViewGroup.LayoutParams)object2);
            object2 = (ViewGroup)object5.getParent();
            n7 = object2.indexOfChild((View)object5);
            object2.removeView((View)object5);
            object2.addView((View)b2, n7);
            this.n = b2;
        } else {
            n4 = 0;
            object2 = null;
            this.n = null;
        }
        n4 = R$id.exo_duration;
        object2 = (TextView)this.findViewById(n4);
        this.l = object2;
        n4 = R$id.exo_position;
        object2 = (TextView)this.findViewById(n4);
        this.m = object2;
        object2 = this.n;
        if (object2 != null) {
            object2.a((b$a)object3);
        }
        n4 = R$id.exo_play;
        object2 = this.findViewById(n4);
        this.e = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        n4 = R$id.exo_pause;
        object2 = this.findViewById(n4);
        this.f = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        n4 = R$id.exo_prev;
        object2 = this.findViewById(n4);
        this.c = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        n4 = R$id.exo_next;
        object2 = this.findViewById(n4);
        this.d = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        n4 = R$id.exo_rew;
        object2 = this.findViewById(n4);
        this.h = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        n4 = R$id.exo_ffwd;
        object2 = this.findViewById(n4);
        this.g = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        n4 = R$id.exo_repeat_toggle;
        object2 = (ImageView)this.findViewById(n4);
        this.i = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        n4 = R$id.exo_shuffle;
        object2 = (ImageView)this.findViewById(n4);
        this.j = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        n4 = R$id.exo_vr;
        object2 = this.findViewById(n4);
        this.k = object2;
        this.setShowVrButton(false);
        this.d(false, false, (View)object2);
        object2 = object.getResources();
        n3 = R$integer.exo_media_button_opacity_percentage_enabled;
        float f6 = object2.getInteger(n3);
        f5 = 100.0f;
        this.C = f6 /= f5;
        n3 = R$integer.exo_media_button_opacity_percentage_disabled;
        this.D = f6 = (float)object2.getInteger(n3) / f5;
        n3 = R$drawable.exo_legacy_controls_repeat_off;
        b2 = object.getTheme();
        object3 = object2.getDrawable(n3, (Resources.Theme)b2);
        this.u = object3;
        n3 = R$drawable.exo_legacy_controls_repeat_one;
        b2 = object.getTheme();
        object3 = object2.getDrawable(n3, (Resources.Theme)b2);
        this.v = object3;
        n3 = R$drawable.exo_legacy_controls_repeat_all;
        b2 = object.getTheme();
        object3 = object2.getDrawable(n3, (Resources.Theme)b2);
        this.w = object3;
        n3 = R$drawable.exo_legacy_controls_shuffle_on;
        b2 = object.getTheme();
        object3 = object2.getDrawable(n3, (Resources.Theme)b2);
        this.A = object3;
        n3 = R$drawable.exo_legacy_controls_shuffle_off;
        object = object.getTheme();
        object = object2.getDrawable(n3, (Resources.Theme)object);
        this.B = object;
        int n15 = R$string.exo_controls_repeat_off_description;
        object = object2.getString(n15);
        this.x = object;
        n15 = R$string.exo_controls_repeat_one_description;
        object = object2.getString(n15);
        this.y = object;
        n15 = R$string.exo_controls_repeat_all_description;
        object = object2.getString(n15);
        this.z = object;
        n15 = R$string.exo_controls_shuffle_on_description;
        object = object2.getString(n15);
        this.E = object;
        n15 = R$string.exo_controls_shuffle_off_description;
        object = object2.getString(n15);
        this.F = object;
        this.t0 = l2;
    }

    public final void a() {
        int n3 = this.c();
        if (n3 != 0) {
            long l2;
            boolean bl2;
            n3 = 8;
            this.setVisibility(n3);
            Object object = this.b.iterator();
            while (bl2 = object.hasNext()) {
                LegacyPlayerControlView$c legacyPlayerControlView$c = (LegacyPlayerControlView$c)object.next();
                this.getVisibility();
                legacyPlayerControlView$c.a();
            }
            object = this.s;
            this.removeCallbacks((Runnable)object);
            object = this.t;
            this.removeCallbacks((Runnable)object);
            this.U = l2 = -9223372036854775807L;
        }
    }

    public final void b() {
        Tt1 tt1 = this.t;
        this.removeCallbacks(tt1);
        int n3 = this.M;
        if (n3 > 0) {
            long l2 = SystemClock.uptimeMillis();
            int n4 = this.M;
            long l3 = n4;
            this.U = l2 += l3;
            n3 = (int)(this.H ? 1 : 0);
            if (n3 != 0) {
                this.postDelayed(tt1, l3);
            }
        } else {
            long l4;
            this.U = l4 = -9223372036854775807L;
        }
    }

    public final boolean c() {
        int n3 = this.getVisibility();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final void d(boolean n3, boolean bl2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(bl2);
        float f5 = bl2 ? this.C : this.D;
        view.setAlpha(f5);
        n3 = n3 != 0 ? 0 : 8;
        view.setVisibility(n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n3;
        int n4 = keyEvent.getKeyCode();
        f f5 = this.G;
        if (f5 != null) {
            int n7 = 88;
            int n8 = 87;
            int n10 = 127;
            int n14 = 126;
            int n15 = 79;
            int n16 = 85;
            int n17 = 89;
            int n18 = 90;
            if (n4 == n18 || n4 == n17 || n4 == n16 || n4 == n15 || n4 == n14 || n4 == n10 || n4 == n8 || n4 == n7) {
                int n19 = keyEvent.getAction();
                if (n19 != 0) return 1 != 0;
                if (n4 == n18) {
                    n3 = f5.getPlaybackState();
                    if (n3 == (n4 = 4)) return 1 != 0;
                    f5.seekForward();
                    return 1 != 0;
                }
                if (n4 == n17) {
                    f5.seekBack();
                    return 1 != 0;
                }
                n3 = keyEvent.getRepeatCount();
                if (n3 != 0) return 1 != 0;
                if (n4 != n15 && n4 != n16) {
                    if (n4 != n8) {
                        if (n4 != n7) {
                            if (n4 != n14) {
                                if (n4 != n10) return 1 != 0;
                                gz3.z(f5);
                                return 1 != 0;
                            }
                            gz3.A(f5);
                            return 1 != 0;
                        }
                        f5.seekToPrevious();
                        return 1 != 0;
                    }
                    f5.seekToNext();
                    return 1 != 0;
                }
                n3 = (int)(this.J ? 1 : 0);
                if (n3 = gz3.Q(f5, n3 != 0)) {
                    gz3.A(f5);
                    return 1 != 0;
                } else {
                    gz3.z(f5);
                }
                return 1 != 0;
            }
        }
        if ((n3 = super.dispatchKeyEvent(keyEvent)) != 0) return 1 != 0;
        return 0 != 0;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getAction();
        if (n3 == 0) {
            Tt1 tt1 = this.t;
            this.removeCallbacks(tt1);
        } else {
            int n4;
            n3 = motionEvent.getAction();
            if (n3 == (n4 = 1)) {
                this.b();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        boolean bl2 = this.c();
        if (bl2 && (bl2 = this.H)) {
            View view;
            boolean bl4;
            boolean bl5;
            boolean bl6;
            boolean bl7;
            Object object = this.G;
            if (object != null) {
                bl7 = object.isCommandAvailable(5);
                bl6 = object.isCommandAvailable(7);
                bl5 = object.isCommandAvailable(11);
                bl4 = object.isCommandAvailable(12);
                int bl3 = 9;
                bl2 = object.isCommandAvailable(bl3);
            } else {
                bl7 = false;
                bl2 = false;
                object = null;
                bl6 = false;
                bl5 = false;
                view = null;
                bl4 = false;
            }
            boolean bl3 = this.R;
            View view2 = this.c;
            this.d(bl3, bl6, view2);
            bl6 = this.P;
            View view3 = this.h;
            this.d(bl6, bl5, view3);
            bl6 = this.Q;
            view = this.g;
            this.d(bl6, bl4, view);
            bl6 = this.S;
            view = this.d;
            this.d(bl6, bl2, view);
            object = this.n;
            if (object != null) {
                object.setEnabled(bl7);
            }
        }
    }

    public final void f() {
        boolean bl2 = this.c();
        if (bl2 && (bl2 = this.H)) {
            View view;
            boolean bl3;
            boolean bl4;
            f f5 = this.G;
            int n3 = this.J;
            bl2 = gz3.Q(f5, n3 != 0);
            n3 = 8;
            boolean bl5 = true;
            View view2 = this.e;
            int n4 = 0;
            if (view2 != null) {
                int n7;
                bl4 = !bl2 && (bl4 = view2.isFocused());
                bl3 = !bl2 && (bl3 = view2.isAccessibilityFocused());
                if (bl2) {
                    n7 = 0;
                    view = null;
                } else {
                    n7 = 8;
                }
                view2.setVisibility(n7);
            } else {
                bl4 = false;
                bl3 = false;
            }
            view = this.f;
            if (view != null) {
                boolean bl6;
                bl6 = bl2 && (bl6 = view.isFocused());
                bl4 |= bl6;
                if (!bl2 || !(bl6 = view.isAccessibilityFocused())) {
                    bl5 = false;
                }
                bl3 |= bl5;
                if (bl2) {
                    n4 = 8;
                }
                view.setVisibility(n4);
            }
            if (bl4) {
                f5 = this.G;
                bl5 = this.J;
                bl2 = gz3.Q(f5, bl5);
                if (bl2 && view2 != null) {
                    view2.requestFocus();
                } else if (!bl2 && view != null) {
                    view.requestFocus();
                }
            }
            if (bl3) {
                f5 = this.G;
                bl5 = this.J;
                bl2 = gz3.Q(f5, bl5);
                if (bl2 && view2 != null) {
                    view2.sendAccessibilityEvent(n3);
                } else if (!bl2 && view != null) {
                    view.sendAccessibilityEvent(n3);
                }
            }
        }
    }

    public final void g() {
        LegacyPlayerControlView legacyPlayerControlView = this;
        int n3 = this.c();
        if (n3 != 0 && (n3 = this.H) != 0) {
            boolean bl2;
            Object object;
            float f5;
            Object object2;
            long l2;
            long l3;
            long l4;
            Object object3 = this.G;
            if (object3 != null) {
                l4 = this.s0;
                l3 = object3.getContentPosition() + l4;
                l4 = this.s0;
                l2 = object3.getContentBufferedPosition() + l4;
            } else {
                l2 = l3 = 0L;
            }
            l4 = legacyPlayerControlView.t0;
            int n4 = 1;
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 != false) {
                object2 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                object2 = 0;
                f5 = 0.0f;
                object = null;
            }
            legacyPlayerControlView.t0 = l3;
            Object object4 = legacyPlayerControlView.m;
            if (object4 != null && (l7 = (long)legacyPlayerControlView.L) == false && object2 != 0) {
                object = legacyPlayerControlView.o;
                Formatter formatter = legacyPlayerControlView.p;
                object = gz3.u((StringBuilder)object, formatter, l3);
                object4.setText((CharSequence)object);
            }
            if ((object = legacyPlayerControlView.n) != null) {
                object.setPosition(l3);
                object.setBufferedPosition(l2);
            }
            object4 = legacyPlayerControlView.s;
            legacyPlayerControlView.removeCallbacks((Runnable)object4);
            int n7 = object3 == null ? 1 : object3.getPlaybackState();
            long l8 = 1000L;
            if (object3 != null && (bl2 = object3.isPlaying())) {
                l2 = object != null ? object.getPreferredUpdateDelay() : l8;
                l3 %= l8;
                l3 = l8 - l3;
                l3 = Math.min(l2, l3);
                object3 = object3.getPlaybackParameters();
                float f6 = ((ot2_0)object3).a;
                f5 = 0.0f;
                object = null;
                float f7 = f6 - 0.0f;
                object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object2 > 0) {
                    f5 = (float)l3 / f6;
                    l8 = (long)f5;
                }
                n3 = legacyPlayerControlView.N;
                long l12 = n3;
                long l14 = 1000L;
                long l15 = gz3.i(l8, l12, l14);
                legacyPlayerControlView.postDelayed((Runnable)object4, l15);
            } else {
                n3 = 4;
                float f8 = 5.6E-45f;
                if (n7 != n3 && n7 != n4) {
                    legacyPlayerControlView.postDelayed((Runnable)object4, l8);
                }
            }
        }
    }

    public f getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.O;
    }

    public boolean getShowShuffleButton() {
        return this.T;
    }

    public int getShowTimeoutMs() {
        return this.M;
    }

    public boolean getShowVrButton() {
        boolean bl2;
        View view = this.k;
        if (view != null && !(bl2 = view.getVisibility())) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void h() {
        ImageView imageView;
        boolean bl2 = this.c();
        if (bl2 && (bl2 = this.H) && (imageView = this.i) != null) {
            int n3 = this.O;
            if (n3 == 0) {
                this.d(false, false, (View)imageView);
                return;
            }
            Object object = this.G;
            String string2 = this.x;
            Drawable drawable2 = this.u;
            int n4 = 1;
            if (object == null) {
                this.d(n4 != 0, false, (View)imageView);
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription((CharSequence)string2);
                return;
            }
            this.d(n4 != 0, n4 != 0, (View)imageView);
            n3 = object.getRepeatMode();
            if (n3 != 0) {
                if (n3 != n4) {
                    int n7 = 2;
                    if (n3 == n7) {
                        object = this.w;
                        imageView.setImageDrawable((Drawable)object);
                        object = this.z;
                        imageView.setContentDescription((CharSequence)object);
                    }
                } else {
                    object = this.v;
                    imageView.setImageDrawable((Drawable)object);
                    object = this.y;
                    imageView.setContentDescription((CharSequence)object);
                }
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription((CharSequence)string2);
            }
            imageView.setVisibility(0);
        }
    }

    public final void i() {
        ImageView imageView;
        boolean bl2 = this.c();
        if (bl2 && (bl2 = this.H) && (imageView = this.j) != null) {
            f f5 = this.G;
            boolean bl3 = this.T;
            boolean bl4 = false;
            if (!bl3) {
                this.d(false, false, (View)imageView);
            } else {
                String string2 = this.F;
                Drawable drawable2 = this.B;
                boolean bl5 = true;
                if (f5 == null) {
                    this.d(bl5, false, (View)imageView);
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription((CharSequence)string2);
                } else {
                    this.d(bl5, bl5, (View)imageView);
                    bl4 = f5.getShuffleModeEnabled();
                    if (bl4) {
                        drawable2 = this.A;
                    }
                    imageView.setImageDrawable(drawable2);
                    boolean bl6 = f5.getShuffleModeEnabled();
                    if (bl6) {
                        string2 = this.E;
                    }
                    imageView.setContentDescription((CharSequence)string2);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void j() {
        var1_1 = this;
        var2_2 = this.G;
        if (var2_2 == null) {
            return;
        }
        var3_3 = this.I;
        var4_4 = 0;
        var5_5 = null;
        var6_6 /* !! */  = 1;
        var7_7 = -9223372036854775807L;
        var9_8 = 0L;
        var11_9 = this.r;
        if (var3_3 != 0 && (var13_11 = (var12_10 = var2_2.getCurrentTimeline()).p()) <= (var14_12 = 100)) {
            var13_11 = var12_10.p();
            for (var14_12 = 0; var14_12 < var13_11; ++var14_12) {
                var15_13 = var12_10.n(var14_12, var11_9, var9_8);
                var16_14 = var15_13.m;
                cfr_temp_0 = var16_14 - var7_7;
                var18_15 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var18_15 /* !! */  != 0) {
                    continue;
                }
                ** break block25
            }
            var3_3 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = 0;
            var12_10 = null;
        }
        var1_1.K = var3_3;
        var1_1.s0 = var9_8;
        var12_10 = var2_2.getCurrentTimeline();
        var13_11 = (int)var12_10.q();
        if (var13_11 == 0) {
            var19_16 = var2_2.getCurrentMediaItemIndex();
            var13_11 = (int)var1_1.K;
            var14_12 = var13_11 != 0 ? 0 : var19_16;
            var13_11 = var13_11 != 0 ? var12_10.p() - var6_6 /* !! */  : var19_16;
            var16_14 = var9_8;
            var18_15 /* !! */  = 0;
            while (var14_12 <= var13_11) {
                if (var14_12 == var19_16) {
                    var1_1.s0 = var9_8 = gz3.T(var16_14);
                }
                var12_10.o(var14_12, var11_9);
                var9_8 = var11_9.m;
                var20_17 = var9_8 == var7_7 ? 0 : (var9_8 < var7_7 ? -1 : 1);
                if (var20_17 == false) {
                    var19_16 = var1_1.K ^ var6_6 /* !! */ ;
                    ct3.f((boolean)var19_16);
                    break;
                }
                for (var21_18 = var11_9.n; var21_18 <= (var22_19 = var11_9.o); ++var21_18) {
                    var23_20 = var1_1.q;
                    var12_10.g(var21_18, var23_20, false);
                    var24_21 = var23_20.g;
                    for (var4_4 = var24_21.e; var4_4 < (var6_6 /* !! */  = var24_21.b); ++var4_4) {
                        block26: {
                            var25_22 = var23_20.d(var4_4);
                            var27_23 = -9223372036854775808L;
                            var6_6 /* !! */  = (int)(var25_22 == var27_23 ? 0 : (var25_22 < var27_23 ? -1 : 1));
                            var29_24 = var19_16;
                            if (var6_6 /* !! */  == 0) {
                                var30_25 = var12_10;
                                var31_26 = var23_20.d;
                                cfr_temp_1 = var31_26 - var7_7;
                                var33_27 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var33_27 /* !! */  == false) {
                                    while (true) {
                                        var34_28 = var30_25;
                                        var3_3 = 1;
                                        break block26;
                                        break;
                                    }
                                }
                                var25_22 = var31_26;
                            } else {
                                var30_25 = var12_10;
                            }
                            var31_26 = var23_20.e;
                            if ((var20_17 = (cfr_temp_2 = (var25_22 += var31_26) - (var31_26 = 0L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) < 0) ** continue;
                            var2_2 = var1_1.k0;
                            var3_3 = ((Object)var2_2).length;
                            if (var18_15 /* !! */  == var3_3) {
                                var3_3 = ((Object)var2_2).length;
                                var3_3 = var3_3 == 0 ? 1 : ((Object)var2_2).length * 2;
                                var2_2 = Arrays.copyOf((long[])var2_2, var3_3);
                                var1_1.k0 = (long[])var2_2;
                                var2_2 = Arrays.copyOf(var1_1.p0, var3_3);
                                var1_1.p0 = (boolean[])var2_2;
                            }
                            var2_2 = var1_1.k0;
                            var25_22 = gz3.T(var16_14 + var25_22);
                            var2_2[var18_15 /* !! */ ] = var25_22;
                            var2_2 = var1_1.p0;
                            var12_10 = var23_20.g.a(var4_4);
                            var35_29 = var12_10.b;
                            var36_30 = -1;
                            if (var35_29 == var36_30) {
                                var34_28 = var30_25;
                                while (true) {
                                    var3_3 = 1;
                                    while (true) {
                                        var37_31 = 1;
                                        ** GOTO lbl105
                                        break;
                                    }
                                    break;
                                }
                            } else {
                                for (var36_30 = 0; var36_30 < var35_29; ++var36_30) {
                                    var34_28 = var30_25;
                                    if ((var6_6 /* !! */  = (int)(var30_25 = (Object)var12_10.f)[var36_30]) == 0) ** continue;
                                    if (var6_6 /* !! */  == (var3_3 = 1)) ** continue;
                                    var30_25 = var34_28;
                                }
                                var34_28 = var30_25;
                                var3_3 = 1;
                                var37_31 = 0;
                            }
lbl105:
                            // 2 sources

                            var6_6 /* !! */  = var37_31 ^ 1;
                            var2_2[var18_15 /* !! */ ] = var6_6 /* !! */ ;
                            ++var18_15 /* !! */ ;
                        }
                        var19_16 = var29_24;
                        var12_10 = var34_28;
                        var7_7 = -9223372036854775807L;
                    }
                    var29_24 = var19_16;
                    var34_28 = var12_10;
                    var3_3 = 1;
                    var4_4 = 0;
                    var5_5 = null;
                    var6_6 /* !! */  = 1;
                    var7_7 = -9223372036854775807L;
                }
                var29_24 = var19_16;
                var34_28 = var12_10;
                var3_3 = 1;
                var38_32 = var11_9.m;
                var16_14 += var38_32;
                ++var14_12;
                var4_4 = 0;
                var5_5 = null;
                var6_6 /* !! */  = 1;
                var7_7 = -9223372036854775807L;
                var9_8 = 0L;
            }
            var9_8 = var16_14;
        } else {
            var9_8 = 0L;
            var18_15 /* !! */  = 0;
        }
        var31_26 = gz3.T(var9_8);
        var5_5 = var1_1.l;
        if (var5_5 != null) {
            var30_25 = var1_1.o;
            var40_33 = var1_1.p;
            var30_25 = gz3.u((StringBuilder)var30_25, (Formatter)var40_33, var31_26);
            var5_5.setText((CharSequence)var30_25);
        }
        if ((var5_5 = var1_1.n) != null) {
            var5_5.setDuration(var31_26);
            var2_2 = var1_1.q0;
            var19_16 = ((Object)var2_2).length;
            var3_3 = var18_15 /* !! */  + var19_16;
            var30_25 = var1_1.k0;
            var35_29 = ((Object)var30_25).length;
            if (var3_3 > var35_29) {
                var30_25 = Arrays.copyOf((long[])var30_25, var3_3);
                var1_1.k0 = (long[])var30_25;
                var30_25 = Arrays.copyOf(var1_1.p0, var3_3);
                var1_1.p0 = (boolean[])var30_25;
            }
            var30_25 = var1_1.q0;
            var40_33 = var1_1.k0;
            var36_30 = 0;
            System.arraycopy(var30_25, 0, var40_33, var18_15 /* !! */ , var19_16);
            var30_25 = var1_1.r0;
            var40_33 = var1_1.p0;
            System.arraycopy(var30_25, 0, var40_33, var18_15 /* !! */ , var19_16);
            var2_2 = var1_1.k0;
            var30_25 = var1_1.p0;
            var5_5.setAdGroupTimesMs((long[])var2_2, (boolean[])var30_25, var3_3);
        }
        this.g();
    }

    public final void onAttachedToWindow() {
        boolean bl2;
        super.onAttachedToWindow();
        this.H = bl2 = true;
        long l2 = this.U;
        long l3 = -9223372036854775807L;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object != false) {
            l3 = SystemClock.uptimeMillis();
            long l4 = (l2 -= l3) - (l3 = 0L);
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object <= 0) {
                this.a();
            } else {
                Tt1 tt1 = this.t;
                this.postDelayed(tt1, l2);
            }
        } else {
            bl2 = this.c();
            if (bl2) {
                this.b();
            }
        }
        this.f();
        this.e();
        this.h();
        this.i();
        this.j();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        Runnable runnable2 = this.s;
        this.removeCallbacks(runnable2);
        runnable2 = this.t;
        this.removeCallbacks(runnable2);
    }

    public void setExtraAdGroupMarkers(long[] objectArray, boolean[] blArray) {
        boolean bl2 = false;
        if (objectArray == null) {
            objectArray = new long[]{};
            this.q0 = objectArray;
            objectArray = new boolean[0];
            this.r0 = (boolean[])objectArray;
        } else {
            blArray.getClass();
            int n3 = objectArray.length;
            int n4 = blArray.length;
            if (n3 == n4) {
                bl2 = true;
            }
            ct3.a(bl2);
            this.q0 = objectArray;
            this.r0 = blArray;
        }
        this.j();
    }

    public void setPlayer(f f5) {
        boolean bl2;
        Object object = Looper.myLooper();
        Object object2 = Looper.getMainLooper();
        boolean bl3 = false;
        if (object == object2) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        ct3.f(bl2);
        if (f5 == null || (object = f5.getApplicationLooper()) == (object2 = Looper.getMainLooper())) {
            bl3 = true;
        }
        ct3.a(bl3);
        object = this.G;
        if (object == f5) {
            return;
        }
        object2 = this.a;
        if (object != null) {
            object.removeListener((f$c)object2);
        }
        this.G = f5;
        if (f5 != null) {
            f5.addListener((f$c)object2);
        }
        this.f();
        this.e();
        this.h();
        this.i();
        this.j();
    }

    public void setProgressUpdateListener(LegacyPlayerControlView$b legacyPlayerControlView$b) {
    }

    public void setRepeatToggleModes(int n3) {
        this.O = n3;
        f f5 = this.G;
        if (f5 != null) {
            int n4 = f5.getRepeatMode();
            if (n3 == 0 && n4 != 0) {
                f f6 = this.G;
                n4 = 0;
                f5 = null;
                f6.setRepeatMode(0);
            } else {
                int n7 = 2;
                int n8 = 1;
                if (n3 == n8 && n4 == n7) {
                    f f7 = this.G;
                    f7.setRepeatMode(n8);
                } else if (n3 == n7 && n4 == n8) {
                    f f8 = this.G;
                    f8.setRepeatMode(n7);
                }
            }
        }
        this.h();
    }

    public void setShowFastForwardButton(boolean bl2) {
        this.Q = bl2;
        this.e();
    }

    public void setShowMultiWindowTimeBar(boolean bl2) {
        this.I = bl2;
        this.j();
    }

    public void setShowNextButton(boolean bl2) {
        this.S = bl2;
        this.e();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean bl2) {
        this.J = bl2;
        this.f();
    }

    public void setShowPreviousButton(boolean bl2) {
        this.R = bl2;
        this.e();
    }

    public void setShowRewindButton(boolean bl2) {
        this.P = bl2;
        this.e();
    }

    public void setShowShuffleButton(boolean bl2) {
        this.T = bl2;
        this.i();
    }

    public void setShowTimeoutMs(int n3) {
        this.M = n3;
        n3 = (int)(this.c() ? 1 : 0);
        if (n3 != 0) {
            this.b();
        }
    }

    public void setShowVrButton(boolean n3) {
        View view = this.k;
        if (view != null) {
            n3 = n3 != 0 ? 0 : 8;
            view.setVisibility(n3);
        }
    }

    public void setTimeBarMinUpdateInterval(int n3) {
        this.N = n3 = gz3.h(n3, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.k;
        if (view != null) {
            boolean bl2;
            view.setOnClickListener(onClickListener);
            boolean bl3 = this.getShowVrButton();
            if (onClickListener != null) {
                bl2 = true;
            } else {
                bl2 = false;
                onClickListener = null;
            }
            this.d(bl3, bl2, view);
        }
    }
}

