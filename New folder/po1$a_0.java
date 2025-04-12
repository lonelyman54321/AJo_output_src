/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 */
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from PO1$a
 */
public final class po1$a_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(String var0, String var1_1, HashMap var2_2) {
        block10: {
            var3_3 /* !! */  = po1_1.e;
            var4_4 = var0.hashCode();
            var5_5 = null;
            switch (var4_4) {
                default: {
                    break block10;
                }
                case 3588: {
                    var3_3 /* !! */  = "r6";
                    var4_4 = (int)var0.equals(var3_3 /* !! */ );
                    if (var4_4 != 0 && (var6_6 = StringsKt.F((CharSequence)var1_1, (CharSequence)(var3_3 /* !! */  = "-"), false))) {
                        var1_1 = fT1.a((String)var3_3 /* !! */ , (String)var1_1);
                        var3_3 /* !! */  = new String[]{};
                        var1_1 = var1_1.toArray(var3_3 /* !! */ )[0];
                    }
                    break block10;
                }
                case 3587: {
                    var3_3 /* !! */  = "r5";
                    var4_4 = (int)var0.equals(var3_3 /* !! */ );
                    if (var4_4 != 0) ** GOTO lbl24
                    break block10;
                }
                case 3586: {
                    var3_3 /* !! */  = "r4";
                    var4_4 = (int)var0.equals(var3_3 /* !! */ );
                    if (var4_4 == 0) break block10;
lbl24:
                    // 2 sources

                    var3_3 /* !! */  = "[^a-z]+";
                    var5_5 = "";
                    var1_1 = oo1_1.a((String)var3_3 /* !! */ , (String)var1_1, var5_5);
                    break block10;
                }
                case 3585: 
            }
            var3_3 /* !! */  = "r3";
            var4_4 = (int)var0.equals(var3_3 /* !! */ );
            if (var4_4 != 0) {
                var3_3 /* !! */  = "m";
                var6_7 = b.s((String)var1_1, (String)var3_3 /* !! */ , false);
                var1_1 = !(var6_7 || (var6_7 = b.s((String)var1_1, var7_8 = "b", false)) || (var8_9 = b.s((String)var1_1, var7_8 = "ge", false))) ? "f" : var3_3 /* !! */ ;
            }
        }
        var2_2.put(var0, var1_1);
    }

    /*
     * WARNING - void declaration
     */
    public static void b(Activity object) {
        block18: {
            void var6_21;
            Object object2 = "activity";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            int n3 = object.hashCode();
            Class<po1_1> clazz = po1_1.class;
            boolean bl2 = td0.b(clazz);
            HashMap hashMap = null;
            if (!bl2) {
                try {
                    hashMap = po1_1.e;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
            object2 = n3;
            Object v4 = hashMap.get(object2);
            if (v4 == null) {
                po1_1 po1_12 = new po1_1((Activity)object);
                hashMap.put(object2, po1_12);
            }
            po1_1 po1_13 = (po1_1)var6_21;
            boolean bl3 = td0.b(clazz);
            if (!bl3) {
                bl3 = td0.b(po1_13);
                if (bl3) break block18;
                AtomicBoolean atomicBoolean = po1_13.d;
                boolean bl4 = true;
                bl3 = atomicBoolean.getAndSet(bl4);
                if (bl3) break block18;
                WeakReference weakReference = po1_13.c;
                Object t3 = weakReference.get();
                Activity activity = (Activity)t3;
                View view = tn_0.b(activity);
                if (view == null) break block18;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                boolean bl5 = viewTreeObserver.isAlive();
                if (!bl5) break block18;
                try {
                    viewTreeObserver.addOnGlobalFocusChangeListener((ViewTreeObserver.OnGlobalFocusChangeListener)po1_13);
                }
                catch (Throwable throwable) {
                    try {
                        td0.a(po1_13, throwable);
                    }
                    catch (Throwable throwable2) {
                        td0.a(clazz, throwable2);
                    }
                }
            }
        }
    }
}

