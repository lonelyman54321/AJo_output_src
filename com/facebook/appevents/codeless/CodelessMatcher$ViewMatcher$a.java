/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.facebook.appevents.codeless;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.codeless.CodelessMatcher$b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class CodelessMatcher$ViewMatcher$a {
    public static ArrayList a(View object, List object2, int n3, int n4, String string2) {
        int n7;
        int n8;
        Object object3;
        Serializable serializable;
        block13: {
            Object object4;
            int n10;
            block19: {
                block14: {
                    String string3;
                    block18: {
                        String string4;
                        String string5;
                        block17: {
                            block16: {
                                int n14;
                                block15: {
                                    block12: {
                                        Intrinsics.checkNotNullParameter(object2, "path");
                                        Intrinsics.checkNotNullParameter(string2, "mapKey");
                                        serializable = new StringBuilder();
                                        ((StringBuilder)serializable).append(string2);
                                        char c2 = '.';
                                        ((StringBuilder)serializable).append(c2);
                                        ((StringBuilder)serializable).append(n4);
                                        string2 = ((StringBuilder)serializable).toString();
                                        serializable = new ArrayList();
                                        if (object == null) {
                                            return serializable;
                                        }
                                        int n15 = object2.size();
                                        n10 = 1;
                                        if (n3 < n15) break block12;
                                        object4 = new CodelessMatcher$b((View)object, string2);
                                        ((ArrayList)serializable).add(object4);
                                        break block13;
                                    }
                                    object3 = (kn2)object2.get(n3);
                                    Object object5 = ((kn2)object3).a;
                                    string3 = "..";
                                    n8 = Intrinsics.areEqual(object5, string3);
                                    if (n8 != 0) {
                                        n4 = (object = object.getParent()) instanceof ViewGroup;
                                        if (n4 != 0) {
                                            object = CodelessMatcher$ViewMatcher$a.b((ViewGroup)object);
                                            n4 = ((ArrayList)object).size();
                                            for (n7 = 0; n7 < n4; ++n7) {
                                                object3 = (View)((ArrayList)object).get(n7);
                                                n8 = n3 + 1;
                                                object3 = CodelessMatcher$ViewMatcher$a.a((View)object3, (List)object2, n8, n7, string2);
                                                ((ArrayList)serializable).addAll(object3);
                                            }
                                        }
                                        return serializable;
                                    }
                                    object5 = ((kn2)object3).a;
                                    string3 = ".";
                                    int n16 = Intrinsics.areEqual(object5, string3);
                                    if (n16 != 0) {
                                        object2 = new CodelessMatcher$b((View)object, string2);
                                        ((ArrayList)serializable).add(object2);
                                        return serializable;
                                    }
                                    int n17 = ((kn2)object3).b;
                                    n16 = -1;
                                    if (n17 != n16 && n4 != n17) break block14;
                                    object4 = object.getClass().getCanonicalName();
                                    n4 = (int)(Intrinsics.areEqual(object4, object5) ? 1 : 0);
                                    if (n4 != 0) break block15;
                                    string5 = ".*android\\..*";
                                    object4 = new Regex(string5);
                                    n4 = (int)(((Regex)object4).c((CharSequence)object5) ? 1 : 0);
                                    if (n4 == 0) break block14;
                                    object4 = new String[]{string3};
                                    n14 = 6;
                                    object5 = object4 = StringsKt.a0((CharSequence)object5, (String[])object4, false, 0, n14);
                                    object5 = (Collection)object4;
                                    n8 = object5.isEmpty() ^ n10;
                                    if (n8 == 0) break block14;
                                    object4 = (String)on_2.d(n10, (List)object4);
                                    object5 = object.getClass().getSimpleName();
                                    n4 = (int)(Intrinsics.areEqual(object5, object4) ? 1 : 0);
                                    if (n4 == 0) break block14;
                                }
                                object4 = kn2$a.ID;
                                n4 = ((kn2$a)((Object)object4)).getValue();
                                n8 = ((kn2)object3).h;
                                if ((n4 &= n8) > 0 && (n14 = ((kn2)object3).c) != (n4 = object.getId())) break block14;
                                object4 = kn2$a.TEXT;
                                n4 = ((kn2$a)((Object)object4)).getValue() & n8;
                                if (n4 <= 0) break block16;
                                object4 = xc3_0.j((View)object);
                                string3 = lz3_0.f(lz3_0.O((String)object4));
                                string5 = ((kn2)object3).d;
                                n4 = (int)(Intrinsics.areEqual(string5, object4) ? 1 : 0);
                                if (n4 == 0 && (n4 = (int)(Intrinsics.areEqual(string5, string3) ? 1 : 0)) == 0) break block14;
                            }
                            object4 = kn2$a.DESCRIPTION;
                            n4 = ((kn2$a)((Object)object4)).getValue() & n8;
                            string3 = "";
                            if (n4 <= 0) break block17;
                            object4 = object.getContentDescription();
                            object4 = object4 == null ? string3 : ((Object)object.getContentDescription()).toString();
                            string5 = lz3_0.f(lz3_0.O((String)object4));
                            string4 = ((kn2)object3).f;
                            n4 = (int)(Intrinsics.areEqual(string4, object4) ? 1 : 0);
                            if (n4 == 0 && (n4 = (int)(Intrinsics.areEqual(string4, string5) ? 1 : 0)) == 0) break block14;
                        }
                        if ((n4 = ((kn2$a)((Object)(object4 = kn2$a.HINT))).getValue() & n8) <= 0) break block18;
                        object4 = xc3_0.h((View)object);
                        string5 = lz3_0.f(lz3_0.O((String)object4));
                        string4 = ((kn2)object3).g;
                        n4 = (int)(Intrinsics.areEqual(string4, object4) ? 1 : 0);
                        if (n4 == 0 && (n4 = (int)(Intrinsics.areEqual(string4, string5) ? 1 : 0)) == 0) break block14;
                    }
                    if ((n4 = ((kn2$a)((Object)(object4 = kn2$a.TAG))).getValue() & n8) <= 0) break block19;
                    object4 = object.getTag();
                    if (object4 != null) {
                        object4 = object.getTag();
                        string3 = object4.toString();
                    }
                    object4 = lz3_0.f(lz3_0.O(string3));
                    object3 = ((kn2)object3).e;
                    n8 = (int)(Intrinsics.areEqual(object3, string3) ? 1 : 0);
                    if (n8 != 0 || (n4 = (int)(Intrinsics.areEqual(object3, object4) ? 1 : 0)) != 0) break block19;
                }
                return serializable;
            }
            if (n3 == (n4 = object2.size() - n10)) {
                object4 = new CodelessMatcher$b((View)object, string2);
                ((ArrayList)serializable).add(object4);
            }
        }
        n4 = object instanceof ViewGroup;
        if (n4 != 0) {
            object = CodelessMatcher$ViewMatcher$a.b((ViewGroup)object);
            n4 = ((ArrayList)object).size();
            while (n7 < n4) {
                object3 = (View)((ArrayList)object).get(n7);
                n8 = n3 + 1;
                object3 = CodelessMatcher$ViewMatcher$a.a((View)object3, (List)object2, n8, n7, string2);
                ((ArrayList)serializable).addAll(object3);
                ++n7;
            }
        }
        return serializable;
    }

    public static ArrayList b(ViewGroup viewGroup) {
        ArrayList<View> arrayList = new ArrayList<View>();
        int n3 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = viewGroup.getChildAt(i3);
            int n4 = view.getVisibility();
            if (n4 != 0) continue;
            String string2 = "child";
            Intrinsics.checkNotNullExpressionValue(view, string2);
            arrayList.add(view);
        }
        return arrayList;
    }
}

