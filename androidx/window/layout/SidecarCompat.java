/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.os.IBinder
 *  android.view.View$OnAttachStateChangeListener
 *  androidx.window.sidecar.SidecarDeviceState
 *  androidx.window.sidecar.SidecarInterface
 *  androidx.window.sidecar.SidecarInterface$SidecarCallback
 *  androidx.window.sidecar.SidecarWindowLayoutInfo
 */
package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import androidx.window.layout.SidecarCompat$DistinctSidecarElementCallback;
import androidx.window.layout.SidecarCompat$TranslatingCallback;
import androidx.window.layout.SidecarCompat$a;
import androidx.window.layout.SidecarCompat$b;
import androidx.window.layout.SidecarCompat$c;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarCompat
implements JH0 {
    public final SidecarInterface a;
    public final v43 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public SidecarCompat$b e;

    public SidecarCompat(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = SidecarCompat$a.b(object);
        v43 v432 = new v43(0);
        Intrinsics.checkNotNullParameter(v432, "sidecarAdapter");
        this.a = object;
        this.b = v432;
        this.c = object;
        super();
        this.d = object;
    }

    public static final /* synthetic */ SidecarCompat$b c(SidecarCompat sidecarCompat) {
        return sidecarCompat.e;
    }

    public static final /* synthetic */ v43 d(SidecarCompat sidecarCompat) {
        return sidecarCompat.b;
    }

    public static final /* synthetic */ LinkedHashMap e(SidecarCompat sidecarCompat) {
        return sidecarCompat.c;
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object object = SidecarCompat$a.a(activity);
        if (object != null) {
            this.h((IBinder)object, activity);
        } else {
            object = new SidecarCompat$c(this, activity);
            activity = activity.getWindow().getDecorView();
            activity.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void b(Activity object) {
        void var5_8;
        Intrinsics.checkNotNullParameter(object, "activity");
        IBinder iBinder = SidecarCompat$a.a((Activity)object);
        if (iBinder == null) {
            return;
        }
        Object object2 = this.a;
        if (object2 != null) {
            object2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        object2 = this.d;
        ComponentCallbacks componentCallbacks = (ComponentCallbacks)((LinkedHashMap)object2).get(object);
        object.unregisterComponentCallbacks(componentCallbacks);
        object2.remove(object);
        object = this.c;
        boolean bl2 = object.size();
        boolean bl3 = true;
        if (bl2 == bl3) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            object2 = null;
        }
        object.remove(iBinder);
        if (var5_8 != false && (object = this.a) != null) {
            object.onDeviceStateListenersChanged(bl3);
        }
    }

    public final SidecarInterface f() {
        return this.a;
    }

    public final gH3 g(Activity object) {
        Object object2 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = SidecarCompat$a.a(object);
        if (object == null) {
            object2 = xx_2.f();
            object = new gH3((List)object2);
            return object;
        }
        object2 = this.a;
        SidecarDeviceState sidecarDeviceState = null;
        object = object2 == null ? null : object2.getWindowLayoutInfo((IBinder)object);
        object2 = this.a;
        if (object2 != null) {
            sidecarDeviceState = object2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.b.e((SidecarWindowLayoutInfo)object, sidecarDeviceState);
    }

    public final void h(IBinder object, Activity activity) {
        Intrinsics.checkNotNullParameter(object, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object object2 = this.c;
        object2.put(object, activity);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded((IBinder)object);
        }
        int n3 = object2.size();
        int n4 = 1;
        if (n3 == n4 && (object = this.a) != null) {
            n4 = 0;
            object2 = null;
            object.onDeviceStateListenersChanged(false);
        }
        if ((object = this.e) != null) {
            object2 = this.g(activity);
            ((SidecarCompat$b)object).a(activity, (gH3)object2);
        }
        object = this.d;
        object2 = ((LinkedHashMap)object).get(activity);
        if (object2 == null) {
            object2 = new A43(this, activity);
            object.put(activity, object2);
            activity.registerComponentCallbacks((ComponentCallbacks)object2);
        }
    }

    public final void i(B43$a b43$a) {
        Intrinsics.checkNotNullParameter(b43$a, "extensionCallback");
        Object object = new SidecarCompat$b(b43$a);
        this.e = object;
        b43$a = this.a;
        if (b43$a != null) {
            SidecarCompat$TranslatingCallback sidecarCompat$TranslatingCallback = new SidecarCompat$TranslatingCallback(this);
            sidecarCompat$TranslatingCallback = sidecarCompat$TranslatingCallback;
            v43 v432 = this.b;
            object = new SidecarCompat$DistinctSidecarElementCallback(v432, sidecarCompat$TranslatingCallback);
            object = (SidecarInterface.SidecarCallback)object;
            b43$a.setSidecarCallback((SidecarInterface.SidecarCallback)object);
        }
    }

    /*
     * Exception decompiling
     */
    public final boolean j() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

