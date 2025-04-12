/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.A$a;
import androidx.recyclerview.widget.A$b;

public final class A {
    public final A$b a;
    public final A$a b;

    public A(A$b object) {
        this.a = object;
        object = new Object();
        ((A$a)object).a = 0;
        this.b = object;
    }

    public final View a(int n3, int n4, int n7, int n8) {
        A$b a$b = this.a;
        int n10 = a$b.b();
        int n14 = a$b.c();
        int n15 = n4 > n3 ? 1 : -1;
        View view = null;
        while (n3 != n4) {
            View view2 = a$b.getChildAt(n3);
            int n16 = a$b.a(view2);
            int n17 = a$b.d(view2);
            A$a a$a = this.b;
            a$a.b = n10;
            a$a.c = n14;
            a$a.d = n16;
            a$a.e = n17;
            if (n7 != 0) {
                a$a.a = n7;
                n16 = (int)(a$a.a() ? 1 : 0);
                if (n16 != 0) {
                    return view2;
                }
            }
            if (n8 != 0) {
                a$a.a = n8;
                n16 = (int)(a$a.a() ? 1 : 0);
                if (n16 != 0) {
                    view = view2;
                }
            }
            n3 += n15;
        }
        return view;
    }

    public final boolean b(View view) {
        Object object = this.a;
        int n3 = object.b();
        int n4 = object.c();
        int n7 = object.a(view);
        int n8 = object.d(view);
        object = this.b;
        ((A$a)object).b = n3;
        ((A$a)object).c = n4;
        ((A$a)object).d = n7;
        ((A$a)object).e = n8;
        ((A$a)object).a = 24579;
        return ((A$a)object).a();
    }
}

