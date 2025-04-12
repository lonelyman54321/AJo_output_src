/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 */
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.e;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qd3
 */
public final class qd3_1
extends f92_0 {
    public final /* synthetic */ ld3_1 e;

    public qd3_1(ld3_1 ld3_12, FragmentActivity fragmentActivity) {
        this.e = ld3_12;
        Intrinsics.checkNotNull(fragmentActivity);
        super(fragmentActivity);
    }

    public final void a(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        ld3_1 ld3_12 = this.e;
        Object object2 = ld3_12.D;
        int n3 = Intrinsics.areEqual(object, object2);
        if (n3 != 0) {
            int n4 = ld3_12.o;
            object2 = ld3_12.Ra();
            if (object2 != null) {
                n3 = object2.size();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (n4 == (n3 += -1)) {
                object = ld3_12.n;
                if (object != null) {
                    object.R();
                }
            } else {
                object = ld3_12.z;
                if (object != null) {
                    object.f();
                }
            }
        } else {
            object2 = ld3_12.C;
            int n7 = Intrinsics.areEqual(object, object2);
            if (n7 != 0) {
                n7 = ld3_12.o;
                if (n7 == 0) {
                    object = ld3_12.n;
                    if (object != null) {
                        object.o();
                    }
                } else {
                    object = ld3_12.z;
                    if (object != null) {
                        object.e();
                    }
                }
            }
        }
    }

    public final void b() {
        qk2_0 qk2_02 = this.e.n;
        if (qk2_02 != null) {
            qk2_02.z1();
        }
    }

    public final void c() {
    }

    public final void d(View object, MotionEvent object2) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "event";
        Intrinsics.checkNotNullParameter(object2, string3);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, string3);
        int n3 = object2.getAction();
        object2 = this.e;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return;
            }
            object = ld3_1.Companion;
            ((ld3_1)object2).Xa();
            ((ld3_1)object2).Va();
            System.currentTimeMillis();
            return;
        }
        System.currentTimeMillis();
        object2.getClass();
        object = ((ld3_1)object2).m;
        if (object != null) {
            boolean bl2 = false;
            string2 = null;
            ((e)object).setPlayWhenReady(false);
        }
        if ((object = ((ld3_1)object2).z) != null) {
            ((StoriesProgressView)((Object)object)).c();
        }
    }
}

