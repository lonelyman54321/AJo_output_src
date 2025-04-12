/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$OnHeaderDecodedListener
 *  android.graphics.ImageDecoder$Source
 */
import android.graphics.ImageDecoder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Fd1
 */
public final class fd1_0
implements Function0 {
    public final /* synthetic */ gd1_0 a;
    public final /* synthetic */ Ref$BooleanRef b;

    public /* synthetic */ fd1_0(gd1_0 gd1_02, Ref$BooleanRef ref$BooleanRef) {
        this.a = gd1_02;
        this.b = ref$BooleanRef;
    }

    public final Object invoke() {
        Object object;
        long l2;
        a93_0 a93_02;
        boolean bl2;
        Ref$BooleanRef ref$BooleanRef = this.b;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        gd1_0 gd1_02 = this.a;
        Object object2 = gd1_02.a;
        boolean bl3 = gd1_02.c;
        if (bl3 && ((bl2 = (a93_02 = ((Fe1)object2).d()).l(l2 = 0L, (ff_2)(object = tZ0.b))) || (bl3 = a93_02.l(l2, (ff_2)(object = tZ0.a))))) {
            object2 = ((Fe1)object2).d();
            a93_02 = new qw0_0((se_1)object2);
            object2 = o72_0.b(a93_02);
            a93_02 = gd1_02.b.a;
            int n3 = 2;
            a00 a002 = new a00(a93_02, n3);
            bl3 = false;
            a93_02 = null;
            object2 = object = new f93_0((se_1)object2, a002, null);
        }
        try {
            a93_02 = gd1_02.b((Fe1)object2);
            object = new Gd1$c(ref$ObjectRef, gd1_02, ref$BooleanRef);
            ref$BooleanRef = od1_0.a((ImageDecoder.Source)a93_02, (ImageDecoder.OnHeaderDecodedListener)object);
            return ref$BooleanRef;
        }
        finally {
            ref$ObjectRef = wd1.a(ref$ObjectRef.element);
            if (ref$ObjectRef != null) {
                xd1.a((ImageDecoder)ref$ObjectRef);
            }
            object2.close();
        }
    }
}

