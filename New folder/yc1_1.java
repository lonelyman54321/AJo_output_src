/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.Animator$AnimatorPauseListener
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.Settings$Global
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.animation.Animator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from yC1
 */
public final class yc1_1
extends Drawable
implements Drawable.Callback,
Animatable {
    public static final boolean S;
    public static final List T;
    public static final ThreadPoolExecutor U;
    public Canvas A;
    public Rect B;
    public RectF C;
    public bp1_1 D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public final float[] J;
    public Matrix K;
    public boolean L;
    public Hq M;
    public final Semaphore N;
    public Handler O;
    public oc1_0 P;
    public final uc1_0 Q;
    public float R;
    public QB1 a;
    public final KC1 b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public yC1$b f;
    public final ArrayList g;
    public gd1 h;
    public String i;
    public OU0 j;
    public Map k;
    public String l;
    public final BC1 m;
    public boolean n;
    public boolean o;
    public g30_0 p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public UI2 w;
    public boolean x;
    public final Matrix y;
    public Bitmap z;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 25;
        if (n3 <= n4) {
            n3 = 1;
        } else {
            n3 = 0;
            threadPoolExecutor = null;
        }
        S = n3;
        T = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        JC1 jC1 = new JC1();
        U = threadPoolExecutor = new ThreadPoolExecutor(0, 2, (long)35, timeUnit, linkedBlockingQueue, jC1);
    }

    public yc1_1() {
        uc1_0 uc1_02;
        Object object;
        KC1 kC1;
        kC1.d = 1.0f;
        kC1.e = false;
        kC1.f = 0L;
        kC1.g = 0.0f;
        kC1.h = 0.0f;
        kC1.i = 0;
        kC1.j = -2.1474836E9f;
        kC1.k = 2.1474836E9f;
        kC1.m = false;
        kC1.n = false;
        this.b = kC1;
        int n3 = 1;
        this.c = n3;
        this.d = false;
        this.e = false;
        this.f = object = yC1$b.NONE;
        super();
        this.g = object;
        super();
        this.m = object;
        this.n = false;
        this.o = n3;
        this.q = 255;
        this.v = false;
        object = UI2.AUTOMATIC;
        this.w = object;
        this.x = false;
        super();
        this.y = object;
        object = new float[9];
        this.J = (float[])object;
        this.L = false;
        tC1 tC12 = new tC1(this);
        super(n3);
        this.N = object;
        this.Q = uc1_02 = new uc1_0(this);
        this.R = -3.4028235E38f;
        kC1.addUpdateListener(tC12);
    }

    public static void f(Rect rect, RectF rectF) {
        int n3 = (int)Math.floor(rectF.left);
        int n4 = (int)Math.floor(rectF.top);
        int n7 = (int)Math.ceil(rectF.right);
        int n8 = (int)Math.ceil(rectF.bottom);
        rect.set(n3, n4, n7, n8);
    }

    public final void A(float f5) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            wc1_1 wc1_12 = new wc1_1(this, f5);
            ((ArrayList)object).add(wc1_12);
            return;
        }
        float f6 = ((QB1)object).l;
        float f7 = ((QB1)object).m;
        int n3 = (int)mp1_0.f(f6, f7, f5);
        this.y(n3);
    }

    public final void B(float f5) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            xc1_0 xc1_02 = new xc1_0(this, f5);
            ((ArrayList)object).add(xc1_02);
            return;
        }
        Hq hq = Yo1.a;
        float f6 = ((QB1)object).l;
        float f7 = ((QB1)object).m;
        f5 = mp1_0.f(f6, f7, f5);
        this.b.k(f5);
    }

    public final boolean C() {
        float f5;
        QB1 qB1 = this.a;
        boolean bl2 = false;
        if (qB1 == null) {
            return false;
        }
        float f6 = this.R;
        KC1 kC1 = this.b;
        this.R = f5 = kC1.e();
        float f7 = qB1.b();
        float f8 = (f6 = Math.abs(f5 -= f6) * f7) - (f7 = 50.0f);
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final void a(ko1 object, Object object2, LC1 lC1) {
        Object object3 = this.p;
        if (object3 == null) {
            object3 = this.g;
            mc1_1 mc1_12 = new mc1_1(this, (ko1)object, object2, lC1);
            ((ArrayList)object3).add(mc1_12);
            return;
        }
        Object object4 = ko1.c;
        int n3 = 1;
        if (object == object4) {
            ((g30_0)object3).h(lC1, object2);
        } else {
            object3 = ((ko1)object).b;
            if (object3 != null) {
                object3.h(lC1, object2);
            } else {
                int n4;
                object3 = new Object();
                object4 = this.p;
                String[] stringArray = new String[]{};
                ko1 ko12 = new ko1(stringArray);
                ((kw_1)object4).c((ko1)object, 0, (ArrayList)object3, ko12);
                for (int i3 = 0; i3 < (n4 = object3.size()); ++i3) {
                    object = ((ko1)object3.get((int)i3)).b;
                    object.h(lC1, object2);
                }
                n4 = (int)(object3.isEmpty() ? 1 : 0);
                n3 ^= n4;
            }
        }
        if (n3 != 0) {
            this.invalidateSelf();
            object = GC1.z;
            if (object2 == object) {
                object = this.b;
                float f5 = ((KC1)((Object)object)).e();
                this.B(f5);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean b(Context var1_1) {
        block7: {
            block6: {
                var2_2 = this.d;
                var3_3 = true;
                if (var2_2) {
                    return var3_3;
                }
                var2_2 = this.c;
                if (!var2_2) break block6;
                var4_4 /* !! */  = Yo1.d;
                var4_4 /* !! */ .getClass();
                if (var1_1 /* !! */  == null) ** GOTO lbl-1000
                var4_4 /* !! */  = wz3.a;
                var1_1 /* !! */  = var1_1 /* !! */ .getContentResolver();
                var5_5 = 1.0f;
                var6_6 = Settings.Global.getFloat((ContentResolver)var1_1 /* !! */ , (String)"animator_duration_scale", (float)var5_5);
                var2_2 = false;
                var4_4 /* !! */  = null;
                cfr_temp_0 = var6_6 - 0.0f;
                var7_7 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var7_7 /* !! */  == false) {
                    var1_1 /* !! */  = mG2.REDUCED_MOTION;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = mG2.STANDARD_MOTION;
                }
                var4_4 /* !! */  = mG2.STANDARD_MOTION;
                if (var1_1 /* !! */  == var4_4 /* !! */ ) break block7;
            }
            var3_3 = false;
        }
        return var3_3;
    }

    public final void c() {
        boolean bl2;
        g30_0 g30_02;
        pp1 pp12;
        yc1_1 yc1_12 = this;
        Object object = this.a;
        if (object == null) {
            return;
        }
        Object object2 = sp1.a;
        Object object3 = ((QB1)object).k;
        object2 = pp12;
        List list = Collections.emptyList();
        pp1$a pp1$a = pp1$a.PRE_COMP;
        List list2 = Collections.emptyList();
        dk_0 dk_02 = new dk_0();
        int n3 = object3.width();
        float f5 = n3;
        int n4 = object3.height();
        float f6 = n4;
        List list3 = Collections.emptyList();
        pp1$b pp1$b = pp1$b.NONE;
        Zo1 zo1 = Zo1.NORMAL;
        long l2 = -1;
        long l3 = -1;
        pp1 pp13 = pp12;
        pp12 = null;
        g30_0 g30_03 = g30_02;
        g30_02 = null;
        QB1 qB1 = object;
        ((pp1)object2)(list, (QB1)object, "__container", l2, pp1$a, l3, null, list2, dk_02, 0, 0, 0, 0.0f, 0.0f, f5, f6, null, null, list3, pp1$b, null, false, null, null, zo1);
        object2 = object;
        list = ((QB1)object).j;
        object3 = pp13;
        object = g30_03;
        g30_03(this, pp13, list, qB1);
        this.p = g30_03;
        boolean bl3 = this.s;
        if (bl3) {
            bl3 = true;
            g30_03.r(bl3);
        }
        object2 = yc1_12.p;
        ((g30_0)object2).L = bl2 = yc1_12.o;
    }

    public final void d() {
        KC1 kC1 = this.b;
        boolean bl2 = kC1.m;
        if (bl2) {
            kC1.cancel();
            bl2 = this.isVisible();
            if (!bl2) {
                yC1$b yC1$b;
                this.f = yC1$b = yC1$b.NONE;
            }
        }
        this.a = null;
        this.p = null;
        this.h = null;
        this.R = -3.4028235E38f;
        kC1.l = null;
        kC1.j = -2.1474836E9f;
        kC1.k = 2.1474836E9f;
        this.invalidateSelf();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void draw(Canvas var1_1) {
        var2_3 = this.p;
        if (var2_3 == null) {
            return;
        }
        var3_4 = this.M;
        if (var3_4 == null) {
            var3_4 = Yo1.a;
        }
        var4_5 = Hq.ENABLED;
        if (var3_4 == var4_5) {
            var5_6 = true;
            var6_7 = 1.4E-45f;
        } else {
            var5_6 = false;
            var6_7 = 0.0f;
            var3_4 = null;
        }
        var4_5 = yc1_1.U;
        var7_8 = this.N;
        var8_9 = this.Q;
        var9_10 = this.b;
        if (var5_6) {
            var7_8.acquire();
        }
        if (!var5_6) ** GOTO lbl29
        var10_11 = this.C();
        if (var10_11) {
            var11_12 = var9_10.e();
            this.B(var11_12);
        }
lbl29:
        // 4 sources

        if (!(var10_11 = this.e)) ** GOTO lbl47
        try {
            block16: {
                var10_11 = this.x;
                if (!var10_11) break block16;
                this.n(var1_1 /* !! */ , var2_3);
                ** GOTO lbl52
            }
            this.g(var1_1 /* !! */ );
        }
        catch (Throwable v0) {
            block15: {
                try {
                    var1_1 /* !! */  = rx1.a;
                    var1_1 /* !! */ .getClass();
                    var1_1 /* !! */  = Yo1.a;
                }
                catch (Throwable var1_2) {
                    break block15;
                }
lbl47:
                // 1 sources

                var10_11 = this.x;
                if (var10_11) {
                    this.n(var1_1 /* !! */ , var2_3);
                } else {
                    this.g(var1_1 /* !! */ );
                }
lbl52:
                // 5 sources

                this.L = false;
                if (var5_6 == false) return;
                var7_8.release();
                var12_13 = var2_3.K;
                var13_15 = var9_10.e();
                var14_18 = var12_13 == var13_15 ? 0 : (var12_13 > var13_15 ? 1 : -1);
                if (var14_18 == false) return;
            }
            if (var5_6 == false) throw var1_2;
            var7_8.release();
            var13_16 = var2_3.K;
            var6_7 = var9_10.e();
            var15_20 = var13_16 == var6_7 ? 0 : (var13_16 > var6_7 ? 1 : -1);
            if (var15_20 == false) throw var1_2;
            var4_5.execute(var8_9);
            throw var1_2;
            catch (InterruptedException v1) {
                var1_1 /* !! */  = Yo1.a;
                if (var5_6 == false) return;
                var7_8.release();
                var12_14 = var2_3.K;
                var13_17 = var9_10.e();
                var14_19 = var12_14 == var13_17 ? 0 : (var12_14 > var13_17 ? 1 : -1);
                if (var14_19 == false) return;
            }
        }
        var4_5.execute(var8_9);
    }

    public final void e() {
        QB1 qB1 = this.a;
        if (qB1 == null) {
            return;
        }
        UI2 uI2 = this.w;
        int n3 = Build.VERSION.SDK_INT;
        boolean bl2 = qB1.o;
        int n4 = qB1.p;
        n4 = (int)(uI2.useSoftwareRendering(n3, bl2, n4) ? 1 : 0);
        this.x = n4;
    }

    public final void g(Canvas canvas) {
        g30_0 g30_02 = this.p;
        QB1 qB1 = this.a;
        if (g30_02 != null && qB1 != null) {
            float f5;
            int n3;
            int n4;
            Matrix matrix = this.y;
            matrix.reset();
            Rect rect = this.getBounds();
            int n7 = rect.isEmpty();
            if (n7 == 0) {
                n7 = rect.width();
                float f6 = n7;
                Rect rect2 = qB1.k;
                float f7 = rect2.width();
                f6 /= f7;
                int n8 = rect.height();
                f7 = n8;
                qB1 = qB1.k;
                float f8 = qB1.height();
                f7 /= f8;
                n4 = rect.left;
                f8 = n4;
                n3 = rect.top;
                f5 = n3;
                matrix.preTranslate(f8, f5);
                matrix.preScale(f6, f7);
            }
            n4 = this.q;
            n3 = 0;
            f5 = 0.0f;
            rect = null;
            g30_02.i(canvas, matrix, n4, null);
        }
    }

    public final int getAlpha() {
        return this.q;
    }

    public final int getIntrinsicHeight() {
        int n3;
        QB1 qB1 = this.a;
        if (qB1 == null) {
            n3 = -1;
        } else {
            qB1 = qB1.k;
            n3 = qB1.height();
        }
        return n3;
    }

    public final int getIntrinsicWidth() {
        int n3;
        QB1 qB1 = this.a;
        if (qB1 == null) {
            n3 = -1;
        } else {
            qB1 = qB1.k;
            n3 = qB1.width();
        }
        return n3;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h(AC1 object, boolean n3) {
        boolean bl2 = false;
        Object[] objectArray = this.m.a;
        if (n3 != 0) {
            n3 = Build.VERSION.SDK_INT;
            int n4 = ((AC1)((Object)object)).minRequiredSdkVersion;
            if (n3 < n4) {
                String string2 = ((Enum)object).name();
                int n7 = ((AC1)((Object)object)).minRequiredSdkVersion;
                object = n7;
                int n8 = 2;
                objectArray = new Object[n8];
                objectArray[0] = string2;
                n3 = 1;
                objectArray[n3] = object;
                object = String.format("%s is not supported pre SDK %d", objectArray);
                rx1.b((String)object);
            } else {
                bl2 = objectArray.add(object);
            }
        } else {
            bl2 = objectArray.remove(object);
        }
        object = this.a;
        if (object != null && bl2) {
            this.c();
        }
    }

    public final Context i() {
        Drawable.Callback callback2 = this.getCallback();
        if (callback2 == null) {
            return null;
        }
        boolean bl2 = callback2 instanceof View;
        if (bl2) {
            return ((View)callback2).getContext();
        }
        return null;
    }

    public final void invalidateDrawable(Drawable drawable2) {
        drawable2 = this.getCallback();
        if (drawable2 == null) {
            return;
        }
        drawable2.invalidateDrawable((Drawable)this);
    }

    public final void invalidateSelf() {
        Looper looper;
        Looper looper2;
        boolean bl2 = this.L;
        if (bl2) {
            return;
        }
        this.L = true;
        bl2 = S;
        if (bl2 && (looper2 = Looper.getMainLooper()) != (looper = Looper.myLooper())) {
            return;
        }
        looper2 = this.getCallback();
        if (looper2 != null) {
            looper2.invalidateDrawable((Drawable)this);
        }
    }

    public final boolean isRunning() {
        return this.k();
    }

    public final OU0 j() {
        Object object = this.getCallback();
        if (object == null) {
            return null;
        }
        object = this.j;
        if (object == null) {
            Object object2 = this.getCallback();
            object = new OU0((Drawable.Callback)object2);
            this.j = object;
            object2 = this.l;
            if (object2 != null) {
                object.e = object2;
            }
        }
        return this.j;
    }

    public final boolean k() {
        KC1 kC1 = this.b;
        if (kC1 == null) {
            return false;
        }
        return kC1.m;
    }

    public final void l() {
        boolean bl2;
        this.g.clear();
        Object object = this.b;
        boolean bl3 = true;
        object.j(bl3);
        Iterator iterator = object.c.iterator();
        while (bl2 = iterator.hasNext()) {
            Animator.AnimatorPauseListener animatorPauseListener = (Animator.AnimatorPauseListener)iterator.next();
            animatorPauseListener.onAnimationPause((Animator)object);
        }
        boolean bl4 = this.isVisible();
        if (!bl4) {
            object = yC1$b.NONE;
            this.f = object;
        }
    }

    public final void m() {
        boolean bl2;
        float f5;
        Object object;
        boolean bl3;
        Object object2;
        Object object3 = this.p;
        if (object3 == null) {
            object3 = this.g;
            vc1_1 vc1_12 = new vc1_1(this);
            object3.add(vc1_12);
            return;
        }
        this.e();
        object3 = this.i();
        int n3 = this.b((Context)object3);
        boolean bl4 = true;
        KC1 kC1 = this.b;
        if (n3 != 0 || (n3 = kC1.getRepeatCount()) == 0) {
            n3 = (int)(this.isVisible() ? 1 : 0);
            if (n3 != 0) {
                long l2;
                kC1.m = bl4;
                n3 = (int)(kC1.i() ? 1 : 0);
                object2 = kC1.b.iterator();
                while (bl3 = object2.hasNext()) {
                    object = (Animator.AnimatorListener)object2.next();
                    int n4 = Build.VERSION.SDK_INT;
                    int n7 = 26;
                    if (n4 >= n7) {
                        lw_0.a((Animator.AnimatorListener)object, (Animator)kC1, n3 != 0);
                        continue;
                    }
                    object.onAnimationStart((Animator)kC1);
                }
                n3 = (int)(kC1.i() ? 1 : 0);
                f5 = n3 != 0 ? kC1.f() : kC1.g();
                f5 = (int)f5;
                kC1.k(f5);
                kC1.f = l2 = 0L;
                n3 = 0;
                f5 = 0.0f;
                object3 = null;
                kC1.i = 0;
                bl2 = kC1.m;
                if (bl2) {
                    kC1.j(false);
                    object3 = Choreographer.getInstance();
                    object3.postFrameCallback((Choreographer.FrameCallback)kC1);
                }
                object3 = yC1$b.NONE;
                this.f = object3;
            } else {
                object3 = yC1$b.PLAY;
                this.f = object3;
            }
        }
        if ((n3 = (int)(this.b((Context)(object3 = this.i())) ? 1 : 0)) == 0) {
            object3 = T.iterator();
            bl2 = false;
            object2 = null;
            while (bl3 = object3.hasNext()) {
                object2 = (String)object3.next();
                object = this.a;
                if ((object2 = ((QB1)object).d((String)object2)) == null) continue;
            }
            if (object2 != null) {
                f5 = ((jh1_0)object2).b;
                n3 = (int)f5;
                this.q(n3);
            } else {
                f5 = kC1.d;
                bl2 = false;
                object2 = null;
                float f6 = f5 - 0.0f;
                n3 = (int)(f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1));
                f5 = n3 < 0 ? kC1.g() : kC1.f();
                n3 = (int)f5;
                this.q(n3);
            }
            kC1.j(bl4);
            n3 = (int)(kC1.i() ? 1 : 0);
            kC1.b(n3 != 0);
            n3 = (int)(this.isVisible() ? 1 : 0);
            if (n3 == 0) {
                object3 = yC1$b.NONE;
                this.f = object3;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n(Canvas canvas, g30_0 g30_02) {
        Canvas canvas2;
        Bitmap bitmap;
        int n3;
        int n4;
        Rect rect;
        float f5;
        int n7;
        QB1 qB1 = this.a;
        if (qB1 == null) return;
        if (g30_02 == null) {
            return;
        }
        Canvas canvas3 = this.A;
        if (canvas3 == null) {
            RectF rectF;
            Rect rect2;
            Rect rect3;
            bp1_1 bp1_12;
            RectF rectF2;
            Rect rect4;
            Matrix matrix;
            Matrix matrix2;
            RectF rectF3;
            Canvas canvas4;
            this.A = canvas4 = new Canvas();
            this.H = rectF3 = new RectF();
            this.I = matrix2 = new Matrix();
            this.K = matrix = new Matrix();
            this.B = rect4 = new Rect();
            this.C = rectF2 = new RectF();
            this.D = bp1_12 = new Paint();
            this.E = rect3 = new Rect();
            this.F = rect2 = new Rect();
            this.G = rectF = new RectF();
        }
        Matrix matrix = this.I;
        canvas.getMatrix(matrix);
        Rect rect5 = this.B;
        canvas.getClipBounds(rect5);
        Rect rect6 = this.B;
        RectF rectF = this.C;
        float f6 = rect6.left;
        int n8 = rect6.top;
        float f7 = n8;
        int n10 = rect6.right;
        float f8 = n10;
        float f11 = rect6.bottom;
        rectF.set(f6, f7, f8, f11);
        Matrix matrix3 = this.I;
        rectF = this.C;
        matrix3.mapRect(rectF);
        RectF rectF4 = this.C;
        yc1_1.f(this.B, rectF4);
        int n14 = this.o;
        rectF = null;
        f6 = 0.0f;
        bp1_1 bp1_13 = null;
        if (n14 != 0) {
            RectF rectF5 = this.H;
            n8 = this.getIntrinsicWidth();
            f7 = n8;
            n10 = this.getIntrinsicHeight();
            f8 = n10;
            n7 = 0;
            f5 = 0.0f;
            rect = null;
            rectF5.set(0.0f, 0.0f, f7, f8);
        } else {
            RectF rectF6 = this.H;
            g30_02.f(rectF6, null, false);
        }
        Matrix matrix4 = this.I;
        RectF rectF7 = this.H;
        matrix4.mapRect(rectF7);
        Rect rect7 = this.getBounds();
        n8 = rect7.width();
        f7 = n8;
        f8 = this.getIntrinsicWidth();
        f7 /= f8;
        n14 = rect7.height();
        f11 = n14;
        n10 = this.getIntrinsicHeight();
        f8 = n10;
        RectF rectF8 = this.H;
        f5 = rectF8.left * f7;
        float f12 = rectF8.top * (f11 /= f8);
        float f14 = rectF8.right * f7;
        float f15 = rectF8.bottom * f11;
        rectF8.set(f5, f12, f14, f15);
        rectF8 = this.getCallback();
        n7 = rectF8 instanceof View;
        int n15 = 1;
        f12 = Float.MIN_VALUE;
        if (n7 != 0 && (n7 = (rectF8 = ((View)rectF8).getParent()) instanceof ViewGroup) != 0) {
            rectF8 = (ViewGroup)rectF8;
            n10 = rectF8.getClipChildren() ^ n15;
        } else {
            n10 = 0;
            f8 = 0.0f;
            rectF8 = null;
        }
        if (n10 == 0) {
            rectF8 = this.H;
            rect = this.B;
            n4 = rect.left;
            f14 = n4;
            n3 = rect.top;
            f15 = n3;
            int n16 = rect.right;
            float f16 = n16;
            n7 = rect.bottom;
            f5 = n7;
            rectF8.intersect(f14, f15, f16, f5);
        }
        rectF8 = this.H;
        f8 = rectF8.width();
        double d2 = Math.ceil(f8);
        n10 = (int)d2;
        rect = this.H;
        f5 = rect.height();
        double d5 = Math.ceil(f5);
        n7 = (int)d5;
        if (n10 <= 0) return;
        if (n7 <= 0) {
            return;
        }
        Bitmap bitmap2 = this.z;
        if (bitmap2 != null && (n4 = bitmap2.getWidth()) >= n10 && (n4 = (bitmap = this.z).getHeight()) >= n7) {
            Bitmap bitmap3;
            Bitmap bitmap4 = this.z;
            n4 = bitmap4.getWidth();
            if (n4 > n10 || (n4 = (bitmap3 = this.z).getHeight()) > n7) {
                Bitmap bitmap5;
                this.z = bitmap5 = Bitmap.createBitmap((Bitmap)this.z, (int)0, (int)0, (int)n10, (int)n7);
                canvas2 = this.A;
                canvas2.setBitmap(bitmap5);
                this.L = n15;
            }
        } else {
            Bitmap bitmap6;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            this.z = bitmap6 = Bitmap.createBitmap((int)n10, (int)n7, (Bitmap.Config)config);
            canvas2 = this.A;
            canvas2.setBitmap(bitmap6);
            this.L = n15;
        }
        if ((n15 = this.L) != 0) {
            Matrix matrix5 = this.I;
            float[] fArray = this.J;
            matrix5.getValues(fArray);
            f12 = fArray[0];
            n3 = 4;
            f15 = 5.6E-45f;
            f14 = fArray[n3];
            canvas2 = this.y;
            Matrix matrix6 = this.I;
            canvas2.set(matrix6);
            canvas2.preScale(f7, f11);
            RectF rectF9 = this.H;
            f7 = -rectF9.left;
            f11 = -rectF9.top;
            canvas2.postTranslate(f7, f11);
            n14 = 1065353216;
            f11 = 1.0f;
            f7 = f11 / f12;
            canvas2.postScale(f7, f11 /= f14);
            this.z.eraseColor(0);
            Canvas canvas5 = this.A;
            rectF7 = wz3.a;
            canvas5.setMatrix((Matrix)rectF7);
            this.A.scale(f12, f14);
            Canvas canvas6 = this.A;
            n8 = this.q;
            g30_02.i(canvas6, (Matrix)canvas2, n8, null);
            g30_02 = this.I;
            Matrix matrix7 = this.K;
            g30_02.invert(matrix7);
            g30_02 = this.K;
            RectF rectF10 = this.G;
            rectF = this.H;
            g30_02.mapRect(rectF10, rectF);
            g30_02 = this.G;
            Rect rect8 = this.F;
            yc1_1.f(rect8, (RectF)g30_02);
        }
        this.E.set(0, 0, n10, n7);
        g30_02 = this.z;
        Rect rect9 = this.E;
        rectF = this.F;
        bp1_13 = this.D;
        canvas.drawBitmap((Bitmap)g30_02, rect9, (Rect)rectF, (Paint)bp1_13);
    }

    public final void o() {
        boolean bl2;
        Animator.AnimatorPauseListener animatorPauseListener;
        boolean bl3;
        float f5;
        float f6;
        int n3;
        Object object = this.p;
        if (object == null) {
            object = this.g;
            pc1_1 pc1_12 = new pc1_1(this);
            ((ArrayList)object).add(pc1_12);
            return;
        }
        this.e();
        object = this.i();
        boolean bl32 = this.b((Context)object);
        boolean bl4 = true;
        KC1 kC1 = this.b;
        if (bl32 || (n3 = kC1.getRepeatCount()) == 0) {
            boolean bl5 = this.isVisible();
            if (bl5) {
                float f7;
                float f8;
                long l2;
                kC1.m = bl4;
                f6 = 0.0f;
                kC1.j(false);
                object = Choreographer.getInstance();
                object.postFrameCallback(kC1);
                kC1.f = l2 = 0L;
                boolean bl6 = kC1.i();
                if (bl6 && (f8 = (f7 = (f6 = kC1.h) - (f5 = kC1.g())) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) == false) {
                    f6 = kC1.f();
                    kC1.k(f6);
                } else {
                    float f11;
                    float f12;
                    boolean bl7 = kC1.i();
                    if (!bl7 && (f12 = (f11 = (f6 = kC1.h) - (f5 = kC1.f())) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) == false) {
                        f6 = kC1.g();
                        kC1.k(f6);
                    }
                }
                object = kC1.c.iterator();
                while (bl3 = object.hasNext()) {
                    animatorPauseListener = (Animator.AnimatorPauseListener)object.next();
                    animatorPauseListener.onAnimationResume((Animator)kC1);
                }
                object = yC1$b.NONE;
                this.f = object;
            } else {
                object = yC1$b.RESUME;
                this.f = object;
            }
        }
        if (!(bl2 = this.b((Context)(object = this.i())))) {
            f6 = kC1.d;
            bl3 = false;
            f5 = 0.0f;
            animatorPauseListener = null;
            float f14 = f6 - 0.0f;
            Object object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            f6 = object2 < 0 ? kC1.g() : kC1.f();
            int n4 = (int)f6;
            this.q(n4);
            kC1.j(bl4);
            boolean bl8 = kC1.i();
            kC1.b(bl8);
            boolean bl9 = this.isVisible();
            if (!bl9) {
                object = yC1$b.NONE;
                this.f = object;
            }
        }
    }

    public final boolean p(QB1 qB1) {
        int n3;
        float f5;
        boolean bl2;
        QB1 qB12 = this.a;
        int n4 = 0;
        float f6 = 0.0f;
        Object object = null;
        if (qB12 == qB1) {
            return false;
        }
        this.L = bl2 = true;
        this.d();
        this.a = qB1;
        this.c();
        Object object2 = this.b;
        Object object3 = ((KC1)((Object)object2)).l;
        if (object3 == null) {
            n4 = 1;
            f6 = Float.MIN_VALUE;
        }
        ((KC1)((Object)object2)).l = qB1;
        if (n4 != 0) {
            f6 = ((KC1)((Object)object2)).j;
            f5 = qB1.l;
            f6 = Math.max(f6, f5);
            f5 = ((KC1)((Object)object2)).k;
            float f7 = qB1.m;
            f5 = Math.min(f5, f7);
            ((KC1)((Object)object2)).l(f6, f5);
        } else {
            n4 = (int)qB1.l;
            f6 = n4;
            n3 = (int)qB1.m;
            f5 = n3;
            ((KC1)((Object)object2)).l(f6, f5);
        }
        f6 = ((KC1)((Object)object2)).h;
        n3 = 0;
        f5 = 0.0f;
        object3 = null;
        ((KC1)((Object)object2)).h = 0.0f;
        ((KC1)((Object)object2)).g = 0.0f;
        n4 = (int)f6;
        f6 = n4;
        ((KC1)((Object)object2)).k(f6);
        ((nw)((Object)object2)).d();
        f6 = ((KC1)((Object)object2)).getAnimatedFraction();
        this.B(f6);
        object2 = this.g;
        object = new ArrayList(object2);
        object = ((ArrayList)object).iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object3 = (yC1$a)object.next();
            if (object3 != null) {
                object3.run();
            }
            object.remove();
        }
        ((ArrayList)object2).clear();
        n4 = (int)(this.r ? 1 : 0);
        qB1.a.a = n4;
        this.e();
        qB1 = this.getCallback();
        n4 = qB1 instanceof ImageView;
        if (n4 != 0) {
            qB1 = (ImageView)qB1;
            n4 = 0;
            f6 = 0.0f;
            object = null;
            qB1.setImageDrawable(null);
            qB1.setImageDrawable(this);
        }
        return bl2;
    }

    public final void q(int n3) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            hc1_0 hc1_02 = new hc1_0(this, n3);
            ((ArrayList)object).add(hc1_02);
            return;
        }
        object = this.b;
        float f5 = n3;
        ((KC1)((Object)object)).k(f5);
    }

    public final void r(int n3) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            kc1_1 kc1_12 = new kc1_1(this, n3);
            ((ArrayList)object).add(kc1_12);
            return;
        }
        float f5 = (float)n3 + 0.99f;
        object = this.b;
        float f6 = ((KC1)((Object)object)).j;
        ((KC1)((Object)object)).l(f6, f5);
    }

    public final void s(String string2) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            rc1_1 rc1_12 = new rc1_1(this, string2);
            ((ArrayList)object).add(rc1_12);
            return;
        }
        if ((object = ((QB1)object).d(string2)) != null) {
            float f5 = ((jh1_0)object).b;
            float f6 = ((jh1_0)object).c;
            int n3 = (int)(f5 + f6);
            this.r(n3);
            return;
        }
        string2 = cP.a("Cannot find marker with name ", string2, ".");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        drawable2 = this.getCallback();
        if (drawable2 == null) {
            return;
        }
        drawable2.scheduleDrawable((Drawable)this, runnable2, l2);
    }

    public final void setAlpha(int n3) {
        this.q = n3;
        this.invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        rx1.b("Use addColorFilter instead.");
    }

    public final boolean setVisible(boolean bl2, boolean bl3) {
        boolean bl4 = this.isVisible() ^ true;
        bl3 = super.setVisible(bl2, bl3);
        if (bl2) {
            yC1$b yC1$b = this.f;
            yC1$b yC1$b2 = yC1$b.PLAY;
            if (yC1$b == yC1$b2) {
                this.m();
            } else {
                yC1$b2 = yC1$b.RESUME;
                if (yC1$b == yC1$b2) {
                    this.o();
                }
            }
        } else {
            Object object = this.b;
            bl2 = object.m;
            if (bl2) {
                this.l();
                object = yC1$b.RESUME;
                this.f = object;
            } else if (!bl4) {
                object = yC1$b.NONE;
                this.f = object;
            }
        }
        return bl3;
    }

    public final void start() {
        boolean bl2;
        Drawable.Callback callback2 = this.getCallback();
        boolean bl3 = callback2 instanceof View;
        if (bl3 && (bl2 = (callback2 = (View)callback2).isInEditMode())) {
            return;
        }
        this.m();
    }

    public final void stop() {
        Object object = this.g;
        object.clear();
        KC1 kC1 = this.b;
        kC1.j(true);
        boolean bl2 = kC1.i();
        kC1.b(bl2);
        bl2 = this.isVisible();
        if (!bl2) {
            object = yC1$b.NONE;
            this.f = object;
        }
    }

    public final void t(float f5) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            nc1_0 nc1_02 = new nc1_0(this, f5);
            ((ArrayList)object).add(nc1_02);
            return;
        }
        float f6 = ((QB1)object).l;
        float f7 = ((QB1)object).m;
        f5 = mp1_0.f(f6, f7, f5);
        object = this.b;
        f6 = ((KC1)((Object)object)).j;
        ((KC1)((Object)object)).l(f6, f5);
    }

    public final void u(int n3, int n4) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            jc1_1 jc1_12 = new jc1_1(this, n3, n4);
            ((ArrayList)object).add(jc1_12);
            return;
        }
        float f5 = n3;
        float f6 = (float)n4 + 0.99f;
        this.b.l(f5, f6);
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        drawable2 = this.getCallback();
        if (drawable2 == null) {
            return;
        }
        drawable2.unscheduleDrawable((Drawable)this, runnable2);
    }

    public final void v(String string2) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            gc1_2 gc1_22 = new gc1_2(this, string2);
            ((ArrayList)object).add(gc1_22);
            return;
        }
        if ((object = ((QB1)object).d(string2)) != null) {
            int n3 = (int)((jh1_0)object).b;
            int n4 = (int)((jh1_0)object).c + n3;
            this.u(n3, n4);
            return;
        }
        string2 = cP.a("Cannot find marker with name ", string2, ".");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void w(String object, String object2, boolean bl2) {
        Object object3 = this.a;
        if (object3 == null) {
            object3 = this.g;
            qc1_0 qc1_02 = new qc1_0(this, (String)object, (String)object2, bl2);
            ((ArrayList)object3).add(qc1_02);
            return;
        }
        object3 = ((QB1)object3).d((String)object);
        String string2 = ".";
        String string3 = "Cannot find marker with name ";
        if (object3 != null) {
            float f5 = ((jh1_0)object3).b;
            int n3 = (int)f5;
            object3 = this.a.d((String)object2);
            if (object3 != null) {
                float f6;
                int n4;
                if (bl2) {
                    n4 = 1065353216;
                    f6 = 1.0f;
                } else {
                    n4 = 0;
                    f6 = 0.0f;
                    object2 = null;
                }
                n4 = (int)(((jh1_0)object3).b + f6);
                this.u(n3, n4);
                return;
            }
            object2 = cP.a(string3, (String)object2, string2);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object = cP.a(string3, (String)object, string2);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void x(float f5, float f6) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            ic1_0 ic1_02 = new ic1_0(this, f5, f6);
            ((ArrayList)object).add(ic1_02);
            return;
        }
        float f7 = ((QB1)object).l;
        float f8 = ((QB1)object).m;
        int n3 = (int)mp1_0.f(f7, f8, f5);
        object = this.a;
        f7 = ((QB1)object).l;
        f8 = ((QB1)object).m;
        int n4 = (int)mp1_0.f(f7, f8, f6);
        this.u(n3, n4);
    }

    public final void y(int n3) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            lc1_1 lc1_12 = new lc1_1(this, n3);
            ((ArrayList)object).add(lc1_12);
            return;
        }
        float f5 = n3;
        object = this.b;
        float f6 = (int)((KC1)((Object)object)).k;
        ((KC1)((Object)object)).l(f5, f6);
    }

    public final void z(String string2) {
        Object object = this.a;
        if (object == null) {
            object = this.g;
            sc1_0 sc1_02 = new sc1_0(this, string2);
            ((ArrayList)object).add(sc1_02);
            return;
        }
        if ((object = ((QB1)object).d(string2)) != null) {
            int n3 = (int)((jh1_0)object).b;
            this.y(n3);
            return;
        }
        string2 = cP.a("Cannot find marker with name ", string2, ".");
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

