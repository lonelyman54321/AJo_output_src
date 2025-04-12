/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.Xml
 *  android.view.View
 *  android.view.View$OnClickListener
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayout$e;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.a$b;
import androidx.constraintlayout.widget.R$styleable;
import org.xmlpull.v1.XmlPullParser;

public final class a$b$a
implements View.OnClickListener {
    public final a$b a;
    public final int b;
    public final int c;

    public a$b$a(Context context, a$b a$b, XmlResourceParser object) {
        int n3;
        this.b = -1;
        this.c = n3 = 17;
        this.a = a$b;
        a$b = Xml.asAttributeSet((XmlPullParser)object);
        object = R$styleable.OnClick;
        context = context.obtainStyledAttributes((AttributeSet)a$b, (int[])object);
        int n4 = context.getIndexCount();
        object = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            n3 = context.getIndex(i3);
            if (n3 == (n7 = R$styleable.OnClick_targetId)) {
                n7 = this.b;
                this.b = n3 = context.getResourceId(n3, n7);
                continue;
            }
            n7 = R$styleable.OnClick_clickAction;
            if (n3 != n7) continue;
            n7 = this.c;
            this.c = n3 = context.getInt(n3, n7);
        }
        context.recycle();
    }

    public final void a(MotionLayout motionLayout, int n3, a$b a$b) {
        int n4 = this.b;
        int n7 = -1;
        if (n4 != n7) {
            motionLayout = motionLayout.findViewById(n4);
        }
        if (motionLayout == null) {
            return;
        }
        n4 = a$b.d;
        int n8 = a$b.c;
        if (n4 == n7) {
            motionLayout.setOnClickListener(this);
            return;
        }
        n7 = this.c;
        int n10 = n7 & 1;
        int n14 = 1;
        int n15 = n10 != 0 && n3 == n4 ? 1 : 0;
        int n16 = n7 & 0x100;
        n16 = n16 != 0 && n3 == n4 ? 1 : 0;
        n4 = n10 != 0 && n3 == n4 ? 1 : 0;
        n4 |= (n15 |= n16);
        n10 = n7 & 0x10;
        n10 = n10 != 0 && n3 == n8 ? 1 : 0;
        n4 |= n10;
        if ((n7 &= 0x1000) == 0 || n3 != n8) {
            n14 = 0;
        }
        n3 = n4 | n14;
        if (n3 != 0) {
            motionLayout.setOnClickListener(this);
        }
    }

    public final void onClick(View object) {
        block24: {
            int n3;
            int n4;
            int n7;
            boolean bl2;
            int n8;
            int n10;
            int n14;
            MotionLayout motionLayout;
            Object object2;
            block23: {
                int n15;
                int n16;
                object = this.a;
                object2 = object.j;
                motionLayout = ((a)object2).a;
                n14 = motionLayout.j;
                if (n14 == 0) {
                    return;
                }
                n14 = object.d;
                n10 = -1;
                if (n14 == n10) {
                    int n17;
                    int n18 = motionLayout.getCurrentState();
                    if (n18 == n10) {
                        int n19 = object.c;
                        n18 = (int)(motionLayout.isAttachedToWindow() ? 1 : 0);
                        if (n18 == 0) {
                            object2 = motionLayout.u0;
                            if (object2 == null) {
                                motionLayout.u0 = object2 = new MotionLayout$e(motionLayout);
                            }
                            object2 = motionLayout.u0;
                            ((MotionLayout$e)object2).d = n19;
                        } else {
                            motionLayout.t(n19);
                        }
                        return;
                    }
                    a a2 = object.j;
                    a$b a$b = new a$b(a2, (a$b)object);
                    a$b.d = n18;
                    a$b.c = n17 = object.c;
                    motionLayout.setTransition(a$b);
                    motionLayout.s();
                    return;
                }
                object2 = ((a)object2).c;
                n14 = this.c;
                n8 = n14 & 1;
                bl2 = true;
                n7 = 0;
                n16 = n8 == 0 && (n16 = n14 & 0x100) == 0 ? 0 : 1;
                n4 = n14 & 0x10;
                if (n4 == 0 && (n15 = n14 & 0x1000) == 0) {
                    bl2 = false;
                }
                if (n16 != 0 && bl2) {
                    int n20;
                    if (object2 != object) {
                        motionLayout.setTransition((a$b)object);
                    }
                    if ((n15 = motionLayout.getCurrentState()) != (n20 = motionLayout.getEndState())) {
                        float f5 = motionLayout.getProgress();
                        n20 = 0x3F000000;
                        float f6 = 0.5f;
                        float f7 = f5 - f6;
                        n15 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                        if (n15 <= 0) {
                            n7 = n16;
                            bl2 = false;
                        }
                    }
                } else {
                    n7 = n16;
                }
                if (object == object2) break block23;
                n3 = object.c;
                n16 = object.d;
                if (!(n16 == n10 ? (n10 = motionLayout.f) != n3 : (n10 = motionLayout.f) == n16 || n10 == n3)) break block24;
            }
            if (n7 != 0 && n8 != 0) {
                motionLayout.setTransition((a$b)object);
                motionLayout.s();
            } else {
                n3 = 0;
                object2 = null;
                if (bl2 && n4 != 0) {
                    motionLayout.setTransition((a$b)object);
                    motionLayout.f(0.0f);
                } else if (n7 != 0 && (n10 = n14 & 0x100) != 0) {
                    motionLayout.setTransition((a$b)object);
                    int n21 = 1065353216;
                    float f8 = 1.0f;
                    motionLayout.setProgress(f8);
                } else if (bl2 && (n14 &= 0x1000) != 0) {
                    motionLayout.setTransition((a$b)object);
                    motionLayout.setProgress(0.0f);
                }
            }
        }
    }
}

