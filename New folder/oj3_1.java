/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.media3.common.b;
import androidx.media3.exoplayer.e;
import com.ril.ajio.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from OJ3
 */
public final class oj3_1
implements View.OnClickListener {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ Ref$ObjectRef h;
    public final /* synthetic */ Ref$BooleanRef i;
    public final /* synthetic */ Ref$BooleanRef j;
    public final /* synthetic */ tj3_2 k;

    public /* synthetic */ oj3_1(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, tj3_2 tj3_22) {
        this.a = ref$ObjectRef;
        this.b = ref$ObjectRef2;
        this.c = ref$ObjectRef3;
        this.d = ref$ObjectRef4;
        this.e = ref$ObjectRef5;
        this.f = ref$ObjectRef6;
        this.g = ref$ObjectRef7;
        this.h = ref$ObjectRef8;
        this.i = ref$BooleanRef;
        this.j = ref$BooleanRef2;
        this.k = tj3_22;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$imgVolume");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$imgPlayPause");
        Ref$ObjectRef ref$ObjectRef = this.c;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$seekbar");
        Ref$ObjectRef ref$ObjectRef2 = this.d;
        Intrinsics.checkNotNullParameter(ref$ObjectRef2, "$imgZoomOut");
        Ref$ObjectRef ref$ObjectRef3 = this.e;
        Intrinsics.checkNotNullParameter(ref$ObjectRef3, "$imgPlay");
        Ref$ObjectRef ref$ObjectRef4 = this.f;
        Intrinsics.checkNotNullParameter(ref$ObjectRef4, "$imgThumbnail");
        Ref$ObjectRef ref$ObjectRef5 = this.g;
        Intrinsics.checkNotNullParameter(ref$ObjectRef5, "$progress");
        Ref$ObjectRef ref$ObjectRef6 = this.h;
        Intrinsics.checkNotNullParameter(ref$ObjectRef6, "$ajioVideoPlayer");
        Ref$BooleanRef ref$BooleanRef = this.i;
        Intrinsics.checkNotNullParameter(ref$BooleanRef, "$isFromReplayButton");
        Ref$BooleanRef ref$BooleanRef2 = this.j;
        Intrinsics.checkNotNullParameter(ref$BooleanRef2, "$isMuted");
        tj3_2 tj3_22 = this.k;
        Intrinsics.checkNotNullParameter(tj3_22, "this$0");
        ImageView imageView = (ImageView)((Ref$ObjectRef)object).element;
        if (imageView != null) {
            ai0_2.B((View)imageView);
        }
        if ((object = (ImageView)((Ref$ObjectRef)object).element) != null) {
            ai0_2.a((View)object);
        }
        if ((object = (ImageView)((Ref$ObjectRef)object2).element) != null) {
            ai0_2.B((View)object);
        }
        if ((object = (SeekBar)ref$ObjectRef.element) != null) {
            ai0_2.B((View)object);
        }
        if ((object = (ImageView)ref$ObjectRef2.element) != null) {
            ai0_2.B((View)object);
        }
        if ((object = (ImageView)ref$ObjectRef3.element) != null) {
            ai0_2.i((View)object);
        }
        if ((object = (ImageView)ref$ObjectRef4.element) != null) {
            ai0_2.i((View)object);
        }
        if ((object = (ImageView)((Ref$ObjectRef)object2).element) != null) {
            int bl3 = R$drawable.ic_pause;
            object.setImageResource(bl3);
        }
        if ((object = (ProgressBar)ref$ObjectRef5.element) != null) {
            ai0_2.i((View)object);
        }
        if ((object = (ob_2)ref$ObjectRef6.element) != null) {
            object2 = tj3_22.f;
            object2.T9((ob_2)object);
        }
        if (bl2 = ref$BooleanRef.element) {
            bl2 = false;
            ref$BooleanRef.element = false;
            object = (ob_2)ref$ObjectRef6.element;
            if (object != null) {
                long l2 = 0L;
                ((ob_2)object).m(l2);
            }
            if ((object = (ob_2)ref$ObjectRef6.element) != null) {
                ((ob_2)object).k();
            }
            if (bl2 = ref$BooleanRef2.element) {
                object = (ob_2)ref$ObjectRef6.element;
                if (object != null) {
                    ((ob_2)object).i();
                }
            } else {
                object = (ob_2)ref$ObjectRef6.element;
                if (object != null) {
                    ((ob_2)object).n();
                }
            }
        } else {
            object = (ob_2)ref$ObjectRef6.element;
            boolean bl3 = true;
            if ((object == null || (object = ((ob_2)object).i) == null || (bl2 = ((b)object).isPlaying()) != bl3) && (object = (ob_2)ref$ObjectRef6.element) != null && (object = ((ob_2)object).i) != null) {
                ((e)object).setPlayWhenReady(bl3);
            }
        }
        tj3_22.f.k0();
    }
}

