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
 * Renamed from MJ3
 */
public final class mj3_2
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

    public /* synthetic */ mj3_2(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, tj3_2 tj3_22) {
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
        Intrinsics.checkNotNullParameter(object, "$ajioVideoPlayer");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$imgZoomOut");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$imgVolume");
        Ref$ObjectRef ref$ObjectRef = this.d;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$imgPlayPause");
        Ref$ObjectRef ref$ObjectRef2 = this.e;
        Intrinsics.checkNotNullParameter(ref$ObjectRef2, "$seekbar");
        Ref$ObjectRef ref$ObjectRef3 = this.f;
        Intrinsics.checkNotNullParameter(ref$ObjectRef3, "$imgPlay");
        Ref$ObjectRef ref$ObjectRef4 = this.g;
        Intrinsics.checkNotNullParameter(ref$ObjectRef4, "$imgThumbnail");
        Ref$ObjectRef ref$ObjectRef5 = this.h;
        Intrinsics.checkNotNullParameter(ref$ObjectRef5, "$progress");
        Ref$BooleanRef ref$BooleanRef = this.i;
        Intrinsics.checkNotNullParameter(ref$BooleanRef, "$isFromReplayButton");
        Ref$BooleanRef ref$BooleanRef2 = this.j;
        Intrinsics.checkNotNullParameter(ref$BooleanRef2, "$isMuted");
        tj3_2 tj3_22 = this.k;
        Intrinsics.checkNotNullParameter(tj3_22, "this$0");
        Object object4 = (ob_2)((Ref$ObjectRef)object).element;
        boolean bl3 = true;
        if (object4 != null && (object4 = ((ob_2)object4).i) != null && (bl2 = ((b)object4).isPlaying()) == bl3) {
            object = (ob_2)((Ref$ObjectRef)object).element;
            if (object != null && (object = ((ob_2)object).i) != null) {
                ((e)object).setPlayWhenReady(false);
            }
            if ((object = (ImageView)((Ref$ObjectRef)object2).element) != null) {
                ai0_2.i((View)object);
            }
            if ((object = (ImageView)((Ref$ObjectRef)object3).element) != null) {
                ai0_2.i((View)object);
            }
            if ((object = (ImageView)ref$ObjectRef.element) != null) {
                ai0_2.i((View)object);
            }
            if ((object = (SeekBar)ref$ObjectRef2.element) != null) {
                ai0_2.i((View)object);
            }
            if ((object = (ImageView)ref$ObjectRef3.element) != null) {
                ai0_2.B((View)object);
            }
            if ((object = (ImageView)ref$ObjectRef3.element) != null) {
                ai0_2.a((View)object);
            }
            if ((object = (ImageView)ref$ObjectRef.element) != null) {
                int n3 = R$drawable.ic_play;
                object.setImageResource(n3);
            }
        } else {
            boolean bl4;
            object4 = (ImageView)((Ref$ObjectRef)object3).element;
            if (object4 != null) {
                ai0_2.B((View)object4);
            }
            if ((object3 = (ImageView)((Ref$ObjectRef)object3).element) != null) {
                ai0_2.a((View)object3);
            }
            if ((object3 = (ImageView)ref$ObjectRef.element) != null) {
                ai0_2.B((View)object3);
            }
            if ((object3 = (SeekBar)ref$ObjectRef2.element) != null) {
                ai0_2.B((View)object3);
            }
            if ((object2 = (ImageView)((Ref$ObjectRef)object2).element) != null) {
                ai0_2.B((View)object2);
            }
            if ((object2 = (ImageView)ref$ObjectRef3.element) != null) {
                ai0_2.i((View)object2);
            }
            if ((object2 = (ImageView)ref$ObjectRef4.element) != null) {
                ai0_2.i((View)object2);
            }
            if ((object2 = (ImageView)ref$ObjectRef.element) != null) {
                int n4 = R$drawable.ic_pause;
                object2.setImageResource(n4);
            }
            if ((object2 = (ProgressBar)ref$ObjectRef5.element) != null) {
                ai0_2.i((View)object2);
            }
            if ((object2 = (ob_2)((Ref$ObjectRef)object).element) != null) {
                object3 = tj3_22.f;
                object3.T9((ob_2)object2);
            }
            if (bl4 = ref$BooleanRef.element) {
                ref$BooleanRef.element = false;
                object2 = (ob_2)((Ref$ObjectRef)object).element;
                if (object2 != null) {
                    long l2 = 0L;
                    ((ob_2)object2).m(l2);
                }
                if ((object2 = (ob_2)((Ref$ObjectRef)object).element) != null) {
                    ((ob_2)object2).k();
                }
                bl4 = ref$BooleanRef2.element;
                object = (ob_2)((Ref$ObjectRef)object).element;
                if (bl4) {
                    if (object != null) {
                        ((ob_2)object).i();
                    }
                } else if (object != null) {
                    ((ob_2)object).n();
                }
            } else {
                object2 = (ob_2)((Ref$ObjectRef)object).element;
                if ((object2 == null || (object2 = ((ob_2)object2).i) == null || (bl4 = ((b)object2).isPlaying()) != bl3) && (object = (ob_2)((Ref$ObjectRef)object).element) != null && (object = ((ob_2)object).i) != null) {
                    ((e)object).setPlayWhenReady(bl3);
                }
            }
            object = tj3_22.f;
            object.k0();
        }
    }
}

