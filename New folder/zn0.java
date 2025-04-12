/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 *  android.media.Spatializer
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.util.Pair
 */
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.d;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.o$a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Ordering;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public final class zn0
extends ch1_0
implements o$a {
    public static final Ordering j;
    public final Object c;
    public final Context d;
    public final DF0$b e;
    public final boolean f;
    public zn0$d g;
    public final zn0$f h;
    public dr_1 i;

    static {
        qn0 qn02 = new Object();
        j = Ordering.from(qn02);
    }

    public zn0(Context context) {
        j4$b j4$b;
        this(context, j4$b);
    }

    public zn0(Context object, j4$b object2) {
        int n3;
        Object object3;
        int n4 = zn0$d.U;
        Object object4 = new zn0$d$a((Context)object);
        object4 = ((zn0$d$a)object4).k();
        this.c = object3 = new Object();
        object3 = null;
        Context context = object != null ? object.getApplicationContext() : null;
        this.d = context;
        this.e = object2;
        this.g = object4;
        this.i = object2 = dr_1.g;
        if (object != null && (n3 = gz3.G(object)) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        this.f = n3;
        if (n3 == 0 && object != null && (n3 = gz3.a) >= (n4 = 32)) {
            object2 = (AudioManager)object.getSystemService("audio");
            if (object2 != null) {
                object2 = An0.a((AudioManager)object2);
                object3 = new zn0$f((Spatializer)object2);
            }
            this.h = object3;
        }
        object2 = this.g;
        n3 = (int)(((zn0$d)object2).N ? 1 : 0);
        if (n3 != 0 && object == null) {
            object = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
            Cx.f((String)object);
        }
    }

    public static int h(int n3, int n4) {
        n3 = n3 != 0 && n3 == n4 ? -1 >>> 1 : Integer.bitCount(n3 & n4);
        return n3;
    }

    public static void i(sp3 sp32, Fp3 fp3, HashMap hashMap) {
        int n3;
        for (int i3 = 0; i3 < (n3 = sp32.a); ++i3) {
            Object object = sp32.a(i3);
            Object object2 = fp3.A;
            if ((object = (Ep3)((ImmutableMap)object2).get(object)) == null) continue;
            object2 = ((Ep3)object).a;
            int n4 = ((qp3)object2).c;
            Object object3 = n4;
            if ((object3 = (Ep3)hashMap.get(object3)) != null && ((n4 = (int)(((AbstractCollection)(object3 = ((Ep3)object3).b)).isEmpty() ? 1 : 0)) == 0 || (n4 = (int)(((AbstractCollection)(object3 = ((Ep3)object).b)).isEmpty() ? 1 : 0)) != 0)) continue;
            int n7 = ((qp3)object2).c;
            object2 = n7;
            hashMap.put(object2, object);
        }
    }

    public static int j(d object, String string2, boolean bl2) {
        String string3;
        int n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        if (n3 == 0 && (n3 = string2.equals(string3 = ((d)object).d)) != 0) {
            return 4;
        }
        string2 = zn0.l(string2);
        object = zn0.l(((d)object).d);
        n3 = 0;
        string3 = null;
        if (object != null && string2 != null) {
            boolean bl3;
            boolean bl4 = ((String)object).startsWith(string2);
            if (!bl4 && !(bl3 = string2.startsWith((String)object))) {
                int n4 = gz3.a;
                String string4 = "-";
                int n7 = 2;
                boolean bl5 = ((String)(object = ((String)object).split(string4, n7)[0])).equals(string2 = string2.split(string4, n7)[0]);
                if (bl5) {
                    return n7;
                }
                return 0;
            }
            return 3;
        }
        if (bl2 && object == null) {
            n3 = 1;
        }
        return n3;
    }

    public static String l(String string2) {
        String string3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2 || (bl2 = TextUtils.equals((CharSequence)string2, (CharSequence)(string3 = "und")))) {
            string2 = null;
        }
        return string2;
    }

    public static Pair n(int n3, cH1$a cH1$a, int[][][] nArray, zn0$h$a zn0$h$a, Comparator comparator) {
        Object object;
        int n7;
        int n8;
        Object object2 = cH1$a;
        Object object3 = new ArrayList();
        Object object4 = null;
        for (n8 = 0; n8 < (n7 = ((cH1$a)object2).a); ++n8) {
            Object object5 = ((cH1$a)object2).b;
            n7 = object5[n8];
            if (n3 == n7) {
                int n10;
                object5 = ((cH1$a)object2).c[n8];
                for (int i3 = 0; i3 < (n10 = object5.a); ++i3) {
                    qp3 qp32 = object5.a(i3);
                    Object object6 = nArray[n8][i3];
                    object6 = zn0$h$a.a(n8, qp32, (int[])object6);
                    n10 = qp32.a;
                    boolean[] blArray = new boolean[n10];
                    for (int i8 = 0; i8 < n10; ++i8) {
                        ArrayList<Object> arrayList = (zn0$h)object6.get(i8);
                        int n14 = ((zn0$h)((Object)arrayList)).a();
                        int n15 = blArray[i8];
                        if (n15 == 0 && n14 != 0) {
                            n15 = 1;
                            if (n14 == n15) {
                                arrayList = ImmutableList.of(arrayList);
                            } else {
                                ArrayList<Object> arrayList2 = new ArrayList<Object>();
                                arrayList2.add(arrayList);
                                for (int i10 = i8 + 1; i10 < n10; ++i10) {
                                    int n4;
                                    Object e2 = object6.get(i10);
                                    object = e2;
                                    object = (zn0$h)e2;
                                    n15 = ((zn0$h)object).a();
                                    if (n15 == (n4 = 2) && (n4 = (int)(((zn0$h)((Object)arrayList)).b((zn0$h)object) ? 1 : 0)) != 0) {
                                        arrayList2.add(object);
                                        blArray[i10] = n4 = 1;
                                    } else {
                                        n4 = 1;
                                    }
                                    object2 = cH1$a;
                                    n15 = 1;
                                }
                                arrayList = arrayList2;
                            }
                            ((ArrayList)object3).add(arrayList);
                        }
                        object2 = cH1$a;
                    }
                    object2 = cH1$a;
                }
            }
            object2 = cH1$a;
        }
        boolean bl2 = ((ArrayList)object3).isEmpty();
        if (bl2) {
            return null;
        }
        object2 = comparator;
        object2 = (List)Collections.max(object3, comparator);
        int n4 = object2.size();
        object3 = new int[n4];
        object = null;
        for (int i3 = 0; i3 < (n8 = object2.size()); ++i3) {
            object4 = (zn0$h)object2.get(i3);
            n8 = ((zn0$h)object4).c;
            object3[i3] = n8;
        }
        object2 = (zn0$h)object2.get(0);
        object4 = ((zn0$h)object2).b;
        object = new DF0$a((qp3)object4, (int[])object3);
        object2 = ((zn0$h)object2).a;
        return Pair.create((Object)object, (Object)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Fp3 a() {
        Object object = this.c;
        synchronized (object) {
            return this.g;
        }
    }

    public final o$a b() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Object object = this.c;
        synchronized (object) {
            try {
                Handler handler;
                Hn0 hn0;
                zn0$f zn0$f;
                int n3 = gz3.a;
                int n4 = 32;
                if (n3 >= n4 && (zn0$f = this.h) != null && (hn0 = zn0$f.d) != null && (handler = zn0$f.c) != null) {
                    handler = zn0$f.a;
                    Dn0.a((Spatializer)handler, hn0);
                    hn0 = zn0$f.c;
                    handler = null;
                    hn0.removeCallbacksAndMessages(null);
                    zn0$f.c = null;
                    zn0$f.d = null;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl14 : MonitorExitStatement: MONITOREXIT : var1_1
                super.d();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void f(dr_1 dr_12) {
        Object object = this.c;
        // MONITORENTER : object
        dr_1 dr_13 = this.i;
        boolean bl2 = dr_13.equals(dr_12) ^ true;
        this.i = dr_12;
        // MONITOREXIT : object
        if (!bl2) return;
        this.k();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(Fp3 fp3) {
        zn0$d zn0$d;
        Object object;
        boolean bl2 = fp3 instanceof zn0$d;
        if (bl2) {
            object = fp3;
            object = (zn0$d)fp3;
            this.o((zn0$d)object);
        }
        Object object2 = this.c;
        synchronized (object2) {
            zn0$d = this.g;
        }
        object = new zn0$d$a(zn0$d);
        ((Fp3$b)object).c(fp3);
        fp3 = new zn0$d((zn0$d$a)object);
        this.o((zn0$d)fp3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void k() {
        int n3;
        Object object;
        block5: {
            Object object2;
            block4: {
                int n4;
                object = this.c;
                // MONITORENTER : object
                object2 = this.g;
                n3 = ((zn0$d)object2).N;
                if (n3 == 0 || (n3 = this.f) != 0 || (n3 = gz3.a) < (n4 = 32) || (object2 = this.h) == null || (n3 = (int)(((zn0$f)object2).b ? 1 : 0)) == 0) break block4;
                n3 = 1;
                break block5;
            }
            n3 = 0;
            object2 = null;
        }
        // MONITOREXIT : object
        if (n3 == 0) return;
        object = this.a;
        if (object == null) return;
        object = ((g)object).i;
        n3 = 10;
        object.k(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void m() {
        Object object = this.c;
        // MONITORENTER : object
        zn0$d zn0$d = this.g;
        int n3 = zn0$d.R;
        // MONITOREXIT : object
        if (n3 == 0) return;
        object = this.a;
        if (object == null) return;
        object = ((g)object).i;
        n3 = 26;
        object.k(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void o(zn0$d object) {
        object.getClass();
        Object object2 = this.c;
        // MONITORENTER : object2
        zn0$d zn0$d = this.g;
        boolean bl2 = zn0$d.equals(object) ^ true;
        this.g = object;
        // MONITOREXIT : object2
        if (!bl2) return;
        boolean bl3 = ((zn0$d)object).N;
        if (bl3 && (object = this.d) == null) {
            object = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
            Cx.f((String)object);
        }
        if ((object = this.a) == null) return;
        object = ((g)object).i;
        int n3 = 10;
        object.k(n3);
    }
}

