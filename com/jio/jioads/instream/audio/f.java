/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.CountDownTimer
 *  android.text.TextUtils
 *  android.view.View$OnClickListener
 */
package com.jio.jioads.instream.audio;

import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.instream.audio.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class f
extends CountDownTimer {
    public final /* synthetic */ j a;

    public f(j j3, long l2, long l3) {
        this.a = j3;
        super(l2, l3);
    }

    public final void onFinish() {
        Object object;
        Drawable drawable2 = this.a;
        Object object2 = drawable2.b.k0();
        if (object2 != (object = JioAdView$AdState.DESTROYED)) {
            Drawable drawable3;
            int n3;
            boolean bl2;
            object2 = drawable2.l;
            int n4 = 0;
            object = null;
            if (object2 != null) {
                object2 = object2.getContentDescription();
            } else {
                bl2 = false;
                object2 = null;
            }
            Drawable drawable4 = null;
            if (object2 != null) {
                object2 = drawable2.l;
                if (object2 != null) {
                    object2.setVisibility(0);
                }
                ((V)drawable2.a).p();
                object2 = drawable2.l;
                if (object2 != null) {
                    object = object2.getContentDescription();
                }
                if ((n4 = TextUtils.isEmpty((CharSequence)(object2 = String.valueOf(object)))) == 0 && (object = drawable2.l) != null) {
                    object.setText((CharSequence)object2);
                }
            }
            bl2 = drawable2.x;
            n4 = 1;
            if (!bl2) {
                object2 = drawable2.l;
                if (object2 != null) {
                    Intrinsics.checkNotNull(object2);
                    n3 = 3;
                    drawable3 = new sb_2(drawable2, n3);
                    object2.setOnClickListener((View.OnClickListener)drawable3);
                }
                drawable2.x = n4;
            }
            if ((object2 = drawable2.s) != null) {
                object2 = drawable2.l;
                Intrinsics.checkNotNull(object2);
                drawable3 = drawable2.s;
                Intrinsics.checkNotNull(drawable3);
                drawable4 = drawable3[0];
                drawable3 = drawable2.s;
                Intrinsics.checkNotNull(drawable3);
                object = drawable3[n4];
                drawable3 = drawable2.s;
                Intrinsics.checkNotNull(drawable3);
                drawable3 = drawable3[2];
                drawable2 = drawable2.s;
                Intrinsics.checkNotNull(drawable2);
                n3 = 3;
                drawable2 = drawable2[n3];
                object2.setCompoundDrawables(drawable4, (Drawable)object, drawable3, drawable2);
            }
        }
    }

    public final void onTick(long l2) {
        JioAdView$AdState jioAdView$AdState;
        j j3 = this.a;
        Object object = j3.b.k0();
        if (object != (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            int n3;
            object = j3.m;
            if (object != null && (n3 = j3.D) != 0) {
                int n4;
                n3 = j3.B;
                long l3 = n3;
                j3.C = l2 /= l3;
                Object object2 = j3.l;
                if (object2 != null) {
                    Object object3;
                    Intrinsics.checkNotNull(object2);
                    object2 = object2.getText();
                    char c2 = 's';
                    l3 = 1L;
                    if (object2 != null) {
                        object2 = j3.t;
                        n4 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                        if (n4 == 0) {
                            object2 = j3.t;
                            String string2 = "SKIP_TIMER";
                            n4 = (int)(StringsKt.F((CharSequence)object2, string2, false) ? 1 : 0);
                            if (n4 != 0) {
                                object2 = j3.t;
                                StringBuilder stringBuilder = new StringBuilder();
                                long l4 = j3.C + l3;
                                stringBuilder.append(l4);
                                stringBuilder.append(c2);
                                object3 = stringBuilder.toString();
                                object2 = b.n((String)object2, string2, (String)object3, false);
                            } else {
                                object2 = new StringBuilder();
                                string2 = j3.t;
                                ((StringBuilder)object2).append(string2);
                                char c3 = ' ';
                                ((StringBuilder)object2).append(c3);
                                long l7 = j3.C + l3;
                                ((StringBuilder)object2).append(l7);
                                ((StringBuilder)object2).append(c2);
                                object2 = ((StringBuilder)object2).toString();
                            }
                        } else {
                            object2 = "";
                        }
                    } else {
                        object2 = new StringBuilder();
                        long l8 = j3.C + l3;
                        ((StringBuilder)object2).append(l8);
                        ((StringBuilder)object2).append(c2);
                        object2 = ((StringBuilder)object2).toString();
                    }
                    object3 = j3.l;
                    Intrinsics.checkNotNull(object3);
                    object3.setText((CharSequence)object2);
                }
                j3.u = n4 = j3.u + -1;
            } else {
                this.cancel();
            }
        }
    }
}

