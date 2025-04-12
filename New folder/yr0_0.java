/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
import android.os.CountDownTimer;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.model.DodFirebaseData;
import com.ril.ajio.launch.config.configlisteners.DodCacheBurstConfigListener$checkForCacheBurst$dodListType$1;
import com.ril.ajio.services.network.OkHttpClientProvider;
import java.io.File;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from Yr0
 */
public final class yr0_0
implements jn_0 {
    public static final Yr0$a Companion;
    public static CountDownTimer b;
    public static CountDownTimer c;
    public jo_2 a;

    static {
        Yr0$a yr0$a;
        Companion = yr0$a = new Object();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(boolean bl2, long l2, long l3) {
        Exception exception2;
        block7: {
            Object object;
            String string2 = "IST";
            if (bl2) {
                Ref$LongRef ref$LongRef;
                long l4;
                try {
                    object = c;
                    if (object != null) {
                        return;
                    }
                    object = TimeZone.getTimeZone(string2);
                    object = Calendar.getInstance((TimeZone)object);
                    l4 = object.getTimeInMillis();
                    ref$LongRef = new Ref$LongRef();
                    l4 = l2 - l4;
                }
                catch (Exception exception2) {
                    break block7;
                }
                ref$LongRef.element = l4;
                object = new as0_2(ref$LongRef, l2, l3);
                c = object = object.start();
                return;
            }
            object = b;
            if (object != null) {
                return;
            }
            object = TimeZone.getTimeZone(string2);
            object = Calendar.getInstance((TimeZone)object);
            long l7 = object.getTimeInMillis();
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            l7 = l3 - l7;
            {
                ref$LongRef.element = l7;
                object = new zr0_0(ref$LongRef, l2, l3);
                b = object = object.start();
                return;
            }
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        long l2;
        long l3;
        Object object;
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("dod_start_end_time");
        Object object3 = new DodCacheBurstConfigListener$checkForCacheBurst$dodListType$1();
        object3 = ((TypeToken)object3).getType();
        try {
            object = new Gson();
            object2 = ((Gson)object).fromJson((String)object2, (Type)object3);
            object2 = (List)object2;
        }
        catch (Exception exception) {
            object3 = yn3_0.a;
            ((yn3$a)object3).e(exception);
            boolean bl2 = false;
            object2 = null;
        }
        object3 = this;
        object = this.a;
        String string2 = "DOD_START_TIME_FLAG";
        long l4 = 0L;
        long l7 = ((sw_0)object).getPreference(string2, l4);
        String string3 = "DOD_END_TIME_FLAG";
        long l8 = ((sw_0)object).getPreference(string3, l4);
        long l12 = k7.p();
        if (object2 == null) return;
        Object object4 = object2;
        object4 = (Collection)object2;
        int n3 = object4.isEmpty();
        int n4 = 1;
        if ((n3 ^= n4) == 0) return;
        long l14 = 1L;
        n3 = 1200000;
        long l15 = Long.MAX_VALUE;
        double d2 = 0.0 / 0.0;
        Object object5 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
        if (object5 == false && (l3 = l8 == l4 ? 0 : (l8 < l4 ? -1 : 1)) == false) {
            long l16;
            long l17;
            long l18;
            long l19;
            boolean bl3;
            object2 = object2.iterator();
            l7 = l4;
            l8 = l15;
            long l20 = l15;
            while (bl3 = object2.hasNext()) {
                long l21;
                Object object6 = (DodFirebaseData)object2.next();
                long l22 = l7 + l14;
                Long l23 = ((DodFirebaseData)object6).getStartTime();
                Intrinsics.checkNotNull(l23);
                long l24 = l23;
                Object object7 = l22 == l24 ? 0 : (l22 < l24 ? -1 : 1);
                if (object7 <= 0 && (l21 = l24 == l12 ? 0 : (l24 < l12 ? -1 : 1)) < 0) {
                    Long l25 = ((DodFirebaseData)object6).getStartTime();
                    Intrinsics.checkNotNull(l25);
                    l4 = l25;
                    Long l26 = ((DodFirebaseData)object6).getEndTime();
                    Intrinsics.checkNotNull(l26);
                    l7 = l26;
                    long l27 = l4;
                    l4 = l7;
                    l7 = l27;
                }
                l22 = l12 + l14;
                l23 = ((DodFirebaseData)object6).getStartTime();
                Intrinsics.checkNotNull(l23);
                l24 = l23;
                long l28 = l22 - l24;
                object7 = l28 == 0L ? 0 : (l28 < 0L ? -1 : 1);
                if (object7 > 0 || (l21 = l24 == l8 ? 0 : (l24 < l8 ? -1 : 1)) >= 0) continue;
                Long l29 = ((DodFirebaseData)object6).getStartTime();
                Intrinsics.checkNotNull(l29);
                l8 = l29;
                object6 = ((DodFirebaseData)object6).getEndTime();
                Intrinsics.checkNotNull(object6);
                l20 = (Long)object6;
            }
            Object object8 = l4 == l12 ? 0 : (l4 < l12 ? -1 : 1);
            if (object8 > 0) {
                OkHttpClientProvider okHttpClientProvider = OkHttpClientProvider.Companion.getInstance();
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                File file = aJIOApplication.getCacheDir();
                okHttpClientProvider.burstCache(file);
                ((sw_0)object).putPreference(string2, l7);
                ((sw_0)object).putPreference(string3, l4);
            }
            if ((l19 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1)) > 0 && (l18 = (l17 = l8 - (l16 = (long)n3 + l12)) == 0L ? 0 : (l17 < 0L ? -1 : 1)) < 0) {
                l19 = 1;
                yr0_0.b((boolean)l19, l8, l20);
            }
            if (object8 <= 0) return;
            l16 = n3;
            long l30 = l4 - (l12 += l16);
            Object object9 = l30 == 0L ? 0 : (l30 < 0L ? -1 : 1);
            if (object9 >= 0) return;
            boolean bl4 = false;
            object2 = null;
            yr0_0.b(false, l7, l4);
            return;
        }
        if (object5 == false) return;
        Object object10 = l8 == l4 ? 0 : (l8 < l4 ? -1 : 1);
        if (object10 == false) return;
        Object object11 = l12 == l8 ? 0 : (l12 < l8 ? -1 : 1);
        if (object11 > 0) {
            boolean bl5;
            boolean bl6;
            object2 = object2.iterator();
            long l31 = l4;
            l7 = l15;
            l8 = l15;
            while (bl6 = object2.hasNext()) {
                DodFirebaseData dodFirebaseData = (DodFirebaseData)object2.next();
                long l34 = l4 + l14;
                Long l35 = dodFirebaseData.getStartTime();
                Intrinsics.checkNotNull(l35);
                long l36 = l35;
                Object object12 = l34 == l36 ? 0 : (l34 < l36 ? -1 : 1);
                if (object12 <= 0 && (object12 = l36 == l12 ? 0 : (l36 < l12 ? -1 : 1)) < 0) {
                    Long l37 = dodFirebaseData.getStartTime();
                    Intrinsics.checkNotNull(l37);
                    l4 = l37;
                    object4 = dodFirebaseData.getEndTime();
                    Intrinsics.checkNotNull(object4);
                    l31 = (Long)object4;
                }
                l34 = l12 + l14;
                l35 = dodFirebaseData.getStartTime();
                Intrinsics.checkNotNull(l35);
                l36 = l35;
                long l38 = l34 - l36;
                object12 = l38 == 0L ? 0 : (l38 < 0L ? -1 : 1);
                if (object12 > 0 || (object12 = l36 == l7 ? 0 : (l36 < l7 ? -1 : 1)) >= 0) continue;
                Long l39 = dodFirebaseData.getStartTime();
                Intrinsics.checkNotNull(l39);
                l7 = l39;
                Long l41 = dodFirebaseData.getEndTime();
                Intrinsics.checkNotNull(l41);
                l8 = l41;
            }
            object2 = OkHttpClientProvider.Companion.getInstance();
            AJIOApplication.Companion.getClass();
            File file = AJIOApplication$a.a().getCacheDir();
            ((OkHttpClientProvider)object2).burstCache(file);
            long l42 = l31 == l12 ? 0 : (l31 < l12 ? -1 : 1);
            if (l42 > 0) {
                ((sw_0)object).putPreference(string2, l4);
                ((sw_0)object).putPreference(string3, l31);
                l15 = l4;
            } else {
                l15 = l4;
                l4 = 0L;
                ((sw_0)object).putPreference(string2, l4);
                ((sw_0)object).putPreference(string3, l4);
            }
            long l43 = l7 == l12 ? 0 : (l7 < l12 ? -1 : 1);
            if (l43 > 0) {
                l43 = 1200000;
                long l44 = (long)l43 + l12;
                long l45 = l7 - l44;
                Object object13 = l45 == 0L ? 0 : (l45 < 0L ? -1 : 1);
                if (object13 < 0) {
                    bl5 = true;
                    yr0_0.b(bl5, l7, l8);
                }
            } else {
                l43 = 1200000;
            }
            if (l42 <= 0) return;
            long l46 = l43;
            long l47 = l31 - (l12 += l46);
            Object object14 = l47 == 0L ? 0 : (l47 < 0L ? -1 : 1);
            if (object14 >= 0) return;
            l4 = l15;
            bl5 = false;
            string2 = null;
            yr0_0.b(false, l15, l31);
            return;
        }
        int n7 = 1200000;
        boolean bl7 = false;
        string2 = null;
        Object object15 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
        if (object15 > 0 && (n7 = (int)((l2 = l8 - (l4 = (long)n7 + l12)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) < 0) {
            yr0_0.b(false, l7, l8);
        }
        object2 = object2.iterator();
        long l48 = l15;
        l4 = l15;
        while (true) {
            long l49;
            boolean bl8;
            if (!(bl8 = object2.hasNext())) {
                Object object16 = l48 == l12 ? 0 : (l48 < l12 ? -1 : 1);
                if (object16 <= 0) return;
                l7 = 1200000;
                long l50 = l48 - (l12 += l7);
                Object object17 = l50 == 0L ? 0 : (l50 < 0L ? -1 : 1);
                if (object17 >= 0) return;
                boolean bl9 = true;
                yr0_0.b(bl9, l48, l4);
                return;
            }
            DodFirebaseData dodFirebaseData = (DodFirebaseData)object2.next();
            long l51 = l12 + l14;
            Long l52 = dodFirebaseData.getStartTime();
            Intrinsics.checkNotNull(l52);
            l8 = l52;
            long l54 = l51 - l8;
            n3 = (int)(l54 == 0L ? 0 : (l54 < 0L ? -1 : 1));
            if (n3 > 0 || (l49 = l8 == l48 ? 0 : (l8 < l48 ? -1 : 1)) >= 0) continue;
            object = dodFirebaseData.getStartTime();
            Intrinsics.checkNotNull(object);
            l48 = (Long)object;
            Long l55 = dodFirebaseData.getEndTime();
            Intrinsics.checkNotNull(l55);
            l4 = l55;
        }
    }
}

