/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.text.Spannable
 */
import android.graphics.Typeface;
import android.text.Spannable;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

public final class X93
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Spannable c;
    public final /* synthetic */ hx0_2 d;

    public X93(Spannable spannable, ii$a ii$a) {
        this.c = spannable;
        this.d = ii$a;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        Object object4;
        object = (S93)object;
        object2 = (Number)object2;
        int n4 = ((Number)object2).intValue();
        object3 = (Number)object3;
        int n7 = ((Number)object3).intValue();
        RU0 rU0 = ((S93)object).f;
        tv0_0 tv0_02 = ((S93)object).c;
        if (tv0_02 == null) {
            tv0_02 = tv0_0.m;
        }
        if ((object4 = ((S93)object).d) != null) {
            n3 = ((nV0)object4).a;
        } else {
            n3 = 0;
            object4 = null;
        }
        nV0 nV02 = new nV0(n3);
        object = ((S93)object).e;
        int n8 = object != null ? ((oV0)object).a : 1;
        object4 = new oV0(n8);
        object = (Typeface)this.d.invoke(rU0, tv0_02, nV02, object4);
        yt3 yt32 = new yt3((Typeface)object);
        this.c.setSpan((Object)yt32, n4, n7, 33);
        return Unit.a;
    }
}

