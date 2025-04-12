/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.util.LongSparseArray
 *  android.view.autofill.AutofillId
 *  android.view.translation.TranslationRequestValue
 *  android.view.translation.TranslationResponseValue
 *  android.view.translation.ViewTranslationRequest$Builder
 *  android.view.translation.ViewTranslationResponse
 */
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Pg$b {
    public static final Pg$b a;

    static {
        Pg$b pg$b;
        a = pg$b = new Object();
    }

    public static void a(pg_1 pg_12, LongSparseArray longSparseArray) {
        boolean bl2;
        qb1_1 qb1_12 = new qb1_1(longSparseArray);
        while (bl2 = qb1_12.hasNext()) {
            Object object;
            int n3;
            Qi1 qi1;
            Object object2;
            long l2 = qb1_12.nextLong();
            Object object3 = Vg.a(longSparseArray.get(l2));
            if (object3 == null || (object3 = Wg.a((ViewTranslationResponse)object3)) == null || (object3 = Xg.a((TranslationResponseValue)object3)) == null || (object2 = (KY2)(qi1 = pg_12.c()).c(n3 = (int)l2)) == null || (object2 = ((KY2)object2).a) == null || (object2 = (H1)AY2.a(((GY2)object2).d, (TY2)(object = yY2.j))) == null || (object2 = (Function1)((H1)object2).b) == null) continue;
            object3 = object3.toString();
            int n4 = 6;
            object = new Sl(n4, (String)object3, null);
            object2 = (Boolean)object2.invoke(object);
        }
    }

    public final void b(pg_1 pg_12, long[] lArray, int[] nArray, Consumer consumer) {
        for (long l2 : lArray) {
            String string2;
            int n3;
            Object object = pg_12.c();
            Object object2 = (KY2)((Qi1)object).c(n3 = (int)l2);
            if (object2 == null || (object2 = ((KY2)object2).a) == null) continue;
            Zg.a();
            AutofillId autofillId = qg_0.a(pg_12.a);
            int n4 = ((GY2)object2).g;
            long l3 = n4;
            autofillId = Yg.a(autofillId, l3);
            object = MY2.v;
            object2 = (List)AY2.a(((GY2)object2).d, (TY2)object);
            if (object2 == null || (object2 = jv1_0.a((List)object2, string2 = "\n", null, n4 = 62)) == null) continue;
            int n7 = 6;
            object = new Sl(n7, (String)object2, null);
            object2 = Rg.a((Sl)object);
            Sg.b((ViewTranslationRequest.Builder)autofillId, (TranslationRequestValue)object2);
            object2 = Tg.a((ViewTranslationRequest.Builder)autofillId);
            Ug.a(consumer, object2);
        }
    }

    public final void c(pg_1 pg_12, LongSparseArray longSparseArray) {
        Runnable runnable2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 < n4) {
            return;
        }
        Object object = Looper.getMainLooper().getThread();
        n3 = Intrinsics.areEqual(object, runnable2 = Thread.currentThread()) ? 1 : 0;
        if (n3 != 0) {
            Pg$b.a(pg_12, longSparseArray);
        } else {
            object = pg_12.a;
            runnable2 = new ah(pg_12, longSparseArray);
            object.post(runnable2);
        }
    }
}

