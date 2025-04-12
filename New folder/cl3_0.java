/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cl3
 */
public final class cl3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Vo0 c;
    public final /* synthetic */ tr1_0 d;

    public cl3_0(Vo0 vo0, tr1_0 tr1_02) {
        this.c = vo0;
        this.d = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Function0)object;
        LP1 lP1 = LP1$a.b;
        al3_0 al3_02 = new al3_0((Function0)object);
        object = this.c;
        Object object2 = this.d;
        bl3_0 bl3_02 = new bl3_0((Vo0)object, (tr1_0)object2);
        int n3 = yG1.a();
        if (n3 != 0) {
            n3 = Build.VERSION.SDK_INT;
            int n4 = 28;
            object = n3 == n4 ? mt2_1.a : nt2_1.a;
            n3 = (int)(yG1.a() ? 1 : 0);
            if (n3 != 0) {
                long l2 = 9205357640488583168L;
                float f5 = 0.0f / 0.0f;
                float f6 = 0.0f / 0.0f;
                boolean bl2 = true;
                float f7 = 0.0f / 0.0f;
                boolean bl3 = true;
                object2 = lP1;
                lP1 = new MagnifierElement(al3_02, null, bl3_02, f6, bl2, l2, f5, f7, bl3, (lt2)object);
            }
            return lP1;
        }
        object = new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        throw object;
    }
}

