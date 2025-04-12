/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.Window$Callback
 */
package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.core.app.ComponentActivity$a;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.o;
import androidx.lifecycle.w$b;
import kotlin.jvm.internal.Intrinsics;

public class ComponentActivity
extends Activity
implements mu1_1,
zn1$a_0 {
    private final a53 extraDataMap;
    private final o lifecycleRegistry;

    public ComponentActivity() {
        Object object = new a53(0);
        this.extraDataMap = object;
        this.lifecycleRegistry = object = new o(this);
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    /*
     * Unable to fully structure code
     */
    private final boolean shouldSkipDump(String[] var1_1) {
        block16: {
            var2_2 = false;
            if (var1_1 == null || (var3_3 = ((String[])var1_1).length) == 0) break block16;
            var1_1 = var1_1[0];
            var3_3 = var1_1.hashCode();
            switch (var3_3) {
                default: {
                    break block16;
                }
                case 1455016274: {
                    var4_4 = "--autofill";
                    var5_9 = var1_1.equals(var4_4);
                    if (var5_9 != 0) {
                        var5_9 = Build.VERSION.SDK_INT;
                        var3_3 = 26;
                        if (var5_9 >= var3_3) {
                            var2_2 = true;
                        }
                        return var2_2;
                    }
                    break block16;
                }
                case 1159329357: {
                    var4_5 = "--contentcapture";
                    var5_10 = var1_1.equals(var4_5);
                    if (var5_10 != 0) {
                        var5_10 = Build.VERSION.SDK_INT;
                        var3_3 = 29;
                        if (var5_10 >= var3_3) {
                            var2_2 = true;
                        }
                        return var2_2;
                    }
                    break block16;
                }
                case 472614934: {
                    var4_6 = "--list-dumpables";
                    var5_11 = var1_1.equals(var4_6);
                    if (var5_11 != 0) ** GOTO lbl37
                    break block16;
                }
                case 100470631: {
                    var4_7 = "--dump-dumpable";
                    var5_11 = var1_1.equals(var4_7);
                    if (var5_11 == 0) break block16;
lbl37:
                    // 2 sources

                    if ((var5_11 = Build.VERSION.SDK_INT) >= (var3_3 = 33)) {
                        var2_2 = true;
                    }
                    return var2_2;
                }
                case -645125871: 
            }
            var4_8 = "--translation";
            var5_12 = var1_1.equals(var4_8);
            if (var5_12 != 0 && (var5_12 = Build.VERSION.SDK_INT) >= (var3_3 = 31)) {
                var2_2 = true;
            }
        }
        return var2_2;
    }

    public void G0() {
        this.onBackPressed();
    }

    public void N() {
        this.onBackPressed();
    }

    public void Y0() {
        this.onBackPressed();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        View view = this.getWindow().getDecorView();
        String string2 = "window.decorView";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        boolean bl2 = zn1_0.a(view, keyEvent);
        boolean bl3 = bl2 ? true : zn1_0.b(this, view, (Window.Callback)this, keyEvent);
        return bl3;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        View view = this.getWindow().getDecorView();
        String string2 = "window.decorView";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        boolean bl2 = zn1_0.a(view, keyEvent);
        boolean bl3 = bl2 ? true : super.dispatchKeyShortcutEvent(keyEvent);
        return bl3;
    }

    public ComponentActivity$a getExtraData(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "extraDataClass");
        return (ComponentActivity$a)this.extraDataMap.get(clazz);
    }

    public i getLifecycle() {
        return this.lifecycleRegistry;
    }

    public void l() {
        this.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w$b.b(this);
    }

    public void onNavigationClick() {
        this.onBackPressed();
    }

    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        o o3 = this.lifecycleRegistry;
        i$b i$b = i$b.CREATED;
        o3.h(i$b);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(ComponentActivity$a componentActivity$a) {
        Intrinsics.checkNotNullParameter(componentActivity$a, "extraData");
        a53 a532 = this.extraDataMap;
        Class<?> clazz = componentActivity$a.getClass();
        a532.put(clazz, componentActivity$a);
    }

    public final boolean shouldDumpInternalState(String[] stringArray) {
        return this.shouldSkipDump(stringArray) ^ true;
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}

