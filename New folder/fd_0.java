/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Fd
 */
public final class fd_0
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;

    public fd_0(Activity activity, dr0_0 dr0_02, yT1 yT12) {
        this.a = activity;
        this.b = dr0_02;
        this.c = yT12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = this.c;
            object2 = this.a;
            dr0_0 dr0_02 = this.b;
            dd_0 dd_02 = new dd_0((Activity)object2, dr0_02, (yT1)object);
            u10 u102 = y10.c;
            int n7 = 24576;
            int n8 = 14;
            dr0_02 = null;
            pc1_0.a(dd_02, null, false, null, u102, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

