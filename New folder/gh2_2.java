/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Gh2
 */
public final class gh2_2
extends h80_0 {
    public Ref$ObjectRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ih2_1 c;
    public int d;

    public gh2_2(ih2_1 ih2_12, f80_0 f80_02) {
        this.c = ih2_12;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.b = object;
        this.d = n3 = this.d | -1 << -1;
        return ih2_1.w(this.c, this);
    }
}

