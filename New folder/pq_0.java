/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Trace
 */
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from pq
 */
public final class pq_0
extends im2
implements ti2_0 {
    public static final oq_0 p;
    public c80 a;
    public final kb3_2 b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableFloatState d;
    public final ParcelableSnapshotMutableState e;
    public pq$a_0 f;
    public im2 g;
    public Function1 h;
    public Function1 i;
    public i70_0 j;
    public int k;
    public boolean l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final ParcelableSnapshotMutableState o;

    static {
        oq_0 oq_02;
        p = oq_02 = new Object();
    }

    public pq_0(pe1_0 object, ce1_0 ce1_02) {
        Object object2 = new C63(0L);
        this.b = object2 = lb3_2.a(object2);
        Object object3 = J83.g(null);
        this.c = object3;
        object3 = tp1_0.e(1.0f);
        this.d = object3;
        this.e = object2 = J83.g(null);
        this.f = object2 = pq$a$a.a;
        this.h = object3 = p;
        this.j = object3 = i70$a.b;
        this.k = 1;
        this.m = object2 = J83.g(object2);
        this.n = object = J83.g(object);
        this.o = object = J83.g(ce1_02);
    }

    public final pq$a_0 a() {
        return (pq$a_0)this.m.getValue();
    }

    public final boolean applyAlpha(float f5) {
        this.d.k(f5);
        return true;
    }

    public final boolean applyColorFilter(TX tX) {
        this.e.setValue(tX);
        return true;
    }

    public final im2 b(Drawable object) {
        int n3 = object instanceof BitmapDrawable;
        if (n3 != 0) {
            object = ((BitmapDrawable)object).getBitmap();
            ih_0 ih_02 = new ih_0((Bitmap)object);
            int n4 = this.k;
            n3 = object.getWidth();
            int n7 = object.getHeight();
            long l2 = dj1.a(n3, n7);
            long l3 = 0L;
            Object object2 = object;
            object = new my_0(ih_02, l3, l2);
            object.d = n4;
        } else {
            object = object.mutate();
            DrawablePainter drawablePainter = new DrawablePainter((Drawable)object);
            object = drawablePainter;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final void c(pq$a_0 var1_1) {
        block11: {
            block10: {
                block9: {
                    block8: {
                        var2_2 = this.f;
                        this.f = var1_1 = (pq$a_0)this.h.invoke(var1_1);
                        var3_3 = this.m;
                        var3_3.setValue(var1_1);
                        var4_4 = var1_1 instanceof pq$a$d;
                        var5_5 = null;
                        if (!var4_4) break block8;
                        var3_3 = var1_1;
                        var3_3 = ((pq$a$d)var1_1).b;
                        break block9;
                    }
                    var4_4 = var1_1 instanceof pq$a$b;
                    if (!var4_4) break block10;
                    var3_3 = var1_1;
                    var3_3 = ((pq$a$b)var1_1).b;
                }
                var6_6 = var3_3.b().m;
                var7_7 = uq_0.a;
                var6_6 = var6_6.a((Nr3)var7_7, (se1_0)var3_3);
                var8_8 = var6_6 instanceof ye0_2;
                if (!var8_8) break block10;
                var7_7 = var2_2.a();
                var9_9 = var2_2 instanceof pq$a$c;
                var10_10 = var9_9 != false ? var7_7 : null;
                var11_11 = var1_1.a();
                var12_12 = this.j;
                var6_6 = (ye0_2)var6_6;
                var8_8 = var3_3 instanceof cg3_2;
                if (!var8_8) ** GOTO lbl-1000
                var3_3 = (cg3_2)var3_3;
                var4_4 = var3_3.g;
                if (var4_4) {
                    var4_4 = false;
                    var3_3 = null;
                    var13_13 = false;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = true;
                    var13_13 = true;
                }
                var14_14 = var6_6.d;
                var15_15 = var6_6.c;
                var3_3 = new xe0_2((im2)var10_10, var11_11, var12_12, var15_15, var13_13, var14_14);
                break block11;
            }
            var4_4 = false;
            var3_3 = null;
        }
        if (var3_3 == null) {
            var3_3 = var1_1.a();
        }
        this.g = var3_3;
        var6_6 = this.c;
        var6_6.setValue(var3_3);
        var3_3 = this.a;
        if (var3_3 != null && (var3_3 = var2_2.a()) != (var6_6 = var1_1.a())) {
            var4_4 = (var2_2 = ((pq$a_0)var2_2).a()) instanceof ti2_0;
            if ((var2_2 = var4_4 != false ? (ti2_0)var2_2 : null) != null) {
                var2_2.onForgotten();
            }
            if (var4_4 = (var2_2 = var1_1.a()) instanceof ti2_0) {
                var5_5 = var2_2;
                var5_5 = (ti2_0)var2_2;
            }
            if (var5_5 != null) {
                var5_5.onRemembered();
            }
        }
        if ((var2_2 = this.i) != null) {
            var2_2.invoke(var1_1);
        }
    }

    public final long getIntrinsicSize-NH-jbRc() {
        im2 im22 = (im2)this.c.getValue();
        long l2 = im22 != null ? im22.getIntrinsicSize-NH-jbRc() : 9205357640488583168L;
        return l2;
    }

    public final void onAbandoned() {
        Object object = this.a;
        Object object2 = null;
        if (object != null) {
            kotlinx.coroutines.d.b((i90_0)object, null);
        }
        this.a = null;
        object = this.g;
        boolean bl2 = object instanceof ti2_0;
        if (bl2) {
            object2 = object;
            object2 = (ti2_0)object;
        }
        if (object2 != null) {
            object2.onAbandoned();
        }
    }

    public final void onDraw(Kt0 kt0) {
        long l2 = kt0.l();
        Object object = new C63(l2);
        Object object2 = this.b;
        object2.getClass();
        ((kb3_2)object2).k(null, object);
        Object object3 = object2 = this.c.getValue();
        object3 = (im2)object2;
        if (object3 != null) {
            long l3 = kt0.l();
            float f5 = this.d.c();
            Object object4 = object2 = this.e.getValue();
            object4 = (TX)object2;
            object = kt0;
            ((im2)object3).draw-x_KDEd0(kt0, l3, f5, (TX)object4);
        }
    }

    public final void onForgotten() {
        Object object = this.a;
        Object object2 = null;
        if (object != null) {
            kotlinx.coroutines.d.b((i90_0)object, null);
        }
        this.a = null;
        object = this.g;
        boolean bl2 = object instanceof ti2_0;
        if (bl2) {
            object2 = object;
            object2 = (ti2_0)object;
        }
        if (object2 != null) {
            object2.onForgotten();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onRemembered() {
        Throwable throwable2;
        block10: {
            Object object;
            block9: {
                boolean bl2;
                Object object2;
                object = "AsyncImagePainter.onRemembered";
                Trace.beginSection((String)object);
                try {
                    object = this.a;
                    if (object != null) break block9;
                    object = be_1.a();
                    object2 = ir0_2.a;
                    object2 = bg1_1.a;
                    object2 = ((d21_0)object2).N0();
                    object = CoroutineContext$Element$a.d((CoroutineContext)object2, (CoroutineContext$Element)object);
                    this.a = object = kotlinx.coroutines.d.a((CoroutineContext)object);
                    object2 = this.g;
                }
                catch (Throwable throwable2) {
                    break block10;
                }
                int n3 = object2 instanceof ti2_0;
                im2 im22 = null;
                if (n3 != 0) {
                    object2 = (ti2_0)object2;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null) {
                    object2.onRemembered();
                }
                if (bl2 = this.l) {
                    object = this.n;
                    object = ((h83_0)object).getValue();
                    object = (pe1_0)object;
                    object = pe1_0.a((pe1_0)object);
                    object2 = this.o;
                    object2 = ((h83_0)object2).getValue();
                    object2 = (ce1_0)object2;
                    ((pe1$a_0)object).b = object2 = object2.a();
                    ((pe1$a_0)object).O = null;
                    object = ((pe1$a_0)object).a();
                    Om0 om0 = ((pe1_0)object).M;
                    Drawable drawable2 = ((pe1_0)object).G;
                    Integer n4 = ((pe1_0)object).F;
                    om0 = om0.j;
                    if ((object = j.b((pe1_0)object, drawable2, n4, (Drawable)om0)) != null) {
                        im22 = this.b((Drawable)object);
                    }
                    object2 = new pq$a$c(im22);
                    this.c((pq$a_0)object2);
                } else {
                    object2 = new pq$b_0(this, null);
                    n3 = 3;
                    Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
                }
            }
            object = Unit.a;
            Trace.endSection();
            return;
        }
        Trace.endSection();
        throw throwable2;
    }
}

