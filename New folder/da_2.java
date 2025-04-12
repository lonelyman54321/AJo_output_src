/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.ImageView
 */
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.RequestManager$a;
import com.bumptech.glide.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import io.reactivex.Scheduler;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from da
 */
public final class da_2 {
    public static final da$b Companion;
    public static da_2 v;
    public static final Nq0$e w;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final ck2_0 k;
    public Object l;
    public final boolean m;
    public final String n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final ImageView s;
    public final rd1_2 t;
    public final boolean u;

    static {
        Object object = new Object();
        Companion = object;
        object = Nq0.c;
        Intrinsics.checkNotNullExpressionValue(object, "AUTOMATIC");
        w = object;
    }

    public da_2(int n3, int n4, int n7, int n8, int n10, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, ck2_0 ck2_02, Object object, boolean bl7, ck2_0 ck2_03, String string2, String string3, boolean bl8, boolean bl9, boolean bl10, ImageView imageView, boolean bl11, rd1_2 rd1_22, boolean bl12, String string4, boolean bl13, boolean bl14, File file) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
        this.e = n10;
        this.f = bl2;
        this.g = bl3;
        this.h = bl4;
        this.i = bl5;
        this.j = bl6;
        this.k = ck2_02;
        this.l = object;
        this.m = bl7;
        this.n = string2;
        this.o = string3;
        this.p = bl8;
        this.q = bl9;
        this.r = bl10;
        this.s = imageView;
        this.t = rd1_22;
        this.u = bl14;
    }

    public static void a() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "enable_glide_cache_clear";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            object = AJIOApplication$a.a();
            object = com.bumptech.glide.a.a((Context)object);
            object.getClass();
            dz3.a();
            object2 = ((a)object).c;
            object2.b();
            object2 = ((a)object).b;
            object2.b();
            object = ((a)object).e;
            try {
                object.b();
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
            System.gc();
        }
    }

    public static void b() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "enable_glide_cache_clear";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            da_2.a();
            object = z40$a.a((Context)AJIOApplication$a.a()).a;
            bl2 = ((ao0_0)object).a((String)object2);
            if (bl2) {
                object = new Object();
                object2 = new o53_0((Callable)object);
                object = qt2_2.c;
                object = ((g53_0)object2).h((Scheduler)object);
                object2 = ti_2.a();
                object = ((g53_0)object).e((Scheduler)object2);
                object2 = new Object();
                aa_2 aa_22 = new aa_2(object2);
                object2 = new ba_2(0);
                ca_2 ca_22 = new ca_2((ba_2)object2);
                ((g53_0)object).f(aa_22, ca_22);
            }
        }
    }

    public static void c(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        RequestManager requestManager = com.bumptech.glide.a.e(imageView.getContext());
        requestManager.getClass();
        RequestManager$a requestManager$a = new qg0((View)imageView);
        requestManager.l(requestManager$a);
    }

    public static boolean e(Object object) {
        int n3;
        if (object != null && (n3 = ((String)(object = object.toString())).length()) != 0) {
            n3 = 0;
            object = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public final fk2_0 d() {
        uw_0 uw_02 = new fk2_0();
        Object object = w;
        uw_02 = ((fk2_0)uw_02.j((Nq0)object)).E(false);
        object = "skipMemoryCache(...)";
        Intrinsics.checkNotNullExpressionValue(uw_02, (String)object);
        int n3 = this.a;
        if (n3 != 0) {
            uw_02.x(n3);
        }
        if ((n3 = this.b) != 0) {
            uw_02.m(n3);
        }
        if ((n3 = this.c) != 0) {
            uw_02.n(n3);
        }
        if ((n3 = (int)(this.f ? 1 : 0)) != 0) {
            uw_02.f();
        }
        if ((n3 = (int)(this.h ? 1 : 0)) != 0) {
            uw_02.e();
        }
        if ((n3 = (int)(this.j ? 1 : 0)) != 0) {
            uw_02.o();
        }
        if ((n3 = (int)(this.m ? 1 : 0)) != 0) {
            n3 = this.d;
            int n4 = this.e;
            uw_02.w(n3, n4);
        }
        if ((n3 = (int)(this.g ? 1 : 0)) != 0) {
            uw_02.k();
        }
        return uw_02;
    }

    public final void f() {
        Object object;
        boolean bl2;
        ImageView imageView = this.s;
        if (imageView != null && !(bl2 = da_2.e(object = this.l))) {
            object = com.bumptech.glide.a.e(imageView.getContext());
            Object object2 = Companion;
            Object object3 = this.l;
            object3 = object3 != null ? object3.toString() : null;
            object2.getClass();
            object2 = da$b.b((String)object3);
            Object object4 = new a01((String)object2);
            object = ((RequestManager)object).n((x31_0)object4);
            object4 = this.d();
            object = ((rj2_0)object).M((uw_0)object4);
            object4 = this.k;
            object = ((rj2_0)object).R((ck2_0)object4);
            Intrinsics.checkNotNull(imageView);
            ((rj2_0)object).Q(imageView);
        }
    }

    public final void g() {
        Object object;
        boolean bl2;
        ImageView imageView = this.s;
        if (imageView != null && !(bl2 = da_2.e(object = this.l))) {
            object = com.bumptech.glide.a.f((View)imageView);
            Object object2 = Companion;
            String string2 = String.valueOf(this.l);
            object2.getClass();
            object2 = da$b.b(string2);
            Object object3 = new a01((String)object2);
            object = ((RequestManager)object).n((x31_0)object3);
            boolean bl3 = this.i;
            if (bl3) {
                object3 = new ku0_0();
                int n3 = 150;
                ((Jr3)object3).a = object2 = new vt0_0(n3);
                ((rj2_0)object).X((Jr3)object3);
            }
            object3 = this.d();
            object = ((rj2_0)object).M((uw_0)object3);
            ((rj2_0)object).Q(imageView);
        }
    }
}

