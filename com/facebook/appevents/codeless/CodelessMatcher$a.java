/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.codeless.CodelessMatcher$ViewMatcher$a;
import com.facebook.appevents.codeless.CodelessMatcher$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CodelessMatcher$a {
    public static Bundle b(CB0 iterator, View view, View view2) {
        Intrinsics.checkNotNullParameter(view, "rootView");
        Intrinsics.checkNotNullParameter(view2, "hostView");
        Bundle bundle = new Bundle();
        if (iterator == null) {
            return bundle;
        }
        iterator = Collections.unmodifiableList(((CB0)((Object)iterator)).c);
        Iterator iterator2 = "unmodifiableList(parameters)";
        Intrinsics.checkNotNullExpressionValue(iterator, (String)((Object)iterator2));
        if (iterator != null) {
            boolean bl2;
            iterator = iterator.iterator();
            block0: while (bl2 = iterator.hasNext()) {
                String string2;
                int n3;
                iterator2 = (cm2_1)iterator.next();
                Object object = ((cm2_1)((Object)iterator2)).b;
                String string3 = ((cm2_1)((Object)iterator2)).a;
                if (object != null && (n3 = ((String)object).length()) > 0) {
                    iterator2 = ((cm2_1)((Object)iterator2)).b;
                    bundle.putString(string3, (String)((Object)iterator2));
                    continue;
                }
                object = ((cm2_1)((Object)iterator2)).c;
                int n4 = ((ArrayList)object).size();
                if (n4 <= 0) continue;
                String string4 = "relative";
                iterator2 = ((cm2_1)((Object)iterator2)).d;
                bl2 = Intrinsics.areEqual(iterator2, string4);
                n4 = -1;
                if (bl2) {
                    iterator2 = view2.getClass().getSimpleName();
                    string2 = "hostView.javaClass.simpleName";
                    Intrinsics.checkNotNullExpressionValue(iterator2, string2);
                    iterator2 = CodelessMatcher$ViewMatcher$a.a(view2, (List)object, 0, n4, (String)((Object)iterator2));
                } else {
                    iterator2 = view.getClass().getSimpleName();
                    string2 = "rootView.javaClass.simpleName";
                    Intrinsics.checkNotNullExpressionValue(iterator2, string2);
                    iterator2 = CodelessMatcher$ViewMatcher$a.a(view, (List)object, 0, n4, (String)((Object)iterator2));
                }
                iterator2 = iterator2.iterator();
                while ((n3 = (int)(iterator2.hasNext() ? 1 : 0)) != 0) {
                    object = (CodelessMatcher$b)iterator2.next();
                    string4 = ((CodelessMatcher$b)object).a();
                    if (string4 == null || (n4 = ((String)(object = xc3_0.j(((CodelessMatcher$b)object).a()))).length()) <= 0) continue;
                    bundle.putString(string3, (String)object);
                    continue block0;
                }
            }
        }
        return bundle;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final CodelessMatcher a() {
        synchronized (this) {
            Throwable throwable3;
            block13: {
                CodelessMatcher codelessMatcher;
                boolean bl2;
                Object object;
                block14: {
                    block12: {
                        object = CodelessMatcher.class;
                        bl2 = td0.b(object);
                        codelessMatcher = null;
                        if (!bl2) {
                            try {
                                object = CodelessMatcher.g;
                                break block12;
                            }
                            catch (Throwable throwable2) {
                                td0.a(object, throwable2);
                            }
                        }
                        object = null;
                    }
                    if (object != null) break block14;
                    object = new CodelessMatcher();
                    Class<CodelessMatcher> clazz = CodelessMatcher.class;
                    boolean bl3 = td0.b(clazz);
                    if (bl3) break block14;
                    {
                        catch (Throwable throwable3) {
                            break block13;
                        }
                    }
                    try {
                        CodelessMatcher.g = object;
                    }
                    catch (Throwable throwable4) {
                        td0.a(clazz, throwable4);
                    }
                }
                if (!(bl2 = td0.b(object = CodelessMatcher.class))) {
                    try {
                        codelessMatcher = CodelessMatcher.g;
                    }
                    catch (Throwable throwable5) {
                        td0.a(object, throwable5);
                    }
                }
                object = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher";
                Intrinsics.checkNotNull(codelessMatcher, (String)object);
                return codelessMatcher;
            }
            throw throwable3;
        }
    }
}

