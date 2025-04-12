/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xj2
 */
public final class xj2_0
extends RecyclerView$B
implements pb_2 {
    public final mu1_1 a;
    public final ma_2 b;
    public sb3_2 c;
    public final ImageView d;
    public final ImageView e;
    public final PlayerView f;
    public final ConstraintLayout g;
    public final ImageView h;
    public final ImageView i;
    public boolean j;
    public boolean k;
    public String l;
    public boolean m;
    public final yr0_1 n;
    public long o;
    public boolean p;
    public final Handler q;
    public final qw1_0 r;
    public String s;

    public xj2_0(View object, mu1_1 object2, ma_2 object3) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object2;
        this.b = object3;
        object = "";
        this.l = object;
        Object object4 = Looper.getMainLooper();
        super(object4);
        this.q = object3;
        this.r = object3 = new qw1_0(this, 1);
        this.n = object3 = eb_2.b();
        object3 = this.itemView;
        int n3 = R$id.playerView;
        object3 = (PlayerView)object3.findViewById(n3);
        this.f = object3;
        object3 = this.itemView;
        n3 = R$id.imgThumbnail;
        object3 = (ImageView)object3.findViewById(n3);
        this.h = object3;
        object3 = this.itemView;
        n3 = R$id.imgReplay;
        object3 = (ImageView)object3.findViewById(n3);
        this.e = object3;
        object3 = this.itemView;
        n3 = R$id.video_constraint_view;
        object3 = (ConstraintLayout)object3.findViewById(n3);
        this.g = object3;
        object3 = this.itemView;
        n3 = R$id.iv_discover_brand;
        object3 = (ImageView)object3.findViewById(n3);
        this.i = object3;
        object3 = this.itemView;
        n3 = R$id.imgMuteUnmute;
        object3 = (ImageView)object3.findViewById(n3);
        this.d = object3;
        object3 = this.e;
        n3 = 0;
        object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            object3 = null;
        }
        Vj2 vj2 = new Vj2(this);
        object3.setOnClickListener((View.OnClickListener)vj2);
        object3 = this.d;
        if (object3 == null) {
            object3 = "imgVolume";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            object4 = object3;
        }
        int n4 = 1;
        object3 = new sw1_0(this, n4);
        object4.setOnClickListener((View.OnClickListener)object3);
        if (object2 != null && (object2 = object2.getLifecycle()) != null) {
            object3 = new wj2_0(this);
            ((i)object2).a((lu1)object3);
        }
        this.s = object;
    }

    public final void Ca(boolean bl2) {
        this.m = bl2;
        if (bl2) {
            ImageView imageView = this.h;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                bl2 = false;
                imageView = null;
            }
            ai0_2.i((View)imageView);
            imageView = this.itemView;
            bl2 = imageView.isAttachedToWindow();
            if (!bl2) {
                this.x();
            }
        }
    }

    public final void F5() {
        Object object = this.d;
        int n3 = 0;
        ImageView imageView = null;
        String string2 = "imgVolume";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ai0_2.a((View)object);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            imageView = object;
        }
        ai0_2.B((View)imageView);
        object = this.b;
        if (object != null && (object = ((ow_0)object).a(n3 = this.getLayoutPosition())) != null) {
            object.play();
        }
    }

    public final void M0() {
    }

    public final void X4() {
    }

    public final void Z1() {
    }

    public final void ha() {
        int n3;
        boolean bl2;
        this.p = false;
        this.k = bl2 = true;
        Object object = this.b;
        if (object != null && (object = ((ow_0)object).a(n3 = this.getLayoutPosition())) != null) {
            long l2 = 0L;
            object.seekTo(l2);
        }
    }

    public final void u4() {
    }

    public final void w(boolean bl2) {
        boolean bl3;
        Object object;
        int n3 = 0;
        Object object2 = null;
        boolean bl4 = true;
        if (bl2) {
            boolean bl5 = this.k;
            if (bl5) {
                boolean bl6;
                this.j = bl6 = this.j ^ bl4;
            } else {
                boolean bl7;
                object = this.c;
                if (object != null && (bl7 = ((sb3_2)object).d) == bl4) {
                    n3 = 1;
                }
                this.j = n3;
            }
        } else {
            boolean bl8;
            object = this.c;
            if (object != null && (bl8 = ((sb3_2)object).d) == bl4) {
                n3 = 1;
            }
            this.j = n3;
        }
        boolean bl9 = this.j;
        object2 = this.b;
        String string2 = "imgVolume";
        sb3_2 sb3_22 = null;
        if (bl9) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl10 = false;
                object = null;
            }
            int n4 = R$string.video_unmute;
            String string3 = hv3_0.K(n4);
            object.setContentDescription((CharSequence)string3);
            if (object2 != null) {
                int n7 = ((ma_2)object2).r;
                object = ((ow_0)object2).a(n7);
                ((ma_2)object2).k((ExoPlayer)object);
            }
            if ((object = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                sb3_22 = object;
            }
            object = this.itemView.getContext();
            n3 = R$drawable.ic_pdp_video_mute;
            object = xn.a((Context)object, n3);
            sb3_22.setImageDrawable((Drawable)object);
        } else {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl11 = false;
                object = null;
            }
            int n8 = R$string.video_mute;
            String string4 = hv3_0.K(n8);
            object.setContentDescription((CharSequence)string4);
            if (object2 != null) {
                int n10 = ((ma_2)object2).r;
                object = ((ow_0)object2).a(n10);
                ma_2.p((ma_2)object2, (ExoPlayer)object);
            }
            if ((object = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                sb3_22 = object;
            }
            object = this.itemView.getContext();
            n3 = R$drawable.ic_pdp_video_unmute;
            object = xn.a((Context)object, n3);
            sb3_22.setImageDrawable((Drawable)object);
        }
        this.j = bl3 = this.j ^ bl4;
        object2 = this.c;
        if (object2 != null) {
            ((sb3_2)object2).d = bl3;
        }
    }

    public final void x() {
        int n3;
        int n4;
        Object object;
        Object object2 = this.b;
        if ((object2 != null && (object = ((ow_0)object2).a(n4 = this.getLayoutPosition())) != null && (n4 = (int)(object.isPlaying() ? 1 : 0)) == (n3 = 1) || (n4 = (int)((object = this.itemView).isAttachedToWindow() ? 1 : 0)) == 0) && object2 != null && (object2 = ((ow_0)object2).a(n4 = this.getLayoutPosition())) != null) {
            object2.pause();
        }
    }

    public final void y() {
        int n3;
        ExoPlayer exoPlayer;
        boolean bl2 = this.m;
        if (bl2) {
            return;
        }
        Object object = this.b;
        if (object != null && (exoPlayer = ((ow_0)object).a(n3 = this.getLayoutPosition())) != null && (n3 = (int)(exoPlayer.isPlaying() ? 1 : 0)) == 0) {
            exoPlayer = this.h;
            if (exoPlayer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                n3 = 0;
                exoPlayer = null;
            }
            ai0_2.i((View)exoPlayer);
            n3 = this.getLayoutPosition();
            object = ((ow_0)object).a(n3);
            if (object != null) {
                object.play();
            }
        }
    }
}

