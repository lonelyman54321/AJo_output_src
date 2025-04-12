/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 */
package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.d;
import androidx.media3.common.f;
import androidx.media3.common.f$c;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView$a;
import androidx.media3.ui.PlayerControlView$b;
import androidx.media3.ui.PlayerControlView$c;
import androidx.media3.ui.PlayerControlView$d;
import androidx.media3.ui.PlayerControlView$e;
import androidx.media3.ui.PlayerControlView$g;
import androidx.media3.ui.PlayerControlView$i;
import androidx.media3.ui.PlayerControlView$j;
import androidx.media3.ui.PlayerControlView$k;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.PlayerView$a;
import androidx.media3.ui.R$array;
import androidx.media3.ui.R$dimen;
import androidx.media3.ui.R$drawable;
import androidx.media3.ui.R$font;
import androidx.media3.ui.R$id;
import androidx.media3.ui.R$integer;
import androidx.media3.ui.R$layout;
import androidx.media3.ui.R$plurals;
import androidx.media3.ui.R$string;
import androidx.media3.ui.R$style;
import androidx.media3.ui.R$styleable;
import androidx.media3.ui.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlayerControlView
extends FrameLayout {
    public static final float[] Q0;
    public final View A;
    public PlayerControlView$c A0;
    public final View B;
    public boolean B0;
    public final TextView C;
    public boolean C0;
    public final TextView D;
    public boolean D0;
    public final b E;
    public boolean E0;
    public final StringBuilder F;
    public boolean F0;
    public final Formatter G;
    public boolean G0;
    public final g$b H;
    public int H0;
    public final g$c I;
    public int I0;
    public final Vt2 J;
    public int J0;
    public final Drawable K;
    public long[] K0;
    public final Drawable L;
    public boolean[] L0;
    public final Drawable M;
    public long[] M0;
    public final Drawable N;
    public boolean[] N0;
    public final Drawable O;
    public long O0;
    public final String P;
    public boolean P0;
    public final String Q;
    public final String R;
    public final Drawable S;
    public final Drawable T;
    public final float U;
    public final mu2 a;
    public final Resources b;
    public final PlayerControlView$b c;
    public final CopyOnWriteArrayList d;
    public final RecyclerView e;
    public final PlayerControlView$g f;
    public final PlayerControlView$d g;
    public final PlayerControlView$i h;
    public final PlayerControlView$a i;
    public final pn0 j;
    public final PopupWindow k;
    public final float k0;
    public final int l;
    public final ImageView m;
    public final ImageView n;
    public final ImageView o;
    public final View p;
    public final String p0;
    public final View q;
    public final String q0;
    public final TextView r;
    public final Drawable r0;
    public final TextView s;
    public final Drawable s0;
    public final ImageView t;
    public final String t0;
    public final ImageView u;
    public final String u0;
    public final ImageView v;
    public final Drawable v0;
    public final ImageView w;
    public final Drawable w0;
    public final ImageView x;
    public final String x0;
    public final ImageView y;
    public final String y0;
    public final View z;
    public f z0;

    static {
        float[] fArray;
        im1_0.a("media3.ui");
        float[] fArray2 = fArray = new float[7];
        float[] fArray3 = fArray;
        fArray2[0] = 0.25f;
        fArray3[1] = 0.5f;
        fArray2[2] = 0.75f;
        fArray3[3] = 1.0f;
        fArray2[4] = 1.25f;
        fArray3[5] = 1.5f;
        fArray3[6] = 2.0f;
        Q0 = fArray;
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int n3) {
        this(context, attributeSet, n3, attributeSet);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PlayerControlView(Context context, AttributeSet object, int n3, AttributeSet object2) {
        void var25_177;
        void var23_125;
        void var16_85;
        void var15_79;
        void var13_69;
        int n4;
        void var36_235;
        Object object3;
        int n7;
        void var11_59;
        void var15_75;
        PlayerControlView playerControlView;
        boolean bl2;
        void var18_98;
        void var53_260;
        void var17_90;
        PlayerControlView$b playerControlView$b;
        void var51_258;
        void var20_114;
        void var8_17;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        PlayerControlView playerControlView2;
        boolean bl6;
        Drawable[] drawableArray;
        Object object4;
        int n19;
        boolean bl7;
        int n20;
        int n21;
        int n22;
        int n24;
        Object throwable;
        Object object5;
        String[] stringArray;
        block38: {
            int n25;
            int n26;
            int n27;
            int n28;
            int n29;
            int n30;
            int n32;
            int n34;
            int n35;
            int n36;
            block37: {
                void var6_11;
                block36: {
                    boolean bl26;
                    boolean bl24;
                    boolean bl22;
                    boolean bl21;
                    boolean bl19;
                    boolean bl17;
                    int n87;
                    int n86;
                    int n79;
                    int n76;
                    int n67;
                    int n64;
                    int n59;
                    int n57;
                    int n54;
                    int n50;
                    int n47;
                    int n45;
                    int n38;
                    stringArray = this;
                    throwable = object5;
                    super(context, object, n3);
                    n24 = R$layout.exo_player_control_view;
                    n36 = R$drawable.exo_styled_controls_play;
                    n35 = R$drawable.exo_styled_controls_pause;
                    int n39 = R$drawable.exo_styled_controls_next;
                    n34 = R$drawable.exo_styled_controls_simple_fastforward;
                    n22 = R$drawable.exo_styled_controls_previous;
                    n32 = R$drawable.exo_styled_controls_simple_rewind;
                    n21 = R$drawable.exo_styled_controls_fullscreen_exit;
                    n30 = R$drawable.exo_styled_controls_fullscreen_enter;
                    n29 = R$drawable.exo_styled_controls_repeat_off;
                    n28 = R$drawable.exo_styled_controls_repeat_one;
                    n27 = R$drawable.exo_styled_controls_repeat_all;
                    n20 = R$drawable.exo_styled_controls_shuffle_on;
                    n26 = R$drawable.exo_styled_controls_shuffle_off;
                    bl7 = R$drawable.exo_styled_controls_subtitle_on;
                    n19 = R$drawable.exo_styled_controls_subtitle_off;
                    n25 = R$drawable.exo_styled_controls_vr;
                    this.E0 = true;
                    this.H0 = 5000;
                    object4 = null;
                    this.J0 = 0;
                    this.I0 = n38 = 200;
                    if (object5 == null) break block37;
                    object4 = context.getTheme();
                    stringArray = (String[])R$styleable.PlayerControlView;
                    int n41 = n27;
                    int n42 = n20;
                    boolean bl11 = false;
                    drawableArray = null;
                    n20 = n3;
                    stringArray = object4.obtainStyledAttributes((AttributeSet)object5, (int[])stringArray, n3, 0);
                    try {
                        int n43 = R$styleable.PlayerControlView_controller_layout_id;
                        n24 = stringArray.getResourceId(n43, n24);
                        int n44 = R$styleable.PlayerControlView_play_icon;
                        n45 = stringArray.getResourceId(n44, n36);
                        int n46 = R$styleable.PlayerControlView_pause_icon;
                        n47 = stringArray.getResourceId(n46, n35);
                        int n48 = R$styleable.PlayerControlView_next_icon;
                        bl6 = stringArray.getResourceId(n48, n39);
                        int n49 = R$styleable.PlayerControlView_fastforward_icon;
                        n50 = stringArray.getResourceId(n49, n34);
                        int n51 = R$styleable.PlayerControlView_previous_icon;
                        n22 = stringArray.getResourceId(n51, n22);
                        int n52 = R$styleable.PlayerControlView_rewind_icon;
                        n54 = stringArray.getResourceId(n52, n32);
                        int n55 = R$styleable.PlayerControlView_fullscreen_exit_icon;
                        n21 = stringArray.getResourceId(n55, n21);
                        int n56 = R$styleable.PlayerControlView_fullscreen_enter_icon;
                        n57 = stringArray.getResourceId(n56, n30);
                        int n58 = R$styleable.PlayerControlView_repeat_off_icon;
                        n59 = stringArray.getResourceId(n58, n29);
                        int n60 = R$styleable.PlayerControlView_repeat_one_icon;
                        n64 = stringArray.getResourceId(n60, n28);
                        int n65 = R$styleable.PlayerControlView_repeat_all_icon;
                        int n67 = n41;
                        n67 = stringArray.getResourceId(n65, n41);
                        int n68 = R$styleable.PlayerControlView_shuffle_on_icon;
                        n20 = n42;
                        n20 = stringArray.getResourceId(n68, n42);
                        int n69 = R$styleable.PlayerControlView_shuffle_off_icon;
                        int n71 = n26;
                        int n74 = stringArray.getResourceId(n69, n26);
                        int n75 = R$styleable.PlayerControlView_subtitle_on_icon;
                        n76 = n74;
                        boolean bl12 = bl7;
                        int n77 = stringArray.getResourceId(n75, (int)(bl7 ? 1 : 0));
                        int n78 = R$styleable.PlayerControlView_subtitle_off_icon;
                        n79 = n77;
                        int n80 = n19;
                        boolean bl13 = stringArray.getResourceId(n78, n19);
                        int n81 = R$styleable.PlayerControlView_vr_icon;
                        bl7 = bl13;
                        int n85 = n25;
                        n85 = stringArray.getResourceId(n81, n25);
                        n86 = R$styleable.PlayerControlView_show_timeout;
                        n87 = n85;
                        n19 = n47;
                        playerControlView2 = this;
                    }
                    catch (Throwable throwable3) {
                        PlayerControlView playerControlView3 = this;
                        break block36;
                    }
                    try {
                        boolean bl8;
                        boolean bl9;
                        boolean bl10;
                        int n93;
                        int n88;
                        int n37 = this.H0;
                        this.H0 = n88 = stringArray.getInt(n86, n37);
                        int n89 = this.J0;
                        int n92 = R$styleable.PlayerControlView_repeat_toggle_modes;
                        this.J0 = n93 = stringArray.getInt(n92, n89);
                        int n94 = R$styleable.PlayerControlView_show_rewind_button;
                        boolean bl14 = true;
                        boolean bl15 = stringArray.getBoolean(n94, bl14);
                        n42 = (int)(bl15 ? 1 : 0);
                        int n95 = R$styleable.PlayerControlView_show_fastforward_button;
                        boolean bl16 = stringArray.getBoolean(n95, bl14);
                        n41 = (int)(bl16 ? 1 : 0);
                        int n96 = R$styleable.PlayerControlView_show_previous_button;
                        bl17 = bl10 = stringArray.getBoolean(n96, bl14);
                        int n97 = R$styleable.PlayerControlView_show_next_button;
                        boolean bl18 = stringArray.getBoolean(n97, bl14);
                        int n98 = R$styleable.PlayerControlView_show_shuffle_button;
                        bl19 = bl18;
                        boolean bl20 = false;
                        throwable = null;
                        bl21 = bl9 = stringArray.getBoolean(n98, false);
                        int n99 = R$styleable.PlayerControlView_show_subtitle_button;
                        bl22 = bl8 = stringArray.getBoolean(n99, false);
                        int n100 = R$styleable.PlayerControlView_show_vr_button;
                        boolean bl23 = stringArray.getBoolean(n100, false);
                        int n101 = R$styleable.PlayerControlView_time_bar_min_update_interval;
                        bl24 = bl23;
                        int n102 = this.I0;
                        int n103 = stringArray.getInt(n101, n102);
                        this.setTimeBarMinUpdateInterval(n103);
                        int n104 = R$styleable.PlayerControlView_animation_enabled;
                        boolean bl25 = true;
                        bl26 = stringArray.getBoolean(n104, bl25);
                    }
                    catch (Throwable throwable2) {
                        break block36;
                    }
                    stringArray.recycle();
                    boolean bl27 = bl26;
                    n18 = n54;
                    n17 = n21;
                    n16 = n57;
                    n15 = n59;
                    n14 = n64;
                    n10 = n67;
                    n8 = n20;
                    n21 = bl7;
                    int n105 = n87;
                    int n106 = n42;
                    int n107 = n41;
                    boolean bl28 = bl17;
                    boolean bl29 = bl19;
                    bl5 = bl21;
                    bl4 = bl22;
                    bl3 = bl24;
                    boolean bl30 = true;
                    int n108 = n79;
                    n20 = n45;
                    int n109 = n50;
                    int n110 = n47;
                    int n111 = n22;
                    n22 = n76;
                    int n112 = n111;
                    break block38;
                }
                stringArray.recycle();
                throw var6_11;
            }
            int n113 = n26;
            int n114 = n25;
            boolean bl31 = true;
            int n115 = n35;
            playerControlView2 = this;
            int n116 = n35;
            int n117 = n22;
            n18 = n32;
            n17 = n21;
            n16 = n30;
            n15 = n29;
            n14 = n28;
            n10 = n27;
            n8 = n20;
            boolean bl32 = bl7;
            n21 = n19;
            boolean bl33 = true;
            boolean bl34 = true;
            boolean bl35 = true;
            boolean bl36 = true;
            bl5 = false;
            bl4 = false;
            bl3 = false;
            n22 = n113;
            int n118 = n114;
            n20 = n36;
            int n119 = n34;
            int n120 = n35;
            boolean bl37 = true;
        }
        LayoutInflater.from((Context)context).inflate(n24, (ViewGroup)playerControlView2);
        playerControlView2.setDescendantFocusability(262144);
        Object object6 = new PlayerControlView$b(playerControlView2);
        playerControlView2.c = object6;
        super();
        playerControlView2.d = object4;
        super();
        playerControlView2.H = object4;
        super();
        playerControlView2.I = object4;
        super();
        playerControlView2.F = object4;
        void var3_5 = var8_17;
        bl7 = bl6;
        Object object7 = Locale.getDefault();
        Object object8 = new Formatter((Appendable)object4, (Locale)object7);
        playerControlView2.G = object8;
        boolean bl38 = false;
        object4 = null;
        object8 = new long[0];
        playerControlView2.K0 = (long[])object8;
        object8 = new boolean[0];
        playerControlView2.L0 = (boolean[])object8;
        object8 = new long[0];
        playerControlView2.M0 = (long[])object8;
        object8 = new boolean[0];
        playerControlView2.N0 = (boolean[])object8;
        playerControlView2.J = object8 = new Vt2((Object)playerControlView2, 0);
        int n121 = R$id.exo_duration;
        object8 = (TextView)playerControlView2.findViewById(n121);
        playerControlView2.C = object8;
        int n122 = R$id.exo_position;
        object8 = (TextView)playerControlView2.findViewById(n122);
        playerControlView2.D = object8;
        int n123 = R$id.exo_subtitle;
        object8 = (ImageView)playerControlView2.findViewById(n123);
        playerControlView2.w = object8;
        if (object8 != null) {
            object8.setOnClickListener((View.OnClickListener)object6);
        }
        int n124 = R$id.exo_fullscreen;
        object8 = (ImageView)playerControlView2.findViewById(n124);
        playerControlView2.x = object8;
        object7 = new Bc((Object)playerControlView2, 3);
        int n125 = 8;
        if (object8 != null) {
            object8.setVisibility(n125);
            object8.setOnClickListener((View.OnClickListener)object7);
        }
        int n126 = R$id.exo_minimal_fullscreen;
        object8 = (ImageView)playerControlView2.findViewById(n126);
        playerControlView2.y = object8;
        int n127 = 3;
        object7 = new Bc((Object)playerControlView2, n127);
        if (object8 != null) {
            int n128 = 8;
            object8.setVisibility(n128);
            object8.setOnClickListener((View.OnClickListener)object7);
        }
        int n129 = R$id.exo_settings;
        object4 = playerControlView2.findViewById(n129);
        playerControlView2.z = object4;
        if (object4 != null) {
            object4.setOnClickListener((View.OnClickListener)object6);
        }
        int n130 = R$id.exo_playback_speed;
        object4 = playerControlView2.findViewById(n130);
        playerControlView2.A = object4;
        if (object4 != null) {
            object4.setOnClickListener((View.OnClickListener)object6);
        }
        int n131 = R$id.exo_audio_track;
        object4 = playerControlView2.findViewById(n131);
        playerControlView2.B = object4;
        if (object4 != null) {
            object4.setOnClickListener((View.OnClickListener)object6);
        }
        int n132 = R$id.exo_progress;
        object4 = (b)playerControlView2.findViewById(n132);
        int n133 = R$id.exo_progress_placeholder;
        object7 = playerControlView2.findViewById(n133);
        boolean bl39 = false;
        object8 = null;
        if (object4 != null) {
            playerControlView2.E = object4;
            var51_258 = var20_114;
            playerControlView$b = object6;
            var53_260 = var17_90;
            void var23_122 = var18_98;
            bl2 = bl7;
            void var18_99 = var3_5;
            playerControlView = playerControlView2;
            bl7 = var15_75;
            void var15_76 = var11_59;
        } else if (object7 != null) {
            n7 = R$style.ExoStyledControls_TimeBar;
            n19 = 0;
            var51_258 = var20_114;
            object = object4;
            playerControlView$b = object6;
            object6 = context;
            var53_260 = var17_90;
            void var23_123 = var18_98;
            void var18_100 = var3_5;
            boolean bl40 = false;
            boolean bl41 = false;
            playerControlView = playerControlView2;
            playerControlView2 = null;
            object3 = object7;
            bl2 = bl7;
            object7 = object5;
            bl7 = var15_75;
            void var15_77 = var11_59;
            int n134 = n7;
            object4 = new DefaultTimeBar(context, null, 0, (AttributeSet)object5, n7);
            int n135 = R$id.exo_progress;
            object6 = object4;
            object4.setId(n135);
            object4 = object3.getLayoutParams();
            object.setLayoutParams((ViewGroup.LayoutParams)object4);
            object4 = (ViewGroup)object3.getParent();
            object8 = object3;
            int n136 = object4.indexOfChild((View)object3);
            object4.removeView((View)object3);
            object4.addView((View)object, n136);
            playerControlView.E = object;
        } else {
            var51_258 = var20_114;
            playerControlView$b = object6;
            boolean bl42 = false;
            object4 = null;
            var53_260 = var17_90;
            void var23_124 = var18_98;
            bl2 = bl7;
            void var18_101 = var3_5;
            playerControlView = playerControlView2;
            bl7 = var15_75;
            void var15_78 = var11_59;
            playerControlView2.E = null;
        }
        object4 = playerControlView.E;
        object6 = playerControlView$b;
        if (object4 != null) {
            object4.a(playerControlView$b);
        }
        object4 = context.getResources();
        playerControlView.b = object4;
        int n137 = R$id.exo_play_pause;
        object8 = (ImageView)playerControlView.findViewById(n137);
        playerControlView.o = object8;
        if (object8 != null) {
            object8.setOnClickListener((View.OnClickListener)object6);
        }
        int n138 = R$id.exo_prev;
        object8 = (ImageView)playerControlView.findViewById(n138);
        playerControlView.m = object8;
        if (object8 != null) {
            playerControlView2 = context.getTheme();
            void var10_50 = var51_258;
            playerControlView2 = object4.getDrawable((int)var51_258, (Resources.Theme)playerControlView2);
            object8.setImageDrawable((Drawable)playerControlView2);
            object8.setOnClickListener((View.OnClickListener)object6);
        }
        int n139 = R$id.exo_next;
        playerControlView2 = (ImageView)playerControlView.findViewById(n139);
        playerControlView.n = playerControlView2;
        if (playerControlView2 != null) {
            object7 = context.getTheme();
            boolean bl43 = bl2;
            object7 = object4.getDrawable((int)(bl2 ? 1 : 0), (Resources.Theme)object7);
            playerControlView2.setImageDrawable((Drawable)object7);
            playerControlView2.setOnClickListener((View.OnClickListener)object6);
        }
        int n140 = R$font.roboto_medium_numbers;
        Object object9 = context;
        object7 = WK2.c(n140, context);
        int n141 = R$id.exo_rew;
        object9 = (ImageView)playerControlView.findViewById(n141);
        object = playerControlView2;
        int n142 = R$id.exo_rew_with_amount;
        playerControlView2 = (TextView)playerControlView.findViewById(n142);
        if (object9 != null) {
            playerControlView2 = context.getTheme();
            object3 = object8;
            int n143 = n18;
            object8 = object4.getDrawable(n18, (Resources.Theme)playerControlView2);
            object9.setImageDrawable((Drawable)object8);
            playerControlView.q = object9;
            boolean bl44 = false;
            object8 = null;
            playerControlView.s = null;
        } else {
            object3 = object8;
            boolean bl45 = false;
            object8 = null;
            if (playerControlView2 != null) {
                playerControlView2.setTypeface((Typeface)object7);
                playerControlView.s = playerControlView2;
                playerControlView.q = playerControlView2;
            } else {
                playerControlView.s = null;
                playerControlView.q = null;
            }
        }
        object8 = playerControlView.q;
        if (object8 != null) {
            object8.setOnClickListener((View.OnClickListener)object6);
        }
        int n144 = R$id.exo_ffwd;
        object8 = (ImageView)playerControlView.findViewById(n144);
        int n145 = R$id.exo_ffwd_with_amount;
        playerControlView2 = (TextView)playerControlView.findViewById(n145);
        if (object8 != null) {
            void var18_102;
            playerControlView2 = context.getTheme();
            playerControlView2 = object4.getDrawable((int)var18_102, (Resources.Theme)playerControlView2);
            object8.setImageDrawable((Drawable)playerControlView2);
            playerControlView.p = object8;
            boolean bl46 = false;
            object8 = null;
            playerControlView.r = null;
        } else {
            boolean bl47 = false;
            object8 = null;
            if (playerControlView2 != null) {
                playerControlView2.setTypeface((Typeface)object7);
                playerControlView.r = playerControlView2;
                playerControlView.p = playerControlView2;
            } else {
                playerControlView.r = null;
                playerControlView.p = null;
            }
        }
        object8 = playerControlView.p;
        if (object8 != null) {
            object8.setOnClickListener((View.OnClickListener)object6);
        }
        int n146 = R$id.exo_repeat_toggle;
        object8 = (ImageView)playerControlView.findViewById(n146);
        playerControlView.t = object8;
        if (object8 != null) {
            object8.setOnClickListener((View.OnClickListener)object6);
        }
        int n147 = R$id.exo_shuffle;
        playerControlView2 = (ImageView)playerControlView.findViewById(n147);
        playerControlView.u = playerControlView2;
        if (playerControlView2 != null) {
            playerControlView2.setOnClickListener((View.OnClickListener)object6);
        }
        int n148 = R$integer.exo_media_button_opacity_percentage_enabled;
        float f5 = object4.getInteger(n148);
        int n149 = 1120403456;
        float f6 = 100.0f;
        playerControlView.U = f5 /= f6;
        int n150 = R$integer.exo_media_button_opacity_percentage_disabled;
        playerControlView.k0 = f5 = (float)object4.getInteger(n150) / f6;
        int n151 = R$id.exo_vr;
        object7 = (ImageView)playerControlView.findViewById(n151);
        playerControlView.v = object7;
        if (object7 != null) {
            void var29_205;
            object9 = context.getTheme();
            throwable = object4.getDrawable((int)var29_205, (Resources.Theme)object9);
            object7.setImageDrawable((Drawable)throwable);
            boolean bl48 = false;
            throwable = null;
            playerControlView.j((View)object7, false);
        } else {
            boolean bl49 = false;
            throwable = null;
        }
        super(playerControlView);
        playerControlView.a = object9;
        ((mu2)object9).C = var36_235;
        int n152 = R$string.exo_controls_playback_speed;
        stringArray = object4.getString(n152);
        int n153 = R$drawable.exo_styled_controls_speed;
        throwable = context.getTheme();
        throwable = object4.getDrawable(n153, (Resources.Theme)throwable);
        int n154 = R$string.exo_track_selection_title_audio;
        drawableArray = object4.getString(n154);
        stringArray = new String[]{stringArray, drawableArray};
        int n155 = R$drawable.exo_styled_controls_audiotrack;
        object5 = object8;
        object8 = context.getTheme();
        object8 = object4.getDrawable(n155, (Resources.Theme)object8);
        drawableArray = new Drawable[2];
        n7 = 0;
        drawableArray[0] = throwable;
        drawableArray[1] = object8;
        playerControlView.f = object8 = new PlayerControlView$g(playerControlView, stringArray, drawableArray);
        int n156 = R$dimen.exo_settings_offset;
        playerControlView.l = n4 = object4.getDimensionPixelSize(n156);
        stringArray = LayoutInflater.from((Context)context);
        int n157 = R$layout.exo_styled_settings_list;
        throwable = (RecyclerView)stringArray.inflate(n157, null);
        playerControlView.e = throwable;
        ((RecyclerView)throwable).setAdapter((RecyclerView$f)object8);
        object8 = this.getContext();
        super((Context)object8);
        ((RecyclerView)throwable).setLayoutManager((RecyclerView$o)stringArray);
        int n158 = -2;
        boolean bl50 = true;
        super((View)throwable, n158, n158, bl50);
        playerControlView.k = stringArray;
        int n159 = gz3.a;
        int n160 = 23;
        if (n159 < n160) {
            boolean bl51 = false;
            object8 = null;
            throwable = new ColorDrawable(0);
            stringArray.setBackgroundDrawable((Drawable)throwable);
        } else {
            boolean bl52 = false;
            object8 = null;
        }
        stringArray.setOnDismissListener((PopupWindow.OnDismissListener)object6);
        playerControlView.P0 = bl50;
        stringArray = this.getResources();
        playerControlView.j = throwable = new pn0((Resources)stringArray);
        throwable = context.getTheme();
        throwable = object4.getDrawable((int)var13_69, (Resources.Theme)throwable);
        playerControlView.r0 = throwable;
        throwable = context.getTheme();
        throwable = object4.getDrawable(n21, (Resources.Theme)throwable);
        playerControlView.s0 = throwable;
        int n161 = R$string.exo_controls_cc_enabled_description;
        playerControlView.t0 = throwable = object4.getString(n161);
        int n162 = R$string.exo_controls_cc_disabled_description;
        playerControlView.u0 = throwable = object4.getString(n162);
        playerControlView.h = throwable = new PlayerControlView$i(playerControlView);
        playerControlView.i = throwable = new PlayerControlView$a(playerControlView);
        int n163 = R$array.exo_controls_playback_speeds;
        stringArray = object4.getStringArray(n163);
        object6 = Q0;
        playerControlView.g = throwable = new PlayerControlView$d(playerControlView, stringArray, (float[])object6);
        throwable = context.getTheme();
        throwable = object4.getDrawable(n20, (Resources.Theme)throwable);
        playerControlView.K = throwable;
        throwable = context.getTheme();
        throwable = object4.getDrawable((int)var15_79, (Resources.Theme)throwable);
        playerControlView.L = throwable;
        throwable = context.getTheme();
        n21 = n17;
        throwable = object4.getDrawable(n17, (Resources.Theme)throwable);
        playerControlView.v0 = throwable;
        throwable = context.getTheme();
        int n164 = n16;
        throwable = object4.getDrawable(n16, (Resources.Theme)throwable);
        playerControlView.w0 = throwable;
        throwable = context.getTheme();
        int n165 = n15;
        throwable = object4.getDrawable(n15, (Resources.Theme)throwable);
        playerControlView.M = throwable;
        throwable = context.getTheme();
        int n166 = n14;
        throwable = object4.getDrawable(n14, (Resources.Theme)throwable);
        playerControlView.N = throwable;
        throwable = context.getTheme();
        int n167 = n10;
        throwable = object4.getDrawable(n10, (Resources.Theme)throwable);
        playerControlView.O = throwable;
        throwable = context.getTheme();
        n20 = n8;
        throwable = object4.getDrawable(n8, (Resources.Theme)throwable);
        playerControlView.S = throwable;
        throwable = context.getTheme();
        throwable = object4.getDrawable(n22, (Resources.Theme)throwable);
        playerControlView.T = throwable;
        int n168 = R$string.exo_controls_fullscreen_exit_description;
        playerControlView.x0 = throwable = object4.getString(n168);
        int n169 = R$string.exo_controls_fullscreen_enter_description;
        playerControlView.y0 = throwable = object4.getString(n169);
        int n170 = R$string.exo_controls_repeat_off_description;
        playerControlView.P = throwable = object4.getString(n170);
        int n171 = R$string.exo_controls_repeat_one_description;
        playerControlView.Q = throwable = object4.getString(n171);
        int n172 = R$string.exo_controls_repeat_all_description;
        playerControlView.R = throwable = object4.getString(n172);
        int n173 = R$string.exo_controls_shuffle_on_description;
        playerControlView.p0 = throwable = object4.getString(n173);
        int n174 = R$string.exo_controls_shuffle_off_description;
        playerControlView.q0 = throwable = object4.getString(n174);
        int n175 = R$id.exo_bottom_bar;
        throwable = (ViewGroup)playerControlView.findViewById(n175);
        boolean bl53 = true;
        ((mu2)object9).h((View)throwable, bl53);
        throwable = playerControlView.p;
        ((mu2)object9).h((View)throwable, (boolean)var16_85);
        throwable = playerControlView.q;
        boolean bl54 = bl7;
        ((mu2)object9).h((View)throwable, bl7);
        object4 = object3;
        void var29_220 = var53_260;
        ((mu2)object9).h((View)object3, (boolean)var53_260);
        object4 = object;
        void var29_221 = var23_125;
        ((mu2)object9).h((View)object, (boolean)var23_125);
        boolean bl55 = bl5;
        ((mu2)object9).h((View)playerControlView2, bl5);
        throwable = playerControlView.w;
        boolean bl56 = bl4;
        ((mu2)object9).h((View)throwable, bl4);
        boolean bl57 = bl3;
        ((mu2)object9).h((View)object7, bl3);
        int n176 = playerControlView.J0;
        object8 = object5;
        if (n176 != 0) {
            boolean bl58 = true;
        } else {
            boolean bl59 = false;
            object4 = null;
        }
        ((mu2)object9).h((View)object8, (boolean)var25_177);
        throwable = new Wt2(playerControlView);
        playerControlView.addOnLayoutChangeListener((View.OnLayoutChangeListener)throwable);
    }

    public static /* synthetic */ void a(PlayerControlView playerControlView, float f5) {
        playerControlView.setPlaybackSpeed(f5);
    }

    public static boolean b(f object, g$c g$c) {
        int n3;
        int n4;
        int n7 = object.isCommandAvailable(17);
        if (n7 == 0) {
            return false;
        }
        n7 = ((g)(object = object.getCurrentTimeline())).p();
        if (n7 > (n4 = 1) && n7 <= (n3 = 100)) {
            for (n3 = 0; n3 < n7; ++n3) {
                g$c g$c2 = ((g)object).n(n3, g$c, 0L);
                long l2 = g$c2.m;
                long l3 = -9223372036854775807L;
                long l4 = l2 - l3;
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 != false) continue;
                return false;
            }
            return n4 != 0;
        }
        return false;
    }

    private void setPlaybackSpeed(float f5) {
        f f6 = this.z0;
        if (f6 != null) {
            int n3 = 13;
            float f7 = 1.8E-44f;
            boolean bl2 = f6.isCommandAvailable(n3);
            if (bl2) {
                f6 = this.z0;
                ot2_0 ot2_02 = f6.getPlaybackParameters();
                f7 = ot2_02.b;
                ot2_0 ot2_03 = new ot2_0(f5, f7);
                f6.setPlaybackParameters(ot2_03);
            }
        }
    }

    public final boolean c(KeyEvent keyEvent) {
        int n3 = keyEvent.getKeyCode();
        f f5 = this.z0;
        if (f5 != null) {
            int n4 = 88;
            int n7 = 87;
            int n8 = 127;
            int n10 = 126;
            int n14 = 79;
            int n15 = 85;
            int n16 = 89;
            int n17 = 90;
            if (n3 == n17 || n3 == n16 || n3 == n15 || n3 == n14 || n3 == n10 || n3 == n8 || n3 == n7 || n3 == n4) {
                int n18 = keyEvent.getAction();
                if (n18 == 0) {
                    if (n3 == n17) {
                        int n19 = f5.getPlaybackState();
                        if (n19 != (n3 = 4) && (n19 = (int)(f5.isCommandAvailable(12) ? 1 : 0)) != 0) {
                            f5.seekForward();
                        }
                    } else if (n3 == n16 && (n16 = (int)(f5.isCommandAvailable(11) ? 1 : 0)) != 0) {
                        f5.seekBack();
                    } else {
                        int n20 = keyEvent.getRepeatCount();
                        if (!n20) {
                            if (n3 != n14 && n3 != n15) {
                                if (n3 != n7) {
                                    if (n3 != n4) {
                                        if (n3 != n10) {
                                            if (n3 == n8) {
                                                gz3.z(f5);
                                            }
                                        } else {
                                            gz3.A(f5);
                                        }
                                    } else {
                                        n20 = f5.isCommandAvailable(7);
                                        if (n20) {
                                            f5.seekToPrevious();
                                        }
                                    }
                                } else {
                                    n20 = f5.isCommandAvailable(9);
                                    if (n20) {
                                        f5.seekToNext();
                                    }
                                }
                            } else {
                                n20 = (int)(this.E0 ? 1 : 0);
                                if (n20 = gz3.Q(f5, n20 != 0)) {
                                    gz3.A(f5);
                                } else {
                                    gz3.z(f5);
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void d(RecyclerView$f recyclerView$f, View view) {
        this.e.setAdapter(recyclerView$f);
        this.q();
        this.P0 = false;
        recyclerView$f = this.k;
        recyclerView$f.dismiss();
        this.P0 = true;
        int n3 = this.getWidth();
        int n4 = recyclerView$f.getWidth();
        n3 -= n4;
        n4 = this.l;
        int n7 = -recyclerView$f.getHeight() - n4;
        recyclerView$f.showAsDropDown(view, n3 -= n4, n7);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        boolean bl3 = this.c(keyEvent);
        if (!bl3 && !(bl2 = super.dispatchKeyEvent(keyEvent))) {
            bl2 = false;
            keyEvent = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final ImmutableList e(bq3 bq32, int n3) {
        int n4;
        ImmutableList$Builder immutableList$Builder = new ImmutableList$Builder();
        ImmutableList immutableList = bq32.a;
        for (int i3 = 0; i3 < (n4 = immutableList.size()); ++i3) {
            int n7;
            bq3$a bq3$a = (bq3$a)immutableList.get(i3);
            qp3 qp32 = bq3$a.b;
            int n8 = qp32.c;
            if (n8 != n3) continue;
            qp32 = null;
            for (n8 = 0; n8 < (n7 = bq3$a.a); ++n8) {
                n7 = (int)(bq3$a.d(n8) ? 1 : 0);
                if (n7 == 0) continue;
                Object object = bq3$a.b.d[n8];
                int n10 = ((d)object).e & 2;
                if (n10 != 0) continue;
                object = this.j.a((d)object);
                PlayerControlView$j playerControlView$j = new PlayerControlView$j(bq32, i3, n8, (String)object);
                immutableList$Builder.add(playerControlView$j);
            }
        }
        return immutableList$Builder.build();
    }

    public final void f() {
        mu2 mu22 = this.a;
        int n3 = mu22.z;
        int n4 = 3;
        if (n3 != n4 && n3 != (n4 = 2)) {
            mu22.f();
            n3 = (int)(mu22.C ? 1 : 0);
            if (n3 == 0) {
                mu22.i(n4);
            } else {
                n3 = mu22.z;
                n4 = 1;
                if (n3 == n4) {
                    mu22 = mu22.m;
                    mu22.start();
                } else {
                    mu22 = mu22.n;
                    mu22.start();
                }
            }
        }
    }

    public final boolean g() {
        boolean bl2;
        Object object = this.a;
        int n3 = ((mu2)object).z;
        if (n3 == 0 && (bl2 = ((PlayerControlView)((Object)(object = ((mu2)object).a))).h())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public f getPlayer() {
        return this.z0;
    }

    public int getRepeatToggleModes() {
        return this.J0;
    }

    public boolean getShowShuffleButton() {
        mu2 mu22 = this.a;
        ImageView imageView = this.u;
        return mu22.b((View)imageView);
    }

    public boolean getShowSubtitleButton() {
        mu2 mu22 = this.a;
        ImageView imageView = this.w;
        return mu22.b((View)imageView);
    }

    public int getShowTimeoutMs() {
        return this.H0;
    }

    public boolean getShowVrButton() {
        mu2 mu22 = this.a;
        ImageView imageView = this.v;
        return mu22.b((View)imageView);
    }

    public final boolean h() {
        int n3 = this.getVisibility();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final void i() {
        this.m();
        this.l();
        this.p();
        this.r();
        this.t();
        this.n();
        this.s();
    }

    public final void j(View view, boolean bl2) {
        if (view == null) {
            return;
        }
        view.setEnabled(bl2);
        float f5 = bl2 ? this.U : this.k0;
        view.setAlpha(f5);
    }

    public final void k(boolean bl2) {
        Object object;
        boolean bl3 = this.B0;
        if (bl3 == bl2) {
            return;
        }
        this.B0 = bl2;
        String string2 = this.y0;
        Drawable drawable2 = this.w0;
        String string3 = this.x0;
        Drawable drawable3 = this.v0;
        ImageView imageView = this.x;
        if (imageView != null) {
            if (bl2) {
                imageView.setImageDrawable(drawable3);
                imageView.setContentDescription((CharSequence)string3);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription((CharSequence)string2);
            }
        }
        if ((imageView = this.y) != null) {
            if (bl2) {
                imageView.setImageDrawable(drawable3);
                imageView.setContentDescription((CharSequence)string3);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription((CharSequence)string2);
            }
        }
        if ((object = this.A0) != null) {
            object = ((PlayerView$a)object).c;
            PlayerView.access$2100((PlayerView)((Object)object));
        }
    }

    public final void l() {
        int n3 = 1;
        boolean bl2 = this.h();
        if (bl2 && (bl2 = this.C0)) {
            Object object;
            Object object2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            boolean bl6;
            f f5 = this.z0;
            if (f5 != null) {
                g$c g$c;
                bl6 = this.D0;
                bl6 = bl6 && (bl6 = PlayerControlView.b(f5, g$c = this.I)) ? f5.isCommandAvailable(10) : f5.isCommandAvailable(5);
                bl5 = f5.isCommandAvailable(7);
                bl4 = f5.isCommandAvailable(11);
                bl3 = f5.isCommandAvailable(12);
                int n4 = 9;
                bl2 = f5.isCommandAvailable(n4);
            } else {
                bl2 = false;
                f5 = null;
                bl6 = false;
                Object var5_6 = null;
                bl5 = false;
                bl4 = false;
                bl3 = false;
            }
            Resources resources = this.b;
            View view = this.q;
            long l2 = 1000L;
            if (bl4) {
                Object object3;
                object2 = this.z0;
                long l3 = object2 != null ? object2.getSeekBackIncrement() : 5000L;
                int n7 = (int)(l3 /= l2);
                object2 = this.s;
                if (object2 != null) {
                    object3 = String.valueOf(n7);
                    object2.setText((CharSequence)object3);
                }
                if (view != null) {
                    int n8 = R$plurals.exo_controls_rewind_by_amount_description;
                    object3 = n7;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object2 = resources.getQuantityString(n8, n7, objectArray);
                    view.setContentDescription((CharSequence)object2);
                }
            }
            object2 = this.p;
            if (bl3) {
                Object object4 = this.z0;
                long l4 = object4 != null ? object4.getSeekForwardIncrement() : 15000L;
                int n10 = (int)(l4 /= l2);
                TextView textView = this.r;
                if (textView != null) {
                    object4 = String.valueOf(n10);
                    textView.setText((CharSequence)object4);
                }
                if (object2 != null) {
                    int n14 = R$plurals.exo_controls_fastforward_by_amount_description;
                    object4 = n10;
                    object = new Object[n3];
                    object[0] = object4;
                    object = resources.getQuantityString(n14, n10, object);
                    object2.setContentDescription((CharSequence)object);
                }
            }
            object = this.m;
            this.j((View)object, bl5);
            this.j(view, bl4);
            this.j((View)object2, bl3);
            object = this.n;
            this.j((View)object, bl2);
            object = this.E;
            if (object != null) {
                object.setEnabled(bl6);
            }
        }
    }

    public final void m() {
        ImageView imageView;
        boolean bl2 = this.h();
        if (bl2 && (bl2 = this.C0) && (imageView = this.o) != null) {
            int n3;
            Object object = this.z0;
            boolean bl3 = this.E0;
            int n4 = gz3.Q((f)object, bl3);
            Drawable drawable2 = n4 != 0 ? this.K : this.L;
            n4 = n4 != 0 ? R$string.exo_controls_play_description : R$string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable2);
            drawable2 = this.b;
            object = drawable2.getString(n4);
            imageView.setContentDescription((CharSequence)object);
            object = this.z0;
            if (object == null || (n4 = (int)(object.isCommandAvailable((int)((bl3 = true) ? 1 : 0)) ? 1 : 0)) == 0 || (n4 = (int)((object = this.z0).isCommandAvailable(n3 = 17) ? 1 : 0)) != 0 && (n4 = (int)(((g)(object = this.z0.getCurrentTimeline())).q() ? 1 : 0)) != 0) {
                bl3 = false;
                drawable2 = null;
            }
            this.j((View)imageView, bl3);
        }
    }

    public final void n() {
        PlayerControlView$d playerControlView$d;
        Object object = this.z0;
        if (object == null) {
            return;
        }
        object = object.getPlaybackParameters();
        float f5 = ((ot2_0)object).a;
        boolean bl2 = false;
        int n3 = 0x7F7FFFFF;
        float f6 = Float.MAX_VALUE;
        int n4 = 0;
        String[] stringArray = null;
        int n7 = 0;
        while (true) {
            playerControlView$d = this.g;
            float[] fArray = playerControlView$d.b;
            int n8 = fArray.length;
            if (n4 >= n8) break;
            float f7 = fArray[n4];
            float f8 = (f7 = Math.abs(f5 - f7)) - f6;
            Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                n7 = n4;
                f6 = f7;
            }
            ++n4;
        }
        playerControlView$d.c = n7;
        object = playerControlView$d.a[n7];
        PlayerControlView$g playerControlView$g = this.f;
        stringArray = playerControlView$g.b;
        stringArray[0] = object;
        int n10 = 1;
        f5 = Float.MIN_VALUE;
        n4 = (int)(playerControlView$g.g(n10) ? 1 : 0);
        if (n4 != 0 || (n3 = (int)(playerControlView$g.g(0) ? 1 : 0)) != 0) {
            bl2 = true;
        }
        object = this.z;
        this.j((View)object, bl2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void o() {
        block8: {
            var1_1 = this.h();
            if (var1_1 == 0 || (var1_1 = this.C0) == 0) break block8;
            var2_2 = this.z0;
            if (var2_2 == null) ** GOTO lbl-1000
            var3_3 = 2.2E-44f;
            var4_4 /* !! */  = var2_2.isCommandAvailable(16);
            if (var4_4 /* !! */  != 0) {
                var5_5 = this.O0;
                var7_6 = var2_2.getContentPosition() + var5_5;
                var5_5 = this.O0;
                var9_7 = var2_2.getContentBufferedPosition() + var5_5;
            } else lbl-1000:
            // 2 sources

            {
                var9_7 = var7_6 = 0L;
            }
            var11_8 = this.D;
            if (var11_8 != null && !(var12_9 = this.G0)) {
                var13_10 = this.F;
                var14_11 = this.G;
                var13_10 = gz3.u((StringBuilder)var13_10, var14_11, var7_6);
                var11_8.setText((CharSequence)var13_10);
            }
            if ((var11_8 = this.E) != null) {
                var11_8.setPosition(var7_6);
                var11_8.setBufferedPosition(var9_7);
            }
            var13_10 = this.J;
            this.removeCallbacks((Runnable)var13_10);
            var15_12 = 1;
            var16_13 = var2_2 == null ? 1 : var2_2.getPlaybackState();
            var17_14 = 1000L;
            if (var2_2 != null && (var19_15 = var2_2.isPlaying())) {
                var9_7 = var11_8 != null ? var11_8.getPreferredUpdateDelay() : var17_14;
                var7_6 %= var17_14;
                var7_6 = var17_14 - var7_6;
                var7_6 = Math.min(var9_7, var7_6);
                var2_2 = var2_2.getPlaybackParameters();
                var20_16 = var2_2.a;
                var3_3 = 0.0f;
                var11_8 = null;
                cfr_temp_0 = var20_16 - 0.0f;
                var4_4 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var4_4 /* !! */  > 0) {
                    var3_3 = (float)var7_6 / var20_16;
                    var17_14 = (long)var3_3;
                }
                var1_1 = this.I0;
                var21_18 = var1_1;
                var23_19 = 1000L;
                var25_20 = gz3.i(var17_14, var21_18, var23_19);
                this.postDelayed((Runnable)var13_10, var25_20);
            } else {
                var1_1 = 4;
                var20_17 = 5.6E-45f;
                if (var16_13 != var1_1 && var16_13 != var15_12) {
                    this.postDelayed((Runnable)var13_10, var17_14);
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mu2 mu22 = this.a;
        ku2_1 ku2_12 = mu22.x;
        PlayerControlView playerControlView = mu22.a;
        playerControlView.addOnLayoutChangeListener(ku2_12);
        this.C0 = true;
        boolean bl2 = this.g();
        if (bl2) {
            mu22.g();
        }
        this.i();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mu2 mu22 = this.a;
        Object object = mu22.x;
        mu22.a.removeOnLayoutChangeListener((View.OnLayoutChangeListener)object);
        this.C0 = false;
        object = this.J;
        this.removeCallbacks((Runnable)object);
        mu22.f();
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        View view = this.a.b;
        if (view != null) {
            n7 -= n3;
            n3 = 0;
            view.layout(0, 0, n7, n8 -= n4);
        }
    }

    public final void p() {
        ImageView imageView;
        boolean bl2 = this.h();
        if (bl2 && (bl2 = this.C0) && (imageView = this.t) != null) {
            boolean bl3;
            int n3 = this.J0;
            int n4 = 0;
            if (n3 == 0) {
                this.j((View)imageView, false);
                return;
            }
            Object object = this.z0;
            String string2 = this.P;
            Drawable drawable2 = this.M;
            if (object != null && (bl3 = object.isCommandAvailable(15))) {
                n4 = 1;
                this.j((View)imageView, n4 != 0);
                n3 = object.getRepeatMode();
                if (n3 != 0) {
                    if (n3 != n4) {
                        n4 = 2;
                        if (n3 == n4) {
                            object = this.O;
                            imageView.setImageDrawable((Drawable)object);
                            object = this.R;
                            imageView.setContentDescription((CharSequence)object);
                        }
                    } else {
                        object = this.N;
                        imageView.setImageDrawable((Drawable)object);
                        object = this.Q;
                        imageView.setContentDescription((CharSequence)object);
                    }
                } else {
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription((CharSequence)string2);
                }
                return;
            }
            this.j((View)imageView, false);
            imageView.setImageDrawable(drawable2);
            imageView.setContentDescription((CharSequence)string2);
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.e;
        recyclerView.measure(0, 0);
        int n3 = this.getWidth();
        int n4 = this.l;
        int n7 = n4 * 2;
        n3 -= n7;
        n3 = Math.min(recyclerView.getMeasuredWidth(), n3);
        PopupWindow popupWindow = this.k;
        popupWindow.setWidth(n3);
        n3 = this.getHeight();
        n3 -= (n4 *= 2);
        int n8 = recyclerView.getMeasuredHeight();
        n3 = Math.min(n3, n8);
        popupWindow.setHeight(n3);
    }

    public final void r() {
        ImageView imageView;
        boolean bl2 = this.h();
        if (bl2 && (bl2 = this.C0) && (imageView = this.u) != null) {
            f f5 = this.z0;
            Object object = this.a;
            boolean bl3 = ((mu2)object).b((View)imageView);
            boolean bl4 = false;
            if (!bl3) {
                this.j((View)imageView, false);
            } else {
                boolean bl5;
                object = this.q0;
                Drawable drawable2 = this.T;
                if (f5 != null && (bl5 = f5.isCommandAvailable(14))) {
                    this.j((View)imageView, true);
                    bl4 = f5.getShuffleModeEnabled();
                    if (bl4) {
                        drawable2 = this.S;
                    }
                    imageView.setImageDrawable(drawable2);
                    boolean bl6 = f5.getShuffleModeEnabled();
                    if (bl6) {
                        object = this.p0;
                    }
                    imageView.setContentDescription((CharSequence)object);
                } else {
                    this.j((View)imageView, false);
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription((CharSequence)object);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void s() {
        block27: {
            block22: {
                var1_1 = this;
                var2_2 = this.z0;
                if (var2_2 == null) {
                    return;
                }
                var3_3 = this.D0;
                var4_4 = 0;
                var5_5 = null;
                var6_6 /* !! */  = 1;
                var7_7 = this.I;
                if (var3_3 != 0 && (var3_3 = PlayerControlView.b((f)var2_2, (g$c)var7_7)) != 0) {
                    var3_3 = 1;
                } else {
                    var3_3 = 0;
                    var8_8 = null;
                }
                var1_1.F0 = var3_3;
                var9_9 = 0L;
                var11_10 = 0.0;
                var1_1.O0 = var9_9;
                var3_3 = var2_2.isCommandAvailable(17);
                var8_8 = var3_3 != 0 ? var2_2.getCurrentTimeline() : androidx.media3.common.g.a;
                var13_11 = var8_8.q();
                var14_12 = -9223372036854775807L;
                if (var13_11 != 0) break block22;
                var16_13 = var2_2.getCurrentMediaItemIndex();
                var13_11 = var1_1.F0;
                var17_14 = var13_11 != 0 ? 0 : var16_13;
                var13_11 = var13_11 != 0 ? var8_8.p() - var6_6 /* !! */  : var16_13;
                var18_15 = var9_9;
                var20_16 = 0;
                while (var17_14 <= var13_11) {
                    if (var17_14 == var16_13) {
                        var1_1.O0 = var9_9 = gz3.T(var18_15);
                    }
                    var8_8.o(var17_14, (g$c)var7_7);
                    var9_9 = var7_7.m;
                    var21_17 = var9_9 == var14_12 ? 0 : (var9_9 < var14_12 ? -1 : 1);
                    if (var21_17 == false) {
                        var16_13 = var1_1.F0 ^ var6_6 /* !! */ ;
                        ct3.f((boolean)var16_13);
                        break;
                    }
                    for (var22_18 = var7_7.n; var22_18 <= (var23_19 = var7_7.o); ++var22_18) {
                        var24_20 = var1_1.H;
                        var8_8.g(var22_18, var24_20, false);
                        var25_21 = var24_20.g;
                        for (var4_4 = var25_21.e; var4_4 < (var6_6 /* !! */  = var25_21.b); ++var4_4) {
                            block25: {
                                block26: {
                                    block23: {
                                        block24: {
                                            var26_22 = var24_20.d(var4_4);
                                            var28_23 = -9223372036854775808L;
                                            var6_6 /* !! */  = (int)(var26_22 == var28_23 ? 0 : (var26_22 < var28_23 ? -1 : 1));
                                            var30_24 = var16_13;
                                            if (var6_6 /* !! */  != 0) break block23;
                                            var31_25 = var8_8;
                                            var32_26 = var24_20.d;
                                            cfr_temp_0 = var32_26 - var14_12;
                                            var34_27 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                            if (var34_27 /* !! */  != false) break block24;
                                            var35_28 = var8_8;
                                            var3_3 = 1;
                                            var36_29 = 0L;
                                            var38_31 = 0.0;
                                            break block25;
                                        }
                                        var26_22 = var32_26;
                                        break block26;
                                    }
                                    var31_25 = var8_8;
                                }
                                var32_26 = var24_20.e;
                                var36_29 = 0L;
                                var38_31 = 0.0;
                                cfr_temp_1 = (var26_22 += var32_26) - var36_29;
                                var16_13 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var16_13 >= 0) {
                                    var2_2 = var1_1.K0;
                                    var3_3 = ((Object)var2_2).length;
                                    if (var20_16 == var3_3) {
                                        var3_3 = ((Object)var2_2).length;
                                        var3_3 = var3_3 == 0 ? 1 : ((Object)var2_2).length * 2;
                                        var2_2 = Arrays.copyOf((long[])var2_2, var3_3);
                                        var1_1.K0 = (long[])var2_2;
                                        var2_2 = Arrays.copyOf(var1_1.L0, var3_3);
                                        var1_1.L0 = (boolean[])var2_2;
                                    }
                                    var2_2 = var1_1.K0;
                                    var26_22 = gz3.T(var18_15 + var26_22);
                                    var2_2[var20_16] = var26_22;
                                    var2_2 = var1_1.L0;
                                    var8_8 = var24_20.g.a(var4_4);
                                    var40_33 = var8_8.b;
                                    var41_34 = -1;
                                    if (var40_33 == var41_34) {
                                        var35_28 = var31_25;
                                        while (true) {
                                            var3_3 = 1;
                                            while (true) {
                                                var42_35 = 1;
                                                ** GOTO lbl105
                                                break;
                                            }
                                            break;
                                        }
                                    } else {
                                        for (var41_34 = 0; var41_34 < var40_33; ++var41_34) {
                                            var35_28 = var31_25;
                                            if ((var6_6 /* !! */  = (int)(var31_25 = (Object)var8_8.f)[var41_34]) == 0) ** continue;
                                            if (var6_6 /* !! */  == (var3_3 = 1)) ** continue;
                                            var31_25 = var35_28;
                                        }
                                        var35_28 = var31_25;
                                        var3_3 = 1;
                                        var42_35 = 0;
                                    }
lbl105:
                                    // 2 sources

                                    var6_6 /* !! */  = var42_35 ^ 1;
                                    var2_2[var20_16] = var6_6 /* !! */ ;
                                    ++var20_16;
                                } else {
                                    var35_28 = var31_25;
                                    var3_3 = 1;
                                }
                            }
                            var16_13 = var30_24;
                            var8_8 = var35_28;
                            var14_12 = -9223372036854775807L;
                        }
                        var30_24 = var16_13;
                        var35_28 = var8_8;
                        var3_3 = 1;
                        var36_29 = 0L;
                        var38_31 = 0.0;
                        var4_4 = 0;
                        var5_5 = null;
                        var6_6 /* !! */  = 1;
                        var14_12 = -9223372036854775807L;
                    }
                    var30_24 = var16_13;
                    var35_28 = var8_8;
                    var3_3 = 1;
                    var36_29 = 0L;
                    var38_31 = 0.0;
                    var43_36 = var7_7.m;
                    var18_15 += var43_36;
                    ++var17_14;
                    var9_9 = var36_29;
                    var11_10 = var38_31;
                    var4_4 = 0;
                    var5_5 = null;
                    var6_6 /* !! */  = 1;
                    var14_12 = -9223372036854775807L;
                }
                var9_9 = var18_15;
                break block27;
            }
            var36_30 = var9_9;
            var38_32 = var11_10;
            var3_3 = var2_2.isCommandAvailable(16);
            if (var3_3 != 0 && (var45_38 = (cfr_temp_2 = (var32_26 = var2_2.getContentDuration()) - (var43_37 = -9223372036854775807L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) != false) {
                var9_9 = gz3.I(var32_26);
lbl149:
                // 2 sources

                while (true) {
                    var20_16 = 0;
                    break;
                }
            } else {
                var9_9 = var36_30;
                var11_10 = var38_32;
                ** continue;
            }
        }
        var32_26 = gz3.T(var9_9);
        var5_5 = var1_1.C;
        if (var5_5 != null) {
            var31_25 = var1_1.F;
            var7_7 = var1_1.G;
            var31_25 = gz3.u((StringBuilder)var31_25, (Formatter)var7_7, var32_26);
            var5_5.setText((CharSequence)var31_25);
        }
        if ((var5_5 = var1_1.E) != null) {
            var5_5.setDuration(var32_26);
            var2_2 = var1_1.M0;
            var16_13 = ((Object)var2_2).length;
            var3_3 = var20_16 + var16_13;
            var31_25 = var1_1.K0;
            var45_38 = ((Object)var31_25).length;
            if (var3_3 > var45_38) {
                var31_25 = Arrays.copyOf((long[])var31_25, var3_3);
                var1_1.K0 = (long[])var31_25;
                var31_25 = Arrays.copyOf(var1_1.L0, var3_3);
                var1_1.L0 = (boolean[])var31_25;
            }
            var31_25 = var1_1.M0;
            var7_7 = var1_1.K0;
            var22_18 = 0;
            System.arraycopy(var31_25, 0, var7_7, var20_16, var16_13);
            var31_25 = var1_1.N0;
            var7_7 = var1_1.L0;
            System.arraycopy(var31_25, 0, var7_7, var20_16, var16_13);
            var2_2 = var1_1.K0;
            var31_25 = var1_1.L0;
            var5_5.setAdGroupTimesMs((long[])var2_2, (boolean[])var31_25, var3_3);
        }
        this.o();
    }

    public void setAnimationEnabled(boolean bl2) {
        this.a.C = bl2;
    }

    public void setExtraAdGroupMarkers(long[] objectArray, boolean[] blArray) {
        boolean bl2 = false;
        if (objectArray == null) {
            objectArray = new long[]{};
            this.M0 = objectArray;
            objectArray = new boolean[0];
            this.N0 = (boolean[])objectArray;
        } else {
            blArray.getClass();
            int n3 = objectArray.length;
            int n4 = blArray.length;
            if (n3 == n4) {
                bl2 = true;
            }
            ct3.a(bl2);
            this.M0 = objectArray;
            this.N0 = blArray;
        }
        this.s();
    }

    public void setOnFullScreenModeChangedListener(PlayerControlView$c playerControlView$c) {
        this.A0 = playerControlView$c;
        boolean bl2 = true;
        boolean bl3 = playerControlView$c != null;
        int n3 = 8;
        ImageView imageView = this.x;
        if (imageView != null) {
            if (bl3) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(n3);
            }
        }
        if (playerControlView$c == null) {
            bl2 = false;
        }
        playerControlView$c = this.y;
        if (playerControlView$c != null) {
            if (bl2) {
                playerControlView$c.setVisibility(0);
            } else {
                playerControlView$c.setVisibility(n3);
            }
        }
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
        object = this.z0;
        if (object == f5) {
            return;
        }
        object2 = this.c;
        if (object != null) {
            object.removeListener((f$c)object2);
        }
        this.z0 = f5;
        if (f5 != null) {
            f5.addListener((f$c)object2);
        }
        this.i();
    }

    public void setProgressUpdateListener(PlayerControlView$e playerControlView$e) {
    }

    public void setRepeatToggleModes(int n3) {
        int n4;
        int n7;
        this.J0 = n3;
        f f5 = this.z0;
        boolean bl2 = false;
        int n8 = 1;
        if (f5 != null && (n7 = f5.isCommandAvailable(n4 = 15)) != 0) {
            f5 = this.z0;
            n7 = f5.getRepeatMode();
            if (n3 == 0 && n7 != 0) {
                f5 = this.z0;
                f5.setRepeatMode(0);
            } else {
                n4 = 2;
                if (n3 == n8 && n7 == n4) {
                    f5 = this.z0;
                    f5.setRepeatMode(n8);
                } else if (n3 == n4 && n7 == n8) {
                    f5 = this.z0;
                    f5.setRepeatMode(n4);
                }
            }
        }
        if (n3 != 0) {
            bl2 = true;
        }
        mu2 mu22 = this.a;
        f5 = this.t;
        mu22.h((View)f5, bl2);
        this.p();
    }

    public void setShowFastForwardButton(boolean bl2) {
        mu2 mu22 = this.a;
        View view = this.p;
        mu22.h(view, bl2);
        this.l();
    }

    public void setShowMultiWindowTimeBar(boolean bl2) {
        this.D0 = bl2;
        this.s();
    }

    public void setShowNextButton(boolean bl2) {
        mu2 mu22 = this.a;
        ImageView imageView = this.n;
        mu22.h((View)imageView, bl2);
        this.l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean bl2) {
        this.E0 = bl2;
        this.m();
    }

    public void setShowPreviousButton(boolean bl2) {
        mu2 mu22 = this.a;
        ImageView imageView = this.m;
        mu22.h((View)imageView, bl2);
        this.l();
    }

    public void setShowRewindButton(boolean bl2) {
        mu2 mu22 = this.a;
        View view = this.q;
        mu22.h(view, bl2);
        this.l();
    }

    public void setShowShuffleButton(boolean bl2) {
        mu2 mu22 = this.a;
        ImageView imageView = this.u;
        mu22.h((View)imageView, bl2);
        this.r();
    }

    public void setShowSubtitleButton(boolean bl2) {
        mu2 mu22 = this.a;
        ImageView imageView = this.w;
        mu22.h((View)imageView, bl2);
    }

    public void setShowTimeoutMs(int n3) {
        this.H0 = n3;
        n3 = (int)(this.g() ? 1 : 0);
        if (n3 != 0) {
            mu2 mu22 = this.a;
            mu22.g();
        }
    }

    public void setShowVrButton(boolean bl2) {
        mu2 mu22 = this.a;
        ImageView imageView = this.v;
        mu22.h((View)imageView, bl2);
    }

    public void setTimeBarMinUpdateInterval(int n3) {
        this.I0 = n3 = gz3.h(n3, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.v;
        if (imageView != null) {
            boolean bl2;
            imageView.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                bl2 = true;
            } else {
                bl2 = false;
                onClickListener = null;
            }
            this.j((View)imageView, bl2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void t() {
        boolean bl2;
        int n4;
        boolean bl3;
        RecyclerView$f recyclerView$f = this.h;
        recyclerView$f.getClass();
        String[] stringArray = Collections.emptyList();
        ((PlayerControlView$k)recyclerView$f).a = stringArray;
        stringArray = this.i;
        stringArray.getClass();
        Object object = Collections.emptyList();
        stringArray.a = object;
        object = this.z0;
        boolean bl4 = false;
        int n7 = 1;
        ImageView imageView = this.w;
        if (object != null && (bl3 = object.isCommandAvailable(n4 = 30)) && (bl3 = (object = this.z0).isCommandAvailable(n4 = 29))) {
            object = this.z0.getCurrentTracks();
            Object object2 = this.e((bq3)object, n7);
            stringArray.a = object2;
            Object object3 = stringArray.c;
            Object object4 = object3.z0;
            object4.getClass();
            object4 = object4.getTrackSelectionParameters();
            int n8 = object2.isEmpty();
            PlayerControlView$g playerControlView$g = object3.f;
            if (n8 != 0) {
                stringArray = object3.getResources();
                n4 = R$string.exo_track_selection_none;
                stringArray = stringArray.getString(n4);
                object2 = playerControlView$g.b;
                object2[n7] = stringArray;
            } else {
                boolean n3 = stringArray.j((Fp3)object4);
                if (!n3) {
                    stringArray = object3.getResources();
                    n4 = R$string.exo_track_selection_auto;
                    stringArray = stringArray.getString(n4);
                    object2 = playerControlView$g.b;
                    object2[n7] = stringArray;
                } else {
                    int n10;
                    void var14_16;
                    boolean bl5 = false;
                    stringArray = null;
                    while (var14_16 < (n10 = object2.size())) {
                        object3 = (PlayerControlView$j)object2.get((int)var14_16);
                        object4 = ((PlayerControlView$j)object3).a.e;
                        n8 = ((PlayerControlView$j)object3).b;
                        Object object5 = object4[n8];
                        if (object5 != false) {
                            stringArray = playerControlView$g.b;
                            stringArray[n7] = object2 = ((PlayerControlView$j)object3).c;
                            break;
                        }
                        ++var14_16;
                    }
                }
            }
            stringArray = this.a;
            boolean bl6 = stringArray.b((View)imageView);
            if (bl6) {
                int n14 = 3;
                stringArray = this.e((bq3)object, n14);
                ((PlayerControlView$i)recyclerView$f).j((List)stringArray);
            } else {
                stringArray = ImmutableList.of();
                ((PlayerControlView$i)recyclerView$f).j((List)stringArray);
            }
        }
        if ((bl2 = ((PlayerControlView$k)recyclerView$f).getItemCount()) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView$f = null;
        }
        this.j((View)imageView, bl2);
        recyclerView$f = this.f;
        boolean bl7 = ((PlayerControlView$g)recyclerView$f).g(n7);
        if (bl7 || (bl2 = ((PlayerControlView$g)recyclerView$f).g(0))) {
            bl4 = true;
        }
        recyclerView$f = this.z;
        this.j((View)recyclerView$f, bl4);
    }
}

