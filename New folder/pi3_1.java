/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Typeface
 */
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import androidx.work.R$bool;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pI3
 */
public final class pi3_1
implements et2_0,
TW0,
W83 {
    public static Typeface d(String string2, tv0_0 tv0_02, int n3) {
        tv0_0 tv0_03 = null;
        int n4 = nV0.a(n3, 0);
        if (n4 != 0 && (n4 = Intrinsics.areEqual(tv0_02, tv0_03 = tv0_0.m)) != 0 && (string2 == null || (n4 = string2.length()) == 0)) {
            return Typeface.DEFAULT;
        }
        int n7 = Fh.a(tv0_02, n3);
        string2 = string2 != null && (n3 = string2.length()) != 0 ? Typeface.create((String)string2, (int)n7) : Typeface.defaultFromStyle((int)n7);
        return string2;
    }

    public static final ni3_1 e(Context context, a a2) {
        WorkDatabase workDatabase = null;
        int n3 = 1;
        Object object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        String string2 = "configuration";
        Intrinsics.checkNotNullParameter(a2, string2);
        Object object2 = a2.c;
        Object object3 = new qi3_1((Executor)object2);
        object2 = context.getApplicationContext();
        String string3 = "context.applicationContext";
        Intrinsics.checkNotNullExpressionValue(object2, string3);
        Object object4 = object3.a;
        Intrinsics.checkNotNullExpressionValue(object4, "workTaskExecutor.serialTaskExecutor");
        Object object5 = context.getResources();
        int n4 = R$bool.workmanager_test_configuration;
        boolean bl2 = object5.getBoolean(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object);
        Intrinsics.checkNotNullParameter(object4, "queryExecutor");
        Object object6 = a2.d;
        Intrinsics.checkNotNullParameter(object6, "clock");
        Object object7 = WorkDatabase.class;
        if (bl2) {
            Intrinsics.checkNotNullParameter(object2, (String)object);
            Intrinsics.checkNotNullParameter(object7, "klass");
            object5 = new FP2$a((Context)object2, (Class)object7, null);
            ((FP2$a)object5).j = n3;
        } else {
            object5 = EP2.a((Context)object2, object7, "androidx.work.workdb");
            object7 = new iu1_1(object2);
            ((FP2$a)object5).i = object7;
        }
        Intrinsics.checkNotNullParameter(object4, "executor");
        ((FP2$a)object5).g = object4;
        object4 = new bV((TV)object6);
        Intrinsics.checkNotNullParameter(object4, "callback");
        ((FP2$a)object5).d.add(object4);
        object4 = new XO1[n3];
        object7 = cp1_1.a;
        object4[0] = object7;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new lk2_0((Context)object2, 2, 3);
        object7 = new XO1[n3];
        object7[0] = object4;
        ((FP2$a)object5).a((XO1)object7);
        object4 = new XO1[n3];
        object4[0] = object7 = dp1_0.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new XO1[n3];
        object4[0] = object7 = ep1_0.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new lk2_0((Context)object2, 5, 6);
        object7 = new XO1[n3];
        object7[0] = object4;
        ((FP2$a)object5).a((XO1)object7);
        object4 = new XO1[n3];
        object4[0] = object7 = fp1_1.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new XO1[n3];
        object4[0] = object7 = gp1_0.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new XO1[n3];
        object4[0] = object7 = hp1_0.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new ri3_0((Context)object2);
        object7 = new XO1[n3];
        object7[0] = object4;
        ((FP2$a)object5).a((XO1)object7);
        object4 = new lk2_0((Context)object2, 10, 11);
        object7 = new XO1[n3];
        object7[0] = object4;
        ((FP2$a)object5).a((XO1)object7);
        object4 = new XO1[n3];
        object4[0] = object7 = yo1_1.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new XO1[n3];
        object4[0] = object7 = zo1_1.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new XO1[n3];
        object4[0] = object7 = ap1_1.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new XO1[n3];
        object4[0] = object7 = bp1_2.a;
        ((FP2$a)object5).a((XO1)object4);
        object4 = new lk2_0((Context)object2, 21, 22);
        Object object8 = new XO1[n3];
        object8[0] = object4;
        ((FP2$a)object5).a((XO1)object8);
        ((FP2$a)object5).c();
        workDatabase = (WorkDatabase)((FP2$a)object5).b();
        object2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object2, string3);
        object8 = new aq3((Context)object2, (Si3)object3);
        object2 = context.getApplicationContext();
        kz2_0 kz2_02 = new kz2_0((Context)object2, a2, (Si3)object3, workDatabase);
        object2 = oi3_1.a;
        Intrinsics.checkNotNullParameter(context, (String)object);
        Intrinsics.checkNotNullParameter(a2, string2);
        Intrinsics.checkNotNullParameter(object3, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(object8, "trackers");
        Intrinsics.checkNotNullParameter(kz2_02, "processor");
        Intrinsics.checkNotNullParameter(object2, "schedulersCreator");
        string3 = context;
        object5 = a2;
        object4 = object3;
        object7 = workDatabase;
        object6 = object8;
        object = ((oi3_1)object2).invoke(context, a2, object3, workDatabase, object8, kz2_02);
        object6 = object;
        object6 = (List)object;
        string3 = context.getApplicationContext();
        object2 = object;
        object3 = object8;
        object = new ni3_1((Context)string3, a2, (Si3)object4, workDatabase, (List)object6, kz2_02, (aq3)object8);
        return object;
    }

    public Typeface a(tv0_0 tv0_02, int n3) {
        return pi3_1.d(null, tv0_02, n3);
    }

    public void b(Activity activity) {
    }

    public Typeface c(gz0_1 object, tv0_0 tv0_02, int n3) {
        int n4;
        String string2;
        String string3 = ((gz0_1)object).f;
        int n7 = tv0_02.a / 100;
        int n8 = 2;
        if (n7 >= 0 && n7 < n8) {
            string2 = "-thin";
            string3 = Ft2.a(string3, string2);
        } else {
            n4 = 4;
            if (n8 <= n7 && n7 < n4) {
                string2 = "-light";
                string3 = Ft2.a(string3, string2);
            } else if (n7 != n4) {
                n8 = 5;
                if (n7 == n8) {
                    string2 = "-medium";
                    string3 = Ft2.a(string3, string2);
                } else {
                    n8 = 6;
                    n4 = 8;
                    if ((n8 > n7 || n7 >= n4) && n4 <= n7 && n7 < (n8 = 11)) {
                        string2 = "-black";
                        string3 = Ft2.a(string3, string2);
                    }
                }
            }
        }
        n7 = string3.length();
        n8 = 0;
        Object object2 = null;
        if (n7 != 0) {
            string3 = pi3_1.d(string3, tv0_02, n3);
            string2 = Typeface.DEFAULT;
            n4 = Fh.a(tv0_02, n3);
            n7 = (int)(Intrinsics.areEqual(string3, string2 = Typeface.create((Typeface)string2, (int)n4)) ? 1 : 0);
            if (n7 == 0 && (n7 = (int)(Intrinsics.areEqual(string3, string2 = pi3_1.d(null, tv0_02, n3)) ? 1 : 0)) == 0) {
                object2 = string3;
            }
        }
        if (object2 == null) {
            object = ((gz0_1)object).f;
            object2 = pi3_1.d((String)object, tv0_02, n3);
        }
        return object2;
    }
}

