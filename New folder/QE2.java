/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class QE2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ pe1_0 b;
    public final /* synthetic */ OE2 c;
    public final /* synthetic */ B63 d;
    public final /* synthetic */ GB0 e;
    public final /* synthetic */ Bitmap f;

    public QE2(pe1_0 pe1_02, OE2 oE2, B63 b63, GB0 gB0, Bitmap bitmap, f80_0 f80_02) {
        this.b = pe1_02;
        this.c = oE2;
        this.d = b63;
        this.e = gB0;
        this.f = bitmap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        GB0 gB0 = this.e;
        Bitmap bitmap = this.f;
        pe1_0 pe1_02 = this.b;
        OE2 oE2 = this.c;
        B63 b63 = this.d;
        object = new QE2(pe1_02, oE2, b63, gB0, bitmap, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (QE2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((QE2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        boolean bl2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return object;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        ArrayList arrayList = this.c.i;
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bl2 = true;
        } else {
            n3 = 0;
            Object var6_7 = null;
            bl2 = false;
        }
        B63 b63 = this.d;
        GB0 gB0 = this.e;
        pe1_0 pe1_02 = this.b;
        object = new se2_0(pe1_02, arrayList, 0, pe1_02, b63, gB0, bl2);
        this.a = n4;
        object = ((se2_0)object).b(pe1_02, this);
        if (object != j90_02) return object;
        return j90_02;
    }
}

