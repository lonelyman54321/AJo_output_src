/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 */
package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.CodelessMatcher$ViewMatcher;
import com.facebook.appevents.codeless.CodelessMatcher$a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class CodelessMatcher {
    public static final CodelessMatcher$a f;
    public static CodelessMatcher g;
    public final Handler a;
    public final Set b;
    public final LinkedHashSet c;
    public HashSet d;
    public final HashMap e;

    static {
        CodelessMatcher$a codelessMatcher$a;
        f = codelessMatcher$a = new Object();
    }

    public CodelessMatcher() {
        Object object;
        Looper looper = Looper.getMainLooper();
        this.a = object = new Handler(looper);
        object = Collections.newSetFromMap(object);
        Intrinsics.checkNotNullExpressionValue(object, "newSetFromMap(WeakHashMap())");
        this.b = object;
        super();
        this.c = object;
        super();
        this.d = object;
        super();
        this.e = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Activity object) {
        Throwable throwable3;
        block13: {
            Object object2;
            block10: {
                Throwable throwable22;
                block12: {
                    Object object3;
                    block11: {
                        boolean bl2 = td0.b(this);
                        if (bl2) {
                            return;
                        }
                        object2 = "activity";
                        try {
                            Intrinsics.checkNotNullParameter(object, (String)object2);
                            object2 = Thread.currentThread();
                            object3 = Looper.getMainLooper();
                            object3 = object3.getThread();
                            if (object2 != object3) break block10;
                            object2 = this.b;
                            object2.add(object);
                            object2 = this.d;
                            ((HashSet)object2).clear();
                            object2 = this.e;
                            int n3 = object.hashCode();
                            object = n3;
                            object = ((HashMap)object2).get(object);
                            object = (HashSet)object;
                            if (object != null) {
                                this.d = object;
                            }
                            if ((n3 = (int)(td0.b(this) ? 1 : 0)) == 0) break block11;
                            return;
                        }
                        catch (Throwable throwable3) {}
                    }
                    try {
                        object = Thread.currentThread();
                        object2 = Looper.getMainLooper();
                        object2 = object2.getThread();
                        if (object == object2) {
                            this.b();
                            return;
                        }
                    }
                    catch (Throwable throwable22) {
                        break block12;
                    }
                    object = this.a;
                    object3 = null;
                    object2 = new tw_0(this, 0);
                    object.post((Runnable)object2);
                    return;
                }
                td0.a(this, throwable22);
                return;
                break block13;
            }
            object2 = "Can't add activity to CodelessMatcher on non-UI thread";
            object = new FacebookException((String)object2);
            throw object;
        }
        td0.a(this, throwable3);
    }

    public final void b() {
        Throwable throwable2;
        block18: {
            block17: {
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                Object object = this.b;
                try {
                    object = object.iterator();
                }
                catch (Throwable throwable2) {
                    break block18;
                }
                while (true) {
                    boolean bl3 = object.hasNext();
                    if (!bl3) break block17;
                    break;
                }
                {
                    Object object2 = object.next();
                    if ((object2 = (Activity)object2) == null) continue;
                    View view = tn_0.b(object2);
                    object2 = object2.getClass();
                    object2 = ((Class)object2).getSimpleName();
                    Handler handler = this.a;
                    HashSet hashSet = this.d;
                    String string2 = "activityName";
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    CodelessMatcher$ViewMatcher codelessMatcher$ViewMatcher = new CodelessMatcher$ViewMatcher(view, handler, hashSet, (String)object2);
                    object2 = this.c;
                    object2.add(codelessMatcher$ViewMatcher);
                    continue;
                }
            }
            return;
        }
        td0.a(this, throwable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Activity object) {
        Throwable throwable2;
        block5: {
            Object object2;
            block4: {
                Object object3;
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                object2 = "activity";
                try {
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object2 = Thread.currentThread();
                    object3 = Looper.getMainLooper();
                    object3 = object3.getThread();
                    if (object2 != object3) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = this.b;
                object2.remove(object);
                object2 = this.c;
                object2.clear();
                object2 = this.e;
                int n3 = object.hashCode();
                object = n3;
                object3 = this.d;
                object3 = ((HashSet)object3).clone();
                String string2 = "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }";
                Intrinsics.checkNotNull(object3, string2);
                object3 = (HashSet)object3;
                ((HashMap)object2).put(object, object3);
                object = this.d;
                ((HashSet)object).clear();
                return;
            }
            object2 = "Can't remove activity from CodelessMatcher on non-UI thread";
            object = new FacebookException((String)object2);
            throw object;
        }
        td0.a(this, throwable2);
    }
}

