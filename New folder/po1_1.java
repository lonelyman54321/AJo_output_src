/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 *  android.widget.EditText
 */
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.h$a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/*
 * Renamed from PO1
 */
public final class po1_1
implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final HashMap e;
    public final LinkedHashSet a;
    public final Handler b;
    public final WeakReference c;
    public final AtomicBoolean d;

    static {
        HashMap hashMap;
        e = hashMap = new HashMap();
    }

    public po1_1(Activity object) {
        Object object2;
        this.a = object2 = new LinkedHashSet();
        Looper looper = Looper.getMainLooper();
        this.b = object2 = new Handler(looper);
        super(object);
        this.c = object2;
        super(false);
        this.d = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(View object) {
        Throwable throwable3;
        block9: {
            no1_1 no1_12;
            block8: {
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                try {
                    no1_12 = new no1_1((View)object, this);
                    boolean bl3 = td0.b(this);
                    if (!bl3) break block8;
                    return;
                }
                catch (Throwable throwable2) {
                    td0.a(this, throwable2);
                    return;
                }
            }
            try {
                object = Thread.currentThread();
                Object object2 = Looper.getMainLooper();
                object2 = object2.getThread();
                if (object == object2) {
                    no1_12.run();
                    return;
                }
            }
            catch (Throwable throwable3) {
                break block9;
            }
            object = this.b;
            object.post((Runnable)no1_12);
            return;
        }
        td0.a(this, throwable3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(View var1_1) {
        var2_3 = td0.b(this);
        if (var2_3) {
            return;
        }
        var3_4 = "null cannot be cast to non-null type android.widget.EditText";
        Intrinsics.checkNotNull(var1_1, (String)var3_4);
        var3_4 = var1_1;
        var3_4 = (EditText)var1_1;
        var3_4 = var3_4.getText();
        var3_4 = var3_4.toString();
        var3_4 = StringsKt.m0(var3_4);
        var3_4 = var3_4.toString();
        var3_4 = var3_4.toLowerCase();
        var4_5 = "this as java.lang.String).toLowerCase()";
        Intrinsics.checkNotNullExpressionValue(var3_4, (String)var4_5);
        var5_6 = var3_4.length();
        if (var5_6 == 0) {
            return;
        }
        var4_5 = this.a;
        var6_7 = var4_5.contains(var3_4);
        if (var6_7 != 0) return;
        var6_7 = var3_4.length();
        if (var6_7 > (var7_8 = 100)) {
            return;
        }
        var4_5.add(var3_4);
        var4_5 = new HashMap<K, V>();
        var8_9 = go1_2.b(var1_1);
        var9_10 = ko1_1.d;
        var10_11 = ko1_1.a();
        var9_10 = new HashSet(var10_11);
        var9_10 = var9_10.iterator();
        var10_11 = null;
        var11_12 = null;
        while (var12_13 = var9_10.hasNext()) {
            var13_14 = var9_10.next();
            var15_16 = "r2";
            var14_15 = (var13_14 = (ko1_1)var13_14).c();
            var16_17 = Intrinsics.areEqual(var15_16, var14_15);
            if (var16_17) {
                var15_16 = "[^\\d.]";
                var14_15 = new Regex((String)var15_16);
                var15_16 = "";
                var14_15 = var14_15.replace(var3_4, (String)var15_16);
            } else {
                var14_15 = var3_4;
            }
            var17_18 = td0.b(var13_14);
            var18_19 = var13_14.b;
            if (var17_18 != 0) {
                var17_18 = 0;
                var15_16 = null;
            } else {
                var15_16 = var18_19;
            }
            var17_18 = var15_16.length();
            if (var17_18 <= 0) ** GOTO lbl76
            var17_18 = (int)td0.b(var13_14);
            if (var17_18 != 0) {
                var18_19 = null;
            }
            var15_16 = go1_2.class;
            var19_21 = td0.b(var15_16);
            var20_22 = false;
            if (var19_21) ** GOTO lbl75
            var21_23 = "text";
        }
        ** GOTO lbl86
        {
            try {
                Intrinsics.checkNotNullParameter(var14_15, (String)var21_23);
                var21_23 = "rule";
                Intrinsics.checkNotNullParameter(var18_19, (String)var21_23);
                var21_23 = new Regex(var18_19);
                var20_22 = var21_23.c((CharSequence)var14_15);
                ** GOTO lbl75
            }
            catch (Throwable var18_20) {
                try {
                    td0.a(var15_16, var18_20);
lbl75:
                    // 3 sources

                    if (!var20_22) continue;
lbl76:
                    // 2 sources

                    if ((var17_18 = (int)go1_2.d(var8_9, (ArrayList)(var15_16 = var13_14.b()))) != 0) {
                        var13_14 = var13_14.c();
                        po1$a_0.a((String)var13_14, (String)var14_15, var4_5);
                        continue;
                    }
                    if (var11_12 == null) {
                        var11_12 = go1_2.a(var1_1);
                    }
                    if ((var17_18 = (int)go1_2.d(var11_12, (ArrayList)(var15_16 = var13_14.b()))) == 0) continue;
                    var13_14 = var13_14.c();
                    po1$a_0.a((String)var13_14, (String)var14_15, var4_5);
                    continue;
lbl86:
                    // 1 sources

                    h$a.a(var4_5);
                    return;
                }
                catch (Throwable var1_2) {}
                break;
            }
        }
        td0.a(this, var1_2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onGlobalFocusChanged(View view, View view2) {
        Throwable throwable2;
        block4: {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return;
            }
            if (view != null) {
                try {
                    this.a(view);
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            if (view2 == null) return;
            this.a(view2);
            return;
        }
        td0.a(this, throwable2);
    }
}

