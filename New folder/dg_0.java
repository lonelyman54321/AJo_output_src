/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
import android.graphics.Rect;
import androidx.compose.ui.platform.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from dg
 */
public final class dg_0
extends Lambda
implements Function0 {
    public final /* synthetic */ pt2_1 c;
    public final /* synthetic */ c d;

    public dg_0(pt2_1 pt2_12, c c2) {
        this.c = pt2_12;
        this.d = c2;
        super(0);
    }

    public final Object invoke() {
        float f5;
        float f6;
        boolean bl2;
        int n3;
        float f7;
        float f8;
        Object object;
        pt2_1 pt2_12 = this.c;
        Object object2 = pt2_12.e;
        CT2 cT2 = pt2_12.f;
        Object object3 = pt2_12.c;
        Float f11 = pt2_12.d;
        Object object4 = null;
        if (object2 != null && object3 != null) {
            object = (Number)((CT2)object2).a.invoke();
            f8 = ((Number)object).floatValue();
            f7 = ((Float)object3).floatValue();
            f8 -= f7;
        } else {
            n3 = 0;
            f8 = 0.0f;
            object = null;
        }
        if (cT2 != null && f11 != null) {
            object3 = (Number)cT2.a.invoke();
            f7 = ((Number)object3).floatValue();
            float f12 = f11.floatValue();
            f7 -= f12;
        } else {
            bl2 = false;
            f7 = 0.0f;
            object3 = null;
        }
        float f14 = (f6 = f8 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f14 != false || (bl2 = (f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) {
            block15: {
                object3 = this.d;
                f14 = pt2_12.a;
                f14 = ((c)object3).u((int)f14);
                object4 = ((c)object3).j();
                n3 = ((c)object3).k;
                if ((object4 = (KY2)((Qi1)object4).c(n3)) != null) {
                    object = ((c)object3).l;
                    if (object == null) break block15;
                    object4 = ((c)object3).b((KY2)object4);
                    try {
                        ((C2)object).k((Rect)object4);
                        object4 = Unit.a;
                    }
                    catch (IllegalStateException illegalStateException) {
                        object4 = Unit.a;
                    }
                }
            }
            ((c)object3).a.invalidate();
            object4 = (KY2)((c)object3).j().c((int)f14);
            if (object4 != null && (object4 = ((KY2)object4).a) != null && (object4 = ((GY2)object4).c) != null) {
                if (object2 != null) {
                    object = ((c)object3).n;
                    ((tr1_1)object).i((int)f14, object2);
                }
                if (cT2 != null) {
                    object = ((c)object3).o;
                    ((tr1_1)object).i((int)f14, cT2);
                }
                ((c)object3).q((xp1_0)object4);
            }
        }
        if (object2 != null) {
            pt2_12.c = object2 = (Float)((CT2)object2).a.invoke();
        }
        if (cT2 != null) {
            pt2_12.d = object2 = (Float)cT2.a.invoke();
        }
        return Unit.a;
    }
}

