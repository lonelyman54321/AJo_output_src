/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.tooling.ComposeViewAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class O20
extends Lambda
implements Function2 {
    public final /* synthetic */ ComposeViewAdapter c;
    public final /* synthetic */ Function2 d;

    public O20(ComposeViewAdapter composeViewAdapter, u10 u102) {
        this.c = composeViewAdapter;
        this.d = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.c.f;
            n3 = 0;
            u10 u102 = (u10)this.d;
            ii1.a((D30)object2, u102, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

