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
 * Renamed from uJ0
 */
public final class uj0_1
extends f92_0 {
    public final /* synthetic */ pj0_2 e;

    public uj0_1(pj0_2 pj0_22, FragmentActivity fragmentActivity) {
        this.e = pj0_22;
        Intrinsics.checkNotNull(fragmentActivity);
        super(fragmentActivity);
    }

    public final void a(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        pj0_2 pj0_22 = this.e;
        Object object2 = pj0_22.H;
        int n3 = Intrinsics.areEqual(object, object2);
        if (n3 != 0) {
            int n4 = pj0_22.p;
            object2 = pj0_22.l;
            if (object2 != null) {
                n3 = ((p83_0)object2).size();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (n4 == (n3 += -1)) {
                object = pj0_22.o;
                if (object != null) {
                    object.R();
                }
            } else {
                object = pj0_22.D;
                if (object != null) {
                    object.f();
                }
            }
        } else {
            object2 = pj0_22.G;
            int n7 = Intrinsics.areEqual(object, object2);
            if (n7 != 0) {
                n7 = pj0_22.p;
                if (n7 == 0) {
                    object = pj0_22.o;
                    if (object != null) {
                        object.o();
                    }
                } else {
                    object = pj0_22.D;
                    if (object != null) {
                        object.e();
                    }
                }
            }
        }
    }

    public final void b() {
        qk2_0 qk2_02 = this.e.o;
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
            pj0_2.Oa((pj0_2)object2);
            ((pj0_2)object2).Wa();
            n3 = (int)(((pj0_2)object2).q ? 1 : 0);
            if (n3 != 0) {
                ((pj0_2)object2).Wa();
                object = ((pj0_2)object2).D;
                if (object != null) {
                    ((StoriesProgressView)((Object)object)).d();
                }
            }
            System.currentTimeMillis();
            return;
        }
        System.currentTimeMillis();
        object2.getClass();
        object = ((pj0_2)object2).n;
        if (object != null) {
            boolean bl2 = false;
            string2 = null;
            ((e)object).setPlayWhenReady(false);
        }
        if ((object = ((pj0_2)object2).D) != null) {
            ((StoriesProgressView)((Object)object)).c();
        }
    }
}

