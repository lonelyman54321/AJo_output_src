/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.webkit.URLUtil
 *  android.widget.ImageView
 */
import android.graphics.Bitmap;
import android.webkit.URLUtil;
import android.widget.ImageView;
import io.reactivex.Scheduler;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;

/*
 * Renamed from AA
 */
public final class aa_1 {
    public static final aa_1 a;
    public static final pn1_1 b;
    public static final Map c;
    public static t30_0 d;
    public static x72_0 e;

    static {
        Object object = new aa_1();
        a = object;
        b = object = new pn1_1();
        object = new WeakHashMap();
        c = Collections.synchronizedMap(object);
        d = object = new t30_0();
    }

    public static final void a(aa_1 object, Bitmap object2, String object3) {
        object.getClass();
        object = yn3_0.a;
        Object object4 = kp1_0.c("initiating bottom tab image disk save with url : ", (String)object3);
        Object object5 = new Object[]{};
        ((yn3$a)object).a((String)object4, object5);
        object = d;
        object4 = new ra_2((String)object3, (Bitmap)object2);
        object2 = new o53_0((Callable)object4);
        object3 = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object3);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = new Object();
        object4 = new ta_2(object3);
        object3 = new Object();
        object5 = new va_2((Function1)object3);
        object2 = ((g53_0)object2).f((o60_0)object4, (o60_0)object5);
        ((t30_0)object).b((yr0_2)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static x72_0 b() {
        Object object;
        block6: {
            object = e;
            if (object == null) {
                object = aa_1.class;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        Object object2;
                        block4: {
                            try {
                                object2 = e;
                                if (object2 != null) break block4;
                                object2 = new x72$a();
                                Object object3 = TimeUnit.SECONDS;
                                long l2 = 30;
                                ((x72$a)object2).c(l2, (TimeUnit)((Object)object3));
                                ((x72$a)object2).b(l2, (TimeUnit)((Object)object3));
                                ((x72$a)object2).e(l2, (TimeUnit)((Object)object3));
                                object3 = new Object();
                                ((x72$a)object2).a((nj1_2)object3);
                                object3 = new x72_0((x72$a)object2);
                                e = object3;
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        object2 = Unit.a;
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        object = e;
        Intrinsics.checkNotNull(object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(kd1_1 kd1_12) {
        Exception exception2;
        Object object;
        block3: {
            String string2;
            Object object2;
            object = "initiating bottom tab image download with url : ";
            try {
                object2 = yn3_0.a;
                string2 = kd1_12.a;
                Object[] objectArray = new StringBuilder((String)object);
                objectArray.append(string2);
                object = objectArray.toString();
                objectArray = null;
                objectArray = new Object[]{};
                ((yn3$a)object2).a((String)object, objectArray);
                boolean bl2 = URLUtil.isNetworkUrl((String)string2);
                if (bl2 && (bl2 = aa_1.d(kd1_12))) {
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object = aa_1.b();
            object2 = new KJ2$a();
            ((KJ2$a)object2).h(string2);
            object2 = ((KJ2$a)object2).b();
            object = ((x72_0)object).b((kj2_2)object2);
            object2 = new AA$a(kd1_12);
            ((RealCall)object).c((wj_2)object2);
            return;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(exception2);
    }

    public static boolean d(kd1_1 object) {
        boolean bl2;
        Object object2 = c;
        ImageView imageView = ((kd1_1)object).b;
        if ((object2 = (String)object2.get(imageView)) != null && (bl2 = Intrinsics.areEqual(object2, object = ((kd1_1)object).a))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

