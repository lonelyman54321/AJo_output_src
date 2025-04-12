/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  org.json.JSONObject
 */
package com.facebook.appevents.suggestedevents;

import android.view.View;
import com.facebook.appevents.suggestedevents.b$a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class b
implements View.OnClickListener {
    public static final HashSet e;
    public final View.OnClickListener a;
    public final WeakReference b;
    public final WeakReference c;
    public final String d;

    static {
        HashSet hashSet;
        e = hashSet = new HashSet();
    }

    public b(View object, View object2, String string2) {
        Object object3;
        this.a = object3 = xc3_0.f(object);
        super(object2);
        this.b = object3;
        super(object);
        this.c = object2;
        object = string2.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).toLowerCase()");
        object = kotlin.text.b.n((String)object, "activity", "", false);
        this.d = object;
    }

    /*
     * Loose catch block
     */
    public final void a() {
        Throwable throwable2222222222;
        block25: {
            block22: {
                String string2;
                String string3;
                Object object;
                Object object2;
                boolean bl2;
                block24: {
                    block23: {
                        bl2 = td0.b(this);
                        if (bl2) {
                            return;
                        }
                        object2 = this.b;
                        {
                            catch (Throwable throwable2222222222) {}
                        }
                        object2 = ((Reference)object2).get();
                        object2 = (View)object2;
                        object = this.c;
                        object = ((Reference)object).get();
                        object = (View)object;
                        if (object2 == null || object == null) break block22;
                        string3 = dg3_2.d((View)object);
                        string2 = ox2_1.b((View)object, string3);
                        if (string2 != null) break block23;
                        return;
                    }
                    boolean bl3 = b$a.a(string2, string3);
                    if (!bl3) break block24;
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                Object object3 = "view";
                object2 = dg3_2.b((View)object2, (View)object);
                jSONObject.put((String)object3, object2);
                object2 = "screenname";
                object = this.d;
                jSONObject.put((String)object2, object);
                bl2 = td0.b(this);
                if (bl2) break block22;
                int n3 = 1;
                object3 = object2;
                try {
                    object2 = new Um0(n3, jSONObject, string3, this, string2);
                    lz3_0.L((Runnable)object2);
                }
                catch (Throwable throwable3) {
                    try {
                        td0.a(this, throwable3);
                    }
                    catch (Exception exception) {}
                    break block25;
                }
            }
            return;
        }
        td0.a(this, throwable2222222222);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View view) {
        Throwable throwable3;
        block8: {
            block7: {
                String string2;
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                try {
                    bl2 = td0.b(this);
                    if (bl2) {
                        return;
                    }
                    string2 = "view";
                }
                catch (Throwable throwable2) {
                    td0.a(this, throwable2);
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(view, string2);
                    string2 = this.a;
                    if (string2 == null) break block7;
                    string2.onClick(view);
                }
                catch (Throwable throwable3) {
                    break block8;
                }
            }
            this.a();
            return;
        }
        td0.a(this, throwable3);
    }
}

