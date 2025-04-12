/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.view.View
 *  android.webkit.URLUtil
 *  android.webkit.WebSettings
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import io.reactivex.Scheduler;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class da$a {
    public boolean A;
    public boolean B;
    public boolean C;
    public File D;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ck2_0 m;
    public Object n;
    public boolean o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public ImageView u;
    public boolean v;
    public rd1_2 w;
    public boolean x;
    public String y;
    public boolean z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final da_2 a() {
        da_2 da_22;
        boolean bl2;
        Object object = this;
        int n3 = this.a;
        int n4 = this.b;
        int n7 = this.c;
        int n8 = this.d;
        int n10 = this.e;
        boolean bl3 = this.f;
        boolean bl4 = this.g;
        boolean bl5 = this.h;
        boolean bl6 = this.i;
        int n14 = this.j;
        boolean bl7 = this.k;
        boolean bl8 = this.l;
        Object object2 = this.m;
        Object object3 = this.n;
        boolean bl9 = this.o;
        String string2 = this.p;
        String string3 = this.q;
        boolean bl10 = this.r;
        boolean bl11 = this.s;
        boolean bl12 = this.t;
        ImageView imageView = this.u;
        boolean bl13 = this.v;
        rd1_2 rd1_22 = this.w;
        boolean bl14 = this.x;
        Object object4 = this.y;
        boolean bl15 = this.z;
        boolean bl16 = this.A;
        boolean bl17 = this.B;
        boolean bl18 = bl2 = this.C;
        File file = this.D;
        String string4 = object4;
        boolean bl19 = bl17;
        boolean bl20 = bl2;
        Object object5 = object3;
        String string5 = string2;
        string2 = string3;
        boolean bl21 = bl10;
        bl10 = bl11;
        bl11 = bl12;
        bl17 = bl13;
        bl18 = bl14;
        bl14 = bl16;
        ImageView imageView2 = imageView;
        rd1_2 rd1_23 = rd1_22;
        bl2 = false;
        Object object6 = null;
        ck2_0 ck2_02 = object2;
        object2 = da_22;
        bl13 = bl8;
        bl8 = bl7;
        bl7 = bl13;
        Object object7 = ck2_02;
        object = da_22;
        object3 = string5;
        string5 = string3;
        boolean bl22 = bl21;
        bl21 = bl10;
        bl10 = bl12;
        bl12 = bl17;
        object4 = file;
        da_22 = new da_2(n3, n4, n7, n8, n10, bl3, bl4, n14 != 0, bl8, bl13, ck2_02, object5, bl9, null, (String)object3, string3, bl22, bl21, bl11, imageView2, bl17, rd1_22, false, string4, bl15, bl16, file);
        object2 = iE0.a;
        n3 = 150;
        n4 = 0;
        Object object8 = null;
        if (bl5) {
            Object object9;
            ImageView imageView3 = imageView2;
            if (imageView2 == null) return object;
            n8 = (int)(da_2.e(object5) ? 1 : 0);
            if (n8 != 0) return object;
            Object object10 = com.bumptech.glide.a.e(imageView2.getContext()).f();
            Object object11 = da_2.Companion;
            String string6 = String.valueOf(da_22.l);
            object11.getClass();
            object11 = da$b.b(string6);
            Object object12 = new a01((String)object11);
            object10 = ((rj2_0)object10).U(object12);
            object12 = da_22.d();
            object10 = ((rj2_0)object10).M((uw_0)object12);
            if (bl8) {
                object12 = new Jr3();
                object11 = new vt0_0(n3);
                ((Jr3)object12).a = object9 = new Nx((vt0_0)object11);
                ((rj2_0)object10).X((Jr3)object12);
            }
            n3 = 0;
            object9 = ((rj2_0)object10).R(null);
            object10 = new ea_2((da_2)object, imageView3);
            ((rj2_0)object9).P((ki3_1)object10, null, (uw_0)object9, (Executor)object2);
            return object;
        }
        Object object13 = imageView2;
        n8 = 0;
        Object object14 = null;
        if (bl6) {
            Object object15;
            Object object16;
            Object object17;
            if (bl15) {
                object13 = z40_0.Companion;
                object13 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object13).a;
                object17 = "enable_webp_images";
                n7 = ((ao0_0)object13).g((String)object17);
                if (n7 == (n10 = 1)) {
                    Object object18;
                    block27: {
                        object17 = string4;
                        if (string4 != null) {
                            object13 = string4.concat("?imformat=chrome");
                        } else {
                            n7 = 0;
                            object13 = null;
                        }
                        try {
                            object17 = AJIOApplication$a.a();
                            if (object17 == null) break block27;
                            object17 = WebSettings.getDefaultUserAgent((Context)object17);
                        }
                        catch (Exception exception) {}
                    }
                    object17 = "";
                    object16 = new vr1$a();
                    object15 = new vr1$b((String)object17);
                    n14 = ((vr1$a)object16).a.size();
                    object17 = new HashMap(n14);
                    Object object19 = ((vr1$a)object16).a.entrySet().iterator();
                    while (bl8 = object19.hasNext()) {
                        object18 = object19.next();
                        object7 = (Collection)object18.getValue();
                        ArrayList arrayList = new ArrayList(object7);
                        object18 = object18.getKey();
                        ((HashMap)object17).put(object18, arrayList);
                    }
                    ((vr1$a)object16).a = object17;
                    object17 = ((vr1$a)object16).a;
                    object19 = "User-Agent";
                    if ((object17 = (List)object17.get(object19)) == null) {
                        object17 = new ArrayList();
                        object18 = ((vr1$a)object16).a;
                        object18.put(object19, object17);
                    }
                    object17.clear();
                    object17.add(object15);
                    n10 = (int)(((vr1$a)object16).b ? 1 : 0);
                    if (n10 != 0) {
                        ((vr1$a)object16).b = false;
                    }
                    object17 = ((vr1$a)object16).a;
                    object14 = new vr1_0((Map)object17);
                    object6 = new a01((String)object13, (vr1_0)object14);
                } else {
                    object17 = string4;
                    object6 = string4;
                }
                ((da_2)object).l = object6;
            }
            if ((object13 = ((da_2)object).s) == null) return object;
            object14 = ((da_2)object).l;
            n8 = (int)(da_2.e(object14) ? 1 : 0);
            if (n8 != 0) return object;
            object14 = com.bumptech.glide.a.f((View)object13).j();
            object16 = da_2.Companion;
            object15 = String.valueOf(((da_2)object).l);
            object16.getClass();
            object16 = da$b.b((String)object15);
            object17 = new a01((String)object16);
            object14 = ((rj2_0)object14).U(object17);
            object17 = ((da_2)object).d();
            object14 = ((rj2_0)object14).M((uw_0)object17);
            n10 = (int)(((da_2)object).i ? 1 : 0);
            if (n10 != 0) {
                object17 = new ku0_0();
                ((Jr3)object17).a = object16 = new vt0_0(n3);
                ((rj2_0)object14).X((Jr3)object17);
            }
            Object object20 = ((da_2)object).k;
            object20 = ((rj2_0)object14).R((ck2_0)object20);
            object14 = new fa_2((da_2)object, (ImageView)object13);
            ((rj2_0)object20).P((ki3_1)object14, null, (uw_0)object20, (Executor)object2);
            return object;
        }
        Object object21 = string4;
        if (bl17) {
            da_22.g();
            return object;
        }
        if (bl18) {
            if (string4 == null) {
                return object;
            }
            Intrinsics.checkNotNull(string4);
            object2 = "android.resource://";
            int n15 = kotlin.text.b.s(string4, (String)object2, false);
            if (n15 != 0) {
                da_22.f();
                return object;
            }
            n15 = URLUtil.isNetworkUrl((String)string4);
            if (n15 == 0) {
                Intrinsics.checkNotNull(string4);
                object2 = "file:///android_asset/";
                n15 = kotlin.text.b.s(string4, (String)object2, false);
                if (n15 == 0) {
                    if (imageView2 == null) return object;
                    Intrinsics.checkNotNull(string4);
                    object2 = aa_1.a;
                    Intrinsics.checkNotNullParameter(string4, "url");
                    Intrinsics.checkNotNullParameter(imageView2, "imageView");
                    object2 = aa_1.d;
                    n15 = ((t30_0)object2).b;
                    if (n15 != 0) {
                        aa_1.d = object2 = new t30_0();
                    }
                    object2 = aa_1.c;
                    Intrinsics.checkNotNullExpressionValue(object2, "imageViews");
                    object2.put(object13, object21);
                    object2 = aa_1.b;
                    object2.getClass();
                    Object object22 = "id";
                    Intrinsics.checkNotNullParameter(object21, (String)object22);
                    object2 = ((pn1_1)object2).a;
                    n3 = (int)(((ConcurrentHashMap)object2).containsKey(object21) ? 1 : 0);
                    if (n3 != 0) {
                        object2 = (SoftReference)((ConcurrentHashMap)object2).get(object21);
                        Intrinsics.checkNotNull(object2);
                        object8 = object2 = ((SoftReference)object2).get();
                        object8 = (Bitmap)object2;
                    }
                    if (object8 != null) {
                        object13.setImageBitmap((Bitmap)object8);
                        return object;
                    }
                    AJIOApplication.Companion.getClass();
                    object2 = AJIOApplication$a.a().getPackageName();
                    object22 = "getPackageName(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object22);
                    n15 = StringsKt.F((CharSequence)object21, (CharSequence)object2, false);
                    if (n15 == 0) {
                        aa_1.a.getClass();
                        object2 = new kd1_1((ImageView)object13, (String)object21);
                        object22 = yn3_0.a;
                        object8 = "initiating bottom tab image disk read with url : ".concat((String)object21);
                        object14 = new Object[]{};
                        ((yn3$a)object22).a((String)object8, (Object[])object14);
                        object22 = aa_1.d;
                        object8 = new ma_1((kd1_1)object2);
                        object14 = new o53_0((Callable)object8);
                        object8 = qt2_2.c;
                        object8 = ((g53_0)object14).h((Scheduler)object8);
                        object14 = ti_2.a();
                        object8 = ((g53_0)object8).e((Scheduler)object14);
                        object14 = new na_2((kd1_1)object2);
                        object21 = new oa_2((na_2)object14);
                        object14 = new pa_2((kd1_1)object2);
                        object2 = new qa_2((pa_2)object14);
                        object2 = ((g53_0)object8).f((o60_0)object21, (o60_0)object2);
                        ((t30_0)object22).b((yr0_2)object2);
                    }
                    n15 = R$drawable.item_dummy_noimg;
                    object13.setImageResource(n15);
                    return object;
                }
            }
            if (bl17) {
                if (object13 == null) return object;
                ((da_2)object).g();
                return object;
            }
            ((da_2)object).f();
            return object;
        }
        if (bl19) {
            AJIOApplication.Companion.getClass();
            object2 = com.bumptech.glide.a.e((Context)AJIOApplication$a.a()).f();
            Object object23 = da_22.l;
            object2 = ((rj2_0)object2).U(object23);
            object23 = new ga_2(da_22);
            object2 = ((rj2_0)object2).R((ck2_0)object23);
            object2.getClass();
            object23 = new bk2_1();
            object8 = iE0.b;
            ((rj2_0)object2).P((ki3_1)object23, (bk2_1)object23, (uw_0)object2, (Executor)object8);
            return object;
        }
        if (bl20) {
            if (imageView2 == null) return object;
            AJIOApplication.Companion.getClass();
            object2 = com.bumptech.glide.a.e((Context)AJIOApplication$a.a()).f();
            File file2 = file;
            object2 = ((rj2_0)object2).S(file);
            ((rj2_0)object2).Q(imageView2);
            return object;
        }
        da_22.f();
        return object;
    }

    public final void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "setDescriptionText");
        this.q = string2;
    }
}

