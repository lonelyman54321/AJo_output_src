/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class cr3
implements F62 {
    public LiveData a;
    public final /* synthetic */ NX0 b;
    public final /* synthetic */ kn1_0 c;

    public cr3(GG1$a gG1$a, kn1_0 kn1_02) {
        this.b = gG1$a;
        this.c = kn1_02;
    }

    public final void onChanged(Object object) {
        Object object2;
        Object object3 = this.a;
        if (object3 == (object = (LiveData)this.b.apply(object))) {
            return;
        }
        kn1_0 kn1_02 = this.c;
        if (object3 != null) {
            Intrinsics.checkNotNull(object3);
            object2 = kn1_02.l;
            object3 = (KN1$a)((CR2)object2).d(object3);
            if (object3 != null) {
                object2 = ((KN1$a)object3).a;
                ((LiveData)object2).j((F62)object3);
            }
        }
        this.a = object;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object3 = new cr3$a(kn1_02);
            object2 = new br3$a((Function1)object3);
            kn1_02.l((LiveData)object, (F62)object2);
        }
    }
}

