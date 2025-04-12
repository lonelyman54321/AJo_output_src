/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class T61$c
implements Function2 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ FragmentManager c;

    public T61$c(yT1 yT12, dr0_0 dr0_02, FragmentManager fragmentManager) {
        this.a = yT12;
        this.b = dr0_02;
        this.c = fragmentManager;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.a;
            dr0_0 dr0_02 = this.b;
            FragmentManager fragmentManager = this.c;
            int n7 = 584;
            T61.a((e)object2, dr0_02, fragmentManager, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

