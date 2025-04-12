/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import com.ril.ajio.R$drawable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from SJ3
 */
public final class sj3_1
implements pb_2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$BooleanRef d;
    public final /* synthetic */ tj3_2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ Ref$ObjectRef h;
    public final /* synthetic */ Ref$ObjectRef i;
    public final /* synthetic */ Ref$ObjectRef j;
    public final /* synthetic */ Ref$ObjectRef k;

    public sj3_1(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$BooleanRef ref$BooleanRef, tj3_2 tj3_22, int n3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8) {
        this.a = ref$ObjectRef;
        this.b = ref$ObjectRef2;
        this.c = ref$ObjectRef3;
        this.d = ref$BooleanRef;
        this.e = tj3_22;
        this.f = n3;
        this.g = ref$ObjectRef4;
        this.h = ref$ObjectRef5;
        this.i = ref$ObjectRef6;
        this.j = ref$ObjectRef7;
        this.k = ref$ObjectRef8;
    }

    public final void Ca(boolean bl2) {
        Object object = (ProgressBar)this.c.element;
        int n3 = 8;
        if (object != null) {
            object.setVisibility(n3);
        }
        if ((object = (ImageView)this.a.element) != null) {
            object.setVisibility(n3);
        }
        object = this.d;
        bl2 = object.element;
        Ref$ObjectRef ref$ObjectRef = this.b;
        if (bl2) {
            object = (ImageView)ref$ObjectRef.element;
            n3 = 0;
            object.setVisibility(0);
        } else {
            object = (ImageView)ref$ObjectRef.element;
            object.setVisibility(n3);
        }
    }

    public final void F5() {
        int n3;
        int n4;
        Object object = this.d;
        boolean bl2 = ((Ref$BooleanRef)object).element;
        Object object2 = this.a;
        Object object3 = this.b;
        if (bl2) {
            object = (ImageView)((Ref$ObjectRef)object3).element;
            if (object != null) {
                ai0_2.i((View)object);
            }
            if ((object = (ImageView)((Ref$ObjectRef)object2).element) != null) {
                ai0_2.i((View)object);
            }
        } else {
            object = (ImageView)((Ref$ObjectRef)object3).element;
            if (object != null) {
                ai0_2.B((View)object);
            }
            if ((object = (ImageView)((Ref$ObjectRef)object2).element) != null) {
                ai0_2.B((View)object);
            }
        }
        object = this.c;
        Object object4 = (ProgressBar)((Ref$ObjectRef)object).element;
        if (object4 != null) {
            ai0_2.i((View)object4);
        }
        object4 = this.e;
        Serializable serializable = object4.h;
        if (serializable != null && (n4 = ((Integer)serializable).intValue()) == (n3 = this.f) && (serializable = object4.g) != null) {
            serializable = this.g;
            ImageView imageView = (ImageView)((Ref$ObjectRef)serializable).element;
            if (imageView != null) {
                ai0_2.B((View)imageView);
            }
            if ((serializable = (ImageView)((Ref$ObjectRef)serializable).element) != null) {
                ai0_2.a((View)serializable);
            }
            serializable = this.h;
            imageView = (ImageView)((Ref$ObjectRef)serializable).element;
            if (imageView != null) {
                ai0_2.B((View)imageView);
            }
            if ((imageView = (SeekBar)this.i.element) != null) {
                ai0_2.B((View)imageView);
            }
            if ((imageView = (ImageView)this.j.element) != null) {
                ai0_2.B((View)imageView);
            }
            if ((object3 = (ImageView)((Ref$ObjectRef)object3).element) != null) {
                ai0_2.i((View)object3);
            }
            if ((object2 = (ImageView)((Ref$ObjectRef)object2).element) != null) {
                ai0_2.i((View)object2);
            }
            if ((object2 = (ImageView)((Ref$ObjectRef)serializable).element) != null) {
                int n7 = R$drawable.ic_pause;
                object2.setImageResource(n7);
            }
            if ((object = (ProgressBar)((Ref$ObjectRef)object).element) != null) {
                ai0_2.i((View)object);
            }
            object = this.k;
            object2 = (ob_2)((Ref$ObjectRef)object).element;
            object3 = object4.f;
            if (object2 != null) {
                object3.T9((ob_2)object2);
            }
            if ((object2 = (ob_2)((Ref$ObjectRef)object).element) != null) {
                serializable = object4.g;
                Intrinsics.checkNotNull(serializable);
                long l2 = (Long)serializable;
                ((ob_2)object2).m(l2);
            }
            if ((object2 = (ob_2)((Ref$ObjectRef)object).element) != null) {
                ((ob_2)object2).k();
            }
            if ((object = (ob_2)((Ref$ObjectRef)object).element) != null) {
                ((ob_2)object).i();
            }
            object3.k0();
            bl2 = false;
            object = null;
            object4.g = null;
        }
    }

    public final void M0() {
        ImageView imageView = (ImageView)this.a.element;
        if (imageView != null) {
            ai0_2.B((View)imageView);
        }
        if ((imageView = (ImageView)this.b.element) != null) {
            ai0_2.B((View)imageView);
        }
        if ((imageView = (ProgressBar)this.c.element) != null) {
            int n3 = 8;
            imageView.setVisibility(n3);
        }
        this.d.element = true;
    }

    public final void X4() {
        q42_0 q42_02 = new q42_0("An operation is not implemented: Not yet implemented");
        throw q42_02;
    }

    public final void Z1() {
        ImageView imageView = (ImageView)this.b.element;
        if (imageView != null) {
            ai0_2.i((View)imageView);
        }
        if ((imageView = (ProgressBar)this.c.element) != null) {
            ai0_2.B((View)imageView);
        }
    }

    public final void ha() {
        ImageView imageView = (ImageView)this.b.element;
        if (imageView != null) {
            ai0_2.B((View)imageView);
        }
        if ((imageView = (ImageView)this.a.element) != null) {
            ai0_2.B((View)imageView);
        }
        this.d.element = true;
    }

    public final void u4() {
        q42_0 q42_02 = new q42_0("An operation is not implemented: Not yet implemented");
        throw q42_02;
    }
}

